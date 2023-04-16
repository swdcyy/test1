package hi0.h;
import hi0.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class h	// class@0026d1
{

    public static final void a(g p0,int p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, oh, "1")) {
          return;
       }
       a.p(p0, "$this$analysis");
       if (!p0.a()) {
          p0.d = p1;
       }
       p0.b = p0.a() + 1;
       if (p1 < p0.f) {
          p0.f = p1;
       }
       if (p1 > p0.max) {
          p0.max = p1;
       }
       p0.e = p1;
       p0.c = p0.b() + p1;
       p0.avg = p0.b() / p0.a();
       p0.incr = p0.e - p0.d;
       return;
    }
}
