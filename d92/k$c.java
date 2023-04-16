package d92.k$c;
import com.kwai.video.waynelive.listeners.LivePlayerRenderListener;
import d92.k;
import java.lang.Object;
import jw7.a;

public class k$c implements LivePlayerRenderListener	// class@0024b1
{
    public final k b;

    public void k$c(k p0){
       this.b = p0;
       super();
    }
    public void onAudioRenderingStart(){
       a.a(this);
    }
    public void onLivePlayViewShow(){
       a.b(this);
    }
    public void onRenderingStartAfterResume(){
       a.c(this);
    }
    public void onSwitchToAudioStreamFromVideoStream(){
       a.d(this);
    }
    public void onSwitchToVideoStreamFromAudioStream(){
       a.e(this);
    }
    public void onVideoRenderingStart(){
       this.b.C = true;
    }
}
