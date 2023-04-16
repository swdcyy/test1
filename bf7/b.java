package bf7.b;
import yf7.w;
import bf7.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import zsd.u;
import java.util.Objects;
import cf7.a;
import com.kwai.performance.fluency.jank.monitor.JankMonitor;
import com.kwai.performance.fluency.jank.monitor.JankMonitorConfig;
import msd.a;
import java.lang.Number;
import java.lang.Long;
import com.yxcorp.utility.Log;

public final class b implements w	// class@00040d
{
    public final a a;
    public boolean b;
    public long c;

    public void b(a p0){
       a.p(p0, "mJankOptimizer");
       super();
       this.a = p0;
       this.c = -1;
    }
    public void a(long p0,long p1,long p2,String p3){
       if (p3 == null) {
          return;
       }
       int i = 0;
       if (p3.charAt(i) == '>') {
          this.b = true;
          if (u.p2(p3, "android.view.Choreographer$FrameHandler", 30, false, 4, null)) {
             this.c = p1;
          }
       }else if(p3.charAt(i) == '<'){
          this.b = i;
          if (this.c <= 0) {
             return;
          }else {
             b tc = this.c;
             Objects.requireNonNull(this.a);
             a a = a.a;
             Objects.requireNonNull(a);
             if (a.c - tc) {
                if ((p1 - tc) - (long)JankMonitor.INSTANCE.getConfig$com_kwai_performance_fluency_jank_monitor().e.invoke().intValue() >= 0) {
                   i = 1;
                }
                if (i) {
                   a.c = tc;
                   Log.g("BarrierJankFixer", a.C("test\(\) - ", Long.valueOf(tc)));
                }
             }
             if (i) {
                a.b();
             }
          }
       }
       return;
    }
}
