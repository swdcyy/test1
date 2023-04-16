package gp2.i;
import erd.o;
import com.kuaishou.livestream.message.nano.TheaterEpisodeOrderInfo;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPlaySourceResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.theater.player.a;
import kotlin.jvm.internal.a;
import com.kuaishou.livestream.message.nano.TheaterEpisodeInfo;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterEpisodePhoto;
import com.kuaishou.live.core.voiceparty.theater.player.a$b;

public final class i implements o	// class@002b7a
{
    public final TheaterEpisodeOrderInfo b;

    public void i(TheaterEpisodeOrderInfo p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       a uoa = PatchProxy.applyOneRefs(p0, this, i.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          p0 = p0.mPhoto;
          a.o(p0, "it.mPhoto");
          uoa = a.a.a(this.b.episodeInfo.type, p0);
       }
       return uoa;
    }
}
