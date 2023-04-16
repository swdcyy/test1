package ed.q;
import java.lang.Math;
import java.lang.Boolean;
import ab.e;

public class q	// class@001f31
{

    public static int a(int p0,int p1,int p2){
       return Math.min(Math.max(0, (p2 - p0)), p1);
    }
    public static void b(int p0,int p1,int p2,int p3,int p4){
       boolean b = true;
       boolean b1 = (p3 >= 0)? true: false;
       e.a(Boolean.valueOf(b1));
       b1 = (p0 >= 0)? true: false;
       e.a(Boolean.valueOf(b1));
       b1 = (p2 >= 0)? true: false;
       e.a(Boolean.valueOf(b1));
       boolean b2 = ((p0 + p3) <= p4)? true: false;
       e.a(Boolean.valueOf(b2));
       if ((p2 + p3) > p1) {
          b = false;
       }
       e.a(Boolean.valueOf(b));
       return;
    }
}
