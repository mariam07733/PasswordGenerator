# PasswordGenerator

## Description

PasswordGenerator est une application développée en Java 21 permettant de générer des mots de passe sécurisés.

## Fonctionnalités

- Génération de mots de passe personnalisés
- Choix de la longueur
- Choix des caractères (majuscules, minuscules, chiffres, symboles)
- Évaluation de la robustesse
- Génération multiple (mode rafale)
- Conteneurisation avec Docker

## Technologies utilisées

- Java 21
- Maven
- Docker
- Git
- GitHub

## Compilation

```bash
mvn clean package
```

## Construction de l'image Docker

```bash
docker build -t password-generator .
```

## Exécution

```bash
docker run -it password-generator
```

## Auteur

**Mariam Seraya Toure**
