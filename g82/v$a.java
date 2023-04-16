package g82.v$a;
import mq5.h;
import g82.v;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import i95.a;

public class v$a implements h	// class@002ab9
{
    public final v b;

    public void v$a(v p0){
       this.b = p0;
       super();
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, v$a.class, "1")) {
          return;
       }
       RxBus.f.b(new a(this.b.Y8()));
       return;
    }
}
