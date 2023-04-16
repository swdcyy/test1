package c.t.m.g.i;
import c.t.m.g.d$a;
import java.lang.Enum;

public class i	// class@000c98
{
    public static int[] a;

    static {
       i.a = new int[8]{0,8,10,'!',0xffff,0x3040101,0xfffffff,0x7fffffff};
    }
    public static boolean a(int p0){
       boolean b = (p0 == d$a.c.ordinal())? true: false;
       return b;
    }
    public static boolean a(int p0,int p1,int p2,int p3,long p4){
       if (p1 >= 0 && (p2 >= 0 && (p3 >= 0 && p4 > 0))) {
          int i = 535;
          if (p1 == i || (p2 == i || (p3 != 0xffff && p4 - 0xffff))) {
             if (!i.a(p0) && (p3 == 0x64f0 || i.a(p4, i.a))) {
                return false;
             }else {
                return true;
             }
          }
       }
    label_0035 :
       return false;
    }
    public static boolean a(long p0,int[] p1){
       int i = 0;
       while (true) {
          if (i >= p1.length) {
             return false;
          }
          if (!p0 - (long)p1[i]) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
}
