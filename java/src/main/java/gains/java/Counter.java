package gains.java;

import java.util.HashMap;

import General.MutableInteger;

public class Counter {

   static String str="one two three two three three";
   static String sArr[]=str.split(" ");
   
   static long startTime = 0;
   static long endTime = 0;
   static long duration = 0;
   
  static  HashMap<String,Integer> counter=new HashMap<String,Integer>();
  static HashMap<String,MutableInteger> newcounter=new HashMap<String,MutableInteger>();
  static HashMap<String,MutableInteger> efficientcounter=new HashMap<String,MutableInteger>();
   public static void main(String[] args) {
       
       //naive counter
       for (int i = 0; i < 1000000; i++)
       for(String a:sArr){
           if(counter.containsKey(a)){
               int oldValue=counter.get(a);
               counter.put(a, oldValue+1);
           }else{
               counter.put(a,1);
           }
       }
   endTime=System.nanoTime();
   duration=endTime-startTime;
   System.out.println("Naive Approach: "+duration);
   
       //better counter
   for (int i = 0; i < 1000000; i++)
       for(String a:sArr){
           if(newcounter.containsKey(a)){
               MutableInteger oldValue=newcounter.get(a);
               oldValue.setVal(oldValue.getVal()+1);
           }else{
               newcounter.put(a, new MutableInteger(1));
           }
       }
   endTime=System.nanoTime();
   duration=endTime-startTime;
   System.out.println("Better Approach: "+duration);
       
       //efficient counter
       for (int i = 0; i < 1000000; i++)
       for(String a:sArr){
               MutableInteger initValue=new MutableInteger(1);
               MutableInteger oldValue=efficientcounter.put(a,initValue);
               if(oldValue!=null){
                   initValue.setVal(oldValue.getVal()+1);
               }
       }
       endTime=System.nanoTime();
       duration=endTime-startTime;
       System.out.println("Efficient Approach: "+duration);
   }
}
