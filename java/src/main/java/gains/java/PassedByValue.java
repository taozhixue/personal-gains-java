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
        *  ��1��������Java����������ݶ��ǰ�ֵ���ݡ���仰����˼�ǣ���ֵ�����Ǵ��ݵ�ֵ�Ŀ����������ô�����ʵ���ݵ������õĵ�ֵַ������ͳ�ư�ֵ���ݡ�

		        ��2������Java����ֻ�л������ͺͰ����������ֶ��巽ʽ��String�ǰ�ֵ���ݣ������Ķ��ǰ����ô��ݡ�
		                     ����ֱ��ʹ��˫���Ŷ����ַ�����ʽ��String str = ��Java˽�ӡ�;
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

