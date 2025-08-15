
# Weekly Planner (Java Terminal App) – Wiki

## 📖 Introduction
The **Weekly Planner** is a simple command-line Java program that allows you to plan your week by entering a set of tasks and saving them in a Markdown file. 
It’s designed for people who want a quick and minimal tool to keep track of their weekly to-do list without using heavy task management software.

---

## 🔄 Flow of the Program

1. **Start the App**
   - You launch the program from your terminal with:
     ```bash
     java WeeklyPlanner
     ```
2. **Enter Number of Tasks**
   - The app asks you how many tasks you want to add.
   - You must choose **between 3 and 7**.

3. **Enter Task Details**
   - For each task, you type its description.
   - The program stores them in a list.

4. **Display the Planner**
   - Once all tasks are entered, the program prints them in a clean numbered list.

5. **Save to Markdown**
   - The tasks are saved to `weekly_planner.md`.
   - The Markdown file can be opened in:
     - Any text editor
     - Markdown viewer
     - GitHub for formatted display

---

## 📂 File Structure
```
weekly-planner-java/
│── WeeklyPlanner.java    # Java source code
│── WeeklyPlanner.class   # Compiled Java bytecode
│── weekly_planner.md     # Generated planner file
│── README.md             # Project description & usage
│── /media                # Folder for screenshots
```

---

## 📄 Example: weekly_planner.md
```markdown
# Weekly Planner

1. Buy groceries
2. Finish Java project
3. Gym workout
4. Read a book
```

---

## 🌍 How to Make it Global
If you want to run the app from **anywhere**:
1. Create the `.jar` file:
   ```bash
   jar cfe WeeklyPlanner.jar WeeklyPlanner WeeklyPlanner.class
   ```
2. Move it to a global directory (e.g., `/usr/local/bin` on Mac/Linux or add it to PATH on Windows).
3. Run it with:
   ```bash
   java -jar WeeklyPlanner.jar
   ```
