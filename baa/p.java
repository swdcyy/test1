package baa.p;
import brd.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qrd.l1;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import baa.p$a;
import io.reactivex.g;

public final class p	// class@000441
{

    public static final void a(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, p.class, "1")) {
          return;
       }
       a.p(p0, "$this$done");
       p0.onNext(l1.a);
       p0.onComplete();
       return;
    }
    public static final t b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, p.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.create(new p$a(p0));
    }
}
