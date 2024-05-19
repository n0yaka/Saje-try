/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg22002385_labtestmain;

import java.util.*;

/**
 *
 * @author radin
 */
public class InboundInventory {
    
    Queue<String> name = new LinkedList<>();
    Queue<Integer> count = new LinkedList<>();
    private String productName;
    private int quantity;
    private int maxSize;

    public InboundInventory(int maxSize) {
        this.productName = productName;
        this.quantity = quantity;
        this.maxSize = maxSize;
    }
    
    public void addProduct(String productName,int quantity){
        name.offer(productName);
        count.offer(quantity);
    }
    
    public String viewNextProduct(){
        return "Product : "+name.peek()+"\nQuantity : "+count.peek();
    }
    
    public int getTotalProducts(){
        return name.size();
    }
    
    public boolean isQueueEmpty(){
        return name.isEmpty();
    }
    
    public boolean isQueueFull(){
        return name.size() == this.maxSize;
    }   
    
}
