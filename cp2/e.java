package cp2.e;
import jp2.u;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import msd.l;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$c;
import cp2.e$a;
import qrd.l1;
import ee1.a;

public final class e implements u	// class@0023bf
{
    public RtcManager$c a;
    public final RtcManager b;

    public void e(RtcManager p0){
       a.p(p0, "rtcManager");
       super();
       this.b = p0;
    }
    public boolean q(){
       Object obj = PatchProxy.apply(null, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.g();
    }
    public void r(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       e ta = this.a;
       if (ta != null) {
          this.b.i(ta);
       }
       if (p0 != null) {
          e$a uoa = new e$a(p0);
          this.b.b(uoa);
          this.a = uoa;
       }
       return;
    }
    public void s(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       a.p(p0, "data");
       this.b.f().T(p0);
       return;
    }
}
