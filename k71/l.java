package k71.l;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import k71.l$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import o63.m$a;
import lp3.e;
import kg1.e;
import lp3.c;
import kotlin.jvm.internal.a;
import asd.h;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import k71.l$b;
import kg1.f$a;
import csd.b;
import dsd.e;

public final class l extends AbstractLiveJsCommand	// class@002cbd
{

    public void l(){
       super();
    }
    public Class a(){
       return l$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, l.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0 instanceof l$a) {
          return m.g.c("invalid params");
       }
       c uoc = this.h().a(e.class);
       a.o(uoc, "serviceManager.getServic¡­ienceService::class.java\)");
       h oh = new h(IntrinsicsKt__IntrinsicsJvmKt.d(p2));
       uoc.pf(p0.source, new l$b(oh), p0.needShowConfirmDialog, p0.needShowFansGroupDialog);
       p0 = oh.b();
       if (p0 == b.h()) {
          e.c(p2);
       }
       return p0;
    }
}
