package co2.c2;
import qu2.c;
import com.kuaishou.live.core.voiceparty.VoicePartyAudienceManagerAssembler;
import co2.n1;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bp2.c;
import com.kuaishou.live.core.voiceparty.b;

public final class c2 implements c	// class@00057e
{
    public VoicePartyAudienceManagerAssembler a;
    public final n1 b;

    public void c2(VoicePartyAudienceManagerAssembler p0,n1 p1){
       a.p(p0, "assembler");
       a.p(p1, "audienceBroker");
       super();
       this.a = p0;
       this.b = p1;
    }
    public RtcManager a(){
       Object obj = PatchProxy.apply(null, this, c2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.c();
    }
    public c b(){
       Object obj = PatchProxy.apply(null, this, c2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.d;
    }
    public b c(){
       Object obj = PatchProxy.apply(null, this, c2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.a();
    }
}
