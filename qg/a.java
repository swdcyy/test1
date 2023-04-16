package qg.a;
import java.lang.Runnable;
import com.frog.engine.view.FrogGLSurfaceView;
import java.lang.Object;

public final class a implements Runnable	// class@0029d5
{
    public final FrogGLSurfaceView b;

    public void a(FrogGLSurfaceView p0){
       this.b = p0;
    }
    public final void run(){
       FrogGLSurfaceView.b(this.b);
    }
}
