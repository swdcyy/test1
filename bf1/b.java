package bf1.b;
import bq5.d;
import bf1.c;
import df1.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import bf1.j;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import bf1.a;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import ef1.c;
import ef1.e;

public class b implements d	// class@00036f
{
    public final c a;
    public final c b;

    public void b(c p0,c p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.b.q(this.a)) {
          return false;
       }
       this.b.s(this.a);
       return true;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       b.d0(LiveLogTag.LIVE_HIGH_FLUENCY_FEEDS, "onMessageRemoved#", "reason", "onRemoveFromQueue", "message", this.a.toString());
       k1.p(new a(this, this.a), this.b);
       return;
    }
    public void onDismiss(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.b.p(this.a);
       b.c0(LiveLogTag.LIVE_HIGH_FLUENCY_FEEDS, "onDismiss", "message", this.a.toString());
       return;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       e.a(this.a, this.b.i(), this.b.j());
       b.c0(LiveLogTag.LIVE_HIGH_FLUENCY_FEEDS, "onShow", "message", this.a.toString());
       return;
    }
}
