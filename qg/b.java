package qg.b;
import java.lang.Runnable;
import com.frog.engine.view.FrogGLSurfaceView;
import java.lang.Object;

public final class b implements Runnable	// class@0029d6
{
    public final FrogGLSurfaceView b;
    public final boolean c;

    public void b(FrogGLSurfaceView p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       FrogGLSurfaceView.a(this.b, this.c);
    }
}
