package m19.c$a;
import com.kwai.framework.player.helper.g;
import m19.c;
import com.kwai.video.cache.AcCallBackInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class c$a extends g	// class@002ddd
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void a(AcCallBackInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "2")) {
          return;
       }
       boolean b = true;
       if (p0.stopReason == b) {
          c$a ta = this.a;
          ta.z = b;
          if (ta.A != null) {
             ta.R8();
          }
       }
       return;
    }
    public void b(AcCallBackInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       c$a ta = this.a;
       if (p0.progressPosition - ta.y >= 0 && ta.A != null) {
          ta.R8();
       }
       return;
    }
}
