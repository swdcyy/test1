package as2.b;
import r92.b;
import as2.b$a;
import nsd.u;
import com.kuaishou.live.core.voiceparty.b;
import lp3.e;
import t02.a0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import as2.b$b;
import as2.b$c;
import p92.j;
import p92.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.kuaishou.live.core.show.guide.frequency.LiveFollowGuideMessageFrequencyConfig;
import java.lang.reflect.Type;
import co2.r;

public final class b extends b	// class@0002bb
{
    public final c f;
    public FollowGuideVoicePartyGuestFollowAnchorConfig g;
    public a h;
    public long i;
    public boolean j;
    public t k;
    public boolean l;
    public b m;
    public final b$c n;
    public final b o;
    public final e p;
    public final a0 q;
    public static final b$a r;

    static {
       b.r = new b$a(null);
    }
    public void b(b p0,e p1,a0 p2){
       a.p(p0, "micSeatDispatcher");
       a.p(p1, "serviceManager");
       a.p(p2, "livePlayCallerContext");
       super(p1, p2);
       this.o = p0;
       this.p = p1;
       this.q = p2;
       this.f = b$b.b;
       this.n = new b$c(this);
    }
    public void b(j p0,e p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "1")) {
          return;
       }
       a.p(p0, "pool");
       a.p(p1, "messageHandler");
       super.b(p0, p1);
       LiveFollowGuideMessageFrequencyConfig liveFollowGu = null;
       LiveFollowGuideMessageFrequencyConfig value = a.t().u("SOURCE_LIVE").getValue("frequencyConfigV2", LiveFollowGuideMessageFrequencyConfig.class, liveFollowGu);
       if (value != null) {
          liveFollowGu = value.mFollowGuideVoicePartyGuestFollowAnchorConfig;
       }
       this.g = liveFollowGu;
       if (value != null) {
          this.o.a(this.n);
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       super.c();
       this.o.b(this.n);
       return;
    }
    public final a0 d(){
       return this.q;
    }
}
