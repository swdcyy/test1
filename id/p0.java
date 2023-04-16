package id.p0;
import uc.d;
import bd.d;

public final class p0	// class@0021c5
{

    public static int a(int p0){
       return (int)((float)p0 * 0x3faaaaab);
    }
    public static boolean b(int p0,int p1,d p2){
       boolean b = true;
       if (p2 == null) {
          if ((float)p0.a(p0) - 0x45000000 < 0 || p0.a(p1) < 2048) {
             b = false;
          }
          return b;
       }else if(p0.a(p0) >= p2.a && p0.a(p1) >= p2.b){
          b = false;
       }
       return b;
    }
    public static boolean c(d p0,d p1){
       if (p0 == null) {
          return false;
       }
       int i = p0.l();
       if (i != 90 && i != 270) {
          return p0.b(p0.getWidth(), p0.getHeight(), p1);
       }
       return p0.b(p0.getHeight(), p0.getWidth(), p1);
    }
}
