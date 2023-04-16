package in1.b;
import sj3.m;
import in1.c;
import java.lang.Object;
import com.kwai.video.waynelive.LiveRestartReason;
import sj3.m$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import ij3.b;
import ij3.a;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import brd.t;
import cjd.e;
import erd.o;

public final class b implements m	// class@00295e
{
    public final c a;

    public void b(c p0){
       this.a = p0;
       super();
    }
    public final m$a a(LiveRestartReason p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       m$a obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "it");
       b ta = this.a;
       Objects.requireNonNull(ta);
       obj = PatchProxy.apply(null, ta, c.class, "17");
       if (obj != patchProxyRe) {
       }else {
          obj = new m$a();
          obj.a = a.a().b(r1.U1(ta.k), r1.M0(ta.k), r1.I1(ta.k), null, ta.m, "").map(new e());
          obj.b = true;
       }
       return obj;
    }
}
