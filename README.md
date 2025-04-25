# Proyecto de Testeo con JUnit

Este proyecto se trata de testear el codigo de uno de mis compañeros, Alberto Estepa Gomez, usando JUnit.

## 🧪 Testing con JUnit 5

He desarrollado pruebas para las clases `Usuario`, `Pedir_datos`, `Menu` y `Main`. Estas pruebas detectan errores potenciales y cosas a mejorar en el diseño del código.

## 🔍 Errores y mejoras detectadas

### 1. **Dependencia fuerte de `System.in` y `Scanner`**
- Métodos en `Pedir_datos` y `Menu` usan directamente `Scanner` y `System.in`.
- Esto dificulta el testeo automático ya que no permite la simulación sin manipular `System.in`.

🔧 **Mejora recomendada**: usar unicamente un `scanner`, el cual se pueda reemplazar de manera sencilla en el testeo.

---

### 2. **Acoplamiento en `Menu.menu()`**
- La lógica principal del programa está toda en el método `menu()`, lo que dificulta el testeo.
- No hay separación entre lógica y la presentación.

🔧 **Mejora recomendada**: separar funciones específicas como `procesarIngreso()`, `procesarGasto()`, `mostrarSaldo()`, etc.

---

### 3. **Falta de setters en `Usuario`**
- Aunque existen getters y setters, no se actualiza `ingresos` al sumar dinero, ni se calcula el `saldo` de forma automática.

🔧 **Mejora recomendada**: centralizar la lógica de actualización dentro de `Usuario`.
