<img src="android_compose_head.png" alt="android jetpack compose android basics" style="width:100%;"/>

# Courses Android Compose Basic - Solution Code #AndroidBasics

Table of contents
=================

<!--ts-->
* [3/Introducción al estado en Compose](#step3)
* [4/Calculo una propina personalizada](#step42)
* [5/Cómo escribir pruebas automatizadas](#step5)
<!--te-->

------------

# <a id="step3" /> Courses Android Compose Basic - Solution Code #AndroidBasics

# Training > Android Basics with Compose > Building App UI > IU y estado > 3/Introducción al estado en Compose

---

Solution code for the Android Basics with Compose

Exercise source: https://developer.android.com/codelabs/basic-android-kotlin-compose-using-state?hl=es-419&continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-3%3Fhl%3Des-419%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-using-state#0

# Description

------------

## [1\. Antes de comenzar](https://developer.android.com/codelabs/basic-android-kotlin-compose-using-state?hl=es-419&continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-3%3Fhl%3Des-419%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-using-state#0)

## 

En este codelab, aprenderás sobre el estado y cómo se puede usar y modificar con Jetpack Compose.

En esencia, el estado de una app es cualquier valor que puede cambiar con el tiempo. Esta definición es muy amplia y abarca desde una base de datos hasta una variable en tu app. Aprenderás más sobre las bases de datos en una unidad posterior. Sin embargo, por ahora, solo debes saber que una base de datos es un conjunto organizado de información estructurada, como los archivos en tu computadora.

Todas las apps para Android muestran un estado al usuario. Estos son algunos ejemplos de estado de las apps para Android:

-   Un mensaje que se muestra cuando no se puede establecer una conexión de red.
-   Formularios, como formularios de registro. Puedes completar y enviar tu estado.
-   Controles que se pueden presionar, como botones. El estado puede ser *no presionado*, *se está presionando* (animación de la pantalla) o *presionado* (una acción `onClick`).

En este codelab, explorarás cómo usar el estado y cómo pensar en él a la hora de usar Compose. Para ello, compilarás una app de calculadora de propinas llamada Tip Time con estos elementos integrados de la IU de Compose:

-   Un elemento `TextField` componible para ingresar y editar texto
-   Un elemento `Text` componible para mostrar texto
-   Un elemento `Spacer` componible para mostrar espacio vacío entre los elementos de la IU

Al final de este codelab, habrás creado una calculadora de propinas interactiva que calcula automáticamente el importe de la propina cuando ingresas el importe del servicio. En esta imagen, se muestra cómo se ve la app final:

![e82cbb534872abcf.png](https://developer.android.com/static/codelabs/basic-android-kotlin-compose-using-state/img/e82cbb534872abcf.png?hl=es-419)

## Requisitos previos

## 

-   Conocimientos básicos sobre Compose (como la anotación `@Composable`)
-   Conocimientos básicos sobre diseños de Compose, como los elementos de diseño `Row` y `Column` componibles
-   Conocimientos básicos sobre los modificadores, como la función `Modifier.padding()`
-   Conocimientos sobre el elemento `Text` componible

## Qué aprenderás

## 

-   Cómo pensar en el estado en una IU
-   Cómo Compose usa el estado para mostrar datos
-   Cómo agregar un cuadro de texto a tu app
-   Cómo elevar un estado

## Qué compilarás

## 

-   Una app para calcular propinas llamada Tip Time, que te permite calcular un importe según el importe del servicio.

## Requisitos

## 

-   Una computadora con acceso a Internet y un navegador web
-   Conocimientos sobre Kotlin
-   La versión más reciente de [Android Studio](https://developer.android.com/studio?hl=es-419)



------------

# <a id="step42" /> Training > Android Basics with Compose > Building App UI > IU y estado > 4/Calculo una propina personalizada

---

Solution code for the Android Basics with Compose

Exercise source: https://developer.android.com/codelabs/basic-android-kotlin-compose-calculate-tip?hl=es-419&continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-3%3Fhl%3Des-419%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-calculate-tip#0

# Description

------------
## [1\. Antes de comenzar](https://developer.android.com/codelabs/basic-android-kotlin-compose-calculate-tip?hl=es-419&continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-3%3Fhl%3Des-419%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-calculate-tip#0)

## 

En este codelab, usarás el código de la solución del codelab [Introducción al estado en Compose](https://developer.android.com/codelabs/basic-android-kotlin-compose-using-state?hl=es-419#0) para compilar una calculadora interactiva de propinas que puede calcular y redondear automáticamente un importe de propina cuando ingresas el importe de la factura y el porcentaje de propina. Puedes ver la app final en esta imagen:

![d8e768525099378a.png](https://developer.android.com/static/codelabs/basic-android-kotlin-compose-calculate-tip/img/d8e768525099378a.png?hl=es-419)

## Requisitos previos

## 

-   Haber completado el codelab [Introducción al estado en Compose](https://developer.android.com/codelabs/basic-android-kotlin-compose-using-state?hl=es-419#0)
-   Poder agregar los elementos componibles `Text` y `TextField` a una app
-   Conocer la función `remember()`, el estado, la elevación de estado y la diferencia entre las funciones de componibilidad con y sin estado

## Qué aprenderás

## 

-   Cómo agregar un botón de acción a un teclado virtual
-   Qué es un elemento `Switch` componible y cómo usarlo
-   Cómo agregar íconos iniciales a los campos de texto

## Qué compilarás

## 

-   Una app de Tip Time que calcula los importes de las propinas según el importe de la factura y el porcentaje de propina ingresados por el usuario

## Requisitos

## 

-   La versión más reciente de [Android Studio](https://developer.android.com/studio?hl=es-419)
-   El código de la solución del codelab [Introducción al estado en Compose](https://developer.android.com/codelabs/basic-android-kotlin-compose-using-state?hl=es-419#12)



------------

# <a id="step5" /> Training > Android Basics with Compose > Building App UI > IU y estado > 5/Cómo escribir pruebas automatizadas

---

Solution code for the Android Basics with Compose

Exercise source: https://developer.android.com/codelabs/basic-android-kotlin-compose-write-automated-tests?hl=es-419&continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-3%3Fhl%3Des-419%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-write-automated-tests#0

# Description

------------

## [1\. Antes de comenzar](https://developer.android.com/codelabs/basic-android-kotlin-compose-write-automated-tests?hl=es-419&continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-3%3Fhl%3Des-419%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-write-automated-tests#0)

## 

En este codelab, aprenderás sobre las pruebas automatizadas de Android y cómo te permiten escribir apps escalables y sólidas. También te familiarizarás con la diferencia entre la lógica de la IU y la lógica empresarial, y cómo probar ambas. Por último, aprenderás a escribir y ejecutar pruebas automatizadas en Android Studio.

## Requisitos previos

## 

-   Capacidad de escribir una app para Android con funciones y elementos componibles

## Qué aprenderás

## 

-   Qué hacen las pruebas automatizadas en Android
-   Por qué son importantes las pruebas automatizadas
-   Qué son las pruebas locales y para qué se usan
-   Qué es una prueba de instrumentación y para qué se usa
-   Cómo escribir pruebas locales para código Android
-   Cómo escribir pruebas de instrumentación para apps para Android
-   Cómo ejecutar pruebas automatizadas

## Qué compilarás

## 

-   Una prueba local
-   Una prueba de instrumentación

## Requisitos

## 

-   La versión más reciente de [Android Studio](https://developer.android.com/studio?hl=es-419)
-   El código de la solución de la app de Tip Time