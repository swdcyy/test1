package af1.l;
import z1.a;
import af1.x;
import java.lang.Object;
import df1.c;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import te1.d;
import te1.c$a;
import ok.h;
import java.lang.Boolean;
import af1.m;
import java.lang.Runnable;
import ekd.k1;

public final class l implements a	// class@000076
{
    public final x a;

    public void l(x p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       l ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidOneRefs(p0, ta, x.class, "11")) {
       }else if(ta.m != null){
          b.d0(LiveLogTag.LIVE_HIGH_FLUENCY_FEEDS, "onMessageRemoved#", "reason", "onDiscardMessage", "message", p0.toString());
          ta.m.b(p0.b);
       }
       x l = ta.l;
       if (l != null && l.apply(p0).booleanValue()) {
          k1.s(new m(ta), ta, ta.f());
          ta.l = null;
       }
       return;
    }
}
