package dx2.h;
import dx2.h$a;
import java.lang.String;
import dx2.a;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeInfo;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPhotoWithEpisode;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeFeedWithEpisodes;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPlayListResponse$VoicePartyTheaterPlayOrderItem;
import com.kwai.framework.model.user.User;

public interface abstract h	// class@0025d3
{
    public static final h a;

    static {
       h.a = new h$a();
    }
    void a(String p0,a p1);
    void b(VoicePartyTheaterTubeInfo p0,VoicePartyTheaterPhotoWithEpisode p1,a p2);
    void c(VoicePartyTheaterTubeFeedWithEpisodes p0,a p1);
    void d(VoicePartyTheaterPlayListResponse$VoicePartyTheaterPlayOrderItem p0,a p1);
    void e(User p0,a p1);
    void f(VoicePartyTheaterTubeFeedWithEpisodes p0,a p1);
}
