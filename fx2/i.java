package fx2.i;
import com.yxcorp.gifshow.widget.m;
import fx2.h$b;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPhotoWithEpisode;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z12.a0;

public final class i extends m	// class@002a0a
{
    public final h$b c;
    public final VoicePartyTheaterPhotoWithEpisode d;
    public final int e;

    public void i(h$b p0,VoicePartyTheaterPhotoWithEpisode p1,int p2){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       h$b g = this.c.g;
       if (g != null) {
          g.a(this.d, this.e);
       }
       return;
    }
}
