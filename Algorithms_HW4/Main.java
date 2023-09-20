public class Main {
    public static void main(String[] args) {
        RedBlackTree node = new RedBlackTree();

        node.insert(10);
        node.inorder();
        System.out.println("\n");
        node.insert(5);
        node.inorder();
        System.out.println("\n");
        node.insert(12);
        node.inorder();
        System.out.println("\n");
        node.insert(2);
        node.inorder();
        System.out.println("\n");
        node.insert(-5);
        node.inorder();
        System.out.println("\n");
        node.insert(-10);
        node.inorder();
        System.out.println("\n");
        node.insert(18);
        node.inorder();
        System.out.println("\n");
        node.insert(-300);
        node.inorder();


    }
}