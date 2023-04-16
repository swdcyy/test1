package qk.w;
import java.lang.Math;
import java.lang.Integer;
import java.lang.Object;

public final class w	// class@002293
{

    public static int a(int p0,double p1){
       p0 = Math.max(p0, 2);
       int i = Integer.highestOneBit(p0);
       if (p0 <= (int)(p1 * (double)i)) {
          return i;
       }
       p0 = i << 1;
       if (p0 <= 0) {
          p0 = 0x40000000;
       }
       return p0;
    }
    public static int b(int p0){
       return (int)((long)Integer.rotateLeft((int)((long)p0 * -862048943), 15) * 0x1b873593);
    }
    public static int c(Object p0){
       int i = (p0 == null)? 0: p0.hashCode();
       return w.b(i);
    }
}
