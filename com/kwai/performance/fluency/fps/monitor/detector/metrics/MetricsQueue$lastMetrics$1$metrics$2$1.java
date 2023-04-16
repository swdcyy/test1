package com.kwai.performance.fluency.fps.monitor.detector.metrics.MetricsQueue$lastMetrics$1$metrics$2$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kwai.performance.fluency.fps.monitor.detector.metrics.Metrics;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class MetricsQueue$lastMetrics$1$metrics$2$1 extends Lambda implements l	// class@00107e
{
    public final long $time;

    public void MetricsQueue$lastMetrics$1$metrics$2$1(long p0){
       this.$time = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(Metrics p0){
       a.p(p0, "it");
       boolean b = (p0.a() - this.$time < 0)? true: false;
       return b;
    }
}
