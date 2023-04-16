package ed2.n;
import android.view.Window$OnFrameMetricsAvailableListener;
import ed2.r;
import java.lang.Object;
import android.view.Window;
import android.view.FrameMetrics;
import java.util.Objects;
import android.util.Pair;
import java.lang.Long;
import java.lang.System;
import java.util.LinkedList;

public final class n implements Window$OnFrameMetricsAvailableListener	// class@002702
{
    public final r b;
    public final Object c;

    public void n(r p0,Object p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onFrameMetricsAvailable(Window p0,FrameMetrics p1,int p2){
       n tb = this.b;
       n tc = this.c;
       Objects.requireNonNull(tb);
       _monitor_enter(tc);
       tb.c.add(new Pair(Long.valueOf(p1.getMetric(8)), Long.valueOf(System.currentTimeMillis())));
       _monitor_exit(tc);
    }
}
