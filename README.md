# Calculadora Java

Un proyecto Java simple que implementa una calculadora básica con operaciones matemáticas fundamentales y pruebas unitarias completas.

## 📋 Descripción

Este proyecto es una implementación educativa de una calculadora en Java que demuestra buenas prácticas de programación, manejo de excepciones y testing unitario. La calculadora incluye operaciones básicas como suma, resta, multiplicación, división, cálculo de porcentajes y raíz cuadrada.

## 🚀 Características

- **Operaciones básicas**: Suma, resta, multiplicación y división
- **Operaciones avanzadas**: Cálculo de porcentajes y raíz cuadrada
- **Manejo de errores**: Validación de división por cero y números negativos
- **Logging detallado**: Cada operación imprime información de entrada y resultado
- **Testing completo**: Cobertura de pruebas para todos los métodos y casos edge
- **Maven**: Gestión de dependencias y build automatizado

## 🛠️ Tecnologías

- **Java 17** - Lenguaje de programación
- **Maven** - Gestión de dependencias y build
- **JUnit 5** - Framework de testing
- **Maven Surefire Plugin** - Ejecución de pruebas

## 📁 Estructura del Proyecto

```
calculadoraTest/
├── pom.xml                 # Configuración de Maven
├── README.md              # Este archivo
├── src/
│   ├── main/java/
│   │   └── Calculadora.java    # Clase principal de la calculadora
│   └── test/java/
│       └── CalculadoraTest.java # Pruebas unitarias
└── target/                # Archivos compilados (generado)
```

## ⚙️ Requisitos

- Java 17 o superior
- Maven 3.6 o superior

## 🚀 Instalación y Uso

### 1. Clonar el repositorio
```bash
git clone <url-del-repositorio>
cd calculadoraTest
```

### 2. Compilar el proyecto
```bash
mvn clean compile
```

### 3. Ejecutar las pruebas
```bash
mvn test
```

### 4. Ejecutar la aplicación
```bash
mvn exec:java -Dexec.mainClass="Calculadora"
```

## 💻 Uso de la Calculadora

### Operaciones Disponibles

#### Suma
```java
Calculadora calc = new Calculadora();
int resultado = calc.sumar(5, 3); // Retorna 8
```

#### Resta
```java
int resultado = calc.restar(10, 4); // Retorna 6
```

#### Multiplicación
```java
int resultado = calc.multiplicar(6, 7); // Retorna 42
```

#### División
```java
int resultado = calc.dividir(20, 5); // Retorna 4
```

#### Porcentaje
```java
double porcentaje = calc.porcentaje(25, 100); // Retorna 25.0
```

#### Raíz Cuadrada
```java
double raiz = calc.raizCuadrada(16); // Retorna 4.0
```

## 🧪 Testing

El proyecto incluye una suite completa de pruebas unitarias que cubren:

- **Casos normales**: Operaciones con números positivos y negativos
- **Casos edge**: División por cero, raíz cuadrada de números negativos
- **Validaciones**: Verificación de resultados esperados
- **Manejo de excepciones**: Testing de casos que deben lanzar errores

### Ejecutar Tests Específicos

```bash
# Ejecutar solo tests de suma
mvn test -Dtest=CalculadoraTest#testSumar

# Ejecutar tests de división
mvn test -Dtest=CalculadoraTest#testDividir*
```

## 🔍 Casos de Uso y Validaciones

### Validaciones Implementadas

1. **División por cero**: Lanza `ArithmeticException`
2. **Porcentaje con total cero**: Lanza `ArithmeticException`
3. **Raíz cuadrada de número negativo**: Lanza `IllegalArgumentException`

### Logging

Cada operación incluye logging detallado:
- Parámetros de entrada
- Resultado de la operación
- Mensajes de error cuando aplica

## 📊 Métricas del Proyecto

- **Líneas de código**: ~57 líneas en la clase principal
- **Métodos**: 6 métodos públicos
- **Tests**: 12 casos de prueba
- **Cobertura**: 100% de los métodos principales

## 🤝 Contribución

Para contribuir al proyecto:

1. Fork el repositorio
2. Crea una rama para tu feature (`git checkout -b feature/nueva-funcionalidad`)
3. Commit tus cambios (`git commit -am 'Agrega nueva funcionalidad'`)
4. Push a la rama (`git push origin feature/nueva-funcionalidad`)
5. Crea un Pull Request

## 📝 Licencia

Este proyecto está bajo la Licencia MIT. Ver el archivo `LICENSE` para más detalles.

## 👨‍💻 Autor

Desarrollado como proyecto educativo para demostrar conceptos de Java, testing y buenas prácticas de programación.

## 🔗 Enlaces Útiles

- [Documentación de Java](https://docs.oracle.com/en/java/)
- [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)
- [Maven Documentation](https://maven.apache.org/guides/)

---

⭐ **¡No olvides dar una estrella al proyecto si te fue útil!**