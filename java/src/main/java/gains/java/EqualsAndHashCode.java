package gains.java;

import java.util.HashMap;

public class EqualsAndHashCode {

    private String color;
    
    public EqualsAndHashCode(String color) {
        this.color = color;
    }
 
    public boolean equals(Object obj) {
        if (!(obj instanceof EqualsAndHashCode))
            return false;   
        if (obj == this)
            return true;
        return this.color.equals(((EqualsAndHashCode) obj).color);
    }
    
    //if  un-overridden method hashCode() ,the apple object will not find
    public int hashCode(){
        return this.color.length(); 
    }
 
    public static void main(String[] args) {
        EqualsAndHashCode a1 = new EqualsAndHashCode("green");
        EqualsAndHashCode a2 = new EqualsAndHashCode("red");
 
        //hashMap stores apple type and its quantity
        HashMap<EqualsAndHashCode, Integer> m = new HashMap<EqualsAndHashCode, Integer>();
        m.put(a1, 10);
        m.put(a2, 20);
        System.out.println(m.get(new EqualsAndHashCode("green")));
    }

}
