package com.yxcorp.gifshow.camera.record.assistant.widget.AssistantViewPager$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.assistant.widget.AssistantViewPager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h3.a;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import kotlin.jvm.internal.a;

public final class AssistantViewPager$b implements Runnable	// class@001d2b
{
    public final AssistantViewPager b;

    public void AssistantViewPager$b(AssistantViewPager p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, AssistantViewPager$b.class, "1")) {
          return;
       }
       a adapter = this.b.getAdapter();
       int i = 0;
       int i1 = (adapter != null)? adapter.j(): 0;
       if (!i1) {
          return;
       }else {
          a adapter1 = this.b.getAdapter();
          a.o(adapter1, "adapter");
          if (this.b.getCurrentItem() == (adapter1.j() - 1)) {
             this.b.S(i, 1266);
          }else {
             AssistantViewPager$b tb = this.b;
             tb.S((tb.getCurrentItem() + 1), 1266);
          }
          return;
       }
    }
}
