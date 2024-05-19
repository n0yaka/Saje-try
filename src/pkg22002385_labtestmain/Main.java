/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22002385_labtestmain;

import java.util.Scanner;

/**
 *
 * @author radin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int size = 2;
        InboundInventory inbound = new InboundInventory(size);
        OutboundInventory outbound = new OutboundInventory(size);
        
        Scanner scanner = new Scanner(System.in);
        
        while(!inbound.isQueueFull()){
            System.out.println("-INBOUNDING-");
            System.out.print("Product Name : ");
            String name = scanner.nextLine();
            System.out.print("Quantity : ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            
            inbound.addProduct(name, quantity);
        }
        
        System.out.println("Products in inbound : "+inbound.getTotalProducts());
        System.out.println("----------------------------------------------------");
        
        
        System.out.println("Incoming items to outbound...\n");
        for (int i = 0; i < size; i++) {
            
            outbound.addProduct(inbound.name.poll(), inbound.count.poll());
            
        }
        
        while(!outbound.isStackEmpty()){
            
            System.out.println("Shipping...\n"+outbound.checkTopProduct());
            outbound.shipProduct();
            System.out.println("----------------------------------------------------");
            System.out.println("Products left in outbound : "+inbound.getTotalProducts());
            System.out.println("----------------------------------------------------");
            
            if (outbound.isStackEmpty()== true) {
            System.out.println("All products have been shipped...");
            }
        }
        
    }
    
}
