package com.kwai.performance.fluency.page.monitor.checker.FullyDrawTagChecker$start$1;
import java.lang.Runnable;
import com.kwai.performance.fluency.page.monitor.checker.FullyDrawTagChecker;
import java.lang.Object;
import java.lang.ref.WeakReference;
import android.view.ViewGroup;
import com.kwai.performance.fluency.page.monitor.checker.FullyDrawTagChecker$start$1$$special$$inlined$let$lambda$1;
import android.os.Handler;

public final class FullyDrawTagChecker$start$1 implements Runnable	// class@0010be
{
    public final FullyDrawTagChecker b;

    public void FullyDrawTagChecker$start$1(FullyDrawTagChecker p0){
       this.b = p0;
       super();
    }
    public final void run(){
       ViewGroup viewGroup = this.b.c.get();
       if (viewGroup != null) {
          this.b.d.post(new FullyDrawTagChecker$start$1$$special$$inlined$let$lambda$1(viewGroup, this));
       }
       this.b.e();
       return;
    }
}
