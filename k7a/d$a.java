package k7a.d$a;
import com.kwai.framework.player.helper.g;
import k7a.d;
import com.kwai.video.cache.AcCallBackInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class d$a extends g	// class@002c09
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void a(AcCallBackInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "2")) {
          return;
       }
       boolean b = true;
       if (p0.stopReason == b) {
          d$a ta = this.a;
          ta.z = b;
          if (ta.A != null && ta.D != null) {
             ta.V8();
          }
       }
       return;
    }
    public void b(AcCallBackInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
          return;
       }
       d$a ta = this.a;
       if (p0.progressPosition - ta.y >= 0) {
          ta.E = true;
          if (ta.A != null && ta.D != null) {
             ta.V8();
          }
       }
       return;
    }
}
