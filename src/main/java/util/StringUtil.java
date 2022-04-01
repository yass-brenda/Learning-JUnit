package util;



import javax.sound.midi.Soundbank;

public class StringUtil {
    public static void main(String[] args){

        String palabra = null;
        System.out.println(isEmpty(palabra));



    }
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

    // Debes fijarte en el orden de las condicciones estas se ejecutan de izquierda a derecha
    // Ten cuidado cuando evaluas un null porque si evaluas este en segundo lugar ya no podra evualuar las siguientes condiciones porque si el objeto es null no
    // podras llamar a ningun metodo  porque el objeto null significa que no existe ese objeto por tanto no existe ese método.

    public static boolean isEmpty(String str) {
        if (str == null || str.trim().equals("") || str.length() == 0 ) {
            return true;
        } else {
            return false ;
        }
    }

}

