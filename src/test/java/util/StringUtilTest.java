package util;


class StringUtilTest {
    public static void main(String[] args) {
        String result =  StringUtil.repeat("hello",3);
        System.out.println(result);
        if(!result.equals("hellohellohello")){
            System.out.println("ERROR");
        }

        String result2 =  StringUtil.repeat("hello",2);
        System.out.println(result);
        if(!result.equals("hellohello")){
            System.out.println("ERROR");
        }
    }

}