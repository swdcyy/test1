package bw7.e;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.ToBAudioManager;
import java.lang.Object;

public final class e implements Runnable	// class@000398
{
    public final ToBAudioManager b;
    public final boolean c;

    public void e(ToBAudioManager p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       ToBAudioManager.d(this.b, this.c);
    }
}
