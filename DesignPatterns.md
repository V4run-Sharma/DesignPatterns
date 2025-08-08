# Introduction to Design Patterns

## 📌 What Are Design Patterns?

Design patterns are **proven, reusable solutions** to common software design problems.  
They are **not code you copy-paste**, but **templates or blueprints** that guide you in structuring your code.

Think of them like **recipes**:

- A recipe doesn't give you the final dish — it gives you **steps and guidelines** to make it.
- Similarly, a design pattern tells you **how to structure classes, objects, and interactions** for a particular kind of
  problem.

---

## 💡 Why Use Design Patterns?

- **Reusable**: Solve problems once, reuse the solution in multiple projects.
- **Readable**: Other developers instantly recognize patterns, making code easier to understand.
- **Maintainable**: Patterns encourage modular, well-structured code.
- **Proven**: Used and tested in countless real-world applications.

---

## 🏗 Categories of Design Patterns

Design patterns are generally grouped into three categories:

1. **Creational** — Focus on **object creation mechanisms**.
2. **Structural** — Focus on **how classes and objects are composed**.
3. **Behavioral** — Focus on **how objects interact and communicate**.

---

## 📚 Common Design Patterns

### 1. Singleton (Creational)

**Purpose:** Ensure only **one instance** of a class exists, and provide a global point of access to it.  
**Example Use Cases:** Logger, configuration manager, thread pool.

**Key Points:**

- Private constructor (prevents direct instantiation).
- Static method to return the single instance.
- Often combined with `volatile` and double-checked locking for thread safety.

---

### 2. Factory Method (Creational)

**Purpose:** Define an **interface for creating objects**, but let subclasses decide which class to instantiate.  
**Example Use Cases:** Creating different types of documents, shapes, or notifications.

**Key Points:**

- Caller doesn't need to know the exact class name.
- Promotes loose coupling between client and concrete classes.

---

### 3. Observer (Behavioral)

**Purpose:** Define a **one-to-many dependency** between objects, so when one object changes state, all dependents are
notified automatically.  
**Example Use Cases:** Event listeners, publish-subscribe systems, GUI frameworks.

**Key Points:**

- Subject keeps a list of observers.
- Observers get updated when subject's state changes.

---

### 4. Strategy (Behavioral)

**Purpose:** Define a **family of algorithms**, encapsulate each one, and make them interchangeable at runtime.  
**Example Use Cases:** Payment processing (credit card, PayPal), sorting strategies, game AI behaviors.

**Key Points:**

- Algorithm is selected at runtime.
- Promotes the Open/Closed Principle — easy to add new strategies without modifying existing code.

---

### 5. Adapter (Structural)

**Purpose:** Allow classes with **incompatible interfaces** to work together.  
**Example Use Cases:** Connecting legacy code to new systems, integrating third-party libraries.

**Key Points:**

- Wraps an existing class with a new interface.
- Doesn't modify the original class.

---

## 🗂 Quick Comparison Table

| Pattern   | Category   | Key Idea                              | Example Use Case                    |
|-----------|------------|---------------------------------------|-------------------------------------|
| Singleton | Creational | Only one instance of a class          | Logger, config manager              |
| Factory   | Creational | Let subclasses decide object creation | Shape factory, notification factory |
| Observer  | Behavioral | One-to-many updates                   | Event listeners, pub-sub            |
| Strategy  | Behavioral | Interchangeable algorithms            | Payment methods, sorting methods    |
| Adapter   | Structural | Match incompatible interfaces         | Legacy code integration             |

---

## 🎯 Final Notes

- **Don't force design patterns** — use them when a problem matches their intent.
- Understanding patterns improves **communication** among developers.
- They are **guidelines**, not strict rules — adapt them as per your project's needs.

> 📖 Recommended Reading: *Design Patterns: Elements of Reusable Object-Oriented Software* by the “Gang of Four”.
