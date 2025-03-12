# Système de Gestion de Consultations Médicales
Ce système permet la gestion complète des patients et des consultations médicales au sein d'un cabinet médical. Il est développé en Java avec JavaFX pour l'interface graphique et MySQL pour le stockage des données.

## Fonctionnalités
### Gestion des Patients

* Ajout de nouveaux patients
* Modification des informations des patients existants
* Suppression de patients
* Visualisation de la liste des patients

### Gestion des Consultations

* Planification de nouvelles consultations
* Association d'une consultation à un patient
* Modification des détails d'une consultation
* Suppression de consultations
* Visualisation de l'historique des consultations

## Architecture du Système
Le système est construit selon une architecture en couches (MVC):

### Couche Modèle (Entités)

* Patient : stocke les informations personnelles du patient
* Consultation : contient les détails d'une consultation


### Couche DAO (Data Access Object)

* PatientDao : gère l'accès aux données des patients
* ConsultationDao : gère l'accès aux données des consultations


### Couche Service

* CabinetService : orchestre les opérations métier et coordonne l'accès aux DAO


### Couche Présentation

* Vues (PatientView, ConsultationView, MainView) : interfaces utilisateur
* Contrôleurs (PatientController, ConsultationController) : gestion des interactions

**********************************************************************************************************************

## Interface Utilisateur
### Onglet Patients
* Remplir un formulaire avec les informations du patient (nom, prénom, téléphone)
* Ajouter un nouveau patient en cliquant sur "Ajouter"
* Sélectionner un patient existant dans le tableau pour modifier ses informations
* Mettre à jour les données d'un patient en cliquant sur "Modifier"
* Supprimer un patient en le sélectionnant puis en cliquant sur "Supprimer"

![Capture d'écran de l'application](./images/Capture1.png)

## Onglet Consultations
### L'interface de gestion des consultations permet de:

* Sélectionner une date pour la consultation
* Choisir un patient dans la liste déroulante
* Ajouter une description détaillée de la consultation
* Enregistrer une nouvelle consultation en cliquant sur "Ajouter"
* Sélectionner une consultation existante pour la modifier
* Mettre à jour les détails d'une consultation en cliquant sur "Modifier"
* Supprimer une consultation en la sélectionnant puis en cliquant sur "Supprimer"

![Capture d'écran de l'application](./images/Capture2.png)

