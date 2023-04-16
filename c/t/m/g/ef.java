package c.t.m.g.ef;
import java.lang.String;
import java.lang.Object;

public class ef	// class@000c68
{

    public static String a(String p0){
       if (p0 == null) {
          p0 = "";
       }
       return p0;
    }
    public static boolean a(Object p0){
       boolean b = (p0 == null)? true: false;
       return b;
    }
    public static boolean a(Object p0,Object p1){
       boolean b = (p0 == null || p1 == null)? true: false;
       return b;
    }
    public static boolean a(Object p0,Object p1,Object[] p2){
       if (!ef.b(p2, p1)) {
          return false;
       }
       int len = p2.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return true;
          }
          if (p2[i] != null) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public static boolean b(Object p0){
       boolean b = (p0 != null)? true: false;
       return b;
    }
    public static boolean b(Object p0,Object p1){
       boolean b = (p0 == null && p1 == null)? true: false;
       return b;
    }
}
