package bh5.b;
import android.view.animation.Interpolator;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import bh5.b$b;
import bh5.b$a;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class b implements Interpolator	// class@0004a4
{
    public final List a;

    public void b(){
       super();
       this.a = new ArrayList();
    }
    public static double b(double p0,double p1,double p2,double p3,double p4){
       double d = 0x3ff0000000000000 - p0;
       double d1 = p0 * p0;
       double d2 = d * d;
       return (((((d2 * d) * p1) + (((d2 * 3.00f) * p0) * p2)) + (((d * 3.00f) * d1) * p3)) + ((d1 * p0) * p4));
    }
    public void a(float p0,float p1,float p2,float p3,float p4,float p5,float p6,float p7){
       b uob = this;
       if (PatchProxy.isSupport(b.class)) {
          Object[] objArray = new Object[]{Float.valueOf(p0),Float.valueOf(p1),Float.valueOf(p2),Float.valueOf(p3),Float.valueOf(p4),Float.valueOf(p5),Float.valueOf(p6),Float.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, this, b.class, "2")) {
             return;
          }
       }
       float f = p6 - p0;
       float f1 = p7 - p1;
       b$b uob1 = new b$b((((p2 - p0) * 0x3f800000) / f), (((p3 - p1) * 0x3f800000) / f1), (((p4 - p0) * 0x3f800000) / f), (((p5 - p1) * 0x3f800000) / f1), f, f1, 0);
       uob.a.add(v8);
       return;
    }
    public float getInterpolation(float p0){
       b$b obj1;
       b$b uob;
       float f4;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       if (PatchProxy.isSupport(b.class)) {
          obj1 = PatchProxy.applyOneRefs(Float.valueOf(p0), obj, b.class, str);
          if (obj1 != patchProxyRe) {
             return obj1.floatValue();
          }
       }
       obj1 = null;
       float f = 0;
       float f1 = 0;
       int i = 0;
       while (true) {
          if (i >= obj.a.size()) {
             return p0;
          }
          uob = obj.a.get(i);
          b$b f2 = uob.f;
          float f3 = f + f2;
          if (p0 - f3 <= 0) {
             f = (p0 - f) / f2;
             b$b uob1 = b$b.class;
             if (PatchProxy.isSupport(uob1)) {
                Object obj2 = PatchProxy.applyOneRefs(Float.valueOf(f), uob, uob1, str);
                if (obj2 != patchProxyRe) {
                   f4 = obj2.floatValue();
                   break ;
                }
             }
             b$b a = uob.a;
             float f5 = f;
             while (a < 0.00f) {
                float f6 = (float)a * 0x3f800000;
                f5 = f6 / 4096.00f;
                if (b.b((double)f5, 0, (double)uob.b, (double)uob.d, 0x3ff0000000000000) - (double)f >= 0) {
                   uob.a = a;
                }
                a = a + 1;
             }
             double d = b.b((double)f5, 0, (double)uob.c, (double)uob.e, 0x3ff0000000000000);
             if (d - 0x3feff7ced916872b > 0) {
                d = 0x3ff0000000000000;
                uob.a = obj1;
             }
             f4 = (float)d;
          }else {
             f = f + f2;
             f1 = f1 + uob.g;
             i = i + 1;
          }
       }
       return (f1 + (f4 * uob.g));
    }
}
