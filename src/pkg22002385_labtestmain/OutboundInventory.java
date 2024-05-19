/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg22002385_labtestmain;

import java.util.Stack;

/**
 *
 * @author radin
 */
public class OutboundInventory {
    
    Stack<String> name = new Stack<>();
    Stack<Integer> count = new Stack<>();
    private String productName;
    private int quantity;
    private int maxSize;

    public OutboundInventory(int maxSize) {
        this.productName = productName;
        this.quantity = quantity;
        this.maxSize = maxSize;
    }
    
    public void addProduct(String productName,int quantity){
        name.push(productName);
        count.push(quantity);
    }
    
    public String shipProduct(){
        return "Product : "+name.pop()+"\nQuantity : "+count.pop();
    }
    
    public String checkTopProduct(){
        return "Product : "+name.peek()+"\nQuantity : "+count.peek();
    }
    
    public int getTotalProduct(){
        return name.size();
    }
    
    public boolean isStackEmpty(){
        return name.isEmpty();
    }
    
}
