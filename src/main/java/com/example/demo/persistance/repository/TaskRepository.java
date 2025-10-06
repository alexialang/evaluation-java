package com.example.demo.persistance.repository;

import com.example.demo.persistance.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByOwnerId(Long userId);
    List<Task> findByCompleted(boolean completed);
}
