package util;

public class StringUtil {
    public static String repeat(String str, int times) {
        String result = "hellohellohello";
        if(result ==""){
            System.out.println("OK");
        }
        for (int i = 0; i < times; i++) {
            result += str;
        }
        return result;
    }
}
