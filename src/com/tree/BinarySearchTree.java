package com.tree;

public class BinarySearchTree {

    TreeNode root;

    public void insert(int item) {
        TreeNode newNode = new TreeNode(item);
        if (root == null)
            root = newNode;
        else {
            TreeNode current = root;
            TreeNode parent;
            while (true) {
                parent = current;
                if (item <= current.value) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public BinarySearchTree() {
        root = null;
    }

    public TreeNode returnRoot() {
        return root;
    }

    public boolean isEmpty() {
        return root == null;
    }

    // Left - Root - Right
    private void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.value + "  ");
            inOrder(root.right);
        }
    }

    // Root - Left  - Right
    private void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.value + "  ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    // Left - Right - Root
    private void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.value + "  ");
        }
    }

    private void clear(TreeNode root) {
        root = null;
    }

    private int successor(TreeNode root) {
        // بجيب ال Minimum في ال Right Sub Tree
        TreeNode current = root.right;
        while (current.left != null)
            current = current.left;
        return current.value;
    }

    private int predecessor(TreeNode root) {
        // بتجيب ال Maximum في ال Left Sub Tree
        TreeNode current = root.left;
        while (current.right != null)
            current = current.right;
        return current.value;
    }

    private TreeNode deleteRecPrivate(TreeNode root, int item) {
        //////// Search /////////
        if (root == null) {
            return root;
        }
        if (item < root.value)
            root.left = deleteRecPrivate(root.left, item);
        else if (item > root.value)
            root.right = deleteRecPrivate(root.right, item);


            // Found it !!!
            // (((((( root.value = item )))))))
        else {
            // 1.Leave Node
            // همسحها مسح طبيعي منغير توصيلات
            if (root.left == null && root.right == null) {
                root = null;
            }

            // 2.Have Right Sub Tree
            // Successor
            else if (root.right != null) {
                // انا هنا اعطيت قيمة ال successor لل node الي عاوز احذفها
                root.value = successor(root);
                // الي انا عاوزه دلوقتي اني احذف ال successor القديم الي هو حاليا leave
                root.right = deleteRecPrivate(root.right, root.value);

                // 2.Have Left Sub Tree
                // Predecessor
            } else {
                // Max in Left Sub Tree
                root.value = predecessor(root);
                // Delete the Old Predecessor
                root.left = deleteRecPrivate(root.left, root.value);
            }
        }
        return root;
    }


    public void preOrderTraverse() {
        preOrder(root);
    }

    public void inOrderTraverse() {
        inOrder(root);
    }

    public void postOrderTraverse() {
        postOrder(root);
    }

    public void delete(int item) {
        deleteRecPrivate(root, item);
    }

}
