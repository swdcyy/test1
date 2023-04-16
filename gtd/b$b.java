package gtd.b$b;
import android.view.Choreographer$FrameCallback;
import ftd.k;
import java.lang.Object;
import ftd.j2;
import ftd.z0;
import java.lang.Long;
import kotlinx.coroutines.CoroutineDispatcher;

public final class b$b implements Choreographer$FrameCallback	// class@000f64
{
    public final k b;

    public void b$b(k p0){
       this.b = p0;
       super();
    }
    public final void doFrame(long p0){
       this.b.N(z0.g(), Long.valueOf(p0));
    }
}
