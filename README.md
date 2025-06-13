## Journey of Learning Spring 💫


> **"Spring Boot lets you focus on building features, not fighting configurations."**


👋 Welcome! If you're new to Spring Boot or just exploring REST APIs, this repository is a great place to start. Dive in, experiment, and build confidently!

 
---

## ⛅ What is Spring & Spring Boot?

**Spring Framework**
A comprehensive Java platform offering features for dependency injection (IoC), aspect‑oriented programming, transaction management, MVC web apps, data access, and more. It’s modular, allowing you to pick only what you need.

**Spring Boot**
Built on Spring, Boot provides auto‑configuration, embedded servers (Tomcat/Jetty), opinionated defaults, and faster development with minimal setup. Just run your `main()` and expose REST endpoints with ease.

---

## 🔍 Operations Used in this API

| HTTP Method      | Annotation | Purpose                        |
| ---------------- | ---------- | ------------------------------ |
| `@PostMapping`   | Create     | Adds new CloudVendor details   |
| `@GetMapping`    | Read       | Retrieves vendor details by ID |
| `@PutMapping`    | Update     | Updates existing vendor record |
| `@DeleteMapping` | Delete     | Removes vendor record          |

Spring MVC maps these HTTP methods to controller methods. Jackson auto‑converts between JSON and Java objects based on your model’s getters/setters.

---

## ✅ Getting Started

**To run your API:**

```bash
mvn spring‑boot:run
```

* **POST** `http://.../API/Learn`

  ```json
  {
    "vendorId": "100",
    "vendorName": "One",
    "vendorAddress": "AddOne",
    "vendorContact": "100"
  }
  ```

* **GET** `http://.../API/Learn/100` → returns the JSON object you created.

* **PUT** `/update` → update the model

* **DELETE** `/100` → clear the stored vendor

---
## Give it a SHOT!


> Feel free to explore, modify, and enhance this project to deepen your understanding of Spring Boot and RESTful API development.

Come on you too learn Spring it's easy
