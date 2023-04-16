package cp2.b;
import jp2.d;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import zo2.a0;
import jp2.u;
import hf3.a;
import jp2.p;
import jp2.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lp2.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import dp2.i;
import dp2.l;
import mp2.c;
import ep2.c;
import com.kuaishou.live.core.voiceparty.core.audience.ktv.watch.AudiencePrepareWatchLogic;

public final class b implements d	// class@0023bb
{
    public final RtcManager a;
    public final a0 b;
    public final u c;
    public final a d;
    public final p e;
    public final c f;

    public void b(RtcManager p0,a0 p1,u p2,a p3,p p4,c p5){
       a.p(p0, "rtcManager");
       a.p(p1, "livePlayer");
       a.p(p2, "ktvRtcService");
       a.p(p3, "longConnection");
       a.p(p4, "downloader");
       a.p(p5, "ktvInfo");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public c a(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uob, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!p0) {
          i oi = new i(this.a, this.c, this.d, this.e, this.b, this.f);
       }else {
          l ol = new l(this.a, this.c, this.d, this.e, this.f);
       }
       return p0;
    }
    public c b(boolean p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       c uoc = (p0)? new c(p1, this.a, this.e, this.f): new AudiencePrepareWatchLogic(p1, this.b);
       return uoc;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.b.release();
       return;
    }
}
