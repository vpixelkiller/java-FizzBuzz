<<<<<<< Updated upstream
# java-FizzBuzz
Java FizzBuzz Kata
=======
# FizzBuzz (Kata)

## Requisitos

- **Java 21**
- **Maven**

## Ejecutar los tests

```bash
mvn test
```
## Generar un nuevo entorno de test
```bash
mvn archetype:generate -DgroupId=com.kata -DartifactId=FizzBuzz -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```

## Modificación en el pom.xml
    - Se cambiaba a la versión de java que tenemos en local (donde ejecutamos la kata)

```xml
    <maven.compiler.source>versión de java (en número)</maven.compiler.source>
    <maven.compiler.target>versión de java (en número)</maven.compiler.target>
```
>>>>>>> Stashed changes
