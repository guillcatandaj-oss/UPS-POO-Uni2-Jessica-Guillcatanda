# UPS-POO-Unidad2-Jessica-Guillcatanda
Proyecto desarrollado en Java para la gestión de contenido audiovisual mediante Programación Orientada a Objetos (POO), aplicando herencia, asociación, agregación y composición. Incluye clases como Pelicula, SerieDeTV, Documental, Podcast y TikTokVideo.
# Sistema de Contenido Audiovisual

## Descripción del Proyecto

Este proyecto fue desarrollado en Java como parte de la asignatura de Programación Orientada a Objetos (POO).
La aplicación permite gestionar diferentes tipos de contenido audiovisual mediante una estructura basada en herencia y relaciones entre clases, aplicando conceptos fundamentales como asociación, agregación y composición.

## Características Principales

- Gestión de películas.
- Gestión de series de TV.
- Gestión de documentales.
- Gestión de podcasts.
- Gestión de videos de TikTok.
- Uso de herencia mediante la clase abstracta ContenidoAudiovisual.
- Implementación de asociación, agregación y composición.
- Aplicación de polimorfismo para mostrar información de diferentes tipos de contenido.

## Clases del Proyecto
### Clase Base

- ContenidoAudiovisual

### Subclases

- Pelicula
- SerieDeTV
- Documental
- Podcast
- TikTokVideo

### Clases Relacionadas

- Actor
- Investigador
- Temporada

## Relaciones Implementadas
### Agregación

- Pelicula → Actor

### Composición

- SerieDeTV → Temporada

### Asociación

- Documental → Investigador

## Estructura de Carpetas

```text
src/
├── poo/
│   └── PruebaAudioVisual.java
│
└── uni1a/
    ├── ContenidoAudiovisual.java
    ├── Pelicula.java
    ├── SerieDeTV.java
    ├── Documental.java
    ├── Podcast.java
    ├── TikTokVideo.java
    ├── Actor.java
    ├── Investigador.java
    └── Temporada.java
```

## Instalación y Ejecución
### Clonar el repositorio

```bash
git clone URL_DEL_REPOSITORIO
```

### Abrir el proyecto

1. Abrir Eclipse.
2. Importar el proyecto.
3. Ejecutar la clase:

```text
PruebaAudioVisual.java
```

### Ejecución

El programa crea diferentes objetos audiovisuales y muestra sus detalles por consola.

## Mejoras Implementadas

Inclusión de nuevas subclases:

Podcast
TikTokVideo
Actualización del diagrama UML.

Aplicación de polimorfismo.

Uso de relaciones entre clases mediante:

Asociación
Agregación
Composición
