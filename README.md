# 📌 ForoHub

ForoHub es una API REST construida con **Spring Boot** que implementa un sistema de foros.  
Permite a los usuarios autenticarse, crear, listar, actualizar y eliminar tópicos, además de contar con seguridad basada en **JWT (JSON Web Token)**.

---

## 🚀 Tecnologías utilizadas
- **Java 17**
- **Spring Boot 3**
  - Spring Web
  - Spring Security + JWT
  - Spring Data JPA
  - Validation
- **Hibernate**
- **MySQL / H2** (dependiendo del perfil de ejecución)
- **Lombok**
- **Maven**

---

## 📂 Estructura del proyecto

src
└── main
├── java
│ └── ApiForoHub.ForoHub
│ ├── Controller # Controladores REST
│ ├── domain # Entidades y DTOs
│ │ ├── topicos
│ │ └── Usuario
│ └── infra # Configuración y seguridad
│ ├── security
│ └── exceptions
└── resources
├── db.migration # Scripts Flyway
├── templates
└── application.properties

---

## 📖 Endpoints principales
Autenticación

POST /login → genera un JWT

Tópicos

GET /topicos → lista todos los tópicos

POST /topicos → crea un nuevo tópico

GET /topicos/{id} → obtiene un tópico por ID

PUT /topicos/{id} → actualiza un tópico

DELETE /topicos/{id} → elimina un tópico

### 1️⃣ Clonar el repositorio
```bash
git clone https://github.com/tu-usuario/ForoHub.git
cd ForoHub
