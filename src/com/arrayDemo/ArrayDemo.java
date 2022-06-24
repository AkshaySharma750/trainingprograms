package com.arrayDemo;

public class ArrayDemo {
    public static void main(String args[]){
        int arrayofAadhar[]=new int[5];
        System.out.println(arrayofAadhar[3]);
        arrayofAadhar[3]=25568;
        
        for(int i=0; i<arrayofAadhar.length;i++)
        {
            System.out.println(arrayofAadhar[i]);
        }
        for(int a:arrayofAadhar){
            System.out.println(a);
        }
        arrayofAadhar=new int[6];
        arrayofAadhar[0]=10001;
        arrayofAadhar[1]=10002;
        arrayofAadhar[2]=10003;
        arrayofAadhar[3]=10004;
        arrayofAadhar[4]=10005;
        arrayofAadhar[5]=10006;
        int[] arrayofAadhar1 = null;
        System.out.println("-----------------");
        int found=0;
        for(int a:arrayofAadhar){
            System.out.println(a);
        }
        
        for(int i=0; i<arrayofAadhar.length; i++)
        {
            if(arrayofAadhar[i]==10003)
            {
                found++;
                
            }
        }
        if(found==0)
        {
            System.out.println("Not found");
        }
        else
        {
            arrayofAadhar1 = new int[arrayofAadhar.length - found];
            for(int i=0;i<arrayofAadhar1.length;i++)
            {
                for(int j=i;j<arrayofAadhar.length;j++)
                {
                    if(arrayofAadhar[j]!=10003)
                    {
                        arrayofAadhar1[i] = arrayofAadhar[j];
                        break;
                    }
                }
            }
        }
        System.out.println("-----------------");
        
        for(int a: arrayofAadhar)
        {
            System.out.println(a);
        }
        System.out.println("-----------------");
        for(int a: arrayofAadhar1)
        {
            System.out.println(a);
        }
        
    }
}