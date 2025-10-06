# TODO List - Application Spring Boot

Une application web de gestion de tâches développée avec Spring Boot, permettant de gérer des utilisateurs et leurs tâches associées.

## 🚀 Fonctionnalités

### Critères minimums implémentés
- ✅ Application démarre correctement
- ✅ Connexion à une base de données H2 (en mémoire)
- ✅ Gestion de deux modèles de données : Users et Tasks
- ✅ Jointure entre les modèles (ManyToOne)
- ✅ Données initiales dans la base de données
- ✅ Affichage des listes et détails via URLs spécifiques

### URLs disponibles
- **Page d'accueil** : `http://localhost:8080/`
- **Liste des utilisateurs** : `http://localhost:8080/users`
- **Détail d'un utilisateur** : `http://localhost:8080/users/{id}`
- **Liste des tâches** : `http://localhost:8080/tasks`
- **Détail d'une tâche** : `http://localhost:8080/tasks/{id}`

### APIs REST disponibles
- **GET** `/api/users` - Liste tous les utilisateurs
- **GET** `/api/users/{id}` - Récupère un utilisateur par ID
- **POST** `/api/users` - Crée un nouvel utilisateur
- **PUT** `/api/users/{id}` - Met à jour un utilisateur
- **DELETE** `/api/users/{id}` - Supprime un utilisateur
- **GET** `/api/tasks` - Liste toutes les tâches
- **GET** `/api/tasks/{id}` - Récupère une tâche par ID
- **POST** `/api/tasks` - Crée une nouvelle tâche
- **PUT** `/api/tasks/{id}` - Met à jour une tâche
- **DELETE** `/api/tasks/{id}` - Supprime une tâche
- **GET** `/api/users/{userId}/tasks` - Récupère les tâches d'un utilisateur

## 🛠️ Technologies utilisées

- **Java 21**
- **Spring Boot 3.5.6**
- **Spring Data JPA**
- **H2 Database** (base de données en mémoire)
- **Thymeleaf** (moteur de template)
- **Bootstrap 5.3.0** (framework CSS)
- **Font Awesome** (icônes)
- **Maven** (gestion des dépendances)

## 📋 Prérequis

- Java 21 ou supérieur
- Maven 3.6 ou supérieur

## 🚀 Installation et démarrage

1. **Cloner le repository**
   ```bash
   git clone <url-du-repository>
   cd evalJava
   ```

2. **Compiler et démarrer l'application**
   ```bash
   ./mvnw spring-boot:run
   ```
   ou sur Windows :
   ```bash
   mvnw.cmd spring-boot:run
   ```

3. **Accéder à l'application**
   Ouvrez votre navigateur et allez à l'adresse : `http://localhost:8080`

## 🗄️ Base de données

L'application utilise H2, une base de données en mémoire. Les données sont automatiquement chargées au démarrage via le fichier `data.sql`.

### Données initiales
- **3 utilisateurs** : Nicolas COQUATRIX, Marie DUPONT, Pierre MARTIN
- **5 tâches** réparties entre les utilisateurs

### Console H2
Pour accéder à la console H2 (optionnel) :
- URL : `http://localhost:8080/h2-console`
- JDBC URL : `jdbc:h2:mem:demo2db`
- User Name : `sa`
- Password : (laisser vide)

## 📁 Structure du projet

```
src/
├── main/
│   ├── java/com/example/demo/
│   │   ├── Controller/
│   │   │   ├── MainController.java      # Contrôleur web
│   │   │   └── RestController.java      # Contrôleur REST
│   │   ├── persistance/
│   │   │   ├── model/
│   │   │   │   ├── User.java           # Modèle utilisateur
│   │   │   │   └── Task.java           # Modèle tâche
│   │   │   └── repository/
│   │   │       ├── UserRepository.java # Repository utilisateur
│   │   │       └── TaskRepository.java # Repository tâche
│   │   ├── service/
│   │   │   ├── UserService.java        # Service utilisateur
│   │   │   └── TaskService.java        # Service tâche
│   │   └── Demo2Application.java       # Classe principale
│   └── resources/
│       ├── application.properties      # Configuration
│       ├── data.sql                    # Données initiales
│       └── templates/                  # Templates Thymeleaf
│           ├── home.html               # Page d'accueil
│           ├── users/
│           │   ├── list.html           # Liste des utilisateurs
│           │   └── detail.html         # Détail d'un utilisateur
│           └── tasks/
│               ├── list.html           # Liste des tâches
│               └── detail.html         # Détail d'une tâche
└── test/                               # Tests unitaires
```

## 🎨 Interface utilisateur

L'application dispose d'une interface moderne et épurée avec :
- **Bootstrap 5.3.0** comme base du design
- **Palette de couleurs professionnelle** : Space Cadet (#222E50), Cerulean (#007991), Zomp (#439A86), Celadon (#BCD8C1), Flax (#E9D985)
- **Font Awesome** pour les icônes
- **Design moderne et minimaliste** avec des animations fluides
- **Navigation intuitive** entre les différentes sections
- **Cartes et tableaux épurés** pour l'affichage des données
- **Design responsive** adapté aux mobiles et tablettes
- **Effets de survol subtils** pour une meilleure expérience utilisateur

## 🔧 Configuration

Le fichier `application.properties` contient la configuration de base :
```properties
spring.application.name=demo2
spring.datasource.url=jdbc:h2:mem:demo2db
spring.jpa.defer-datasource-initialization=true
```

## 📝 Exemples d'utilisation des APIs

### Créer un utilisateur
```bash
curl -X POST http://localhost:8080/api/users \
  -H "Content-Type: application/json" \
  -d '{"firstName":"Jean","lastName":"Dupont"}'
```

### Créer une tâche
```bash
curl -X POST http://localhost:8080/api/tasks \
  -H "Content-Type: application/json" \
  -d '{"title":"Nouvelle tâche","description":"Description de la tâche","owner":{"id":1}}'
```

### Récupérer les tâches d'un utilisateur
```bash
curl http://localhost:8080/api/users/1/tasks
```

## 🧪 Tests

Pour exécuter les tests :
```bash
./mvnw test
```

## 📄 Licence

Ce projet est développé dans le cadre d'un exercice d'évaluation.

## 👨‍💻 Auteur

Développé avec ❤️ en utilisant Spring Boot
