package gains.java;

class Apple {
    public String color="red";
    
}

public class PassedByValue {
       /**
        * Output red green ab  ab 
        * 
        *  new Apple() is the Apple object
        *  apple is original reference
        *  changeApple(apple) copied reference
        *  Since the orignal and copied reference refer the same object, the member value gets changed.
        *  String immutability. 
        *  
        *  （1）：“在Java里面参数传递都是按值传递”这句话的意思是：按值传递是传递的值的拷贝，按引用传递其实传递的是引用的地址值，所以统称按值传递。

		        （2）：在Java里面只有基本类型和按照下面这种定义方式的String是按值传递，其它的都是按引用传递。
		                     就是直接使用双引号定义字符串方式：String str = “Java私塾”;
        * 
        */
  
        public static void main(String[] args) {
            Apple apple = new Apple();
            System.out.println(apple.color);
            changeApple(apple);
            System.out.println(apple.color);
            
            String str="ab";
            System.out.println(str);
            change(str);
            System.out.println(str);
        }
     
        public static void changeApple(Apple apple){
            apple.color = "green";
        }
        
        public static void change(String str){
            str="cd";
        }
    }

