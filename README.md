a)
In DLinkedList I have an inner class Node to hold the Trip object. front object is to store the first node of the list, and rear is to store the last one. In the constructor we initialize length to 0 to indicate the size of the list. We also have a Set of integer to keep track of inserted Trip's id since set does not allow duplicate values.

addFirst method will set the new node to front and set the new node's next object to the previous first node. Also need to set the prev node to point to the new node. incrase length by 1. add the new Trip's id to the set before inserting to the list

addLast has the same logic, it sets the new node to rear as well as its prev node to the old rear node. Also set the next node of the old value to point to the new node. increase length by 1. add the new Trip's id to the set after deleting the node

deleteFirst stores the first node to an object and values the second node to the new front value. decrease length by 1. delete the new Trip's id to the set after deleting the node

deleteLast stores he last node to an object and values the seconde last node to the new rear value. decrease length by 1. delete the new Trip's id to the set before inserting to the list

deleteAll calls the deletLast method to delete nodes backwards. decrease length by 1

size returns the lenght value to indicate the size of list

printNextList traverse from the front of the list and print out each Trip's attributes

printPrevList traverse from the end of the list and print out each Trip's attributes

calculateCost loop from the front of the list to find the correct Trip node and return the cost

averageCost loop from the front of the list and sum all the cost of the Trip objects

b)
convertToList loop through the array and put each element having cost greater than 100 of the array as a node at the end of the list

c)
insertBetween will first loop through the list, trying to find the correct posision of id1 and id2, then it will validate if id1 appears before id2, if yes, the method will set id1's next node and id2's prev node to the new node. Also set the new node's next/prev accordingly

d)
QueueADT is implemented as firt in first out, and using capcacity to track the capacity of this queue. If the list's size equals to the capacity, isFull will return true. If the list's size equals to 0, isEmpty will return true. size method will return the list's length. enQueue will add one element to the first of the list using addFirst method. Same logic, deQueue will remove the first element of the list using deleteFirst. For peek(), it will call deletFirst first to get the front node and then addFirst to add the node back

e)
StackADT is implemented as last in first out, and using capcacity to track the capacity of this queue. If the list's size equals to the capacity, isFull will return true. If the list's size equals to 0, isEmpty will return true. size method will return the list's length. push will add one element to the rear of the list using addLast method. Same logic, pop will remove the last element of the list using deleteLast. For peek(), it will call deletLast first to get the rear node and then addLast to add the node back



Stack1 will output BCFEHGA
Stack2 will need to push the element following the order ABC**DE*F***, * means pop() and letters means push()
