public class Main {
    static Node rotateTree(Node root) {
        if (root == null) {
            return root;
        }

        Node left = rotateTree(root.left);
        Node right = rotateTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    static void printTree(Node root) {
        if (root != null) {
            printTree(root.left);
            System.out.print(root.key + " ");
            printTree(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.left.right.left = new Node(6);

        root.right = new Node(12);
        root.right.right = new Node(16);
        root.right.right.left = new Node(13);
        root.right.right.right = new Node(20);

        // Print before rotate
        printTree(root);
        // Swap
        rotateTree(root);

        // Print inverted binary tree
        System.out.println("\n");
        printTree(root);
    }
}