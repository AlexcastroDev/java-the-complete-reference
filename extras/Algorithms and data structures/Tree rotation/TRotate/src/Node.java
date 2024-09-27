public class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        // When initialized, we set children as null
        left = right = null;
    }
}
