package b77.m$b;
import mq5.h;
import b77.m;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.c;

public class m$b implements h	// class@0003e3
{
    public final m b;

    public void m$b(m p0){
       this.b = p0;
       super();
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, m$b.class, "1")) {
          return;
       }
       m t = this.b.t;
       if (t != null && t.K()) {
          this.b.t.o();
          this.b.t = null;
       }
       return;
    }
}
