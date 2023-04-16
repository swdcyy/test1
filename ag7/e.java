package ag7.e;
import java.lang.Runnable;
import com.kwai.performance.overhead.battery.monitor.b;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo$c;
import java.lang.Object;
import java.util.Objects;
import java.lang.String;
import yf7.h;
import java.lang.System;
import android.os.SystemClock;
import com.kwai.performance.overhead.battery.monitor.ThreadInfoSampler;

public final class e implements Runnable	// class@0000c4
{
    public final b b;
    public final BatteryInfo$c c;

    public void e(b p0,BatteryInfo$c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       e tb = this.b;
       Objects.requireNonNull(tb);
       h.d("BatteryMonitor.Exception", "startStackSampling\(\)");
       tb.j = System.currentTimeMillis();
       tb.k = this.c.a;
       tb.l = SystemClock.currentThreadTimeMillis();
       tb.u.reset();
    }
}
