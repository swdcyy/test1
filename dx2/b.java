package dx2.b;
import erd.g;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController;
import qm6.b;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.app.Activity;
import com.kuaishou.live.viewcontroller.ViewController;
import tq5.c;

public final class b implements g	// class@0025cc
{
    public final VoicePartyTheaterAudiencePanelController b;
    public final b c;

    public void b(VoicePartyTheaterAudiencePanelController p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          a.p(p0, "plugin");
          p0.Um(this.b.B2(), this.c);
          this.b.t.tc();
       }
       return;
    }
}
