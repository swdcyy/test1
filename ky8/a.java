package ky8.a;
import android.view.animation.Interpolator;
import java.lang.Object;
import android.graphics.PointF;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class a implements Interpolator	// class@002c53
{
    public int a;
    public final PointF b;
    public final PointF c;

    public void a(float p0,float p1,float p2,float p3){
       super();
       this.a = 0;
       PointF pointF = new PointF();
       this.b = pointF;
       PointF pointF1 = new PointF();
       this.c = pointF1;
       pointF.x = p0;
       pointF.y = p1;
       pointF1.x = p2;
       pointF1.y = p3;
    }
    public static double a(double p0,double p1,double p2,double p3,double p4){
       double d = 0x3ff0000000000000 - p0;
       double d1 = p0 * p0;
       double d2 = d * d;
       return (((((d2 * d) * p1) + (((d2 * 3.00f) * p0) * p2)) + (((d * 3.00f) * d1) * p3)) + ((d1 * p0) * p4));
    }
    public void b(){
       this.a = 0;
    }
    public float getInterpolation(float p0){
       a obj;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       obj = this.a;
       float f = p0;
       while (obj < 0.00f) {
          float f1 = (float)obj * 0x3f800000;
          f = f1 / 4096.00f;
          if (a.a((double)f, 0, (double)this.b.x, (double)this.c.x, 0x3ff0000000000000) - (double)p0 >= 0) {
             this.a = obj;
             break ;
          }
          int i = obj + 1;
       }
       double d = a.a((double)f, 0, (double)this.b.y, (double)this.c.y, 0x3ff0000000000000);
       if (d - 0x3feff7ced916872b > 0) {
          d = 0x3ff0000000000000;
          this.a = 0;
       }
       return (float)d;
    }
}
