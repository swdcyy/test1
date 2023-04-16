package com.kuaishou.live.common.core.component.pendant.miniwidget.base.container.LivePerfSafeViewPager$a;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.pendant.miniwidget.base.container.LivePerfSafeViewPager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.ViewParent;

public class LivePerfSafeViewPager$a implements Runnable	// class@0016ec
{
    public final LivePerfSafeViewPager b;

    public void LivePerfSafeViewPager$a(LivePerfSafeViewPager p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, LivePerfSafeViewPager$a.class, "1")) {
          return;
       }
       LivePerfSafeViewPager$a tb = this.b;
       tb.c = false;
       tb.forceLayout();
       if (this.b.getParent() != null && !this.b.getParent().isLayoutRequested()) {
          tb = this.b;
          tb.measure(tb.d, tb.e);
          tb = this.b;
          tb.layout(tb.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());
       }
       return;
    }
}
