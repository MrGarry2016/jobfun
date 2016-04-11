1. What is the Java difference heap and stack
Java Heap Memory
Heap memory is used by java runtime to allocate memory to Objects and JRE classes. Whenever we create any object, it’s always created in the Heap space. Garbage Collection runs on the heap memory to free the memory used by objects that doesn’t have any reference. Any object created in the heap space has global access and can be referenced from anywhere of the application.
Java Stack Memory
Java Stack memory is used for execution of a thread. They contain method specific values that are short-lived and references to other objects in the heap that are getting referred from the method. Stack memory is always referenced in LIFO (Last-In-First-Out) order. Whenever a method is invoked, a new block is created in the stack memory for the method to hold local primitive values and reference to other objects in the method. As soon as method ends, the block becomes unused and become available for next method.
Stack memory size is very less compared to Heap memory.

2. what is java static class? where can we have it?
Java has "static nested classes", but they're not at all the same as C#'s static classes, if that's where you were coming from. A static nested class is just one which doesn't implicitly have a reference to an instance of the outer class.
Static nested classes can have instance methods and static methods.
There's no such thing as a top-level static class in Java.

3. What is difference between paging and swapping?
Swapping is the procedure of copying out the entire process(its address space) from main memory to some sort of secondary storage(typically hard disk or tape storage). Usually this is done as a result of CPU scheduling. 
Paging on the other hand is a memory allocation technique that allows the physical address space of the process to be non-contiguous. In other words, a process can be allocated memory wherever it is available and the unit of allocation is the size of page or frame (usually 4KB , but it is system dependent). Wherever a free frame is available in main memory, a physical page belonging to the process can be loaded into it and the page table of process will take care of mapping the logical address (logical page numbers) to correct physical frames in memory (may or may not be contiguous). 

4. What is the difference betwen mutex and semaphore and critical section?
A mutex provides mutual exclusion, either producer or consumer can have the key (mutex) and proceed with their work. As long as the buffer is filled by producer, the consumer needs to wait, and vice versa.
Strictly speaking, a mutex is locking mechanism used to synchronize access to a resource. 
In computer science, a semaphore is a variable or abstract data type that is used for controlling access, by multiple processes, to a common resource in a concurrent system such as a multiprogramming operating system.
一个二元信号量的占有和释放可以是不同线程
critical section（临界区）是一种比互斥量更严格的互斥访问机制。只允许一个进程访问，不可能两个进程进行竞争。一个进程创建了临界区以后，其他进程是不可能获取到该临界区的进入权利的，但是允许进程内的多个线程竞争

5. Difference between Heap and Stack Memory1
1. Heap memory is used by all the parts of the application whereas stack memory is used only by one thread of execution.
2. Whenever an object is created, it’s always stored in the Heap space and stack memory contains the reference to it. Stack memory only contains local primitive variables and reference variables to objects in heap space.
3. Objects stored in the heap are globally accessible whereas stack memory can’t be accessed by other threads.
4. Memory management in stack is done in LIFO manner whereas it’s more complex in Heap memory because it’s used globally. Heap memory is divided into Young-Generation, Old-Generation etc, more details at Java Garbage Collection.
5. Stack memory is short-lived whereas heap memory lives from the start till the end of application execution.
6. We can use -Xms and -Xmx JVM option to define the startup size and maximum size of heap memory. We can use -Xss to define the stack memory size.
7. When stack memory is full, Java runtime throws java.lang.StackOverFlowError whereas if heap memory is full, it throws java.lang.OutOfMemoryError: Java Heap Space error.
8. Stack memory size is very less when compared to Heap memory. Because of simplicity in memory allocation (LIFO), stack memory is very fast when compared to heap memory.
