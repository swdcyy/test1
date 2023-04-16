package com.kwai.performance.fluency.page.monitor.utils.ChoreographerExt$runOnNextPreFrame$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Runnable;
import java.lang.Object;
import qrd.l1;
import hf7.a;
import com.kwai.performance.fluency.page.monitor.utils.ChoreographerExt$runOnNextPreFrame$1$a;
import android.view.Choreographer$FrameCallback;
import android.view.Choreographer;

public final class ChoreographerExt$runOnNextPreFrame$1 extends Lambda implements a	// class@0010cf
{
    public final Runnable $action;

    public void ChoreographerExt$runOnNextPreFrame$1(Runnable p0){
       this.$action = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Choreographer a;
       a.d.a();
       a = a.a;
       if (a != null) {
          a.postFrameCallback(new ChoreographerExt$runOnNextPreFrame$1$a(this));
       }
       return;
    }
}
