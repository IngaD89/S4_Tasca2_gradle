# Proyecto Spring Boot con Gradle

Este proyecto es una API REST desarrollada con Spring Boot y Gradle. Su objetivo es proporcionar dos endpoints que permiten saludar a los usuarios mediante diferentes tipos de parámetros en las solicitudes HTTP.

## Requisitos previos

Para ejecutar este proyecto, necesitas:

- Tener instalado [Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- Tener instalado [Gradle](https://gradle.org/install/)  (opcional)
- Crear un proyecto en [Spring Initializr](https://start.spring.io/) con Gradle como gestor de dependencias
- Importar el proyecto en un entorno de desarrollo como [IntelliJ IDEA](https://www.jetbrains.com/idea/) o [Eclipse](https://www.eclipse.org/downloads/)

## Configuración

El servidor está configurado para ejecutarse en el puerto 9001. Esto se especifica en el archivo `application.properties`:

```properties
server.port=9001
```

## Endpoints

### GET `/helloWorld` (RequestParam)

- Recibe el parámetro `name` como un RequestParam opcional.
- Si no se proporciona, el valor por defecto es "UNKNOWN".
- Ejemplo de uso:
  - `http://localhost:9001/helloWorld`
  - `http://localhost:9001/helloWorld?name=myName`

### GET `/helloWorld2` (PathVariable)

- Recibe el parámetro `name` como un PathVariable opcional.
- Si no se proporciona, el valor por defecto es "UNKNOWN".
- Ejemplo de uso:
  - `http://localhost:9001/helloWorld2`
  - `http://localhost:9001/helloWorld2/myName`

## Comandos básicos de Gradle

Este proyecto incluye el **Gradle Wrapper**, lo que significa que no es necesario tener Gradle instalado globalmente. Puedes ejecutar los comandos usando `./gradlew` (Linux/macOS) o `gradlew.bat` (Windows), y Gradle se descargará automáticamente si no está presente.

Para ejecutar el proyecto en tu entorno local, clónalo y usa los siguientes comandos:

- **Compilar el proyecto:**
  ```sh
  ./gradlew build
  ```
- **Limpiar el proyecto:**
  ```sh
  ./gradlew clean
  ```
- **Ejecutar la aplicación:**
  ```sh
  ./gradlew bootRun
  ```



