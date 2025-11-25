# 🛒 E-Commerce Microservices – Projet PFA

Ce projet implémente une architecture e-commerce basée sur plusieurs **microservices Spring Boot**.  
L’objectif est de créer un système distribué fiable permettant la gestion des clients, du stock et de la facturation, tout en utilisant les outils Spring Cloud (Gateway, Eureka, Config).

---

##  Architecture globale

L’architecture repose sur les services suivants :

- **customer-service** : gestion des clients  
- **inventory-service** : gestion des produits et du stock  
- **billing-service** : création des factures  
- **gateway-service** : point d’entrée unique pour toutes les APIs  
- **discovery-service (Eureka)** : registre de services  
- **config-service** : centralisation des configurations  



## Microservices

### 1. customer-service
- CRUD complet des clients  
- API REST  
- Enregistrement dans Eureka  
- Configuration externe via Config Server  
- Base MySQL  

### 2. inventory-service
- Gestion des produits  
- Quantités en stock  
- API REST  
- Enregistrement dans Eureka  

### 3. billing-service
- Création automatique de factures  
- Communication avec customer-service et inventory-service  
- Exposition d’API REST  

### 4. gateway-service
- Routage dynamique vers chaque microservice  
- Intégration avec Discovery  
- Préparation à la sécurisation (JWT possible)

### 5. discovery-service (Eureka)
- Centralise l’état de chaque microservice  
- Donne la disponibilité de chaque service  
- Interface web : http://localhost:8761  

Capture recommandée :  
``<img width="1065" height="2556" alt="localhost_8761_ (4)" src="https://github.com/user-attachments/assets/db7f0136-683e-45d6-b7ea-8c55da80a3c7" />


```

### 6. config-service
- Déploie les `application.properties` depuis un repo Git  
- Facilite l’uniformisation des configurations

```
<img width="1464" height="747" alt="image" src="https://github.com/user-attachments/assets/db003873-a71f-486d-89a1-ea5aff486ba8" />

```

---

## 🛠️ Technologies utilisées

- Java 21
- Spring Boot 4
- Spring Cloud 2023  
- Eureka Discovery  
- Spring Cloud Gateway  
- Spring Cloud Config  
- Maven  
- H2

---

## 📁 Structure du projet

```
ecommerce-microservices/
│
├── customer-service/
├── inventory-service/
├── billing-service/
├── gateway-service/
├── discovery-service/
└── config-service/
```

---

## ⚙️ Installation & exécution

### 1. Cloner le projet
```
git clone https://github.com/fahdjabbar/Microservices_project-.git
```

### 2. Lancer un microservice
Dans chaque dossier :
```
mvn spring-boot:run
```

### 3. Lancer les services dans cet ordre recommandé
1. discovery-service  
2. config-service 
3. customer-service  
4.  inventory-service 
5.  billing-service 
6.  gateway-service 

---

## 🌐 URLs principales

| Service | URL |
|--------|-----|
| **Gateway** | http://localhost:8888 |
| **Eureka Discovery** | http://localhost:8761 |
| **Customer Service** | http://localhost:8081 |
| **Inventory Service** | http://localhost:8082 |
| **Billing Service** | http://localhost:8083 |

---

## 📷 Captures d’écran principales

### Dashboard Eureka
```
<img width="1883" height="796" alt="image" src="https://github.com/user-attachments/assets/e1873363-ae8e-4e27-9daf-0c90ae43bc23" />

```

### Gateway Routes
```
<img width="1479" height="910" alt="image" src="https://github.com/user-attachments/assets/1f1dd6c1-cfd9-4f64-b4ba-7f011d3d3395" />

<img width="1479" height="927" alt="image" src="https://github.com/user-attachments/assets/ae349c8d-466a-48e6-96d1-06fe8e39c32d" />

<img width="1821" height="935" alt="Capture d&#39;écran 2025-11-17 160104" src="https://github.com/user-attachments/assets/d12c8dde-b18d-49ba-8185-5c2fcd1d5801" />


```

### Customer API
```
<img width="1920" height="1008" alt="Capture d&#39;écran 2025-11-17 114417" src="https://github.com/user-attachments/assets/9aefb701-401d-4c85-80a1-9419e03a84bd" />

```



---

## 📌 Fonctionnalités

- Gestion des clients  
- Gestion des produits  
- Gestion des stocks  
- Création automatique des factures  
- Architecture distribuée basée sur microservices  
- Découverte, routage et configuration centralisée  

---

## 🔄 Évolutions prévues

- Ajout du frontend Angular  
- Intégration d’une authentification JWT  
- Ajout d’un service Order / Paiement  
- Containerisation Docker  
- Monitoring (Prometheus / Grafana)  

---

## 🧑‍💻 Auteur

Fahd Jabbar
Étudiant Cycle Ingénieur 

