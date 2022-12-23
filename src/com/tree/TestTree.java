package com.tree;

public class TestTree {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(40);
        tree.insert(45);
        tree.insert(30);
        tree.insert(35);
        tree.insert(30);
        tree.insert(22);
        tree.insert(50);
        tree.delete(30);
        System.out.print("Pre-Order : ");
        tree.preOrderTraverse();
        System.out.println();
        System.out.print("Post-Order : ");
        tree.postOrderTraverse();
        System.out.println();
        System.out.print("In-Order : ");
        tree.inOrderTraverse();
        System.out.println();
    }
}
