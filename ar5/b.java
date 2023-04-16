package ar5.b;
import android.view.animation.Interpolator;
import java.lang.Object;
import android.graphics.PointF;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class b implements Interpolator	// class@000398
{
    public final PointF a;
    public final PointF b;
    public int c;

    public void b(float p0,float p1,float p2,float p3){
       super();
       PointF pointF = new PointF();
       this.a = pointF;
       PointF pointF1 = new PointF();
       this.b = pointF1;
       this.c = 0;
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
    public float getInterpolation(float p0){
       b obj;
       if (PatchProxy.isSupport(b.class)) {
          obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, b.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       obj = this.c;
       float f = p0;
       while (obj < 0.00f) {
          float f1 = (float)obj * 0x3f800000;
          f = f1 / 4096.00f;
          if (b.a((double)f, 0, (double)this.a.x, (double)this.b.x, 0x3ff0000000000000) - (double)p0 >= 0) {
             this.c = obj;
             break ;
          }
          int i = obj + 1;
       }
       double d = b.a((double)f, 0, (double)this.a.y, (double)this.b.y, 0x3ff0000000000000);
       if (d - 0x3feff7ced916872b > 0) {
          d = 0x3ff0000000000000;
          this.c = 0;
       }
       return (float)d;
    }
}
