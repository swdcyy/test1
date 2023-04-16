package bc9.f0$b;
import cc9.i;
import bc9.f0;
import java.lang.Object;
import cc9.q;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import y8c.d;
import bc9.c0;
import java.util.HashMap;
import java.lang.Integer;
import cc9.r;
import android.view.View;
import com.yxcorp.utility.n;
import java.util.Objects;
import bc9.k;
import com.yxcorp.gifshow.camera.record.assistant.a;
import ec9.j;
import cc9.c;
import sa6.a;

public final class f0$b implements i	// class@0003e9
{
    public final f0 a;

    public void f0$b(f0 p0){
       this.a = p0;
       super();
    }
    public void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f0$b.class, "1")) {
       }else {
          a.p(p0, "newState");
          f0$b ta = this.a;
          ta.w = p0;
          f0 x = this.a.x;
          p0 = p0.i().get(Integer.valueOf(ta.W8().get()));
          if (!p0 instanceof r) {
             p0 = null;
          }
          if (p0 != null && !a.g(p0, x)) {
             this.a.x = p0;
             boolean b = p0.b();
             if (x == null || b != x.b()) {
                if (p0.b()) {
                   n.Y(this.a.V8(), 0, 0);
                }else {
                   n.Y(this.a.V8(), 8, 0);
                }
             }
             b = p0.a();
             if (x == null || b != x.a()) {
                if (p0.a()) {
                   this.a.Y8();
                }else {
                   p0 = this.a;
                   Objects.requireNonNull(p0);
                   if (!PatchProxy.applyVoid(null, p0, f0.class, "5")) {
                      p0.P8().r1().g().w0(new c(11));
                   }
                }
             }
          }
       }
    label_00aa :
       return;
    }
}
