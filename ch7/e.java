package ch7.e;
import java.lang.Runnable;
import ch7.i;
import dh7.d;
import com.kwai.performance.stability.oom.leakfix.base.LowMemoryLevel;
import java.lang.Object;
import android.app.Application;

public final class e implements Runnable	// class@000553
{
    public final i b;
    public final d c;
    public final LowMemoryLevel d;

    public void e(i p0,d p1,LowMemoryLevel p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       this.c.b(this.b.a, this.d);
    }
}
