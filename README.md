
# 🌳 Binary Search Tree (BST) in Java

Welcome to my **Binary Search Tree (BST)** repository! 🚀

This repository contains Java implementations of various Binary Search Tree operations. The main objective is to understand BST concepts and practice Data Structures and Algorithms using Java.

---

## 📌 What is a Binary Search Tree?

A **Binary Search Tree (BST)** is a special type of binary tree that follows these properties:

- The left subtree contains values smaller than the root node.
- The right subtree contains values greater than or equal to the root node.
- Both left and right subtrees must also be Binary Search Trees.

### 🌳 Example of a Binary Search Tree

```text
          8
        /   \
       5     10
      / \      \
     3   6      11
    /            \
   1              14
```

---

## 📂 Programs Included

| No. | Java File | Description |
|:---:|---|---|
| 1 | `BSTCreation.java` | Creating a Binary Search Tree using insertion. |
| 2 | `BSTSearch.java` | Searching for an element in a BST. |
| 3 | `BSTDelete.java` | Deleting a node from a BST. |
| 4 | `PrintRange.java` | Printing nodes within a given range. |
| 5 | `Root2LeafPaths.java` | Printing all root-to-leaf paths. |

---

## ⚙️ Operations Implemented

### 1. BST Creation

- Creates a BST by inserting elements one by one.
- Uses recursive insertion.
- Displays elements using Inorder Traversal.

**Sample Output:**

```text
1 2 3 4 5 7
```

### 2. BST Searching

- Searches for a particular value in the BST.
- Uses BST properties to search efficiently.
- Returns `true` if the element is found; otherwise, returns `false`.

**Sample Output:**

```text
1 2 3 4 5 8 9
found
```

### 3. BST Deletion

Deletion in a BST involves three cases:

- **Case 1:** Node has no children (Leaf Node).
- **Case 2:** Node has one child.
- **Case 3:** Node has two children (using Inorder Successor).

### 4. Print Nodes in a Given Range

- Prints all nodes whose values lie within a given range `[X, Y]`.
- Uses BST properties to avoid unnecessary traversal.

**Sample Output:**

```text
6 8 10
```

### 5. Root-to-Leaf Paths

- Finds all possible paths from the root node to the leaf nodes.
- Uses recursion and an `ArrayList` to maintain the current path.
- Uses Backtracking to explore different paths.

**Sample Output:**

```text
8->5->3->
8->5->6->
8->11->12->15->
```

---

## ⏱️ Time Complexity

Let `n` be the number of nodes and `h` be the height of the BST.

| Operation | Average Case | Worst Case |
|---|---|---|
| Insertion | O(log n) | O(n) |
| Searching | O(log n) | O(n) |
| Deletion | O(log n) | O(n) |
| Inorder Traversal | O(n) | O(n) |
| Range Printing | O(n) | O(n) |
| Root-to-Leaf Paths | O(n + output size) | O(n + output size) |

**Note:** The worst case occurs when the BST becomes skewed, similar to a Linked List.

---

## 🛠️ Technologies Used

- **Programming Language:** Java
- **Concepts:** Data Structures and Algorithms
- **Topics Covered:**
  - Binary Search Trees
  - Recursion
  - Inorder Traversal
  - Insertion
  - Searching
  - Deletion
  - Backtracking

---

## ▶️ How to Run

### Step 1: Clone the Repository

```bash
git clone https://github.com/YOUR-USERNAME/BInary-Search-Tree.git
```

### Step 2: Navigate to the Project Directory

```bash
cd BInary-Search-Tree
```

### Step 3: Compile a Java File

```bash
javac BSTCreation.java
```

### Step 4: Run the Program

```bash
java BSTCreation
```

You can follow the same steps to execute the other Java programs.

---

## 🎯 Learning Objectives

Through this repository, I aim to:

- Understand Binary Search Tree concepts.
- Learn recursive insertion, searching, and deletion.
- Understand Inorder Traversal.
- Practice range-based searching.
- Implement root-to-leaf path problems using Backtracking.
- Improve my Data Structures and Algorithms skills.

---

## 🤝 Contributions

Suggestions, improvements, and contributions are always welcome!

If you find something that can be improved, feel free to:

1. Fork this repository.
2. Make your changes.
3. Create a Pull Request.

---

## ⭐ Support

If you find this repository helpful for learning Data Structures and Algorithms, don't forget to give it a **Star ⭐**!

---

**Happy Coding! 💻🌳**

*Keep Learning. Keep Practicing. Keep Growing!* 🚀
