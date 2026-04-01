# LRU Cache Implementation (Java)

# Overview

This project implements an **LRU (Least Recently Used) Cache** using Java.
It is designed to perform cache operations in **O(1) time complexity** using an efficient combination of data structures.

---

# Features

* O(1) time complexity for both `get()` and `put()` operations
* Uses **HashMap** for fast lookup
* Uses **Doubly Linked List** to maintain access order
* Automatically removes the **least recently used** element when capacity is exceeded.

---

# How It Works

* The cache stores key-value pairs
* When a key is accessed, it becomes the **most recently used**
* New elements are always added to the front
* When the cache is full:

  * The **least recently used element (at the end)** is removed

---

# Tech Stack

* Java
* Data Structures (HashMap + Doubly Linked List)

---

# Project Structure

LRUCacheImplementation
│
│── LRUCache.java
│── Main.java


# How to Run

1. Clone the repository
2. Compile the files:
   javac Main.java

3. Run the program:
   java Main

# Sample Output

Enter cache capacity: 2

1. Put (key, value)
2. Get (key)
3. Display Cache

Input: Put(1,10)
Cache: [1:10]

Input: Put(2,20)
Cache: [2:20] [1:10]

Input: Get(1)
Output: 10
Cache: [1:10] [2:20]

Input: Put(3,30)
Cache: [3:30] [1:10]


# Complexity Analysis

* `get(key)` → O(1)
* `put(key, value)` → O(1)

---

# Use Cases

* Caching frequently accessed data
* Improving application performance
* Reducing database load

---

# Future Improvements

* Add TTL (Time-To-Live) for cache expiry
* Convert to Generic Cache (K, V)
* Build GUI using Java Swing
* Integrate with backend systems

# Author

Dhiru Bhai
