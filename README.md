# ForoHub

## Descripción

¡Bienvenido a nuestro último desafío Challenge Back End!

Un foro es un espacio donde todos los participantes de una plataforma pueden plantear sus preguntas sobre determinados tópicos. Aquí en Alura Latam, los estudiantes utilizan el foro para resolver sus dudas sobre los cursos y proyectos en los que participan. Este lugar mágico está lleno de aprendizaje y colaboración entre estudiantes, profesores y moderadores.

Ya sabemos para qué sirve el foro y conocemos su aspecto, pero ¿sabemos cómo funciona detrás de escena? ¿Dónde se almacenan las informaciones? ¿Cómo se tratan los datos para relacionar un tópico con una respuesta, o cómo se relacionan los usuarios con las respuestas de un tópico?

Este es nuestro desafío, llamado ForoHub: en él, vamos a replicar este proceso a nivel de back end y, para eso, crearemos una API REST usando Spring.

## Funcionalidades

Nuestra API se centrará específicamente en los tópicos, y debe permitir a los usuarios:

- Crear un nuevo tópico
- Mostrar todos los tópicos creados
- Mostrar un tópico específico
- Actualizar un tópico
- Eliminar un tópico

Es lo que normalmente conocemos como CRUD (CREATE, READ, UPDATE, DELETE) y es muy similar a lo que desarrollamos en LiterAlura, pero ahora de forma completa, agregando las operaciones de UPDATE y DELETE, y usando un framework que facilitará mucho nuestro trabajo.

## Objetivo del Challenge

Nuestro objetivo con este challenge es implementar una API REST con las siguientes funcionalidades:

- API con rutas implementadas siguiendo las mejores prácticas del modelo REST
- Validaciones realizadas según las reglas de negocio
- Implementación de una base de datos relacional para la persistencia de la información
- Servicio de autenticación/autorización para restringir el acceso a la información

## Requisitos

- Java 11 o superior
- Maven 3.6.3 o superior
- PostgreSQL 12 o superior

## Instalación

1. Clona este repositorio en tu máquina local:

    ```bash
    git clone https://github.com/tu_usuario/forohub.git
    ```

2. Navega al directorio del proyecto:

    ```bash
    cd forohub
    ```

3. Configura la base de datos PostgreSQL:

    - Crea una base de datos para el proyecto:
    
        ```sql
        CREATE DATABASE forohub;
        ```
    
    - Asegúrate de tener el usuario y contraseña configurados en PostgreSQL.

4. Configura las propiedades de la base de datos en `src/main/resources/application.properties`:

    ```properties
    # Configuración de la base de datos PostgreSQL
    spring.datasource.url=jdbc:postgresql://localhost:5432/forohub
    spring.datasource.username=tu_usuario
    spring.datasource.password=tu_contraseña
    spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true

    # Configuración de H2 para desarrollo (opcional)
    # spring.datasource.url=jdbc:h2:mem:testdb
    # spring.datasource.driverClassName=org.h2.Driver
    # spring.datasource.username=sa
    # spring.datasource.password=password
    # spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
    ```

5. Construye y ejecuta la aplicación:

    ```bash
    mvn spring-boot:run
    ```

## Uso

La API ofrece las siguientes rutas para interactuar con los tópicos:

- **Crear un nuevo tópico**
    ```http
    POST /topics
    ```

- **Mostrar todos los tópicos creados**
    ```http
    GET /topics
    ```

- **Mostrar un tópico específico**
    ```http
    GET /topics/{id}
    ```

- **Actualizar un tópico**
    ```http
    PUT /topics/{id}
    ```

- **Eliminar un tópico**
    ```http
    DELETE /topics/{id}
    ```

## Contribuciones

Las contribuciones son bienvenidas. Por favor, sigue los siguientes pasos:

1. Haz un fork del proyecto.
2. Crea una nueva rama (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza los cambios necesarios y haz commits (`git commit -m 'Agrega nueva funcionalidad'`).
4. Haz push a la rama (`git push origin feature/nueva-funcionalidad`).
5. Crea un Pull Request.

## Licencia

Este proyecto no tiene licencia.

## Contacto

Si tienes alguna pregunta o sugerencia, por favor contacta a [serrato-18@hotmail.com](mailto:serrato-18@hotmail.com).
