package eu2.c$a;
import erd.g;
import eu2.c;
import java.lang.Object;
import hp2.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import co2.f2;
import com.kuaishou.live.core.voiceparty.pendant.VoicePartyTopicPendantView;

public final class c$a implements g	// class@0027eb
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
       }else {
          p0 = this.b;
          c d = p0.d;
          p0 = p0.i.b();
          if (p0 == null) {
             p0 = "";
          }
          d.b(0, p0);
       }
       return;
    }
}
