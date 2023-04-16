package dx2.d;
import java.lang.Runnable;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPhotoWithEpisode;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class d implements Runnable	// class@0025ce
{
    public final VoicePartyTheaterAudiencePanelController b;
    public final VoicePartyTheaterPhotoWithEpisode c;

    public void d(VoicePartyTheaterAudiencePanelController p0,VoicePartyTheaterPhotoWithEpisode p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.b.Z2(this.c, "PLAY");
       return;
    }
}
