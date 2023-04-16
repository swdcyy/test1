package h63.k0$b;
import mq5.h;
import h63.k0;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import brd.y;

public class k0$b implements h	// class@002c88
{
    public final k0 b;

    public void k0$b(k0 p0){
       this.b = p0;
       super();
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, k0$b.class, "1")) {
          return;
       }
       this.b.N.onNext(Boolean.TRUE);
       return;
    }
}
