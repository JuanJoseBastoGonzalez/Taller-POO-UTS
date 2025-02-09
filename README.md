# Proyecto Final Taller

Este proyecto es una aplicación de escritorio en Java con una interfaz basada en `JOptionPane`, que permite a un usuario simular actividades como correr y descansar mientras se gestiona su fatiga. Se implementa usando Maven como herramienta de gestión de dependencias y construcción.

## 🚀 Tecnologías utilizadas

- **Java** (JDK 8+)
- **Maven**
- **Swing (`JOptionPane`)**

## 📂 Estructura del Proyecto

El proyecto sigue una estructura de paquetes de la siguiente manera:

```
com.mycompany.finaltaller
├── Main.java          # Punto de entrada de la aplicación
├── Person.java        # Clase que representa una persona con atributos como nombre, edad y fatiga
├── Menu.java          # Lógica del menú de la aplicación
├── Inputs.java        # Manejo de entrada de datos del usuario
├── Outputs.java       # Manejo de salida de datos
```

## 🛠 Instalación y Ejecución

### Prerrequisitos

Antes de ejecutar el proyecto, asegúrate de tener instalados:

- **JDK 8 o superior**
- **Apache Maven**

### 📥 Clonación del repositorio

```sh
git clone <URL_DEL_REPOSITORIO>
cd finaltaller
```

### 🔧 Compilación del proyecto

```sh
mvn clean compile
```

### ▶️ Ejecución del programa

```sh
mvn exec:java -Dexec.mainClass="com.mycompany.finaltaller.Main"
```

## 📌 Funcionamiento

1. El programa solicita al usuario ingresar su nombre y edad.
2. Se presenta un menú con opciones para:
   - 🏃 Correr (aumenta la fatiga).
   - 😴 Descansar (disminuye la fatiga).
   - ℹ️ Mostrar información del usuario.
   - ❌ Salir de la aplicación.
3. Se utilizan cuadros de diálogo (`JOptionPane`) para interactuar con el usuario.

## 👤 Autor

- **Juan José Basto González**
- [![LinkedIn](https://img.shields.io/badge/LinkedIn-blue?style=flat&logo=linkedin)](https://www.linkedin.com/in/juan-jose-basto-gonzalez-49945023a/)
- [![GitHub](https://img.shields.io/badge/GitHub-black?style=flat&logo=github)](https://github.com/JuanJoseBastoGonzalez)
