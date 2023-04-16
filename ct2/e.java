package ct2.e;
import erd.g;
import ct2.c;
import java.lang.Object;
import wca.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import co2.f2;
import at2.c$b;
import at2.c;
import com.kuaishou.live.core.voiceparty.micseats.guide.MicSeatGuideState;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class e implements g	// class@0023e2
{
    public final c b;

    public void e(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else {
          e tb = this.b;
          a.o(p0, "it");
          Objects.requireNonNull(tb);
          if (PatchProxy.applyVoidOneRefs(p0, tb, c.class, "20") || (tb.p.G() && p0.d == null)) {
             c g = tb.g;
             if (g != null) {
                if (g instanceof c$b && a.g(g.g(), p0.b)) {
                   p0 = g.b(MicSeatGuideState.IDLE);
                   Objects.requireNonNull(p0, "null cannot be cast to non-null type com.kuaishou.live.core.voiceparty.micseats.guide.MicSeatGuideModel.MicSeatFollowModel");
                   tb.g(p0);
                }
                b.Z(LiveVoicePartyLogTag.OTHER, "onFollowUpdate "+g.g());
             }
          }
       }
       return;
    }
}
