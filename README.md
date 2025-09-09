# Reto Técnico – Automatización con Serenity BDD & Screenplay

Este proyecto implementa la **automatización de pruebas ** sobre el componente **JQuery Datepicker**, utilizando el patrón **Screenplay** de Serenity BDD junto con **Cucumber** para la definición de escenarios en lenguaje Gherkin.

---

## 🚀 Tecnologías utilizadas

- [Java 17]
- [Gradle 8] 
- [Serenity BDD 4.0.28] 
- [Cucumber ] 
- [Screenplay Pattern]

---

## 📂 Estructura del proyecto


- **`tasks`**: Contienen las acciones que realiza el actor (ej. abrir página, seleccionar día, navegar entre meses).
- **`questions`**: Validaciones sobre la UI (ej. comprobar la fecha seleccionada en el campo).
- **`stepdefinitions`**: code que conecta los escenarios Gherkin con las Tasks y Questions.
- **`utils`**: Métodos de ayuda.

---

## ⚙️ Configuración

### Requisitos previos
- Tener instalado **Java 17**
  ```bash
  java -version
- Tener instalado Gradle (aunque puedes usar el wrapper ./gradlew)
    ```bash
    gradle -v
