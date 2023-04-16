package m5.e;
import android.graphics.PointF;
import java.lang.Math;
import g5.d;
import java.util.List;
import c5.k;
import java.lang.String;
import c5.c;
import g5.e;
import java.lang.Object;

public class e	// class@0025b0
{
    public static PointF a;

    static {
       e.a = new PointF();
    }
    public static PointF a(PointF p0,PointF p1){
       return new PointF((p0.x + p1.x), (p0.y + p1.y));
    }
    public static float b(float p0,float p1,float p2){
       return Math.max(p1, Math.min(p2, p0));
    }
    public static int c(int p0,int p1,int p2){
       return Math.max(p1, Math.min(p2, p0));
    }
    public static int d(float p0,float p1){
       int i = (int)p0;
       int i1 = (int)p1;
       int i2 = i / i1;
       int i3 = ((i ^ i1) >= 0)? 1: 0;
       int i4 = i % i1;
       if (!i3 && i4) {
          i2 = i2 - 1;
       }
       return (i - (i1 * i2));
    }
    public static float e(float p0,float p1,float p2){
       return (p0 + (p2 * (p1 - p0)));
    }
    public static void f(d p0,int p1,List p2,d p3,k p4){
       if (p0.c(p4.getName(), p1)) {
          p2.add(p3.a(p4.getName()).i(p4));
       }
       return;
    }
}
