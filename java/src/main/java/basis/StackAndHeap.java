package basis;

/**
 * 
 * ջstack  ��heap
 *
 */
public class StackAndHeap {
	/**
	 * ջstack
	 */
	/**
	 * 2. ջ�������ǣ���ȡ�ٶȱȶ�Ҫ�죬������ֱ��λ��CPU�еļĴ�������ȱ���ǣ�����ջ�е����ݴ�С�������ڱ�����ȷ���ģ�ȱ������ԡ�
	 * ���⣬ջ���ݿ��Թ����������3�㡣�ѵ������ǿ��Զ�̬�ط����ڴ��С��������Ҳ�������ȸ��߱�������Java�������ռ������Զ�������Щ����ʹ�õ����ݡ�
	 * ��ȱ���ǣ�����Ҫ������ʱ��̬�����ڴ棬��ȡ�ٶȽ����� 
	 */
	
	/**
	 * ��������(primitive types), ����8�֣���int, short, long, byte, float, double, boolean, char
	 * (ע�⣬��û��string�Ļ�������)���������͵Ķ�����ͨ������int a = 3; long b = 255L;����ʽ������ģ���Ϊ�Զ�������
	 * ֵ��ע����ǣ��Զ��������������ֵ���������ʵ����������������ã����ﲢû����Ĵ��ڡ���int a = 3; 
	 * �����a��һ��ָ��int���͵����ã�ָ��3�������ֵ����Щ����ֵ�����ݣ����ڴ�С��֪�������ڿ�֪(��Щ����ֵ�̶�������ĳ����������棬������˳���
	 * �ֶ�ֵ����ʧ��)������׷���ٶȵ�ԭ�򣬾ʹ�����ջ�С�
	 */
	
	/**
	 * ����ջ�е����ݿ��Թ���
	 */
	
	/**
	 * ��������ֵ�����������������ò�ͬ���ٶ���������������ͬʱָ��һ���������һ���������ñ����޸������������ڲ�״̬��
	 * ��ô��һ���������ñ���Ҳ���̷�ӳ������仯���෴��ͨ������ֵ���������޸���ֵ�����ᵼ����һ��ָ�������ֵ�����õ�ֵҲ���Ÿı�������
	 * �����������Ƕ�����a��b��ֵ������a=4����ô��b�������4�����ǵ���3���ڱ������ڲ�������a=4��ʱ�����ͻ���������ջ���Ƿ���4������ֵ��
	 * ���û�У����¿��ٵ�ַ���4��ֵ������Ѿ����ˣ���ֱ�ӽ�aָ�������ַ�����aֵ�ĸı䲻��Ӱ�쵽b��ֵ��
	 */
	
	/**
	 * ��һ���ǰ�װ�����ݣ���Integer, String, Double�Ƚ���Ӧ�Ļ����������Ͱ�װ�������ࡣ��Щ������ȫ�������ڶ��У�
	 * Java��new()�������ʾ�ظ��߱�������������ʱ�Ÿ�����Ҫ��̬��������˱Ƚ�����ȱ����Ҫռ�ø����ʱ�䡣 4.
	 *  String��һ������İ�װ�����ݡ���������String str = new String("abc");����ʽ��������Ҳ������String str = "abc"��
	 *  ����ʽ������(��Ϊ�Աȣ���JDK 5.0֮ǰ�����δ����Integer i = 3;�ı���ʽ����Ϊ��������ֵ�ǲ���ͨ�õģ�����String��
	 *  ����JDK 5.0�У����ֱ���ʽ�ǿ��Եģ���Ϊ�������ں�̨����Integer i = new Integer(3)��ת��)��
	 *  ǰ���ǹ淶����Ĵ������̣�����Java�У�һ�ж��Ƕ��󣬶����������ʵ����ȫ��ͨ��new()����ʽ��������Java�е���Щ�࣬
	 *  ��DateFormat�࣬����ͨ�������getInstance()����������һ���´������࣬�ƺ�Υ���˴�ԭ����ʵ��Ȼ�����������˵���ģʽ���������ʵ����
	 *  ֻ�������ʵ�����ڸ����ڲ�ͨ��new()�������ģ���getInstance()���ⲿ�����˴�ϸ�ڡ���Ϊʲô��String str = "abc"���У�
	 *  ��û��ͨ��new()������ʵ�����ǲ���Υ��������ԭ����ʵû�С� 
	 */
	
	/**
	 * ����String str = "abc"���ڲ�������Java�ڲ��������ת��Ϊ���¼������裺
		(1)�ȶ���һ����Ϊstr�Ķ�String��Ķ������ñ�����String str��
		(2)��ջ�в�����û�д��ֵΪ"abc"�ĵ�ַ�����û�У��򿪱�һ���������ֵΪ"abc"�ĵ�ַ�����Ŵ���һ���µ�String��Ķ���o��
		����o���ַ���ֵָ�������ַ��������ջ�������ַ�Ա߼���������õĶ���o������Ѿ�����ֵΪ"abc"�ĵ�ַ������Ҷ���o��������o�ĵ�ַ��
		(3)��strָ�����o�ĵ�ַ�� 
	 */
	/**
	 * String str1 = "abc";
		String str2 = "abc";
		str1 = "bcd";
		System.out.println(str1 + "," + str2); //bcd, abc
		System.out.println(str1==str2); //false
		�����˵����ֵ�ı仯��������������õı仯��str1ָ��������һ���¶��󣡶�str2�Ծ�ָ��ԭ���Ķ��������У������ǽ�str1��ֵ��Ϊ"bcd"ʱ��
		JVM������ջ��û�д�Ÿ�ֵ�ĵ�ַ���㿪���������ַ����������һ���µĶ������ַ�����ֵָ�������ַ�� 
	 */
	
	/**
	 * ջ���������͵ı����Ͷ�������ñ���
	 * �ѣ���new�����Ķ��������
	 * ջ�еı���ָ����ڴ��еı���������� Java �е�ָ��!
	 * ����Ҫ������Ŷ���ģ�ջ��Ҫ������ִ�г����
	 * �ں����ж����һЩ�������͵ı����Ͷ�������ñ������ں�����ջ�ڴ��з��䡣 
	 * ���ñ������൱����Ϊ�����������һ�����ƣ��Ժ�Ϳ����ڳ�����ʹ��ջ�е����ñ��������ʶ��е���������
	 * http://blog.csdn.net/chengyingzhilian/article/details/7781858
	 * 
	 */
}