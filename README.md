# Algoritmos de Árboles Binarios

## 📌 Información General
- **Título:** Implementación de Algoritmos de Árboles Binarios
- **Asignatura:** Estructura de Datos
- **Carrera:** Computación
- **Estudiantes:** [Nombre del estudiante]
- **Fecha:** 5 de julio del 2025
- **Profesor:** Ing. Pablo Torres

---

## 🛠 Descripción

Este proyecto implementa y demuestra diferentes algoritmos fundamentales para el manejo de árboles binarios en **Java**, incluyendo:

- **Inserción en BST (Binary Search Tree)** - Algoritmo de inserción en árbol binario de búsqueda
- **Inversión de Árbol Binario** - Algoritmo para invertir completamente un árbol binario
- **Listado por Niveles** - Recorrido por niveles usando BFS (Breadth-First Search)
- **Cálculo de Profundidad** - Determinación de la altura máxima del árbol
- **Árbol AVL** - Implementación de árbol auto-balanceado con rotaciones

El sistema incluye:
- Clases modelo para representar nodos del árbol
- Controladores para manejo de diferentes tipos de árboles
- Métodos de recorrido (in-order, pre-order, post-order)
- Pruebas unitarias con JUnit para validar la funcionalidad
- Visualización del árbol en formato texto

---

## 🚀 Ejecución

Para ejecutar el proyecto:

1. Asegúrate de tener Java JDK 11 o superior instalado
2. Compila el proyecto desde la raíz:
```bash
javac -cp ".:lib/*" src/main/App.java
```
3. Ejecuta la aplicación principal:
```bash
java -cp ".:lib/*:src" main.App
```

Para ejecutar las pruebas unitarias:
```bash
java -cp ".:lib/*:src" org.junit.runner.JUnitCore test.Ejercicio_01_insert.InsertBSTTest
```

---

## 📁 Estructura del Proyecto

```
src/
├── main/
│   ├── App.java                          # Clase principal
│   ├── Ejercicio_01_insert/
│   │   └── InsertBST.java               # Inserción en BST
│   ├── Ejercicio_02_invert/
│   │   └── InvertBinaryTree.java        # Inversión de árbol
│   ├── Ejercicio_03_listLeves/
│   │   └── ListLevels.java              # Listado por niveles
│   ├── Ejercicio_04_depth/
│   │   └── Depth.java                   # Cálculo de profundidad
│   └── Materia/
│       ├── Controllers/
│       │   ├── AVLTree.java             # Árbol AVL auto-balanceado
│       │   ├── ArbolBinario.java        # Árbol binario básico
│       │   └── ArbolRecorridos.java     # Métodos de recorrido
│       └── Models/
│           └── Node.java                # Clase nodo del árbol
└── test/
    └── [Pruebas unitarias para cada ejercicio]
```

---

## 🧪 Funcionalidades Implementadas

### 1. Inserción en BST
- Inserción recursiva manteniendo propiedades del BST
- Recorrido in-order para verificar ordenamiento
- Complejidad: O(log n) promedio, O(n) peor caso

### 2. Inversión de Árbol Binario
- Intercambio recursivo de subárboles izquierdo y derecho
- Preserva la estructura original del árbol
- Complejidad: O(n) donde n es el número de nodos

### 3. Listado por Niveles (BFS)
- Recorrido nivel por nivel usando cola (Queue)
- Retorna lista de listas con nodos por nivel
- Complejidad: O(n) tiempo y espacio

### 4. Cálculo de Profundidad Máxima
- Determina la altura del árbol recursivamente
- Considera el camino más largo desde la raíz
- Complejidad: O(n) tiempo, O(h) espacio (h = altura)


---

## 🧪 Ejemplo de Salida por Consola

```
👤 Estudiante: [Nombre]
✉️  Correo: [correo@ejemplo.com]

* Nodo a insertar: 10
├── 10
│   ├── null
│   └── null
Nodo insertado: 10, Balance: 0

* Nodo a insertar: 20
├── 10
│   ├── null
│   └── 20
...

Inorder traversal: 8, 9, 10, 15, 20, 21, 23, 24, 25, 50
```

---

## 📊 Análisis de Complejidad

| Algoritmo | Tiempo Promedio | Tiempo Peor Caso | Espacio |
|-----------|----------------|------------------|---------|
| Inserción BST | O(log n) | O(n) | O(h) |
| Inversión | O(n) | O(n) | O(h) |
| Listado por Niveles | O(n) | O(n) | O(n) |
| Profundidad | O(n) | O(n) | O(h) |


*Donde n = número de nodos, h = altura del árbol*

---

## ✅ Conclusiones

La implementación de algoritmos de árboles binarios demuestra la importancia de las estructuras de datos jerárquicas en la computación:

- **BST** ofrece búsqueda eficiente pero puede degradarse sin balanceo
- **Árboles AVL** garantizan operaciones logarítmicas mediante auto-balanceo
- **Recorridos** permiten procesamiento sistemático de datos jerárquicos
- **Inversión** muestra manipulación estructural de árboles
- **BFS** proporciona acceso nivel por nivel para análisis jerárquico

Los árboles balanceados como AVL son fundamentales para aplicaciones que requieren garantías de rendimiento, mientras que los BST simples son adecuados para casos donde el balanceo no es crítico.

---

## 🔧 Dependencias

- Java JDK 11+
- JUnit 5 para pruebas unitarias
- No se requieren dependencias externas adicionales

---

## 📝 Notas Adicionales

- Todos los algoritmos incluyen validación de entrada
- Las pruebas unitarias cubren casos base y casos límite
- La visualización del árbol facilita la comprensión de la estructura
- El código sigue principios de programación orientada a objetos