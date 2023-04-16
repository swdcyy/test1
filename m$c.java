package m$c;
import java.lang.String;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.StringBuilder;

public class m$c	// class@002597
{
    public static boolean a = true;
    public static PrintWriter b;

    static {
       m$c.c(true);
       m$c.c(false);
    }
    public static String a(String p0,Object[] p1){
       String str = (p0 == null)? "": p0;
       try{
          return String.format(str, p1);
       }catch(java.lang.RuntimeException e5){
          Object[] objArray = new Object[]{e5.getMessage(),p0};
          m$c.a("format error. reason=%s, format=%s", objArray);
          p1 = new Object[]{p0};
          return String.format(v0, p1);
       }
    }
    public static void b(String p0){
       if (m$c.a) {
          int i = 0;
          Object[] objArray = new Object[i];
          p0 = m$c.a("[*] Debug : "+p0, objArray);
          int i1 = p0.length() / 2000;
          while (i <= i1) {
             i1 = i * 2000;
             i = i + 1;
             int i2 = i * 2000;
             if (i2 > p0.length()) {
                i2 = p0.length();
             }
             p0.substring(i1, i2);
          }
       }
       return;
    }
    public static void c(boolean p0){
       m$c.a = p0;
    }
    public static void d(String p0){
       if (m$c.a) {
          Object[] objArray = new Object[0];
          m$c.a("[-] Error : "+p0, objArray);
       }
       return;
    }
}
