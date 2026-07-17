# 🧬 Multilevel Inheritance in Java

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk)
![OOP](https://img.shields.io/badge/OOP-Multilevel%20Inheritance-blue?style=for-the-badge)
![IDE](https://img.shields.io/badge/IDE-Eclipse-purple?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)

---

# 📚 Project Overview

This project demonstrates **Multilevel Inheritance** in Java.

Multilevel Inheritance occurs when a class inherits from another class, and a third class inherits from the second class. This creates an inheritance chain where the final child class has access to the members of every class above it.

In this example:

- 👴 **GrandParent**
- 👨 **Parent1**
- 👦 **Child1**

The **Child1** class inherits members from **Parent1**, which already inherits members from **GrandParent**, allowing Child1 to access variables and methods from both classes. :contentReference[oaicite:0]{index=0}

---

# 🧬 What is Multilevel Inheritance?

Multilevel Inheritance means:

> **GrandParent → Parent → Child**

Each class passes its variables and methods down to the next generation.

---

# 🖼 Class Diagram

```text
                GrandParent
         ┌──────────────────────────┐
         │ lastName                 │
         │ message1()               │
         └─────────────┬────────────┘
                       │
                    extends
                       │
                       ▼
                  Parent1
         ┌──────────────────────────┐
         │ parentJob                │
         │ message2()               │
         └─────────────┬────────────┘
                       │
                    extends
                       │
                       ▼
                    Child1
         ┌──────────────────────────┐
         │ school                   │
         │ message3()               │
         └──────────────────────────┘
```

---

# 🏗 Project Structure

```
day8
│
├── GrandParent
│      ├── lastName
│      └── message1()
│
├── Parent1
│      ├── parentJob
│      └── message2()
│
├── Child1
│      ├── school
│      └── message3()
│
└── MultiLevelInheritanceExample
```

---

# 🧠 Learning Objectives

After completing this project you will understand:

- ✅ Multilevel Inheritance
- ✅ The **extends** keyword
- ✅ Parent and Child relationships
- ✅ Code Reusability
- ✅ Creating Objects
- ✅ Calling inherited methods
- ✅ Accessing inherited variables

---

# 💻 Java Concepts Used

- ☕ Classes
- 🧬 Multilevel Inheritance
- 📦 Objects
- 🏛 GrandParent Class
- 👨 Parent Class
- 👦 Child Class
- 📚 Variables
- ⚙ Methods
- 🖨 Console Output

---

# 🔍 Code Walkthrough

## Step 1

Create the GrandParent class.

```java
class GrandParent
```

This class contains:

- 🏷 lastName
- 💬 message1()

These members are inherited by every class below it. :contentReference[oaicite:1]{index=1}

---

## Step 2

Create Parent1.

```java
class Parent1 extends GrandParent
```

Parent1 inherits:

- lastName
- message1()

It also adds:

- 💼 parentJob
- 💬 message2() :contentReference[oaicite:2]{index=2}

---

## Step 3

Create Child1.

```java
class Child1 extends Parent1
```

Child1 inherits:

From Parent1:

- parentJob
- message2()

From GrandParent:

- lastName
- message1()

Child1 also has its own:

- 🏫 school
- 💬 message3() :contentReference[oaicite:3]{index=3}

---

## Step 4

Create the Object

```java
Child1 obj = new Child1();
```

Because Child1 is the final class in the inheritance chain, the object can access:

- Child variables
- Parent variables
- GrandParent variables

and

- Child methods
- Parent methods
- GrandParent methods. :contentReference[oaicite:4]{index=4}

---

# 🔄 Program Flow

```text
Create GrandParent
        │
        ▼
Create Parent1
        │
        ▼
Create Child1
        │
        ▼
Create Child Object
        │
        ▼
Access Child Members
        │
        ▼
Access Parent Members
        │
        ▼
Access GrandParent Members
```

---

# ▶ Sample Output

```text
Central High School
Message from Child
Software Engineer
Message from Parent
Mitchell
Message from GrandParent
```

---

# 🌎 Real-World Example

Imagine three generations of a family.

👴 **GrandParent**

Owns:

- 🏷 Last Name
- 💬 Family Greeting

↓

👨 **Parent**

Inherits:

- Last Name
- Family Greeting

Adds:

- 💼 Job

↓

👦 **Child**

Inherits:

- Last Name
- Family Greeting
- Parent's Job

Adds:

- 🏫 School

The child automatically receives information from both previous generations.

---

# 🖼 Inheritance Chain

```text
        👴 GrandParent
             │
             ▼
         👨 Parent1
             │
             ▼
          👦 Child1
```

---

# 🎯 Key Takeaways

✅ Inheritance can occur across multiple levels.

✅ Child classes inherit members from every parent above them.

✅ Promotes code reuse.

✅ Eliminates duplicate code.

✅ Makes Java applications easier to maintain.

---

# 📖 OOP Vocabulary

| Term | Meaning |
|------|---------|
| Class | Blueprint for creating objects |
| Object | Instance of a class |
| GrandParent | Top-level parent class |
| Parent | Middle class in the inheritance chain |
| Child | Final class that inherits all previous members |
| Variable | Stores data |
| Method | Performs an action |
| extends | Allows one class to inherit another class |

---

# 🚀 Technologies Used

- ☕ Java 21
- 💻 Eclipse IDE
- 🧬 Object-Oriented Programming (OOP)
- 📦 Inheritance

---

# 💡 Why This Project Matters

Multilevel Inheritance is one of Java's core Object-Oriented Programming (OOP) principles. It demonstrates how functionality can be passed from one generation of classes to another, allowing developers to build organized, reusable, and maintainable code.

This concept is widely used in enterprise Java applications and automation frameworks like **Selenium**, where common functionality is inherited through multiple layers of classes.

---

## ⭐ Author

**Tracy Joseph**

*Cloudberry Java Bootcamp – Day 8*

*"Building strong Java foundations, one inheritance level at a time."* ☕🚀
