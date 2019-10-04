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
convertToList loop throught the array



Stack1: BCFEHGA
Stack2: ABC**DE*F***
