package com.kuaishou.pagedy.container.widget.DynamicMultiTabsView$b;
import java.lang.Runnable;
import com.kuaishou.pagedy.container.widget.DynamicMultiTabsView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class DynamicMultiTabsView$b implements Runnable	// class@000a66
{
    public final DynamicMultiTabsView b;
    public final int c;

    public void DynamicMultiTabsView$b(DynamicMultiTabsView p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, DynamicMultiTabsView$b.class, "1")) {
          return;
       }
       DynamicMultiTabsView$b tb = this.b;
       tb.setRetryCount((tb.getRetryCount() + 1));
       this.b.c(this.c);
       return;
    }
}
