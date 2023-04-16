package bw7.c;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.ToBAudioManager;
import java.lang.Object;

public final class c implements Runnable	// class@000396
{
    public final ToBAudioManager b;
    public final boolean c;

    public void c(ToBAudioManager p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       ToBAudioManager.a(this.b, this.c);
    }
}
