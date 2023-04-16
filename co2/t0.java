package co2.t0;
import java.lang.Runnable;
import com.kuaishou.live.core.voiceparty.s$a;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.s;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import com.kuaishou.live.core.voiceparty.VoicePartyAudienceManagerAssembler;

public final class t0 implements Runnable	// class@0005af
{
    public final s$a b;
    public final String c;

    public void t0(s$a p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       t0 tc = this.c;
       s i1 = this.b.a.i1;
       Objects.requireNonNull(i1);
       if (PatchProxy.applyVoidOneRefs(tc, i1, h.class, "15")) {
       }else {
          i1.m.c().c(tc, h.o);
       }
       return;
    }
}
