package c.t.m.g.bw;
import java.lang.Double;
import java.lang.Math;

public class bw	// class@000bfb
{

    public static int a(boolean p0){
       return p0;
    }
    public static final boolean a(double p0,double p1){
       return bw.a(p0, p1, 0.00f);
    }
    public static final boolean a(double p0,double p1,double p2){
       boolean b = false;
       if (Double.isNaN(p0) || (!Double.isNaN(p1) && Math.abs((p0 - p1)) - p2 < 0)) {
          b = true;
       }
    label_0018 :
       return b;
    }
}
