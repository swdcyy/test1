package aegon.chrome.base.TraceEvent$d;
import android.os.MessageQueue$IdleHandler;
import aegon.chrome.base.TraceEvent$c;
import aegon.chrome.base.TraceEvent$a;
import java.lang.String;
import aegon.chrome.base.TraceEvent;
import aegon.chrome.base.TraceEvent$f;
import aegon.chrome.base.f;
import K.S;
import android.util.Log;
import android.os.SystemClock;
import java.lang.StringBuilder;
import android.os.MessageQueue;
import android.os.Looper;

public final class TraceEvent$d extends TraceEvent$c implements MessageQueue$IdleHandler	// class@000159
{
    public long d;
    public long e;
    public int f;
    public int g;
    public int h;
    public boolean i;

    public void TraceEvent$d(){
       super(null);
    }
    public void TraceEvent$d(TraceEvent$a p0){
       super(null);
    }
    public static void d(int p0,String p1){
       if (TraceEvent.c) {
          f.l();
          S.ML40H8ed("TraceEvent.LooperMonitor:IdleStats", p1);
       }
       Log.println(p0, "TraceEvent_LooperMonitor", p1);
       return;
    }
    public final void a(String p0){
       if (this.h == null) {
          TraceEvent.c("Looper.queueIdle");
       }
       this.e = SystemClock.elapsedRealtime();
       this.c();
       super.a(p0);
       return;
    }
    public final void b(String p0){
       long l = SystemClock.elapsedRealtime() - this.e;
       if (l - 16 > 0) {
          TraceEvent$d.d(5, "observed a task that took "+l+"ms: "+p0);
       }
       super.b(p0);
       this.c();
       this.f = this.f + 1;
       this.h = this.h + 1;
       return;
    }
    public final void c(){
       if (TraceEvent.c && this.i == null) {
          this.d = SystemClock.elapsedRealtime();
          Looper.myQueue().addIdleHandler(this);
          this.i = true;
       }else if(this.i != null && !TraceEvent.c){
          Looper.myQueue().removeIdleHandler(this);
          this.i = false;
       }
       return;
    }
    public final boolean queueIdle(){
       long l = SystemClock.elapsedRealtime();
       if (!this.d - null) {
          this.d = l;
       }
       long l1 = l - this.d;
       this.g = this.g + 1;
       TraceEvent.a("Looper.queueIdle", this.h+" tasks since last idle.");
       if (l1 - 48 > 0) {
          TraceEvent$d.d(3, this.f+" tasks and "+this.g+" idles processed so far, "+this.h+" tasks bursted and "+l1+"ms elapsed since last idle");
       }
       this.d = l;
       this.h = 0;
       return 1;
    }
}
