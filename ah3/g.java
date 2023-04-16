package ah3.g;
import erd.g;
import ah3.v;
import java.lang.String;
import java.lang.Object;
import ah3.a;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import zg3.c;
import zg3.c$b;
import ah3.l;
import z1.a;
import oh3.a;
import java.lang.Throwable;
import jh3.a;

public final class g implements g	// class@0000cc
{
    public final v b;
    public final String c;

    public void g(v p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       g tb = this.b;
       g tc = this.c;
       Objects.requireNonNull(tb);
       tb.j = p0.mChatId;
       tb.k = p0.mSessionId;
       a mTimeoutMs = p0.mTimeoutMs;
       p0 = v.class;
       if (!PatchProxy.isSupport(p0) || (!PatchProxy.applyVoidOneRefs(Long.valueOf(mTimeoutMs), tb, p0, "7") && mTimeoutMs > 0)) {
          p0 = new c((int)mTimeoutMs);
          tb.f = p0;
          p0.a(tb.p);
          tb.f.c();
       }
       tb.Q(new l(tb));
       tb.g.b(tb.h, tc, true, null);
       return;
    }
}
