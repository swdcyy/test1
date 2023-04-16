package dx2.j;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterPanelFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qu2.a;
import dx2.p;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import co2.f2;
import mw2.e;

public class j extends m	// class@0025d5
{
    public final VoicePartyTheaterPanelFragment c;

    public void j(VoicePartyTheaterPanelFragment p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       e.l(this.c.B.d().a(), this.c.B.g(), "play_list");
       return;
    }
}
