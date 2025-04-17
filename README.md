# Projet Spring boot

Ce projet est une application basée sur **Spring Boot**, construite avec **Maven** et conçue pour fonctionner avec **Java 21**.

---

## Prérequis

Avant de lancer le projet, assurez-vous d’avoir installé :

- **Java Development Kit (JDK) 21**  
  ➤ [Télécharger JDK 21](https://www.graalvm.org/downloads/)

- **Apache Maven 3.9 ou supérieur**  
  ➤ [Télécharger Maven](https://maven.apache.org/download.cgi)

- **Docker**  
  ➤ [Télécharger Docker](https://www.docker.com/products/docker-desktop/)

- Un IDE comme **IntelliJ IDEA**, **Eclipse** ou **Visual Studio Code** (optionnel mais recommandé)

Vérifiez vos versions avec les commandes suivantes :

```bash
java -version
mvn -version
```

## Demarrage du projet

- Clonez le repository
```bash
git clone https://github.com/nderhore/studi-live-java-web.git
cd studi-live-java-web
```

- Demarrez la database en local via docker-compose
```bash
docker-compose up -d
```

- Lancez l'application
```bash
mvn spring-boot:run
```

## Utilisation

Par défaut, l'application sera disponible à l'adresse : http://localhost:8080/api