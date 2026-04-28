# Sistema de Gestión de Inventario para Tienda de Electrónicos

## 📌 Descripción del Proyecto
Este proyecto consiste en una aplicación de escritorio desarrollada en **Java** utilizando la librería gráfica **Swing**. El sistema permite la gestión integral de productos y ventas para una tienda de electrónicos, aplicando lógica de negocio para el control de stock y cálculos financieros automáticos.

Este es un **trabajo teórico-práctico** desarrollado para el instituto, cuyo objetivo es demostrar la correcta implementación de los fundamentos de la Programación Orientada a Objetos (POO) y el diseño de interfaces interactivas.

## 🚀 Funcionalidades Principales
* **Gestión de Inventario (CRUD):** Registro de nuevos productos, actualización de precios y gestión de stock (sumar existencias).
* **Módulo de Ventas:** Procesamiento de ventas con validación automática de disponibilidad de stock.
* **Lógica de Descuentos:** Aplicación automática de un **15% de descuento** para ventas realizadas "En Línea" que superen las 3 unidades.
* **Reportes en Tiempo Real:** Visualización del inventario actual y estado de la bodega.

## 🛠️ Tecnologías y Conceptos Aplicados
* **Lenguaje:** Java.
* **Interfaz Gráfica:** Java Swing & AWT (JFrame, JPanel, JTabbedPane, Layouts).
* **Patrón de Diseño:** MVC (Modelo-Vista-Controlador) para separar la lógica de negocio de la interfaz de usuario.
* **Estructuras de Datos:** Manejo de colecciones dinámicas mediante `ArrayList`.
* **Lógica Programática:** Uso de estructuras de control, operaciones aritméticas y manejo de eventos.

## 📂 Estructura del Código
* **`model`**: Clases `Producto` y `Compra` que definen la estructura de los datos.
* **`view`**: Paneles y ventanas diseñadas con componentes Swing.
* **`controller`**: Clase `ProductoController` que actúa como el cerebro de la aplicación, gestionando la persistencia en memoria y la lógica de ventas.

## 💡 Nota Académica
Este software fue diseñado como parte de mi proceso de formación académica, integrando conceptos de arquitectura de software y diseño de sistemas interactivos bajo el estándar de la industria.
