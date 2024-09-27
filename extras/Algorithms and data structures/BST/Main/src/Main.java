public class Main {
    static Node search(Node root, int key) {
        if (root == null || root.key == key) {
            return root;
        }

        if (root.key < key) {
            return search(root.right, key);
        }

        return search(root.left, key);
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

        System.out.println(search(root, 8) != null ? "found" : "Not found");
    }
}