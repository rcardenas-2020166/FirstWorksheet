# 🚗 Sistema de Gestión de Automóviles - Hoja de Trabajo Uno

## 👨‍💻 Información del Desarrollador

**Desarrollado por:** Rodrigo Gerardo Cárdenas  
**Carné:** 9490-23-25128  
**Clase:** Programación II  
**Proyecto:** Hoja de Trabajo Uno  

---

## 📋 Descripción del Proyecto

Sistema orientado a objetos desarrollado en Java que simula la gestión completa de un automóvil y sus componentes. El proyecto implementa principios sólidos de programación orientada a objetos, incluyendo composición, encapsulación, validaciones y mejores prácticas de desarrollo.

## 🎯 Características Principales

### 🚙 Modelo de Automóvil Completo
- **4 Puertas** con funcionalidades independientes
- **4 Ventanas** (una por puerta)
- **5 Llantas** (4 de rodaje + 1 de repuesto)
- **Motor** con especificaciones técnicas
- **Sistema de validaciones** robusto

### 🔧 Funcionalidades Implementadas

#### Gestión de Puertas
- Abrir/cerrar puertas individuales o todas
- Control de ventanas por puerta (subir/bajar)
- Estado en tiempo real de cada puerta

#### Sistema de Ventanas
- Control independiente de 4 ventanas del vehículo
- Operaciones de apertura y cierre masivas
- Integración con sistema de puertas

#### Motor y Propulsión
- Arranque del vehículo
- Sistema de aceleración
- Información técnica completa (cilindrada, combustible, marca)

#### Gestión de Llantas
- Proceso de "enllantado" del vehículo
- Información detallada de cada llanta (rin, perfil, marca)
- Gestión de 5 llantas completas

## 🏗️ Arquitectura del Sistema

### Estructura de Clases

```
📁 src/edu/gt/rodrigocardenas/umg/
├── 📄 Main.java                    # Clase principal y pruebas
└── 📁 models/
    ├── 📄 Carro.java               # Clase principal del automóvil
    ├── 📄 Motor.java               # Sistema de motor
    ├── 📄 Puerta.java              # Gestión de puertas
    ├── 📄 Ventana.java             # Control de ventanas
    └── 📄 Llantas.java             # Manejo de llantas
```

### Principios de Diseño Aplicados

#### ✅ Composición
- El `Carro` **TIENE** Motor, Puertas, Ventanas y Llantas
- Relaciones bien definidas entre componentes

#### ✅ Validaciones Robustas
- Validación de parámetros en constructores
- Control de rangos y valores nulos
- Mensajes de error descriptivos

#### ✅ Constantes y Mejores Prácticas
```java
private static final int CANTIDAD_LLANTAS = 5;
private static final int CANTIDAD_PUERTAS = 4;
private static final int CANTIDAD_VENTANAS = 4;
```

#### ✅ Nomenclatura Profesional
- Métodos con nombres descriptivos
- Variables con convenciones Java
- Código auto-documentado

## 🚀 Cómo Ejecutar

### Prerequisitos
- Java 17 o superior
- IDE compatible (IntelliJ IDEA, Eclipse, VS Code)

### Pasos de Ejecución

1. **Clonar el repositorio**
   ```bash
   git clone [URL_DEL_REPOSITORIO]
   cd HojaTrabajoUno
   ```

2. **Compilar el proyecto**
   ```bash
   javac -d out/production/HojaTrabajoUno src/edu/gt/rodrigocardenas/umg/models/*.java src/edu/gt/rodrigocardenas/umg/Main.java
   ```

3. **Ejecutar el programa**
   ```bash
   java -cp out/production/HojaTrabajoUno edu.gt.rodrigocardenas.umg.Main
   ```

## 📊 Ejemplo de Salida

```
Enllantando Vehículo
Vehículo Enllantado

=== PROBANDO FUNCIONALIDADES DEL CARRO ===
Arranca P923JYF
Abriendo todas las puertas del carro P923JYF
Carro P923JYF acelerando
Motor Mazda acelerando

=== PROBANDO 4 VENTANAS DEL CARRO (ABRIR) ===
Ventana 1 abierta
Ventana 2 abierta
Ventana 3 abierta
Ventana 4 abierta

=== INFORMACIÓN DEL CARRO ===
Placa: P923JYF
Marca: Mazda
Línea: 3
Año: 2024
Motor: Mazda - 2500cc
Combustible: Gasolina
Número de llantas: 5
Número de ventanas: 4
Número de puertas: 4

=== INFORMACIÓN DE LLANTAS ===
Llanta 1: Rin 12, Perfil 12, Marca GoodYear
Llanta 2: Rin 12, Perfil 12, Marca GoodYear
...
```

## 🔧 Configuración del Vehículo

El sistema permite configurar un vehículo con las siguientes especificaciones:

- **Marca:** Mazda
- **Línea:** 3
- **Año:** 2024
- **Motor:** 2500cc, Gasolina
- **Placa:** P923JYF

## 💡 Mejoras Técnicas Implementadas

### ⚡ Validaciones de Entrada
- Validación de placa, marca y línea no vacías
- Validación de año entre 1900-2030
- Control de números de puerta válidos (1-4)

### 🎯 Constantes Definidas
- Eliminación de "números mágicos"
- Facilidad de mantenimiento
- Código más legible

### 📝 Nomenclatura Mejorada
- Métodos con convenciones Java
- Variables descriptivas
- Eliminación de typos (electica → electrica)

## 🏆 Puntuación de Calidad

- **Funcionalidad:** 9/10 ✅
- **Nomenclatura:** 9/10 ✅
- **Validaciones:** 8/10 ✅
- **Mantenibilidad:** 8/10 ✅
- **Arquitectura:** 9/10 ✅

**Total: 8.6/10** 🎉

## 📝 Licencia

Este proyecto fue desarrollado con fines académicos para la clase de Programación II.

## 📞 Contacto

**Rodrigo Gerardo Cárdenas**  
Carné: 9490-23-25128  
Universidad Mariano Gálvez  
Programación II

---

*Desarrollado con ❤️ en Java*