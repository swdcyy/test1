package n11.e$c;
import l11.j$a;
import n11.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import dq5.b;
import l11.i;
import com.kuaishou.livestream.message.nano.LiveLineChatMessages$SCLiveLineChatReady;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import com.kuaishou.live.core.basic.activity.x;
import no1.j;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import k2b.e0;
import na2.a;
import com.kuaishou.livestream.message.nano.LiveLineChatMessages$SCLiveLineChatInfoUpdate;

public class e$c implements j$a	// class@003278
{
    public final e a;

    public void e$c(e p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, e$c.class, "1")) {
          return;
       }
       this.a.d9();
       a0 w = this.a.K.W;
       if (w != null) {
          w.a();
       }
       return;
    }
    public void b(){
       i.d(this);
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, e$c.class, "2")) {
          return;
       }
       this.a.a9();
       a0 w = this.a.K.W;
       if (w != null) {
          w.a();
       }
       return;
    }
    public void d(LiveLineChatMessages$SCLiveLineChatReady p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$c.class, "3")) {
          return;
       }
       e$c ta = this.a;
       a.a(this.a.K.S.t0(), this.a.c9(), "", "LIVE_ONLINE", ta.L.b, ta.K.Z2.a(), false, this.a.b9());
       return;
    }
    public void e(LiveLineChatMessages$SCLiveLineChatInfoUpdate p0){
       i.c(this, p0);
    }
}
