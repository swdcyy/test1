package g0.c$b;
import android.view.Choreographer$FrameCallback;
import g0.c;
import java.lang.Runnable;
import java.lang.Object;

public class c$b implements Choreographer$FrameCallback	// class@002021
{
    public final Runnable b;
    public final c c;

    public void c$b(c p0,Runnable p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void doFrame(long p0){
       this.b.run();
    }
}
