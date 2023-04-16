package ao.c;
import io.reactivex.g;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.webkit.extension.KwSdk;
import java.lang.Boolean;
import brd.g;
import tkd.b;
import tkd.d;
import p80.m;
import ao.c$a;
import p80.a;

public final class c implements g	// class@000207
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       if (KwSdk.isCoreLoaded()) {
          p0.onNext(Boolean.TRUE);
          p0.onComplete();
          return;
       }else {
          d.a(-1717725018).Nz(new c$a(p0));
          return;
       }
    }
}
