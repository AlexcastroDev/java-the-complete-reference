# What is a BBST?

A Balanced Binary Search Tree (BBST) is a self-balancing binary search tree.

This type of tree will adjust itself in order to maintain a low (logarithmic) height allowing for faster operations such as insertions and deletions.

Complexity of Binary Search Trees

|   Operation   |   Average     |   Worst   |
|   Insert      |   o(log(n))   |   O(n)    |
|   Delete      |   o(log(n))   |   O(n)    |
|   Remove      |   o(log(n))   |   O(n)    |
|   Search      |   o(log(n))   |   O(n)    |

<img src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/20220812122843/Logarithmic-time-complexity-blog-1.jpg">

# Tree rotations

The secret ingredient to most BBST algorithms is the clever usage of a tree invariant and tree rotations.

A tree invariant is a property/rule you impose on your tree that it must meet after every operation. 

To ensure that the invariant is always satisfied a series of tree rotations are normally applied.