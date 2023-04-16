package of0.b;
import android.view.animation.Interpolator;
import of0.b$a;
import nsd.u;
import java.lang.Object;
import android.graphics.PointF;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class b implements Interpolator	// class@0034e4
{
    public int a;
    public final PointF b;
    public final PointF c;
    public static final b$a d;

    static {
       b.d = new b$a(null);
    }
    public void b(float p0,float p1,float p2,float p3){
       super();
       PointF pointF = new PointF();
       this.b = pointF;
       PointF pointF1 = new PointF();
       this.c = pointF1;
       pointF.x = p0;
       pointF.y = p1;
       pointF1.x = p2;
       pointF1.y = p3;
    }
    public float getInterpolation(float p0){
       b obj;
       if (PatchProxy.isSupport(b.class)) {
          obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, b.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       obj = this.a;
       float f = p0;
       int i = 4096;
       while (obj < i) {
          float f1 = (float)obj * 0x3f800000;
          f = f1 / (float)i;
          if (b.d.a((double)f, 0, (double)this.b.x, (double)this.c.x, 0x3ff0000000000000) - (double)p0 >= 0) {
             this.a = obj;
             break ;
          }
          int i1 = obj + 1;
       }
       double d = b.d.a((double)f, 0, (double)this.b.y, (double)this.c.y, 0x3ff0000000000000);
       if (d - 0x3feff7ced916872b > 0) {
          d = 0x3ff0000000000000;
          this.a = 0;
       }
       return (float)d;
    }
}
