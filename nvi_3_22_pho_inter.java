1. what is java Encapsulation and Polymorphism
Encapsulation is:
Binding the data with the code that manipulates it.
It keeps the data and the code safe from external interference

Polymorphism means to process objects differently based on their data type.
In other words it means, one method with multiple implementation, for a certain class of action. And which implementation to be used is decided at runtime depending upon the situation (i.e., data type of the object)

2. How to do multi inheritance in Java?
As you can see that the class implemented two interfaces. A class can implement any number of interfaces.

3 Compare ArrayList and LinkedList
For LinkedList<E>
	get(int index) is O(n)
	add(E element) is O(1)
	add(int index, E element) is O(n)
	remove(int index) is O(n)
	Iterator.remove() is O(1) <--- main benefit of LinkedList<E>
	ListIterator.add(E element) is O(1) <--- main benefit of LinkedList<E>
For ArrayList<E>
	get(int index) is O(1) <--- main benefit of ArrayList<E>
	add(E element) is O(1) amortized, but O(n) worst-case since the array must be resized and copied
	add(int index, E element) is O(n - index) amortized, but O(n) worst-case (as above)
	remove(int index) is O(n - index) (i.e. removing last is O(1))
	Iterator.remove() is O(n - index)
	ListIterator.add(E element) is O(n - index)

4. what is volatile?
Essentially, volatile is used to indicate that a variable's value will be modified by different threads.
Declaring a volatile Java variable means:
The value of this variable will never be cached thread-locally: all reads and writes will go straight to "main memory";
Access to the variable acts as though it is enclosed in a synchronized block, synchronized on itself.

5 when GC memory leak?
ObjectA -> ObjectB
In this example, ObjectA is an object in active use in the code. However, ObjectA contains a reference to ObjectB that is effectively dead (ie: ObjectB has been allocated and used and is now, from the programmer's perspective, dead) but the programmer forgot to set the reference in ObjectA to null. In this case, ObjectB has been "leaked".

6. can finally alone?
finally should have atleast a try block, catch is optional. The point of finally blocks is to make sure stuff gets cleaned up whether an exception is thrown or not.

7. Can interface have String property?
Yes. The point of an interface is to specify the public API. An interface has no state. Any variables that you create are really constants (so be careful about making mutable objects in interfaces).

8. Compare Set and List?
List is an ordered sequence of elements whereas Set is a distinct list of elements which is unordered (thank you, Quinn Taylor).
List<E>:
	An ordered collection (also known as a sequence). The user of this interface has precise control over where in the list each element is inserted. The user can access elements by their integer index (position in the list), and search for elements in the list.
Set<E>:
	A collection that contains no duplicate elements. More formally, sets contain no pair of elements e1 and e2 such that e1.equals(e2), and at most one null element. As implied by its name, this interface models the mathematical set abstraction.

9. Advantage to use a Synchronized Method instead of a Synchronized Block?
There is not a clear advantage of using synchronized method over block. Perhaps the only one ( but I wouldn't call it advantage ) is you don't need to include the object reference this.
Blocks do have advantages over methods, most of all in flexibility because you can use other object as lock whereas syncing the method would lock the complete class.

10. What is data binding?
Data binding is a general technique that binds data sources from the provider and consumer together and synchronizes them.
Data-binding in Angular apps is the automatic synchronization of data between the model and view components

