# Traductor SQL a LINQ

Este proyecto se desarrolló con el objetivo de traducir sentacias SQL a
sentencias LINQ tipo query soportadas en C#

## Presentado por:

- Andrés Ortega
- Andrés Aldana
- Juan Preciado

## Guía de compilación:

1. Descargar .zip
2. Descomprimir y abrir con IntelliJ IDEA
3. En configuración del proyecto (Module Settings), agregar las carpetas gen y src como Source Folders
4. Agregar las dependencias (ANTLR)
5. En la pestaña Run, seleccionar Edit Configurations.. y configurar la clase principal como "Main" y definir el archivo de entrada (input/in.txt)
6. Escrbir el programa que se desea traducir de SQL a LINQ en el archivo de entrada (input/in.txt por defecto)
7. Compilar Main
8. Visualizar traducción en la consola

## Consideraciones

### Herramientas:

A continuación se listan las herramientas utilizadas y sus versiones
utilizadas para el desarrollo del proyecto.

- Java 15: Versión 15.0.2
- ANTLR: Versión 4.9.3
- IntelliJ: Versión 2021.3

### Tutorial SQL:

- https://www.mysqltutorial.org/mysql-select-statement-query-data.aspx

### Tutorial LINQ

- https://www.tutorialsteacher.com/linq/linq-filtering-operators-where

### Gramática usada:

Para el desarrollo del proyecto se hizo uso de la gramática de MySQL en
su versión Positive Technology disponible en el repositorio ANTLR Grammars.
Como consideración, esta gramática es sensible a las mayúsculas aunque
normalmente  una sintáxis de SQL no lo es.

- https://github.com/antlr/grammars-v4/tree/master/sql/mysql/Positive-Technologies

