# Multithreading and Concurrency in Java 🧵

Java is designed with multithreading and concurrency in mind, allowing developers to write programs that can perform multiple tasks simultaneously.

Become a Medium member

---

## 1. Multithreading

### Purpose:
Multithreading allows a program to execute multiple threads concurrently. Each thread runs a separate path of execution in the program, which can improve performance and responsiveness.

### Creating Threads:
Threads in Java can be created by either:
- Extending the `Thread` class
- Implementing the `Runnable` interface

```java
public class ThreadExample extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        ThreadExample thread = new ThreadExample();
        thread.start();
    }
}
```

In this example, a new thread is created by extending the `Thread` class and overriding its `run` method.

---

## 2. Concurrency

### Purpose:
Concurrency in Java allows multiple threads to execute simultaneously, sharing resources like memory and data structures. Managing these shared resources efficiently and safely is key to writing robust concurrent programs.

### Synchronization:
To prevent race conditions, where multiple threads access shared resources simultaneously, Java provides synchronization mechanisms like the `synchronized` keyword.

```java
public class SynchronizedExample {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public static void main(String[] args) {
        SynchronizedExample example = new SynchronizedExample();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count: " + example.count);
    }
}
```

In this example, the `increment` method is synchronized to ensure that only one thread can access it at a time, preventing race conditions.

---

## Thread Safety

In concurrent programs, it’s crucial to ensure that shared resources are accessed in a thread-safe manner. This means protecting shared resources from being corrupted or modified unpredictably when accessed by multiple threads simultaneously.