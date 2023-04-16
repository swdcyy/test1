package dv2.b;
import le3.f$a;
import com.kuaishou.live.core.voiceparty.playway.video.VoicePartyAudienceVideoViewController;
import java.lang.Object;
import iv2.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import lnc.i3;
import co2.f2;
import yx2.h;
import yx2.n;
import java.lang.Number;
import kotlin.jvm.internal.a;

public final class b implements f$a	// class@0025a9
{
    public final VoicePartyAudienceVideoViewController a;

    public void b(VoicePartyAudienceVideoViewController p0){
       this.a = p0;
       super();
    }
    public void a(long p0,long p1,long p2){
       b uob = this;
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Long.valueOf(p1), Long.valueOf(p2), this, b.class, "1")) {
          return;
       }
       VoicePartyAudienceVideoViewController q = uob.a.q;
       Objects.requireNonNull(q);
       if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Long.valueOf(p1), Long.valueOf(p2), q, b.class, "7")) {
          i3 oi31 = i3.f();
          n.b(q.d(), oi31);
          oi31.d("voice_party_id", q.d().y());
          oi31.c("enter_business_timestamp", Long.valueOf(p0));
          oi31.c("leave_business_timestamp", Long.valueOf(p1));
          oi31.c("watch_video_duration", Long.valueOf(p2));
          String str1 = (q.d().F())? "GUEST": "AUDIENCE";
          oi31.d("leave_role", str1);
          String str2 = oi31.e();
          a.o(str2, "params");
          q.i("AAVBS_RECORDING_TIME", str2, (p1 - p0));
       }
       if (uob.a.s.I()) {
          VoicePartyAudienceVideoViewController q1 = uob.a.q;
          Objects.requireNonNull(q1);
          if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), q1, b.class, "4")) {
             i3 oi3 = i3.f();
             n.a(q1.d(), oi3);
             oi3.c("enter_voice_nine_timestamp", Long.valueOf(p0));
             oi3.c("leave_voice_nine_timestamp", Long.valueOf(p1));
             String str = oi3.e();
             a.o(str, "params");
             b.k(q1, "VOICE_PARTY_VOICE_NINE_PLAY", str, (p1 - p0), 0, 0, 0, 0, 120, null);
          }
       }
       return;
    }
}
