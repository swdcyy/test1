package bw7.f;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.ToBAudioManager;
import java.lang.Object;

public final class f implements Runnable	// class@000399
{
    public final ToBAudioManager b;
    public final boolean c;

    public void f(ToBAudioManager p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       ToBAudioManager.e(this.b, this.c);
    }
}
