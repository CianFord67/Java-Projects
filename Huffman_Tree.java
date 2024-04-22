package HuffmanTree;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Huffman_Tree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word - ");
        String text = scanner.nextLine();

        int[] frequencies = new int[128]; // ASCII characters

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequencies[currentChar]++;
        }

        // Print the frequency of each character
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] > 0) {
                System.out.println("'" + (char) i + "' has a frequency of " + frequencies[i]);
            }
        }

        Tree huffmanTree = buildHuffmanTree(frequencies);
        System.out.println("----------------------------------------------------");
        System.out.println("Huffman Tree constructed:");
        System.out.println("----------------------------------------------------");
        printTree(huffmanTree.root);
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static Tree buildHuffmanTree(int[] frequencies) {
        PriorityQueue<Tree> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] > 0) {
                priorityQueue.offer(new Tree((char) i, frequencies[i]));
            }
        }

        while (priorityQueue.size() > 1) {
            Tree left = priorityQueue.poll();
            Tree right = priorityQueue.poll();

            Tree combined = new Tree(left, right);
            priorityQueue.offer(combined);
        }

        return priorityQueue.poll();
    }

    public static void printTree(Node node) {
        if (node == null) {
            return;
        }
        if (node.letter != '\u0000') {
            System.out.println("'" + node.letter + "'" + " has a frequency of " + node.frequency);
        }

        printTree(node.leftChild);
        printTree(node.rightChild);
    }
}

class Tree implements Comparable<Tree> {
    public Node root;
    public int frequency;

    public Tree(char letter, int frequency) {
        this.root = new Node(letter, frequency);
        this.frequency = frequency;
    }

    public Tree(Tree left, Tree right) {
        this.root = new Node();
        this.root.leftChild = left.root;
        this.root.rightChild = right.root;
        this.frequency = left.frequency + right.frequency;
    }

    public int compareTo(Tree other) {
        return this.frequency - other.frequency;
    }
}


class Node {
    public char letter;
    public int frequency;
    public Node leftChild;
    public Node rightChild;

    public Node(char letter, int frequency) {
        this.letter = letter;
        this.frequency = frequency;
    }

    public Node() {}
}

