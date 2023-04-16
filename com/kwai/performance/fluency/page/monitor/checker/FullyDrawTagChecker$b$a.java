package com.kwai.performance.fluency.page.monitor.checker.FullyDrawTagChecker$b$a;
import java.lang.Runnable;
import com.kwai.performance.fluency.page.monitor.checker.FullyDrawTagChecker$b;
import java.lang.Object;
import com.kwai.performance.fluency.page.monitor.checker.FullyDrawTagChecker;
import java.lang.ref.WeakReference;
import android.view.ViewGroup;
import com.kwai.performance.fluency.page.monitor.checker.FullyDrawTagChecker$b$a$a;
import android.os.Handler;

public final class FullyDrawTagChecker$b$a implements Runnable	// class@0010b7
{
    public final FullyDrawTagChecker$b b;

    public void FullyDrawTagChecker$b$a(FullyDrawTagChecker$b p0){
       this.b = p0;
       super();
    }
    public final void run(){
       ViewGroup viewGroup = this.b.a.c.get();
       if (viewGroup != null) {
          this.b.post(new FullyDrawTagChecker$b$a$a(viewGroup, this));
       }
       this.b.a.e();
       return;
    }
}
