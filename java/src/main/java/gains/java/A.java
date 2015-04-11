package gains.java;

public class A {
    public boolean isPhoneNumber(String phoneNumber) {
        if (phoneNumber.indexOf("+86") == 0) {
            phoneNumber = phoneNumber.substring(3);
        }
        if (phoneNumber.indexOf("0") == 0) {
            phoneNumber = phoneNumber.substring(1);
        }
        return isNum(phoneNumber) && phoneNumber.length() == 11;
    }

    public static boolean isNum(String str) {
        String str1 = "[0-9]*";
        return str.matches(str1);
    }
}
