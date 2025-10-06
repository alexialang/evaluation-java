package com.example.demo.Controller;

import com.example.demo.persistance.model.Task;
import com.example.demo.persistance.model.User;
import com.example.demo.service.TaskService;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class MainController {

    private final UserService userService;
    private final TaskService taskService;

    public MainController(UserService userService, TaskService taskService) {
        this.userService = userService;
        this.taskService = taskService;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<User> users = userService.findAll();
        List<Task> tasks = taskService.findAll();
        model.addAttribute("users", users);
        model.addAttribute("tasks", tasks);
        model.addAttribute("message", "Bienvenue sur votre TODO List !");
        return "home";
    }

    @GetMapping("/users")
    public String users(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "users/list";
    }

    @GetMapping("/users/{id}")
    public String userDetail(@PathVariable Long id, Model model) {
        User user = userService.findById(id)
                .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé avec l'id : " + id));
        List<Task> userTasks = taskService.findByOwner(user);
        model.addAttribute("user", user);
        model.addAttribute("tasks", userTasks);
        return "users/detail";
    }

    @GetMapping("/tasks")
    public String tasks(Model model) {
        List<Task> tasks = taskService.findAll();
        model.addAttribute("tasks", tasks);
        return "tasks/list";
    }

    @GetMapping("/tasks/{id}")
    public String taskDetail(@PathVariable Long id, Model model) {
        Task task = taskService.findById(id)
                .orElseThrow(() -> new RuntimeException("Tâche non trouvée avec l'id : " + id));
        model.addAttribute("task", task);
        return "tasks/detail";
    }
}