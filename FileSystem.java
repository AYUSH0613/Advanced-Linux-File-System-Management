package LFMS;

import java.util.*;

public class FileSystem {
    TreeNode root;
    TreeNode pwd;

    public FileSystem() {
        root = new TreeNode("/", 'd', null);
        pwd = root;
    }

    private String currentPath(TreeNode node) {
        if (node == null || node == root) return "/";
        return currentPath(node.parent) + (node.parent == root ? "" : "/") + node.name;
    }

    private TreeNode findNode(TreeNode start, String name) {
        TreeNode curr = start.firstChild;
        while (curr != null) {
            if (curr.name.equals(name)) return curr;
            curr = curr.nextSibling;
        }
        return null;
    }

    private TreeNode traverse(String path) {
        if (path.equals("/")) return root;
        TreeNode curr = path.startsWith("/") ? root : pwd;
        String[] parts = path.split("/");
        for (String part : parts) {
            if (part.isEmpty() || part.equals(".")) continue;
            if (part.equals("..")) {
                if (curr.parent != null) curr = curr.parent;
            } else {
                TreeNode next = findNode(curr, part);
                if (next == null || next.type != 'd') return null;
                curr = next;
            }
        }
        return curr;
    }

    public void ls() {
        TreeNode curr = pwd.firstChild;
        while (curr != null) {
            System.out.printf("%c %s\t%s\n", curr.type, curr.getPermissionString(), curr.name);
            curr = curr.nextSibling;
        }
    }

    public void pwd() {
        System.out.println(currentPath(pwd));
    }

    public void cd(String path) {
        TreeNode target = traverse(path);
        if (target != null) pwd = target;
        else System.out.println("Directory not found.");
    }

    public void mkdir(String name) {
        if (findNode(pwd, name) != null) {
            System.out.println("Directory already exists.");
            return;
        }
        TreeNode newDir = new TreeNode(name, 'd', pwd);
        if (pwd.firstChild == null) pwd.firstChild = newDir;
        else {
            TreeNode curr = pwd.firstChild;
            while (curr.nextSibling != null) curr = curr.nextSibling;
            curr.nextSibling = newDir;
        }
    }

    public void touch(String name) {
        if (findNode(pwd, name) != null) {
            System.out.println("File already exists.");
            return;
        }
        TreeNode newFile = new TreeNode(name, '-', pwd);
        if (pwd.firstChild == null) pwd.firstChild = newFile;
        else {
            TreeNode curr = pwd.firstChild;
            while (curr.nextSibling != null) curr = curr.nextSibling;
            curr.nextSibling = newFile;
        }
    }

    public void rm(String name) {
        TreeNode prev = null, curr = pwd.firstChild;
        while (curr != null && !curr.name.equals(name)) {
            prev = curr;
            curr = curr.nextSibling;
        }

        if (curr == null) {
            System.out.println("File/Directory not found.");
            return;
        }

        if (curr.type == 'd' && curr.firstChild != null) {
            System.out.println("Directory not empty.");
            return;
        }

        if (prev == null) pwd.firstChild = curr.nextSibling;
        else prev.nextSibling = curr.nextSibling;

        System.out.println("Removed " + name);
    }

    public void tree(TreeNode node, String indent) {
        System.out.println(indent + node.name);
        TreeNode child = node.firstChild;
        while (child != null) {
            tree(child, indent + "  ");
            child = child.nextSibling;
        }
    }

    public void find(String target) {
        findHelper(root, target, "");
    }

    private void findHelper(TreeNode node, String target, String path) {
        String current = path + "/" + node.name;
        if (node.name.equals(target)) {
            System.out.println(current.replace("//", "/"));
        }
        TreeNode child = node.firstChild;
        while (child != null) {
            findHelper(child, target, current);
            child = child.nextSibling;
        }
    }
}
