package bw7.b;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.ToBAudioManager;
import java.lang.Object;

public final class b implements Runnable	// class@000395
{
    public final ToBAudioManager b;

    public void b(ToBAudioManager p0){
       this.b = p0;
    }
    public final void run(){
       ToBAudioManager.b(this.b);
    }
}
