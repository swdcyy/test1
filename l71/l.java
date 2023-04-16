package l71.l;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import l71.l$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import o63.m$a;
import java.lang.Integer;
import asd.h;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import gq1.l;
import lp3.c;
import l71.m;
import gq1.l$a;
import csd.b;
import dsd.e;
import java.lang.StringBuilder;

public final class l extends AbstractLiveJsCommand	// class@002ea0
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
       l$a uoa = p0;
       if (uoa.c() != null && (uoa.b() == null || uoa.a() == null)) {
          return m.g.c("params is null "+p0);
       }
       p0 = new h(IntrinsicsKt__IntrinsicsJvmKt.d(p2));
       this.g(l.class).l5(uoa.c().intValue(), uoa.b(), uoa.a(), uoa.bizExtraInfo, new m(p0));
       p0 = p0.b();
       if (p0 == b.h()) {
          e.c(p2);
       }
       return p0;
    }
}
