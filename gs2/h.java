package gs2.h;
import io.reactivex.g;
import gs2.i;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyMusicInfoResponse;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import gs2.h$a;
import com.kuaishou.android.model.music.Music;
import com.kuaishou.live.core.voiceparty.music.util.LiveVoicePartyKtvMusicDownloadHelper$d;
import com.kuaishou.live.core.voiceparty.music.util.LiveVoicePartyKtvMusicDownloadHelper;

public final class h implements g	// class@002b97
{
    public final i b;
    public final LiveVoicePartyMusicInfoResponse c;

    public void h(i p0,LiveVoicePartyMusicInfoResponse p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       this.b.q.a(this.c.mMusic, new h$a(p0));
       return;
    }
}
