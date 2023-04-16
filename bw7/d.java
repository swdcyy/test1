package bw7.d;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.ToBAudioManager;
import java.lang.Object;

public final class d implements Runnable	// class@000397
{
    public final ToBAudioManager b;
    public final boolean c;

    public void d(ToBAudioManager p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       ToBAudioManager.c(this.b, this.c);
    }
}
