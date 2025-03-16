# Clients et Factures

[![Java](https://img.shields.io/badge/Java-8-orange.svg)](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)
[![Licence](https://img.shields.io/badge/Licence-MIT-blue.svg)](LICENSE)

Un système simple de gestion de clients et factures en Java.

## 📋 Table des matières

- [Description](#description)
- [Fonctionnalités](#fonctionnalités)
- [Structure du projet](#structure-du-projet)
- [Prérequis](#prérequis)
- [Installation](#installation)
- [Utilisation](#utilisation)
- [Exemples](#exemples)
- [Architecture](#architecture)
- [Améliorations possibles](#améliorations-possibles)
- [Contribution](#contribution)
- [Licence](#licence)

## 📝 Description

Ce projet implémente un système de gestion basique permettant de créer des clients, de leur associer des factures et de suivre l'état des paiements. Il offre une interface simple pour gérer les relations client-facture et effectuer des analyses basiques sur les paiements.

## ✨ Fonctionnalités

### Gestion des clients
- ✅ Création, modification et suppression de clients
- ✅ Stockage centralisé de tous les clients
- ✅ Récupération de la liste complète des clients

### Gestion des factures
- ✅ Création de factures avec montants validés (pas de montants négatifs)
- ✅ Suivi de l'état de règlement (payé/non payé)
- ✅ Date automatique de création des factures
- ✅ Possibilité de dupliquer des factures existantes
- ✅ Suppression de factures

### Fonctionnalités analytiques
- ✅ Calcul du montant total des factures par client
- ✅ Filtrage des factures selon leur état de règlement

## 📁 Structure du projet

```
ClientsEtFactures/
├── .settings/
│   └── org.eclipse.jdt.core.prefs
├── src/
│   └── metier/
│       ├── Client.java  - Gestion des clients et leurs factures
│       └── Facture.java - Représentation d'une facture
├── tests/               - Tests unitaires (à implémenter)
├── .classpath
├── .gitignore
└── .project
```

## 🔧 Prérequis

- Java JDK 8 ou supérieur
- Un IDE Java (Eclipse recommandé)

## 📥 Installation

1. Clonez le dépôt :
```bash
git clone https://github.com/votre-username/ClientsEtFactures.git
```

2. Importez le projet dans Eclipse :
   - File > Import > Existing Projects into Workspace
   - Sélectionnez le dossier racine du projet
   - Cliquez sur Finish

## 🚀 Utilisation

Le projet définit deux classes principales :

### Client

Représente un client avec un nom et une collection de factures.

### Facture

Représente une facture associée à un client, avec un montant, une date et un état de règlement.

## 📋 Exemples

### Création d'un client et ajout de factures

```java
// Création d'un nouveau client
Client client = new Client("Entreprise ABC");

// Création de factures
Facture factureStandard = client.createFacture(1500);  // Non réglée par défaut
Facture factureReglee = client.createFacture(3000, true);  // Facture réglée
```

### Obtention des statistiques de facturation

```java
// Obtenir toutes les factures d'un client
List<Facture> toutesFactures = client.getFactures();

// Obtenir seulement les factures réglées
List<Facture> facturesReglees = client.facturesReglees();

// Calculer le montant total des factures
int montantTotal = client.sommeMontants();
System.out.println("Montant total facturé : " + montantTotal + " €");
```

### Manipulation des factures

```java
// Duplication d'une facture
Facture copieFacture = factureStandard.copie();

// Suppression d'une facture
factureStandard.delete();
```

## 🏗️ Architecture

Le projet suit une architecture simple orientée objet :

- **Client** : Contient des références vers des objets `Facture`
- **Facture** : Possède une référence vers son `Client`

Cette relation bidirectionnelle permet de naviguer facilement entre les clients et leurs factures.

## 🔄 Améliorations possibles

1. Intégration d'une base de données pour la persistance
2. Ajout d'une interface utilisateur graphique
3. Mise en place de tests unitaires complets
4. Correction des problèmes d'encodage dans les commentaires Javadoc
5. Amélioration de la gestion des exceptions
6. Normalisation des noms de variables et méthodes
7. Implémentation d'une gestion plus avancée des factures (échéances, relances, etc.)

## 👥 Contribution

Les contributions sont les bienvenues ! Pour contribuer :

1. Forkez le projet
2. Créez une branche pour votre fonctionnalité (`git checkout -b feature/nouvelle-fonctionnalite`)
3. Committez vos changements (`git commit -am 'Ajout d'une nouvelle fonctionnalité'`)
4. Poussez la branche (`git push origin feature/nouvelle-fonctionnalite`)
5. Ouvrez une Pull Request
