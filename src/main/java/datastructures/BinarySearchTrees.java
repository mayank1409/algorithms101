package datastructures;

public class BinarySearchTrees<T extends Comparable<T>> {

    private Node<T> root;

    private static class Node<T> {
        private T key;
        private Node left;
        private Node right;

        Node(T key) {
            this.key = key;
        }
    }

    public T find(T key) {
        Node node = find(root, key);
        return node == null ? null : (T) node.key;
    }

    public void insert(T key) {
        root = insert(root, key);
    }

    public T findMin() {
        if (root == null) {
            return null;
        }

        Node temp = root;
        if (temp.left == null) {
            return (T) temp.key;
        }
        while (temp.left.left != null) {
            temp = temp.left;
        }
        return (T) temp.left.key;
    }

    public T findMax() {
        if (root == null) {
            return null;
        }
        Node temp = root;
        if (temp.right == null) {
            return (T) temp.key;
        }
        while (temp.right.right != null) {
            temp = temp.right;
        }
        return (T) temp.right.key;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void delete(T key) {
        root = delete(root, key);
    }

    public void inorder() {
        if (isEmpty()) {
            return;
        }
        inorder(root);
    }

    public void preOrder(){
        if (isEmpty()) {
            return;
        }
        preOrder(root);
    }

    public void postOrder() {
        if (isEmpty()) return;
        postOrder(root);
    }

    private void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.key);
        }
    }

    private void preOrder(Node node) {
        if (node != null) {
            System.out.println(node.key);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    private void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.println(node.key);
            inorder(node.right);
        }
    }

    private Node delete(Node<T> node, T key) {
        if (node == null) {
            return null;
        } else if (key.compareTo(node.key) < 0) {
            node.left = delete(node.left, key);
        } else if (key.compareTo(node.key) > 0) {
            node.right = delete(node.right, key);
        } else if (key.compareTo(node.key) == 0){

            if (node.left == null && node.right == null) {
                node = null;
            } else if (node.left == null) {
                node = node.right;
            } else if (node.right == null){
                node = node.left;
            } else {
                Node minRight = findMinRight(node.right);
                node.key = (T) minRight.key;
                node.right = delete(node.right, node.key);
            }
        }
        return node;
    }

    private static Node findMinRight(Node root) {
        Node minRight;
        Node temp = root.right;
        if (temp.left == null) {
            return temp;
        }
        while (temp.left.left != null) {
            temp = temp.left;
        }
        minRight = temp.left;
        return minRight;
    }

    private Node<T> insert(Node<T> node, T key) {
        Node<T> newNode = new Node<>(key);

        if (node == null) {
            node = newNode;
            return node;
        }
        if (key.compareTo(node.key) < 0) {
            node.left = insert(node.left, key);
        } else {
            node.right = insert(node.right, key);
        }
        return node;
    }

    private Node find(Node<T> node, T key) {
        if (node == null || node.key.equals(key)) {
            return node;
        } else if (key.compareTo(node.key) < 0) {
            return find(node.left, key);
        } else if (key.compareTo(node.key) > 0) {
            return find(node.right, key);
        }
        return null;
    }

}
