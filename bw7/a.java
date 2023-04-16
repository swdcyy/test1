package bw7.a;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.HisenseAudioManager;
import java.lang.Object;

public final class a implements Runnable	// class@000394
{
    public final HisenseAudioManager b;

    public void a(HisenseAudioManager p0){
       this.b = p0;
    }
    public final void run(){
       HisenseAudioManager.a(this.b);
    }
}
