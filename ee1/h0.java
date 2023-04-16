package ee1.h0;
import z1.a;
import com.kuaishou.rtc.model.SnowRtcConstants$VoicePartyBusinessScene;
import java.lang.Object;
import wv4.d1;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wv4.f1;
import wv4.a;
import tv4.a;

public final class h0 implements a	// class@002108
{
    public final SnowRtcConstants$VoicePartyBusinessScene a;

    public void h0(SnowRtcConstants$VoicePartyBusinessScene p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       h0 ta = this.a;
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidOneRefs(ta, p0, d1.class, "30")) {
       }else {
          p0 = p0.h;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(ta, p0, f1.class, "24")) {
             p0.a.i1(ta);
          }
       }
       return;
    }
}
