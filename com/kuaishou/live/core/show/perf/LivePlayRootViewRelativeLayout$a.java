package com.kuaishou.live.core.show.perf.LivePlayRootViewRelativeLayout$a;
import java.lang.Runnable;
import com.kuaishou.live.core.show.perf.LivePlayRootViewRelativeLayout;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.RelativeLayout;
import android.view.ViewParent;

public class LivePlayRootViewRelativeLayout$a implements Runnable	// class@000d4d
{
    public final LivePlayRootViewRelativeLayout b;

    public void LivePlayRootViewRelativeLayout$a(LivePlayRootViewRelativeLayout p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, LivePlayRootViewRelativeLayout$a.class, "1")) {
          return;
       }
       LivePlayRootViewRelativeLayout$a tb = this.b;
       tb.e = false;
       tb.forceLayout();
       if (this.b.getParent() != null && !this.b.getParent().isLayoutRequested()) {
          tb = this.b;
          tb.measure(tb.b, tb.c);
          tb = this.b;
          tb.layout(tb.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());
       }
       return;
    }
}
