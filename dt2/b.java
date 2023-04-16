package dt2.b;
import bt2.a;
import bt2.e;
import android.content.Context;
import qu2.a;
import co2.f2;
import com.kuaishou.live.core.voiceparty.core.shared.a;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import com.kuaishou.live.common.core.component.topbar.topuser.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ct2.c;
import dt2.b$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import java.util.Objects;
import com.kuaishou.live.common.core.component.topbar.topuser.l$a;
import wca.n;
import ct2.e;
import com.kwai.robust.PatchProxyResult;
import crd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import brd.t;
import eoc.e;
import brd.z;
import ct2.f;
import erd.g;
import crd.a;
import tu2.b;
import hp2.s;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.HashMap;

public final class b extends a	// class@002597
{
    public final c a;
    public final e b;
    public final Context c;
    public final a d;
    public final f2 e;
    public final a f;
    public final MicSeatsDataManager g;
    public final l h;

    public void b(e p0,Context p1,a p2,f2 p3,a p4,MicSeatsDataManager p5,l p6){
       a.p(p0, "micSeatMessageManager");
       a.p(p2, "liveBasicContext");
       a.p(p3, "voicePartyContext");
       a.p(p4, "audienceManager");
       a.p(p5, "micSeatsDataManager");
       a.p(p6, "liveTopUserService");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       c uoc = new c(p1, p2, p3, p4, p5, p6);
       this.a = p0;
       b$a uoa = new b$a(this);
       if (PatchProxy.applyVoidOneRefs(uoa, p0, c.class, "1")) {
       }else {
          a.p(uoa, "listener");
          p0.i.add(uoa);
       }
       return;
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "1")) {
          return;
       }
       b ta = this.a;
       Objects.requireNonNull(ta);
       c uoc = c.class;
       if (!PatchProxy.applyVoid(objArray, ta, uoc, "3")) {
          ta.s.d(ta);
          c e = ta.e;
          n on = n.class;
          e uoe = new e(ta);
          b uob = PatchProxy.applyTwoRefs(on, uoe, ta, uoc, "24");
          if (uob != PatchProxyResult.class) {
          }else {
             uob = RxBus.f.f(on).observeOn(e.c).subscribe(uoe, f.b);
             a.o(uob, "RxBus.INSTANCE.toObserva¡­deManager\", throwable\) }\)");
          }
          e.c(uob);
          ta.r.a(ta.k);
          ta.q.a(ta.l);
       }
       return;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "2")) {
          return;
       }
       b ta = this.a;
       Objects.requireNonNull(ta);
       c uoc = c.class;
       if (!PatchProxy.applyVoid(objArray, ta, uoc, "4")) {
          b.Z(LiveVoicePartyLogTag.OTHER, "VoicePartyMicSeatsGuideManager destroy "+ta.o.getLiveStreamId());
          if (!PatchProxy.applyVoid(objArray, ta, uoc, "7")) {
             ta.b();
             ta.d.clear();
             ta.b = -1;
          }
          ta.e.dispose();
          ta.s.b(ta);
          ta.r.x(ta.k);
          ta.q.l(ta.l);
       }
       return;
    }
}
