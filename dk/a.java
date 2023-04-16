package dk.a;
import java.lang.Math;

public final class a	// class@001e6c
{

    public static float a(float p0,float p1,float p2,float p3){
       return (float)Math.hypot((double)(p2 - p0), (double)(p3 - p1));
    }
    public static float b(float p0,float p1,float p2,float p3,float p4,float p5){
       return a.e(a.a(p0, p1, p2, p3), a.a(p0, p1, p4, p3), a.a(p0, p1, p4, p5), a.a(p0, p1, p2, p5));
    }
    public static boolean c(float p0,float p1,float p2){
       boolean b = ((p0 + p2) - p1 >= 0)? true: false;
       return b;
    }
    public static float d(float p0,float p1,float p2){
       return (((0x3f800000 - p2) * p0) + (p2 * p1));
    }
    public static float e(float p0,float p1,float p2,float p3){
       if (p0 - p1 <= 0 || (p0 - p2 <= 0 || p0 - p3 <= 0)) {
          if (p1 - p2 > 0 && p1 - p3 > 0) {
             p0 = p1;
          }else if(p2 - p3 > 0){
             p0 = p2;
          }else {
             p0 = p3;
          }
       }
       return p0;
    }
}
