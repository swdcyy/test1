package av2.b$a;
import com.kuaishou.live.core.voiceparty.giftanimation.VoicePartyGiftAnimationView$c;
import av2.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qrd.l1;

public final class b$a implements VoicePartyGiftAnimationView$c	// class@0002cf
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "1")) {
          return;
       }
       b$a ta = this.a;
       _monitor_enter(ta);
       b$a ta1 = this.a;
       ta1.a = false;
       ta1.a();
       _monitor_exit(ta);
       return;
    }
}
