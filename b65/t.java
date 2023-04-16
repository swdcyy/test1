package b65.t;
import java.lang.Runnable;
import com.kwai.camerasdk.Daenerys$f;
import java.lang.Object;
import com.kwai.camerasdk.Daenerys;
import com.kwai.camerasdk.stats.StatsHolder;
import com.kwai.camerasdk.videoCapture.DaenerysFrameObserver;
import java.lang.String;
import com.kwai.camerasdk.log.Log;

public final class t implements Runnable	// class@000359
{
    public final Daenerys$f b;

    public void t(Daenerys$f p0){
       this.b = p0;
    }
    public final void run(){
       t tb = this.b;
       tb.c.i.dispose();
       Daenerys$f c = tb.c;
       c.nativeDestroy(c.c);
       Daenerys$f c1 = tb.c;
       c1.c = 0;
       c1.d.c();
       Log.i("Daenerys", "Daenerys successfully disposed.");
    }
}
