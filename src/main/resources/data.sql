INSERT INTO users (ID, FIRST_NAME, LAST_NAME) VALUES (1, 'Nicolas','COQUATRIX');
INSERT INTO users (ID, FIRST_NAME, LAST_NAME) VALUES (2, 'Marie','DUPONT');
INSERT INTO users (ID, FIRST_NAME, LAST_NAME) VALUES (3, 'Pierre','MARTIN');

INSERT INTO task (ID, TITLE, DESCRIPTION, COMPLETED, CREATED_AT, USER_ID) VALUES (1, 'Apprendre Spring Boot', 'Maîtriser les bases de Spring Boot et JPA', false, '2024-01-15 10:00:00', 1);
INSERT INTO task (ID, TITLE, DESCRIPTION, COMPLETED, CREATED_AT, USER_ID) VALUES (2, 'Créer une API REST', 'Développer une API REST complète', false, '2024-01-16 14:30:00', 1);
INSERT INTO task (ID, TITLE, DESCRIPTION, COMPLETED, CREATED_AT, USER_ID) VALUES (3, 'Faire les courses', 'Acheter du pain et du lait', true, '2024-01-17 09:15:00', 2);
INSERT INTO task (ID, TITLE, DESCRIPTION, COMPLETED, CREATED_AT, USER_ID) VALUES (4, 'Réviser pour l''examen', 'Préparer l''examen de Java', false, '2024-01-18 16:45:00', 2);
INSERT INTO task (ID, TITLE, DESCRIPTION, COMPLETED, CREATED_AT, USER_ID) VALUES (5, 'Nettoyer la maison', 'Faire le ménage complet', false, '2024-01-19 11:20:00', 3);