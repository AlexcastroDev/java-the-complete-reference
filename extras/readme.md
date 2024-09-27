# Introduction

I will try put in practice what i learned with 26 classes from Harvard.

https://www.youtube.com/watch?v=0JUN9aDxVmI&list=PL2SOU6wwxB0uP4rJgf5ayhHWgw7akUWSf

# Lecture 1

## Static/Dynamic predecessor problem

A data structure is used to represent a set S of items {x₁, x₂, ..., xₙ}.

The goal is to efficiently answer queries of the form: predecessor(Z), which returns the maximum value x from S such that x < Z.

The challenge is to achieve low space complexity while enabling fast query operations.

Static case: No insertions are allowed after the initial set is defined.

Dynamic case: Insertions are allowed, and the set can be modified over time.

Example Solution
A possible approach to solving this problem is as follows:

Store the numbers in a sorted manner and perform a binary search for efficient querying (applicable to the static case).
For dynamic queries, use a balanced Binary Search Tree (BST) to achieve O(log N) query time.

### Word RAM models

- The items are integers within the range { 0, 1, 2, ..., w - 1 }, where w represents the word size.
- w = word size
- u =  2 𝑤 − 1
- It is assumed that pointers can fit within a single word.
- space = n
- w ≈ log(space) ≈ log n

## 2 Data structure example

### 1. Van Emde Boas Tree

- **Update/Query Operations**: `O(log w)` time complexity, where `w` is the word size.

- **Space Complexity**: `O(u)`, where `u` is the universe size. This can be optimized to `O(n)` with the use of randomization.

### 2. Y-Fast Tries

- Y-fast tries provide specific computational bounds as described by Willard.

-> Fusion Trees

Fusion trees are a type of data structure that supports queries in O(log_w n) time, 
where w is the word size (in bits) and n is the number of elements stored.

If the word size w is known, it is possible to select the optimal configuration of the fusion tree to achieve the best query time.

In summary, the goal is to minimize the expression min { log w, log_w n }.

=> min { log_w, log_w n } =  sqtr of log n

=> with dynamic fusion tree => O (n sqtr of log n)


In this model you can get faster sorting, you can get 
O(nn log log_n) deterministic.

You can also have O(n sqrt log log_n) expected time randomized.

# Word Ram

in Word RAM assume that given x,y fitting in a word each, we can do:

plus, divide, times, minus, Bitwise negation, XOR, OR, AND, shift left and right in constant time.

