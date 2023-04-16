package ci7.a;
import com.kwai.video.player.IMediaPlayer;
import com.kwai.player.qos.AppLiveAdaptiveRealtimeInfo;
import java.lang.String;
import com.kwai.player.qos.KwaiQosInfo;

public interface abstract a implements IMediaPlayer	// class@00055c
{

    AppLiveAdaptiveRealtimeInfo getAppLiveAdaptiveRealtimeInfo();
    long getAudioCachedDuration();
    int getCurPlayingId();
    String getCurPlayingUrl();
    String getKflvVideoPlayingUrl();
    String getKwaiSign();
    String getLiveRealTimeQosJson(int p0,int p1,long p2,long p3,long p4);
    String getServerAddress();
    String getStreamId();
    KwaiQosInfo getStreamQosInfo();
    long getVideoCachedDuration();
    String getXksCache();
    boolean isLiveManifest();
    boolean isMediaPlayerValid();
}
