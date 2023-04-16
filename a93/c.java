package a93.c;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kuaishou.live.lite.background.a;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;

public final class c implements IMediaPlayer$OnVideoSizeChangedListener	// class@000084
{
    public final a b;

    public void c(a p0){
       this.b = p0;
    }
    public final void onVideoSizeChanged(IMediaPlayer p0,int p1,int p2,int p3,int p4){
       c tb = this.b;
       tb.x = true;
       tb.W2(false);
    }
}
