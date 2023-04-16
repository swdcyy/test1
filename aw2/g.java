package aw2.g;
import erd.o;
import java.lang.Object;
import java.lang.Long;
import com.kuaishou.live.core.voiceparty.teampk.stage.VoicePartyTeamPkPlayingContainerView;

public final class g implements o	// class@0002d8
{
    public final long b;

    public void g(long p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       return Long.valueOf(((this.b - p0.longValue()) - 1));
    }
}
