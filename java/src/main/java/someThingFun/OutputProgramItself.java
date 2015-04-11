package someThingFun;

public class OutputProgramItself {
    public static void main(String[] args) {
        String s="package someThingFun;public class OutputProgramItself {"
        		+ " public static void main(String[] args) {String s=%c%s%c;"
        		+ "System.out.printf(s,34,s,34);}}";
        System.out.printf(s,34,s,34);
    }
}
