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
public class MyLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyList list = new MyList();
        
        MyNode node;

        list.push(2);
        list.push(1);
        list.push(4);
        list.push(3);
        System.out.println(list);

        list.bubbleSort();
        System.out.println(list);
        
        
    }
    
}
