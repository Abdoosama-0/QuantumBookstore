# Quantum Bookstore

📚 A simple simulation of an online bookstore application built as part of the Fawry N² Dev Slope Internship challenge.

---

## 🧠 Overview

This project models an extensible bookstore system with the ability to:

- Add books to the inventory.
- Remove outdated books based on their publishing year.
- Purchase books using their ISBN code.
- Support multiple book types:
  - 📦 PaperBook — physical copy with stock and shipping.
  - 📧 EBook — digital copy sent via email.
  - 🖼️ DemoBook — for showcase only, not for sale.


---
## input example
![input example](https://i.postimg.cc/4djcLKZ7/Screenshot-2025-07-09-004815.png)

## output example
![output example](https://i.postimg.cc/gJLXZYRY/Screenshot-2025-07-09-004835.png)
## 🛠️ Tech Stack

- Language: Java 
- Build Tool: Maven  
- IDE: NetBeans 

---

## ✅ Features

- 📥 Add books by ISBN  
- 🧹 Remove outdated books (older than a given number of years)  
- 🛒 Purchase books and reduce stock accordingly  
- 📨 Simulate sending eBooks via MailService  
- 🚚 Simulate shipping paper books via ShippingService  
- ❌ Attempting to buy a demo book throws an error






