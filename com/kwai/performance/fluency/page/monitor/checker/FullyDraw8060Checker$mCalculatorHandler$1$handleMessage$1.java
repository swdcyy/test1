package com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker$mCalculatorHandler$1$handleMessage$1;
import java.lang.Runnable;
import com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker$mCalculatorHandler$1;
import java.lang.Object;
import com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker;
import java.lang.ref.WeakReference;
import android.view.ViewGroup;
import java.util.Map;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker$mCalculatorHandler$1$handleMessage$1$$special$$inlined$let$lambda$1;
import android.os.Handler;

public final class FullyDraw8060Checker$mCalculatorHandler$1$handleMessage$1 implements Runnable	// class@0010ad
{
    public final FullyDraw8060Checker$mCalculatorHandler$1 b;

    public void FullyDraw8060Checker$mCalculatorHandler$1$handleMessage$1(FullyDraw8060Checker$mCalculatorHandler$1 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       ViewGroup viewGroup = this.b.a.c.get();
       if (viewGroup != null) {
          this.b.a.d.clear();
          a.o(viewGroup, "rootView");
          this.b.a.l(viewGroup);
          this.b.post(new FullyDraw8060Checker$mCalculatorHandler$1$handleMessage$1$$special$$inlined$let$lambda$1(viewGroup, this));
       }
       this.b.a.k();
       return;
    }
}
