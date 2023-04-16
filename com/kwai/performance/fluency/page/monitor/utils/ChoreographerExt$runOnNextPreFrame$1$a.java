package com.kwai.performance.fluency.page.monitor.utils.ChoreographerExt$runOnNextPreFrame$1$a;
import android.view.Choreographer$FrameCallback;
import com.kwai.performance.fluency.page.monitor.utils.ChoreographerExt$runOnNextPreFrame$1;
import java.lang.Object;
import java.lang.Runnable;

public final class ChoreographerExt$runOnNextPreFrame$1$a implements Choreographer$FrameCallback	// class@0010ce
{
    public final ChoreographerExt$runOnNextPreFrame$1 b;

    public void ChoreographerExt$runOnNextPreFrame$1$a(ChoreographerExt$runOnNextPreFrame$1 p0){
       this.b = p0;
       super();
    }
    public final void doFrame(long p0){
       ChoreographerExt$runOnNextPreFrame$1 $action = this.b.$action;
       if ($action != null) {
          $action.run();
       }
       return;
    }
}
