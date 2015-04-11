package gains.java;

import java.util.ArrayList;

class Insect {
    private int size;
    private String color;
    
    public Insect(int size, String color) {
        this.size = size;
        this.color = color;
    }
 
    public int getSize() {
        return size;
    }
 
    public void setSize(int size) {
        this.size = size;
    }
 
    public String getColor() {
        return color;
    }
 
    public void setColor(String color) {
        this.color = color;
    }
 
    public void move() {
        System.out.println("Move");
    }
 
    public void attack() {
        move(); //assuming an insect needs to move before attacking
        System.out.println("Attack");
    }
}

class Bee extends Insect {
    public Bee(int size, String color) {
        super(size, color);
    }
 
    public void move() {
        System.out.println("Fly");
    }
 
    public void attack() {
        move();
        System.out.println("Attack");
    }
}
public class Inheritance {

    public static void main(String[] args) {
        //把子类对象直接赋给父类引用叫upcasting向上转型，向上转型不用强制转型。
        Insect i = new Bee(1, "red");
        i.attack();
        //把指向子类对象的父类引用赋给子类引用叫向下转型（downcasting），要强制转型。
        Bee b=(Bee) i;
        b.attack();
        
    }
}
