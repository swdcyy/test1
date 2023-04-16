package aec.d$b;
import erd.o;
import aec.d;
import java.lang.Object;
import com.kwai.feature.api.social.reminder.push.OpenServiceBarResponse;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.w;
import kotlin.jvm.internal.a;
import java.util.Objects;
import brd.t;
import aec.c;
import aec.e;

public final class d$b implements o	// class@0000fb
{
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t ot = PatchProxy.applyOneRefs(p0, this, d$b.class, "1");
       if (ot != patchProxyRe) {
       }else {
          a.p(p0, "bar");
          d$b tb = this.b;
          Objects.requireNonNull(tb);
          t ot1 = PatchProxy.apply(null, tb, d.class, "6");
          if (ot1 != patchProxyRe) {
          }else {
             d r = tb.r;
             if (r == null) {
                a.S("tabSubject");
             }
             ot1 = r.map(c.b);
          }
          ot = ot1.map(new e(p0));
       }
       return ot;
    }
}
