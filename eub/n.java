package eub.n;
import io.reactivex.g;
import eub.i$e;
import y26.b$a;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import faa.a;
import q87.c;
import g6c.c;
import eub.i;
import eub.n$a;
import tkd.b;
import tkd.d;
import f0c.t;
import com.yxcorp.gifshow.postwork.a;
import r26.e;

public final class n implements g	// class@00282f
{
    public final i$e b;
    public final b$a c;

    public void n(i$e p0,b$a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       Object[] objArray = new Object[0];
       a.D().w("EditPageNoUiPublishStageImpl", "upload flatmap", objArray);
       i$e b = this.b.b;
       n tc = this.c;
       a.o(tc, "sharePageParamBuilder");
       b.d = b.j(tc, this.b.c);
       this.b.b.e = new n$a(this, p0);
       b uob = d.a(-273232199);
       a.o(uob, "PluginManager.get\(PostWo¡­ternalPlugin::class.java\)");
       uob.a20().V3(this.b.b.e);
       return;
    }
}
