package b65.s;
import java.lang.Runnable;
import com.kwai.camerasdk.Daenerys$d;
import java.lang.Object;
import java.util.Objects;
import com.kwai.camerasdk.Daenerys;
import com.kwai.camerasdk.monitor.FrameMonitor;
import com.kwai.camerasdk.stats.StatsHolder;
import com.kwai.camerasdk.videoCapture.DaenerysFrameObserver;
import java.lang.String;
import com.kwai.camerasdk.log.Log;

public final class s implements Runnable	// class@000358
{
    public final Daenerys$d b;

    public void s(Daenerys$d p0){
       this.b = p0;
    }
    public final void run(){
       s tb = this.b;
       Objects.requireNonNull(tb);
       FrameMonitor g = Daenerys.G;
       _monitor_enter(g);
       g.a = true;
       _monitor_exit(g);
       tb.b.i.dispose();
       Daenerys d = tb.b.d;
       _monitor_enter(d);
       d.c = false;
       _monitor_exit(d);
       Daenerys$d b = tb.b;
       b.nativeDestroy(b.c);
       Daenerys$d b1 = tb.b;
       b1.c = 0;
       b1.d.c();
       Log.i("Daenerys", "Daenerys successfully disposed.");
    }
}
