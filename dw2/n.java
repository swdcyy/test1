package dw2.n;
import erd.g;
import com.kuaishou.live.core.voiceparty.theater.VoicePartyTheaterAudiencePlayerController;
import java.lang.Object;
import rw2.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager;

public final class n implements g	// class@0025c4
{
    public final VoicePartyTheaterAudiencePlayerController b;

    public void n(VoicePartyTheaterAudiencePlayerController p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
       }else {
          p0 = p0.a;
          if (p0 == 4) {
             this.b.n.k();
          }else if(p0 == 3){
             this.b.n.p();
          }
       }
       return;
    }
}
