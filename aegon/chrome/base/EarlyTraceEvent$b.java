package aegon.chrome.base.EarlyTraceEvent$b;
import java.lang.String;
import java.lang.Object;
import android.os.Process;
import android.os.SystemClock;

public final class EarlyTraceEvent$b	// class@000136
{
    public final boolean a;
    public final boolean b;
    public final String c;
    public final int d;
    public final long e;
    public final long f;

    public void EarlyTraceEvent$b(String p0,boolean p1,boolean p2){
       super();
       this.a = p1;
       this.b = p2;
       this.c = p0;
       this.d = Process.myTid();
       this.e = SystemClock.elapsedRealtimeNanos();
       this.f = SystemClock.currentThreadTimeMillis();
    }
}
