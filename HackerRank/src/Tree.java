import java.util.*;
import java.util.LinkedList;

/**
 * Created by lab on 5/31/2016.
 */
public class Tree {

    void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    int height(TreeNode root) {
        if (root == null) {
            return -1;
        } else {
            int counterLeft = height(root.left) + 1;
            int counterRight = height(root.right) + 1;

            if (counterLeft > counterRight) {
                return counterLeft;
            } else {
                return counterRight;
            }
        }
    }

    boolean hasRight(TreeNode node) {
        return node.right != null;
    }

    boolean hasLeft(TreeNode node) {
        return node.left != null;
    }

    void top_view(TreeNode root) {
        TreeNode tempRoot = root;
        Stack<TreeNode> nodes = new Stack<TreeNode>();

        while (tempRoot != null) {
            nodes.add(tempRoot);
            tempRoot = tempRoot.left;
        }

        while (nodes.size() > 0) {
            System.out.print(nodes.pop().data + " ");
        }
        root = root.right;
        while (root != null) {
            System.out.print(root.data + " ");
            root = root.right;
        }
    }

    void LevelOrder(TreeNode root) {
        Queue<TreeNode> nodes = new LinkedList<TreeNode>();

        nodes.add(root);

        while (nodes.size() >= 0 && root != null) {

            if (root.left != null) {
                nodes.add(root.left);
            }
            if (root.right != null) {
                nodes.add(root.right);
            }
            System.out.print(nodes.remove().data + " ");

            root = nodes.peek();
        }
    }

    static TreeNode Insert(TreeNode root,int value)
    {
        TreeNode current = root;
        TreeNode temp = new TreeNode();
        temp.data = value;

        if (root == null) {
            return temp;
        }

        while (true) {
            if (value > current.data) {

                if (current.right != null) {
                    current = current.right;
                } else {
                    current.right = temp;
                    break;
                }
            } else {
                if (current.left != null) {
                    current = current.left;
                } else {
                    current.left = temp;
                    break;
                }
            }
        }
        return root;
    }
}
