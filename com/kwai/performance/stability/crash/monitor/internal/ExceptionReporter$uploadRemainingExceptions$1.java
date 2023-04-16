package com.kwai.performance.stability.crash.monitor.internal.ExceptionReporter$uploadRemainingExceptions$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.util.concurrent.CountDownLatch;
import java.lang.Object;
import qrd.l1;

public final class ExceptionReporter$uploadRemainingExceptions$1 extends Lambda implements a	// class@0011e2
{
    public final CountDownLatch $latch;

    public void ExceptionReporter$uploadRemainingExceptions$1(CountDownLatch p0){
       this.$latch = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       this.$latch.countDown();
    }
}
