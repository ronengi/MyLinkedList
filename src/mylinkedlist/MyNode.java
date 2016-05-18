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
public class MyNode {
    public int value;
    public MyNode next;
    
    public MyNode() {
        this(0, null);
    }
    
    public MyNode(int value) {
        this(value, null);
    }
    
    public MyNode(int value, MyNode next) {
        this.value = value;
        this.next = next;
    }
    
    
    
}
