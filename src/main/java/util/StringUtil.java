package util;

public class StringUtil {
    public static String repeat(String str, int times) {
        if(times < 0){
            throw new IllegalArgumentException("negative times not allowed");
        }
        String result = "";
        if(result ==""){
            System.out.println("OK");
        }
        for (int i = 0; i < times; i++) {
            result += str;
        }
        return result;
    }
}
