package com.convenientStore;

public class Store {
    public String hisab(int[] paisa, int itemPrice) {
        int totalBalance= paisa[0]*10;	//100
        	totalBalance=totalBalance + paisa[1]*50; //100 + 100
        	totalBalance=totalBalance + paisa[2]*100;//200 + 100
        	totalBalance=totalBalance + paisa[3]*200;//300 + 1200
        	
        //	System.out.println(totalBalance);	//1500
        	
        if (totalBalance >= itemPrice) 
            return "I can purchase";
         else 
            return "I need more money";
        
    }

    public static void main(String[] args) {
        int paisa[] = {10, 2, 1, 6}; 
        //respective currency notes:10, 50, 100, 200 
        int itemPrice = 630; 
        
        Store s=new Store();
              
        String message=s.hisab(paisa, itemPrice);
        
        System.out.println(message);
    }
}