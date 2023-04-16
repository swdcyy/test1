package dh9.a$d;
import y4b.f;
import dh9.a;
import java.lang.Object;
import y4b.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Integer;

public final class a$d implements f	// class@001f37
{
    public final a a;

    public void a$d(a p0){
       this.a = p0;
       super();
    }
    public b a(b p0,float p1,float p2){
       a$d obj1;
       b a;
       a$d uod = this;
       Object obj = p0;
       if (PatchProxy.isSupport(a$d.class)) {
          obj1 = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, a$d.class, "1");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       a.p(obj, "magicSafeUiArea");
       obj1 = uod.a;
       a w = obj1.w;
       if (w != null) {
          a s = obj1.s;
          if (s > null) {
             a.m(w);
             float f = (float)(s - w.intValue()) / 2.00f;
             int i = 0;
             if (f - (float)i < 0) {
                f = 0;
             }
             float f1 = ((p0.d() * p2) + f) / (float)uod.a.s;
             int i1 = 2;
             float f2 = (float)i1 * f;
             a s1 = uod.a.s;
             float f3 = ((float)s1 - ((p2 - (p0.c() * p2)) + f2)) / (float)s1;
             float f4 = ((p0.b() * p2) + f) / (float)uod.a.s;
             f = (p2 - (p0.a() * p2)) + f2;
             a s2 = uod.a.s;
             f2 = (float)s2 - f;
             float f5 = f2 / (float)s2;
             a = obj.a;
             b c = obj.c;
             b e = obj.e;
             b g = obj.g;
             if (PatchProxy.isSupport(b.class)) {
                Object[] objArray = new Object[]{Float.valueOf(a),Float.valueOf(f1),Float.valueOf(c),Float.valueOf(f3),Float.valueOf(e),Float.valueOf(f4),Float.valueOf(g),Float.valueOf(f5)};
                b uob = PatchProxy.apply(objArray, obj, b.class, "1");
                if (uob != PatchProxyResult.class) {
                label_00ec :
                   return uob;
                }
             }
             b uob1 = new b(a, f1, c, f3, e, f4, g, f5);
             goto label_00ec ;
          }
       }
       return obj;
    }
}
