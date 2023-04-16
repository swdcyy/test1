package fx2.h$e;
import z12.a0;
import fx2.h;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPhotoWithEpisode;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.CharSequence;
import dx2.a;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeFeedWithEpisodes;
import com.kuaishou.live.core.voiceparty.theater.tube.list.a$a;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeInfo;

public final class h$e implements a0	// class@002a07
{
    public final h a;

    public void h$e(h p0){
       this.a = p0;
       super();
    }
    public void a(Object p0,int p1){
       h$e uoe = h$e.class;
       if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe, "1")) {
          if (p1 == 5 && this.a.W8()) {
             p0 = this.a;
             p0.z.c(p0.q, h.c9(p0, null, 1, null));
          }else {
             h$e ta = this.a;
             h z = ta.z;
             h q = ta.q;
             VoicePartyTheaterTubeFeedWithEpisodes mTube = (q != null)? q.mTube: null;
             z.b(mTube, p0, h.c9(ta, null, 1, null));
          }
       }
       return;
    }
}
