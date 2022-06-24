package com.collectionDemo;

import java.util.*;

//import com.mycompany.day8bookauthorprojectsolution.Author;

import java.util.ArrayList;
import java.util.List;

public class MapDemo1 {

	public static void main(String[] args) {
		 
        Map<Integer, String> mapOfEmployee = new HashMap<>();
        
        mapOfEmployee.put(111,"John");
        mapOfEmployee.put(555,"Alex");
        mapOfEmployee.put(333,"Peter");
        mapOfEmployee.put(444,"Joe");
        mapOfEmployee.put(null,null);
        mapOfEmployee.put(null,null);   

        
        mapOfEmployee.put(777,null);

        for(Map.Entry<Integer, String> m: mapOfEmployee.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
            if(m.getValue()!=null && m.getValue().equals("Alex"))
            {
                System.out.println("Found Alex at Key: "+m.getKey());
            }
        }
        System.out.println(mapOfEmployee.get(333));
        System.out.println(mapOfEmployee.size());   
    }
}

	


