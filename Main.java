package LFMS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileSystem fs = new FileSystem();
        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("Advanced Linux File System (Java Version)");
        System.out.println("Type 'help' for list of commands");

        while (true) {
            System.out.print("fs:" + fs.currentPath(fs.pwd) + "$ ");
            input = sc.nextLine().trim();

            if (input.isEmpty()) continue;

            String[] tokens = input.split("\\s+");
            String cmd = tokens[0];
            String arg = tokens.length > 1 ? tokens[1] : "";

            switch (cmd) {
                case "ls": fs.ls(); break;
                case "pwd": fs.pwd(); break;
                case "cd": fs.cd(arg); break;
                case "mkdir": fs.mkdir(arg); break;
                case "touch": fs.touch(arg); break;
                case "rm": fs.rm(arg); break;
                case "tree": fs.tree(fs.pwd, ""); break;
                case "find": fs.find(arg); break;
                case "help":
                    System.out.println("Commands: ls, pwd, cd <dir>, mkdir <dir>, touch <file>, rm <name>, tree, find <name>, exit");
                    break;
                case "exit": return;
                default: System.out.println("Unknown command.");
            }
        }
    }
}
