# 🗂️ Advanced Linux File System Management (Java)

This is a Java-based simulation of an **Advanced Linux-like File System**, using data structures such as trees and linked lists. It allows users to create, navigate, and manage a virtual in-memory file system via a command-line interface (CLI), mimicking Linux commands like `mkdir`, `cd`, `ls`, `rm`, `tree`, and more.

---

## 📦 Features

- 🗂️ Create directories and files (`mkdir`, `touch`)
- 📁 Change directory (`cd`)
- 📄 List directory contents (`ls`)
- 📌 Print current directory path (`pwd`)
- 🧹 Remove files and empty directories (`rm`)
- 🌳 Display file tree structure (`tree`)
- 🔍 Search for a file or folder by name (`find`)
- 🔐 File permission simulation (mode 777 format)
- 🧠 Internal data structure: Tree using `TreeNode` class

---

## 🧾 Project Structure

LFMS/

├── FileSystem.java //Core logic and operations

├── TreeNode.java // Tree structure for file system

└── Main.java // CLI interface for user interaction


> All files are inside the `LFMS` package.

---

## 🚀 Getting Started

### 1. Clone or Download the Repository

```bash
git clone https://github.com/yourusername/your-repo-name.git
cd your-repo-name
```

### 2. Compile the Java Code
```bash
javac "LFMS/*.java"'
```
### 3. Run the Program
```bash
java LFMS.Main
```
###🧪 Sample Commands
```bash
mkdir home
cd home
mkdir documents
touch notes.txt
ls
pwd
tree
find notes.txt
rm notes.txt
```
## 🛠️ Built With

- 💻 Java 21 (latest LTS version)
- 🧠 Object-Oriented Design
- 🌳 Tree & Linked List Data Structures
- 🖥️ Command-Line Interface (CLI) with Scanner



👨‍💻 Author

Ayush Gupta
[GitHub Profile](https://github.com/AYUSH0613)

###🙌 Acknowledgements
Inspired by Linux CLI behavior and file system principles.

