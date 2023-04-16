package a66.d;
import java.lang.Runnable;
import com.kwai.framework.config.heartbeat.HeartbeatInitModule;
import java.lang.Object;
import java.util.Objects;
import com.kwai.framework.config.heartbeat.g;
import com.kuaishou.gifshow.network.degrade.RequestTiming;

public final class d implements Runnable	// class@00002d
{
    public final HeartbeatInitModule b;

    public void d(HeartbeatInitModule p0){
       this.b = p0;
    }
    public final void run(){
       RequestTiming cOLD_START;
       d tb = this.b;
       Objects.requireNonNull(tb);
       g og = g.b();
       if (tb.q != null) {
          tb.q = false;
          cOLD_START = RequestTiming.COLD_START;
       }else {
          cOLD_START = RequestTiming.ON_FOREGROUND;
       }
       og.e(cOLD_START);
       return;
    }
}
