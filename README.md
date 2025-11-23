# Sistema Académico NovaTech

Este proyecto simula el funcionamiento básico del sistema académico de una universidad. Permite registrar, buscar y mostrar información de estudiantes, profesores y cursos, aplicando principios fundamentales de la Programación Orientada a Objetos (POO) en Java.

## Requisitos

- Java 17 o superior
- No se requieren dependencias externas; el proyecto utiliza únicamente la biblioteca estándar de Java.

Entre sus funcionalidades se incluyen:

Registro y consulta de personas (estudiantes y profesores).

Gestión de cursos y asignación de estudiantes o profesores.
Formateo de valores numéricos (como matrículas o salarios) en formato de moneda local, soportando locales configurables (por ejemplo, es-ES para España, en-US para Estados Unidos) mediante la clase `Locale` de Java.
Búsqueda por distintos criterios (nombre, documento, código de curso).

Cálculo del promedio académico de los estudiantes.

Formateo de valores numéricos (como matrículas o salarios) en formato de moneda local.

El proyecto fue diseñado para practicar conceptos como clases, herencia, encapsulamiento, polimorfismo, sobrecarga y organización mediante packages.

## Cómo ejecutar

1. Clona este repositorio en tu máquina local.
2. Navega al directorio raíz del proyecto.
3. Compila los archivos Java:
   ```bash
   javac -d bin src/**/*.java
   ```
4. Ejecuta la clase principal (por ejemplo, `Main`):
   ```bash
   java -cp bin Main
   ```
    O si se tienen las extensiones para vscode puedes ejecutar cualquier archivo .java
    oprimiendo el botón f5
5. Sigue las instrucciones en pantalla para interactuar con el sistema.