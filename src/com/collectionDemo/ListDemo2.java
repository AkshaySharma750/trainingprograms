package com.collectionDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
		List<String> fruitsList = new ArrayList<String>();
        
        fruitsList.add("Mango");    
        fruitsList.add("Apple");
        fruitsList.add("Papaya");
        fruitsList.add(null);   

        System.out.println(fruitsList.get(1));  
        fruitsList.add(1, "Grapes");    
        System.out.println(fruitsList.get(2));
        System.out.println(fruitsList.size());
        fruitsList.remove("Apple"); 
        fruitsList.set(2,"Orange");     

        for(String a: fruitsList)
        {
            System.out.println(a);
        }
        if(fruitsList.contains("Mango"))
        {
            System.out.println("Its present");
        }
        else
        {
            System.out.println("Its not present");
        }
        if(fruitsList.isEmpty())
        {
            System.out.println("Its empty");
        }
        else
        {
            System.out.println("List is not empty");
        }

        fruitsList = new LinkedList<>();//Dynamic Polymorphism
    }


	}


