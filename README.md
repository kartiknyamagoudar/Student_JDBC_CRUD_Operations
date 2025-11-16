<p align="center">
  <img src="https://dummyimage.com/900x200/000/fff&text=STUDENT+JDBC+CRUD+OPERATION" alt="Banner" />
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-8+-blue?logo=java&logoColor=white" />
  <img src="https://img.shields.io/badge/JDBC-MySQL-brightgreen" />
  <img src="https://img.shields.io/badge/MySQL-Database-orange?logo=mysql" />
  <img src="https://img.shields.io/badge/License-MIT-yellow" />
</p>

_____________________________________________________________________________________________________

📖 Overview

This project demonstrates a fully functional CRUD (Create, Read, Update, Delete) system using Java + JDBC + MySQL.
It is a console-based application that allows you to manage student records through a simple text menu.

_____________________________________________________________________________________________________

You will learn:
	•	JDBC Connections
	•	PreparedStatement
	•	SQL Operations
	•	Modular Java Architecture

  _____________________________________________________________________________________________________


📑 Table of Contents
| Section               | Description |
|----------------------|-------------|
| [Overview](#-overview) | Project introduction and features |
| [Tech Stack](#-tech-stack) | Technologies used |
| [Project Structure](#-project-structure) | Folder and file layout |
| [Database Setup](#-database-setup) | MySQL database creation steps |
| [Commands Cheat Sheet](#-commands-cheat-sheet) | Quick SQL & JDBC commands |
| [GIF Preview](#-gif-preview) | Demo GIF of the project |
| [How to Run](#-how-to-run) | Setup + execution instructions |
| [License](#-license) | MIT license info |

_____________________________________________________________________________________________________


🛠 Tech Stack
| Component  | Technology                     |
|-----------|---------------------------------|
| Language  | Java 8+                         |
| Database  | MySQL                           |
| Connector | JDBC                            |
| IDE       | Eclipse / IntelliJ / VS Code    |


_____________________________________________________________________________________________________

🗄 Database Setup (MySQL)

CREATE DATABASE studentdb;

USE studentdb;

CREATE TABLE student (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100),
    city VARCHAR(100)
);

_____________________________________________________________________________________________________

🧾 Commands Cheat Sheet

| Action        | SQL / Code                                                   |
|---------------|--------------------------------------------------------------|
| Insert        | `INSERT INTO student(name,email,city) VALUES (?,?,?)`        |
| View          | `SELECT * FROM student`                                      |
| Update        | `UPDATE student SET name=?,email=?,city=? WHERE id=?`        |
| Delete        | `DELETE FROM student WHERE id=?`                             |
| Load Driver   | `Class.forName("com.mysql.cj.jdbc.Driver")`                  |
| Connect       | `DriverManager.getConnection(...)`                           |

_____________________________________________________________________________________________________

📜 License

This project is licensed under the MIT License.
