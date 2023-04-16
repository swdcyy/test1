package dv2.c;
import le3.e$a;
import com.kuaishou.live.core.voiceparty.playway.video.VoicePartyAudienceVideoViewController;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import co2.f2;
import iv2.b;
import java.util.Objects;
import lnc.i3;
import yx2.h;
import yx2.n;
import kotlin.jvm.internal.a;

public final class c implements e$a	// class@0025aa
{
    public final VoicePartyAudienceVideoViewController a;

    public void c(VoicePartyAudienceVideoViewController p0){
       this.a = p0;
       super();
    }
    public void a(long p0,long p1,long p2){
       c uoc = this;
       long l = p0;
       long l1 = p1;
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Long.valueOf(p1), Long.valueOf(p2), this, c.class, "1")) {
          return;
       }
       if (uoc.a.s.I()) {
          uoc.a.q.g(l, l1);
       }
       if (uoc.a.s.M()) {
          VoicePartyAudienceVideoViewController q = uoc.a.q;
          Objects.requireNonNull(q);
          b uob = b.class;
          if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), q, uob, "3")) {
             i3 oi3 = i3.f();
             n.a(q.d(), oi3);
             String str = (q.c != null)? "INVITE": "ACTIVE";
             oi3.d("open_type", str);
             String str1 = oi3.e();
             a.o(str1, "params");
             b.k(q, "VOICE_PARTY_GUEST_VIDEO_PLAY", str1, (l1 - l), p0, p1, 0, 0, 96, null);
          }
          uoc.a.q.l(false);
       }
       return;
    }
}
