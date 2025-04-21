# FinSys – Jednoduché digitálne prepitné 💸

## 📅 Checkpoint: 23.4.2025  
**Úloha:** Jedna obrazovka musí byť napojená na REST API (vrátane JWT tokenov) – 5 bodov

---

## 🧾 Popis

Aplikácia FinSys umožňuje jednoduché digitálne prepitné pre čašníkov, hudobníkov a pracovníkov služieb. Projekt je postavený na Angular + Spring Boot a komunikuje cez zabezpečené REST API pomocou JWT tokenov.

---

## 🔐 Funkcie

- Registrácia používateľa
- Prihlásenie s JWT tokenom
- Získanie používateľských údajov cez REST API
- Dashboard napojený na backend (JWT + databáza)
- Prívetivé UI + moderný dizajn

---

## 🖼️ Ukážky obrazoviek

### 1. Prihlásenie
![Login obrazovka](/git/login.png)

### 2. Registrácia
![Signup obrazovka](/git/signup.png)

### 3. Dashboard (napojený na REST API)
![Dashboard obrazovka](/git/d.png)

---

## 🔗 REST API príklad (GET meno používateľa):

GET /api/user Authorization: Bearer <JWT_TOKEN>


Backend automaticky dekóduje token, overí používateľa a vráti jeho meno zo systému.

---

## 🛠️ Použité technológie

- Angular
- Spring Boot
- PostgreSQL (Docker)
- JWT (io.jsonwebtoken)
- Bootstrap 5

---

## 👤 Autor

Roman Fenev, 2025  
Projekt pre checkpoint 23. apríla 2025
