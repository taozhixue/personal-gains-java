package basis;

public class EqualsAndDengDeng {
	 static String aa="abc";
	
	public static void main(String[] args) {
		String a="abc";
		String b="abc";
		String c=new String("abc");
		String d=new String("abc");
		
		
		/**
		 * *��һ����true ԭ���ǣ�
	 *  	 �����ڰ����ı���String�����д�������ķ�ʽ.����"=="���صĽ����true,Ϊʲô��?��Ϊ��JVM��,�����ַ�����,
	 *  ���б����źܶ� String���󣬲��ҿ��Ա�����ʹ�ã�����������Ч��.�ַ�������String��ά�������ǿ��Ե���intern()�����������ַ�����
	 *  �������������ڰ����ı���������ʱ,�������Ķ����Ǽ��뵽�ַ����������.���Ҫ������һ���ַ�������,JVM���Ȼᵽ�ַ�������Ѱ��,
	 *  �Ƿ���ڶ�Ӧ���ַ�������,�������,�򷵻�һ�������ڶ���Ķ�������ø�Ҫ�����Ķ�������.���������,�Żᴴ��һ���µĶ���,
	 *  ������һ���¶���Ķ������ø�Ҫ�����Ķ�������.������λ�����������ܱȽ��ֿ�.�ô���������str2��str1��������������,
	 *  ��ָ����ͬһ������.����'=='���ص���true.
	 *   ֻ�������ڰ����ı���������ŻὫ�����Ķ�����뵽�ַ����ء�String str = new String("abc")
	 *   ���ַ����������ַ��������ǲ����뵽�ַ����صġ�����,�����ڰ����ı��������������Ҫ�Ⱥ������ַ��������ַ������������Ҫ�á�
		 */
		System.out.println("a==b"+(a==b));
		
		//false  ��ִ���ַ���ƴ�� ��ִ�бȽ�
		System.out.println("a==b��"+a==b);
		
		
		/**
		 * true
		 * ��������������"ջ"�д����������ֵ,������������"ջ"�д���ǵ�ַ,��Щ��ַָ��"��"�еĶ���
		 */
		System.out.println("a.equals(b):"+a.equals(b));
		
		
		System.out.println(a==c); //false ��JAVA������"=="�Ƚϱ���ʱ,ϵͳʹ�ñ�����"ջ"�������ֵ��Ϊ�Ƚϵ����ݡ�
		
		//false  ���Ҫ�Ƚ����������Ƿ�ָ��ͬһ�����󣬼�Ҫ����������������Ӧ���ڴ��е���ֵ�Ƿ���ȣ���ʱ�����Ҫ��==���������бȽϡ�
		System.out.println(c==d);
		
		//���� 
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
