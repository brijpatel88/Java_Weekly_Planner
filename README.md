

# 🗓 Weekly Planner (Java Terminal App)

## 📌 Overview
The **Weekly Planner** is a simple, lightweight Java terminal application that helps you organize your weekly tasks.  
It asks for **3 to 7 tasks**, displays them neatly in the terminal, and saves them to a **Markdown file** (`weekly_planner.md`) for easy reference.

This app is perfect for:
- Students planning weekly assignments
- Professionals organizing work tasks
- Anyone who prefers a quick, distraction-free way to list tasks

---

## 🚀 Features
- **Simple & Fast** → Run directly from your terminal
- **Custom Task Count** → Add between **3 and 7 tasks**
- **Markdown Export** → Saves your planner as `weekly_planner.md` for easy sharing
- **Cross-Platform** → Works on **Windows, macOS, and Linux** with Java installed
- **No Extra Dependencies** → Just plain Java code

---

## 🛠 Installation & Setup

### 1️⃣ Prerequisites
Make sure Java is installed:
```bash
java -version
```
If not installed, download Java from:  
🔗 https://www.oracle.com/java/technologies/javase-downloads.html

---

### 2️⃣ Download the App
Save the file `WeeklyPlanner.java` to a folder on your computer.

---

### 3️⃣ Compile the Program
Open your **terminal/command prompt** in that folder and run:
```bash
javac WeeklyPlanner.java
```
This will create a `WeeklyPlanner.class` file.

---

### 4️⃣ Run the Program
Run the app with:
```bash
java WeeklyPlanner
```

---

### 5️⃣ (Optional) Create a JAR File
If you want to run the program with a single command:
```bash
jar cfe WeeklyPlanner.jar WeeklyPlanner WeeklyPlanner.class
java -jar WeeklyPlanner.jar
```

---

## 📖 How to Use

1. **Start the app**:
   ```bash
   java WeeklyPlanner
   ```
2. **Enter number of tasks** (between 3 and 7).
3. **Type each task** when prompted.
4. **View your planner** in the terminal.
5. **Find your saved file** `weekly_planner.md` in the same folder.

---

## 📄 Example Usage
```
===== Weekly Planner =====
How many tasks do you want to add? (3–7): 4
Enter task 1: Buy groceries
Enter task 2: Finish Java project
Enter task 3: Gym workout
Enter task 4: Read a book

Your Weekly Planner:
1. Buy groceries
2. Finish Java project
3. Gym workout
4. Read a book

Planner saved to 'weekly_planner.md'.
```

---

## 🗂 Example Markdown Output
```markdown
# Weekly Planner

1. Buy groceries
2. Finish Java project
3. Gym workout
4. Read a book
```

---

## 🛠 Troubleshooting

**Problem:** `java: command not found`  
**Solution:** Install Java and ensure it's added to your system's PATH.

**Problem:** `Planner not saving`  
**Solution:** Make sure you have write permission in the folder where the program is running.

**Problem:** Tasks not displaying correctly  
**Solution:** Avoid entering blank lines or pressing enter without typing anything.

---

