# Construction de l'image docker
FROM maven:3.9.9-eclipse-temurin-21-alpine AS build

# créer un repertoire de travail
# mkdir /app && cd
WORKDIR /toto

# je copie le projet
COPY . .

# telechargement des dependances & compilation
RUN mvn clean package -DskipTests -Pdocker

# executer le code : JRE
FROM eclipse-temurin:21.0.7_6-jre-alpine-3.21

WORKDIR /app

COPY --from=build /toto/target/*.war application.war

EXPOSE 8080

#commande de lancement applicative
ENTRYPOINT ["java","-jar","/app/application.war","--spring.profiles.active=docker"]