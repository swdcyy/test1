package ca7.u;
import java.lang.String;
import java.lang.CharSequence;
import java.lang.Object;

public final class u	// class@0003a9
{

    public static String a(String p0){
       if (p0 != null) {
       }else {
          p0 = "";
       }
       return p0;
    }
    public static boolean b(CharSequence p0,CharSequence p1){
       if (p0 == p1) {
          return true;
       }
       if (p0 != null && p1 != null) {
          int i = p0.length();
          if (i == p1.length()) {
             if (p0 instanceof String && p1 instanceof String) {
                return p0.equals(p1);
             }else {
                int i1 = 0;
                while (true) {
                   if (i1 >= i) {
                      return true;
                   }
                   if (p0.charAt(i1) != p1.charAt(i1)) {
                      break ;
                   }else {
                      i1 = i1 + 1;
                   }
                }
                return false;
             }
          }
       }
       return false;
    }
    public static boolean c(CharSequence p0){
       boolean b = (p0 == null || !p0.length())? true: false;
       return b;
    }
    public static String d(Object p0){
       p0 = (p0 != null)? u.a(p0.toString()): "";
       return p0;
    }
}
