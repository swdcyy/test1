package ekd.j;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.lang.Integer;
import java.lang.Class;

public abstract class j	// class@00155a
{

    public static ArrayList a(Object[] p0){
       return new ArrayList(Arrays.asList(p0));
    }
    public static List b(int[] p0){
       ArrayList uArrayList = new ArrayList();
       if (p0 == null) {
          return uArrayList;
       }
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          uArrayList.add(Integer.valueOf(p0[i]));
       }
       return uArrayList;
    }
    public static boolean c(int[] p0,int p1){
       if (p0 == null) {
          return false;
       }
       int len = p0.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          if (p0[i] == p1) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public static boolean d(Object[] p0,Object p1){
       boolean b = false;
       int i = 0;
       while (true) {
          if (i < p0.length) {
             if (p1.equals(p0[i])) {
             label_0013 :
                if (i != -1) {
                   b = true;
                   break ;
                }
                break ;
             }else {
                i = i + 1;
             }
          }else {
             i = -1;
             goto label_0013 ;
          }
       }
       return b;
    }
    public static Object e(Object[] p0,Class p1){
       int i1;
       if (!j.h(p0)) {
          int len = p0.length;
          int i = 0;
          i1 = -1;
          while (true) {
             if (i < len) {
                object oobject = p0[i];
                i1 = i1 + 1;
                if (oobject != null && p1 == oobject.getClass()) {
                label_001d :
                   if (i1 != -1) {
                      break ;
                   }else {
                      return null;
                   }
                }else {
                   i = i + 1;
                }
             }
          }
          return p0[i1];
       }
       i1 = -1;
       goto label_001d ;
    }
    public static Object f(Object[] p0,int p1){
       if (p0 != null && (p1 >= 0 && p1 < p0.length)) {
          return p0[p1];
       }
       return null;
    }
    public static boolean g(int[] p0){
       boolean b = (p0 == null || !p0.length)? true: false;
       return b;
    }
    public static boolean h(Object[] p0){
       boolean b = (p0 == null || !p0.length)? true: false;
       return b;
    }
    public static int i(int[] p0,int p1){
       int i = 0;
       while (true) {
          if (i >= p0.length) {
             return -1;
          }
          if (p0[i] == p1) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i;
    }
}
