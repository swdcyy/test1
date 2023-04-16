package com.kwai.performance.fluency.fps.monitor.detector.metrics.MetricsQueue;
import java.lang.Object;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
import android.view.FrameMetrics;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.concurrent.locks.Lock;
import com.kwai.performance.fluency.fps.monitor.detector.metrics.Metrics;
import te7.c;
import java.util.List;
import qrd.l1;
import kotlin.collections.CollectionsKt___CollectionsKt;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.ListIterator;
import com.kwai.performance.fluency.fps.monitor.detector.metrics.MetricsQueue$lastMetrics$1$metrics$2$1;
import msd.l;
import trd.y;

public final class MetricsQueue	// class@00107f
{
    public final List a;
    public final ReentrantLock b;
    public final Condition c;

    public void MetricsQueue(){
       super();
       this.a = new LinkedList();
       ReentrantLock reentrantLoc = new ReentrantLock();
       this.b = reentrantLoc;
       this.c = reentrantLoc.newCondition();
    }
    public final void a(FrameMetrics p0){
       MetricsQueue metricsQueue = this;
       Object obj = p0;
       a.p(obj, "frameMetrics");
       MetricsQueue b = metricsQueue.b;
       b.lock();
       float f = c.b(obj, 1);
       float f1 = c.b(obj, 2);
       float f2 = c.b(obj, 3);
       float f3 = c.b(obj, 4);
       float f4 = c.b(obj, 5);
       float f5 = c.b(obj, 6);
       float f6 = c.b(obj, 7);
       float f7 = c.b(obj, 0);
       int i = 0;
       Metrics metrics = new Metrics(f, f1, f2, f3, f4, f5, f6, f7, c.c(p0));
       a.p(v14, "<this>");
       int i1 = (!v14.inputHandlingDuration)? 1: 0;
       if (i1 ^ 0x01) {
          metricsQueue.a.add(v14);
          metricsQueue.c.signalAll();
          if (metricsQueue.a.size() > 30) {
             metricsQueue.a.remove(i);
          }
       }
       b.unlock();
       return;
    }
    public final Metrics b(long p0){
       Metrics metrics1;
       Metrics metrics2;
       MetricsQueue tb = this.b;
       tb.lock();
       Metrics metrics = CollectionsKt___CollectionsKt.e3(this.a);
       long l = SystemClock.elapsedRealtime();
       while (metrics != null && metrics.a() - p0 < 0) {
          this.c.await(1, TimeUnit.SECONDS);
          long l1 = SystemClock.elapsedRealtime() - l;
          if (l1 - 1000 > 0) {
             break ;
          }else {
             metrics = CollectionsKt___CollectionsKt.e3(this.a);
          }
       }
       MetricsQueue ta = this.a;
       ListIterator listIterator = ta.listIterator(ta.size());
       while (true) {
          metrics1 = null;
          if (listIterator.hasPrevious()) {
             metrics2 = listIterator.previous();
             Object obj = (metrics2.a() - p0 < 0)? 1: null;
             if (!obj) {
                continue ;
             }
          }else {
             metrics2 = metrics1;
          }
          if (metrics2 != null) {
             y.K0(this.a, new MetricsQueue$lastMetrics$1$metrics$2$1(p0));
             metrics1 = metrics2;
             break ;
          }
          break ;
       }
       tb.unlock();
       return metrics1;
    }
}
