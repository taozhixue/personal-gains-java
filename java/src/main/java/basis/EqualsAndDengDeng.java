package basis;

public class EqualsAndDengDeng {
	 static String aa="abc";
	
	public static void main(String[] args) {
		String a="abc";
		String b="abc";
		String c=new String("abc");
		String d=new String("abc");
		
		
		/**
		 * *第一个是true 原因是：
	 *  	 引号内包含文本是String类特有创建对象的方式.但是"=="返回的结果是true,为什么呢?因为在JVM内,存在字符串池,
	 *  其中保存着很多 String对象，并且可以被共享使用，因此它提高了效率.字符串池由String类维护，我们可以调用intern()方法来访问字符串池
	 *  。当运用引号内包含文本创建对象时,所创建的对象是加入到字符串池里面的.如果要创建下一个字符串对象,JVM首先会到字符串池中寻找,
	 *  是否存在对应的字符串对象,如果存在,则返回一个己存在对象的对象的引用给要创建的对象引用.如果不存在,才会创建一个新的对象,
	 *  并返回一个新对象的对象引用给要创建的对象引用.以上这段话理解起来可能比较拗口.用代码理解就是str2和str1是两个对象引用,
	 *  并指向了同一个对象.所以'=='返回的是true.
	 *   只有引号内包含文本创建对象才会将创建的对象放入到字符串池。String str = new String("abc")
	 *   这种方法创建的字符串对象是不放入到字符串池的。所以,引号内包含文本创建对象的性能要比后来那种方法创建字符串对象的性能要好。
		 */
		System.out.println("a==b"+(a==b));
		
		//false  先执行字符串拼接 在执行比较
		System.out.println("a==b："+a==b);
		
		
		/**
		 * true
		 * 基本数据类型在"栈"中存的是其内容值,而对象类型在"栈"中存的是地址,这些地址指向"堆"中的对象。
		 */
		System.out.println("a.equals(b):"+a.equals(b));
		
		
		System.out.println(a==c); //false 在JAVA中利用"=="比较变量时,系统使用变量在"栈"中所存的值作为比较的依据。
		
		//false  如果要比较两个变量是否指向同一个对象，即要看这两个变量所对应的内存中的数值是否相等，这时候就需要用==操作符进行比较。
		System.out.println(c==d);
		
		//常量 
		final String e="abc";
		String f="abcdef";
		String g=e+"def";
		String h=aa+"def";
		String i=a+"def";
		
		//true  
		System.out.println(f==g);
		
		//false
		System.out.println(f==h);
		//false
		System.out.println(f==a);
		
		a="cba"; //false
		System.out.println(a==b);
		
		
		String str1 = "abc";
		String str2 = "abc";
		str1 = "bcd";
		String str3 = str1;
		System.out.println(str3); //bcd
		System.out.println(str1==str3); //true
		String str4 = "bcd";
		System.out.println(str1 == str4); //true 
	}
	

}
