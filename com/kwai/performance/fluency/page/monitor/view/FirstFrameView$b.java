package com.kwai.performance.fluency.page.monitor.view.FirstFrameView$b;
import java.lang.Runnable;
import com.kwai.performance.fluency.page.monitor.view.FirstFrameView;
import java.lang.Object;
import android.view.View;
import com.kwai.performance.fluency.page.monitor.view.FirstFrameView$a;

public final class FirstFrameView$b implements Runnable	// class@0010d3
{
    public final FirstFrameView b;

    public void FirstFrameView$b(FirstFrameView p0){
       this.b = p0;
       super();
    }
    public final void run(){
       FirstFrameView$b tb = this.b;
       FirstFrameView b = tb.b;
       if (b != null) {
          b.a(tb);
       }
       return;
    }
}
