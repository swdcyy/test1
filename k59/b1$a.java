package k59.b1$a;
import erd.g;
import k59.b1;
import java.lang.Object;
import wl9.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Integer;
import mxb.j0;
import mxb.i0;
import kotlin.jvm.internal.a;

public final class b1$a implements g	// class@002ac7
{
    public final b1 b;

    public void b1$a(b1 p0){
       this.b = p0;
       super();
    }
    public final void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b1$a.class, "1")) {
          return;
       }
       if (p0.f(this.b.p) && (p0.c() && p0.d() == 1)) {
          Integer integer = p0.a(false);
          if (integer != null) {
             b1 p = this.b.p;
             a.m(p);
             i0.a().e(integer.intValue(), p).a();
          }
       }
       return;
    }
    public void accept(Object p0){
       this.a(p0);
    }
}
