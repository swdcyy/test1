package com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker$mCalculatorHandler$1;
import android.os.Handler;
import com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker;
import android.os.Looper;
import android.os.Message;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import gf7.a;
import hf7.a;
import com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker$mCalculatorHandler$1$handleMessage$1;
import java.lang.Runnable;
import hf7.a$a;

public final class FullyDraw8060Checker$mCalculatorHandler$1 extends Handler	// class@0010ae
{
    public final FullyDraw8060Checker a;

    public void FullyDraw8060Checker$mCalculatorHandler$1(FullyDraw8060Checker p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       a.p(p0, "msg");
       if (a.g(p0.obj, FullyDraw8060Checker.g)) {
          FullyDraw8060Checker b = this.a.b;
          if (b != null && (b == null || b.g() != true)) {
             a.c(a.d, new FullyDraw8060Checker$mCalculatorHandler$1$handleMessage$1(this), null, 2, null);
          }
       }
       return;
    }
}
