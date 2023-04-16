package c.t.m.g.by;
import java.lang.Object;
import java.lang.String;
import java.util.Collection;

public class by	// class@000bfd
{

    public static int a(boolean p0){
       return p0;
    }
    public static boolean a(Object p0){
       boolean b = (p0 == null)? true: false;
       return b;
    }
    public static boolean a(String p0){
       boolean b = (p0 == null || !p0.length())? true: false;
       return b;
    }
    public static boolean a(Collection p0){
       boolean b = (p0 == null || p0.isEmpty())? true: false;
       return b;
    }
    public static boolean a(byte[] p0){
       boolean b = (p0 == null || !p0.length)? true: false;
       return b;
    }
    public static boolean a(Object[] p0){
       int len = p0.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return true;
          }
          if (p0[i] == null) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public static boolean b(Object[] p0){
       boolean b = (p0 == null || !p0.length)? true: false;
       return b;
    }
}
