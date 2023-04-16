package ok.a;
import java.lang.String;

public final class a	// class@0027df
{

    public static boolean a(char p0){
       boolean b = (p0 >= 'a' && p0 <= 'z')? true: false;
       return b;
    }
    public static boolean b(char p0){
       boolean b = (p0 >= 'A' && p0 <= 'Z')? true: false;
       return b;
    }
    public static String c(String p0){
       int i = p0.length();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return p0;
          }
          if (a.b(p0.charAt(i1))) {
             char[] uocharArray = p0.toCharArray();
             while (i1 < i) {
                char c = uocharArray[i1];
                if (a.b(c)) {
                   int i2 = c ^ 0x20;
                   uocharArray[i1] = (char)i2;
                }
                i1 = i1 + 1;
             }
             return String.valueOf(uocharArray);
          }else {
             i1 = i1 + 1;
          }
       }
    }
    public static String d(String p0){
       int i = p0.length();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return p0;
          }
          if (a.a(p0.charAt(i1))) {
             char[] uocharArray = p0.toCharArray();
             while (i1 < i) {
                char c = uocharArray[i1];
                if (a.a(c)) {
                   int i2 = c & 0x5f;
                   uocharArray[i1] = (char)i2;
                }
                i1 = i1 + 1;
             }
             return String.valueOf(uocharArray);
          }else {
             i1 = i1 + 1;
          }
       }
    }
}
