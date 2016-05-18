/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylinkedlist;

/**
 *
 * @author stimpy
 */
public class MyList {
    public MyNode head;
    
    
    public MyList() {
        head = null;
    }
    
    
    public MyNode push(int value) {
        if (head == null) {
            head = new MyNode(value);
            return head;
        }

        MyNode node = head;
        while (node.next != null) 
            node = node.next;

        node.next = new MyNode(value);
        return node.next;
    }
    

    public MyNode pushOrdered(int value) {
        if (head == null) {
            head = new MyNode(value);
            return head;
        }

        if (head.value > value) {
            MyNode node = new MyNode(value, head);
            head = node;
            return head;
        }

        MyNode node = head;
        while (node.next != null) {
            if (node.next.value > value) {
                MyNode newNode = new MyNode(value, node.next);
                node.next = newNode;
                return newNode;
            }
            node = node.next;
        }

        node.next = new MyNode(value);
        return node.next;
    }
    
    
    public boolean del(MyNode delNode) {
        if (head == null)
            return false;
        
        if (head == delNode) {
            head = head.next;
            return true;
        }
        
        MyNode node = head;
        while (node.next != null) {
            if (node.next == delNode) {
                node.next = node.next.next;
                return true;
            }
            node = node.next;
        }

        return false;
    }

    
    public void swapNodes(MyNode a, MyNode b) {
        int tmp = a.value;
        a.value = b.value;
        b.value = tmp;
    }

    
    public void bubbleSort() {
        if (count() <= 1)
            return;
        boolean sorted;
        do {
            sorted = true;
            for (MyNode node = head; node.next != null; node = node.next) {
                if (node.value > node.next.value) {
                    swapNodes(node, node.next);
                    sorted = false;
                }
            }
        } while (!sorted);
    }


    public int count() {
        int c = 0;
        for (MyNode node = head; node != null; node = node.next)
            ++c;
        return c;
    }

    
    public String toString() {
        MyNode node = head;
        String str = "";
        while (node != null) {
            str += "[" +  node.value + "] -> ";
            node = node.next;
        }
        str += "null";
        return str;
    }
    
}
