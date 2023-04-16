package rg7.a;
import rg7.f;
import com.kwai.performance.stability.crash.monitor.anr.c;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfig;
import java.lang.String;
import java.lang.Thread;
import com.kwai.performance.stability.crash.monitor.anr.LogRecordQueue;
import com.kwai.performance.stability.crash.monitor.anr.LogRecordQueue$PackedRecordExtra;

public class a extends f	// class@002388
{
    public final c e;
    public final AnrMonitorConfig f;

    public void a(c p0,AnrMonitorConfig p1){
       super();
       this.e = p0;
       this.f = p1;
       this.setName("AnrCheckTime");
    }
    public void a(){
    }
    public long b(){
       return (long)this.f.checkTimeInterval;
    }
    public boolean c(){
       return true;
    }
    public void f(long p0,long p1){
       if (p0 - -1) {
          this.e.h.i.update(p0);
       }
       return;
    }
}
