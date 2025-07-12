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
├── FileSystem.java // Core logic and operations
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
###📋 Supported Commands
Command	Description
mkdir <dir>	Create a new directory
touch <file>	Create a new file
cd <dir>	Change current directory
cd ..	Move to parent directory
ls	List contents of current directory
pwd	Print current working directory
rm <name>	Remove a file or an empty directory
tree	Display hierarchical structure
find <name>	Search and list paths matching the name
help	Show available commands
exit	Exit the CLI

###🛠️ Built With
*Java 8+

*Object-Oriented Design

*Tree & Linked List data structures

*CLI using Scanner


👨‍💻 Author
Ayush Gupta
GitHub Profile

###🙌 Acknowledgements
Inspired by Linux CLI behavior and file system principles.

```bash

---

Let me know if you'd like:

- A `LICENSE` file
- Badge icons (build, version, license, etc.)
- GitHub Pages documentation

Or I can push the `README.md` directly to your repo if you link it.```