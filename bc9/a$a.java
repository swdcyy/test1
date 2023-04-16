package bc9.a$a;
import cc9.i;
import bc9.a;
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
import cc9.f;
import android.view.View;
import com.yxcorp.utility.n;

public final class a$a implements i	// class@0003cf
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
       }else {
          a.p(p0, "newState");
          a w = this.a.w;
          p0 = p0.i().get(Integer.valueOf(this.a.W8().get()));
          if (!p0 instanceof f) {
             p0 = null;
          }
          if (p0 != null && !a.g(p0, w)) {
             this.a.w = p0;
             boolean b = p0.a();
             if (w == null || b != w.a()) {
                if (p0.a()) {
                   n.Y(this.a.V8(), 0, 0);
                }else {
                   n.Y(this.a.V8(), 8, 0);
                }
             }
          }
       }
    label_0068 :
       return;
    }
}
