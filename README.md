# **Plan de Aprendizaje para Java**

## **— Fundamentos Sólidos de Java —**

**Objetivo:** Dominar la base del lenguaje Java y los conceptos fundamentales de programación orientada a objetos.

### **Temas**

* **Sintaxis y conceptos básicos**

  * Tipos de datos, variables y operadores
  * Control de flujo: if, switch, for, while, do-while
  * Métodos y paso de parámetros

* **Colecciones básicas y manejo de datos**

  * Colecciones List, Set, Map (ArrayList, HashSet, HashMap)
  * Iteradores y bucles foreach

* **Programación Orientada a Objetos (POO)**

  * Clases y objetos
  * Encapsulamiento: modificadores de acceso (public, private, protected, default)
  * Constructores
  * Herencia, polimorfismo y abstracción
  * Interfaces y clases abstractas
  * Clases finales
  * Sobrecarga y sobreescritura de métodos

* **Manejo de errores y entrada/salida**

  * Excepciones y manejo con try-catch-finally
  * Entrada y salida básica (streams, lectura y escritura de archivos)

* **Fundamentos de la JVM**

  * Conceptos de JVM, compilación y ejecución
  * Instalación y configuración de JDK


## **— Ecosistema Java y Herramientas Avanzadas —**

**Objetivo:** Ampliar conocimientos del lenguaje, programación funcional, manejo avanzado y herramientas clave para desarrollo.

### **Temas**

* **Colecciones avanzadas y genéricos**

  * Uso avanzado de colecciones y genéricos
  * Clases internas, enums y anotaciones personalizadas

* **Programación funcional (Java 8+)**

  * Expresiones lambda
  * Streams API: filter, map, reduce
  * Optional para evitar NullPointerException

* **Manejo avanzado de excepciones**

  * Excepciones personalizadas
  * Propagación y manejo correcto

* **Concurrencia básica**

  * Threads, Runnable
  * ExecutorService y pools de hilos

* **Persistencia con JDBC**

  * Conexión a bases de datos
  * Consultas con Statement y PreparedStatement

* **Gestión de proyectos y dependencias**

  * Introducción a Maven y Gradle
  * Construcción, ejecución y manejo de dependencias

* **Testing**

  * Tests unitarios con JUnit 5
  * Mocking con Mockito


## **— Frameworks Empresariales y Arquitectura —**

**Objetivo:** Construir aplicaciones empresariales modernas usando frameworks y aplicar buenas prácticas profesionales.

### **Temas**

* **Spring Framework Core**

  * Inyección de dependencias (IoC)
  * Configuración con anotaciones y Java Config
  * Ciclo de vida de beans

* **Spring Boot**

  * Estructura y auto-configuración
  * Starters y configuración externa (application.properties / YAML)
  * Perfiles de aplicación

* **Acceso a datos con Spring Data JPA e Hibernate**

  * Mapeo ORM y entidades
  * Repositorios y consultas personalizadas

* **Desarrollo de APIs REST con Spring MVC**

  * Controladores REST
  * Validación con Hibernate Validator
  * Manejo centralizado de excepciones

* **Seguridad básica con Spring Security**

  * Autenticación y autorización
  * Configuración de roles y permisos

* **Patrones de diseño**

  * Patrones clave: Singleton, Factory, Strategy, Observer, Repository, Service
  * Principios SOLID

* **Arquitectura de software**

  * Capas de aplicación
  * Separación de responsabilidades
  * Manejo de logs, profiling y monitorización básica


## **— Microservicios, DevOps y Arquitectura Moderna —**

**Objetivo:** Implementar arquitecturas modernas y escalables basadas en microservicios, integración continua, despliegue automatizado y monitoreo profesional.

### **Temas**

* **Arquitectura de microservicios**

  * Principios y comparación con monolitos
  * Comunicación entre microservicios (REST, gRPC, mensajería)
  * Gestión de configuración distribuida (Spring Cloud Config)
  * Registro y descubrimiento de servicios (Eureka, Consul)

* **API Gateway y balanceo de carga**

  * Uso de API Gateway (Spring Cloud Gateway, Zuul)
  * Circuit breaker y patrones de resiliencia (Hystrix, Resilience4j)

* **Mensajería y eventos**

  * Integración con sistemas de mensajería (RabbitMQ, Kafka)
  * Arquitectura orientada a eventos (EDA)

* **Contenerización y orquestación**

  * Docker: creación y gestión de contenedores
  * Kubernetes básico: pods, despliegues, servicios

* **DevOps e integración continua / entrega continua (CI/CD)**

  * Pipelines con Jenkins, GitHub Actions o GitLab CI
  * Automatización de build, test y despliegue
  * Estrategias de despliegue (rolling updates, blue-green)

* **Testing avanzado para microservicios**

  * Pruebas contractuales (Consumer-Driven Contracts)
  * Pruebas de integración entre microservicios
  * Pruebas end-to-end

* **Monitorización y logging**

  * Centralización de logs (ELK Stack: Elasticsearch, Logstash, Kibana)
  * Métricas y alertas con Prometheus y Grafana
  * Distributed tracing (Jaeger, Zipkin)

* **Seguridad avanzada**

  * OAuth 2.0 y OpenID Connect para autenticación federada
  * Seguridad en microservicios (JWT, tokens, scopes)
  * Gestión de secretos y certificados
