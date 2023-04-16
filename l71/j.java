package l71.j;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import l71.j$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import o63.m$a;
import java.lang.Integer;
import java.lang.StringBuilder;
import asd.h;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import sz1.e;
import lp3.c;
import lh3.b;
import lh3.i0;
import l71.k;
import qrd.l1;
import csd.b;
import dsd.e;

public final class j extends AbstractLiveJsCommand	// class@002e9d
{
    public i0 e;

    public void j(){
       super();
    }
    public Class a(){
       return j$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, j.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0 instanceof j$a) {
          return m.g.c("invalid params");
       }
       p1 = p0;
       if (p1.a() == null) {
          return m.g.c("params is null "+p0);
       }
       int i = p1.a().intValue();
       j$a bizStartExtr = p1.bizStartExtraInfo;
       p1 = p1.bizEndExtraInfo;
       h oh = new h(IntrinsicsKt__IntrinsicsJvmKt.d(p2));
       b uob = this.g(e.class).gc();
       uob.h(this.e);
       k ok = new k(oh, uob, this, i, bizStartExtr, p1);
       uob.m(v10);
       this.e = v10;
       uob.d(i, bizStartExtr, p1);
       i = oh.b();
       if (i == b.h()) {
          e.c(p2);
       }
       return i;
    }
}
