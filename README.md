<!--
*** Plantilla de readme hecha por othneildrew
-->


<!-- PROJECT SHIELDS -->
![release-shield]
[![Contributors][contributors-shield]][contributors-url] 
[![Issues][issues-shield]][issues-url]
[![Contact][discord-shield]][discord-url]
[![LinkedIn][linkedin-shield]][linkedin-url] 



<!-- PROJECT LOGO -->
<br />
<p align="center">
  <h3 align="center">Proyecto Kanban</h3>

  <p align="center">
    Tablero para organizar tareas hecho con Java JSP y Servlets
    <br />
    ·
    <a href="https://github.com/Pikass0/WebTareasMarcelo/issues">Report Bug</a>
    ·
    <a href="https://github.com/Pikass0/WebTareasMarcelo/issues">Request Feature</a>
  </p>
</p>



<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary>Contenido</summary>
  <ol>
    <li>
      <a href="#sobre-el-proyecto">Sobre el proyecto</a>
      <ul>
        <li><a href="#tecnologías">Tecnologías usadas</a></li>
      </ul>
    </li>
    <li>
      <a href="#probar-el-proyecto">Probar el proyecto</a>
      <ul>
        <li><a href="#requisitos">Requisitos</a></li>
        <li><a href="#instalación">Instalación</a></li>
      </ul>
    </li>
    <li><a href="#uso">Uso</a></li>
    <li><a href="#contribución">Contrubución</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## Sobre el proyecto

![menu-ss]<!--(https://example.com) por si se quiere metir link-->

Tablero Kanban para organizar tus tareas, esta vez con JSP, JS, Bootstrap y Servlets

¿Cómo funciona?
* Cada usuario tiene sus tareas
* Hay un tablero con 3 listas: todo, in progress y done.
* Puedes crear y mover tareas
* Borrar tiene sus bugs


### Tecnologías

Herramientas usadas:
* JSP, Servlets, Java
* Bootstrap, JavaScript, HTML5, CSS
* GlassFish



<!-- GETTING STARTED -->
## Probar el proyecto

Cómo ejecutar el proyecto:

### Requisitos

Tener GlassFish


### Instalación
 
1. Clonar repositorio
   ```sh
   git clone https://github.com/Pikass0/WebTareasMarcelo.git
   ```

2. Agregar al proyecto un servidor GlassFish. En NetBeans, Tools>Servers>Add Server y seleccionar GlassFish.

3. Run el proyecto



<!-- USAGE EXAMPLES -->
## Uso

* Cada usuario tiene unas tareas distintas, puedes probar usuario **test** con contraseña **12345678**. Si quieres registrarte, tienes que poner una contraseña con al menos 8 caracteres
* Ve a tareas y verás tu tablero, aparecen tooltips en los botones por si no puedes descifrarlos.
* Eliminar tarea funciona pero a veces aparece error 500, sin embargo la tarea la borra. En ese caso, refresca la página o ve hacia atrás.
* La base de datos es de pruebas, es una clase estática de Java. Esto significa que los cambios que hagas no se guardarán cuando el servidor se cierre.
* La pestaña de **Cuenta** era para meter extras en caso de aburrirme en Navidad. Solo es funcional el Logout

![tablero-ss]


<!-- CONTRIBUTING -->
## Contribución

Si quieres contribuir:

1. Fork el proyecto
2. Crea tu rama (`git checkout -b feature/AmazingFeature`)
3. Commit los cambios (`git commit -m 'Add some AmazingFeature'`)
4. Push a la rama (`git push origin feature/AmazingFeature`)
5. Abre un [Pull request](https://github.com/Pikass0/WebTareasMarcelo/pulls)






<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->

[discord-shield]: https://img.shields.io/badge/chat-on%20discord-7289da.svg?style=flat&logo=discord
[discord-url]: https://www.discord.com/users/290575161869205504
[release-shield]: https://img.shields.io/badge/release%20date-Dec%202020-lightgrey
[contributors-shield]: https://img.shields.io/github/contributors/Pikass0/WebTareasMarcelo?color=green
[contributors-url]: https://github.com/Pikass0/WebTareasMarcelo/graphs/contributors
[issues-shield]: https://img.shields.io/github/issues-raw/Pikass0/WebTareasMarcelo?color=orange
[issues-url]: https://github.com/Pikass0/WebTareasMarcelo/issues
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=flat&logo=linkedin&color=blue
[linkedin-url]: https://www.linkedin.com/in/marcelo-toral-martínez-573735176/
[menu-ss]: /fotosReadme/readme1.jpg
[tablero-ss]: /fotosReadme/readme2.jpg
