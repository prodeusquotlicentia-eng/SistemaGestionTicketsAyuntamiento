\# Sistema de Tickets - Ayuntamiento de Chihuahua



\# Resumen Ejecutivo



\## Descripción



El Sistema de Tickets es una aplicación desarrollada en Java para administrar solicitudes de soporte técnico del Ayuntamiento de Chihuahua. Su objetivo es registrar, organizar y dar seguimiento a los reportes realizados por los usuarios, facilitando la gestión de incidencias y mejorando el proceso de atención.



\## Problema identificado



El área de soporte técnico requería una herramienta que permitiera registrar y administrar las incidencias de forma organizada, ya que el seguimiento manual dificultaba el control de los reportes y aumentaba los tiempos de atención.



\## Solución



Se desarrolló una aplicación en Java que permite registrar y gestionar tickets de soporte. El proyecto utiliza GitHub para el control de versiones y Maven para la administración de dependencias y la construcción del proyecto.



\## Arquitectura



La aplicación está organizada en una arquitectura por capas:



\- Capa de presentación.

\- Capa de lógica de negocio.

\- Capa de datos.



Tecnologías utilizadas:



\- Java

\- Maven

\- JUnit

\- Git

\- GitHub



\# Tabla de Contenidos



\- \[Resumen Ejecutivo](#resumen-ejecutivo)

\- \[Requerimientos](#requerimientos)

\- \[Instalación](#instalación)

\- \[Configuración](#configuración)

\- \[Uso](#uso)

\- \[Contribución](#contribución)

\- \[Roadmap](#roadmap)



\# Requerimientos



\## Servidores



Para esta versión del proyecto no es necesario utilizar un servidor web, servidor de aplicaciones ni servidor de base de datos, ya que la aplicación se ejecuta de manera local.



\## Paquetes adicionales



\- Apache Maven

\- JUnit



\## Versión de Java



\- Java JDK 11 o superior



\# Instalación



\## Instalación del ambiente de desarrollo



1\. Instalar Java JDK 11 o superior.

2\. Instalar Apache Maven.

3\. Instalar Git.

4\. Clonar el repositorio desde GitHub.

5\. Abrir el proyecto en IntelliJ IDEA o cualquier IDE compatible con Maven.



\# Configuración



\## Configuración del producto



El proyecto utiliza Apache Maven para la administración de dependencias mediante el archivo `pom.xml`.



La configuración del control de versiones se encuentra en el repositorio de GitHub y la integración continua está definida en el archivo `.travis.yml`.



\## Configuración de los requerimientos



Antes de ejecutar la aplicación es necesario contar con:



\- Java JDK 11 o superior instalado.

\- Apache Maven correctamente configurado.

\- Git instalado para clonar el repositorio.

\- Un IDE compatible con proyectos Maven, como IntelliJ IDEA.



\# Uso



\## Usuario final



El usuario puede utilizar el sistema para:



\- Registrar tickets de soporte.

\- Consultar la información de los tickets registrados.

\- Dar seguimiento a las solicitudes de soporte.



\## Usuario administrador



El administrador tiene acceso a las siguientes funciones:



\- Administrar los tickets registrados.

\- Gestionar la información de los usuarios.

\- Supervisar el estado y seguimiento de las incidencias.



\# Contribución



Para contribuir al proyecto se deben seguir los siguientes pasos:



\## 1. Clonar el repositorio



```bash

git clone https://github.com/prodeusquotlicentia-eng/SistemaGestionTicketsAyuntamiento.git

```



\## 2. Crear una nueva rama



```bash

git checkout -b nueva-funcionalidad

```



\## 3. Realizar los cambios necesarios



Modificar el código y guardar los cambios correspondientes.



\## 4. Registrar los cambios



```bash

git add .

git commit -m "Descripción de los cambios"

```



\## 5. Enviar la rama al repositorio



```bash

git push origin nueva-funcionalidad

```



\## 6. Crear un Pull Request



Ingresar al repositorio en GitHub y crear un Pull Request para solicitar la integración de la nueva rama.



\## 7. Esperar la revisión y el Merge



Una vez revisados y aprobados los cambios, realizar el Merge de la rama con la rama principal.



\### Clonar el repositorio



```bash

git clone https://github.com/TU-USUARIO/TU-REPOSITORIO.git

```



\## Ejecutar pruebas manualmente



Desde la carpeta del proyecto ejecutar:



```bash

mvn test

```



También es posible ejecutar las pruebas directamente desde el IDE.



\## Implementación



Para un ambiente local basta con compilar y ejecutar el proyecto desde IntelliJ IDEA.



```bash

mvn clean install

```



La versión actual está diseñada para ejecutarse en un entorno local. En futuras versiones podrá adaptarse para desplegarse en servicios en la nube.



\### Clonar el repositorio



```bash

git clone https://github.com/prodeusquotlicentia-eng/SistemaGestionTicketsAyuntamiento.git

```



\# Roadmap



Las siguientes funcionalidades se consideran para futuras versiones del sistema:



\- Implementar una base de datos para almacenar los tickets.

\- Agregar autenticación e inicio de sesión para usuarios.

\- Incorporar distintos niveles de permisos (administrador y usuario).

\- Permitir la asignación automática de tickets al personal de soporte.

\- Enviar notificaciones por correo electrónico sobre el estado de los tickets.

\- Generar reportes y estadísticas de incidencias.

\- Desarrollar una interfaz gráfica más intuitiva para facilitar el uso del sistema.

\- Mejorar el seguimiento y control del ciclo de vida de cada ticket.





