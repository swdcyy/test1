package eu2.c$b;
import erd.g;
import eu2.c;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import co2.f2;
import com.kuaishou.live.core.voiceparty.pendant.VoicePartyTopicPendantView;

public final class c$b implements g	// class@0027ec
{
    public final c b;

    public void c$b(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "1")) {
       }else {
          this.b.S();
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
