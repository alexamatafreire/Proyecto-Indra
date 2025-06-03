# Portal proyectos sostenibles

Aquí procederé a describir brevemente cada parte de mi proyecto y mostrar algunas imagenes del mismo.

## Página web (Lenguaje de marcas)

Es una página simple, con un carusel que contiene las tarjetas de ciertos eventos destacados. Tambien está disponible una lista con todos los eventos que hay en el portal, asi como una página con la descripcion y detalles de cada evento y un boton para inscribirse a él (no funciona)

En la parte superior disponemos del logo, que tambien funciona como boton de inicio, y tres botones para navegar entre la pagina de inicio, la de listado de eventos y la del perfil (no funciona)

Tambien existe un boton para cambiar entre el modo claro y el modo oscuro pero este solo he conseguido que se muestre en un servidor web, no abriendo el archivo HTML. No obstante el boton sigue estando ahi y funcionando. Puedes probar la página [aqui](https://alexamata.static.domains).

![Demostracion_modo_oscuro](/doc/modo_oscuro.gif)

## Base de datos

Creé primero tanto el diseño conceptual, como el logico, para asi despúes crear facilmente el codigo de la base de datos, para ello usé Transact-SQL.

Dispone de las tablas Eventos, Usuarios, Organizadores, Ubicaciones, Inscripciones y Eventos creados.

## Programacion (objetos Java)

Para los objetos de java simplemente me basé en las tablas de la base de datos, creando asi las clases Evento, Ubicacion, Usuario y Organizador en java maven.

Cada clase tiene sus propios metodos como, por ejemplo, un organizador puede crear eventos y se almacenan en la lista de eventos que ha creado.

## Maquina virtual y servidor web

En esta parte documente los pasos necesarios para crear una maquina virtual de Windows 10 Pro usando VirtualBox y su opcion de instalación desatendida. Este documento se puede hallar [aqui](/doc/Documentacion%20maquina%20virtual.pdf).

## Grafo de ramas

Por ultimo, muestro aqui el grafo de ramas de este proyecto en VSCode.

<p align="center">
  <img src="/doc/grafo de ramas.png">
</p>