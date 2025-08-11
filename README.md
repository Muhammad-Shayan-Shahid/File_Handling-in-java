# 📂 Java File Handling

A beginner-to-advanced guide on **File Handling in Java** 📝 — with practical examples, clear explanations, and best practices.  
This repository is perfect for students, developers, or anyone looking to **read, write, and manage files effectively** in Java.

---

## 📂 Project Overview
File handling in Java allows programs to store data permanently on disk and retrieve it when needed.  
This repo covers:
- **Reading files**
- **Writing files**
- **Creating files**
- **Deleting files**
- **Working with directories**
- **Best Practices for file I/O**  

---

## 📸 Example Code

```java
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("example.txt")) {
            writer.write("Hello, Java File Handling!");
            System.out.println("✅ Data written successfully.");
        } catch (IOException e) {
            System.out.println("❌ An error occurred.");
            e.printStackTrace();
        }

---

## 🛠 Topics Covered
- ✅ **Introduction to File Handling**
- ✅ **Creating a File**
- ✅ **Reading Data from a File**
- ✅ **Writing Data to a File**
- ✅ **Appending Data to a File**
- ✅ **Deleting Files and Directories**
- ✅ **Handling Exceptions in File I/O**
- ✅ **Using `try-with-resources`**
- ✅ **Best Practices**

---

