package com.yxcorp.gifshow.page.cost.list.ListPageFirstRenderObserver;
import android.view.Choreographer$FrameCallback;
import com.yxcorp.gifshow.page.cost.list.ListPageFirstRenderObserver$a;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import com.yxcorp.gifshow.page.cost.list.ListPageFirstRenderObserver$FlagNode;
import android.view.Choreographer;
import androidx.lifecycle.Lifecycle;
import com.yxcorp.gifshow.page.cost.list.ListPageFirstRenderObserver$1;
import androidx.lifecycle.LifecycleObserver;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Long;

public class ListPageFirstRenderObserver implements Choreographer$FrameCallback	// class@000e22
{
    public final ListPageFirstRenderObserver$a b;
    public final Choreographer c;
    public ListPageFirstRenderObserver$FlagNode d;

    public void ListPageFirstRenderObserver(ListPageFirstRenderObserver$a p0,LifecycleOwner p1){
       super();
       this.d = ListPageFirstRenderObserver$FlagNode.NONE;
       this.b = p0;
       this.c = Choreographer.getInstance();
       p1.getLifecycle().addObserver(new ListPageFirstRenderObserver$1(this));
    }
    public void a(ListPageFirstRenderObserver$FlagNode p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ListPageFirstRenderObserver.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       ListPageFirstRenderObserver td = this.d;
       if (td == ListPageFirstRenderObserver$FlagNode.LAUNCH_FINISH_RENDERED) {
          return;
       }
       if (td == p0) {
          return;
       }
       if (td.mNextValue != p0.mValue) {
          return;
       }
       this.d = p0;
       if (p0 == ListPageFirstRenderObserver$FlagNode.LAUNCH_FINISH_PRE_RENDER) {
          this.c.postFrameCallback(this);
       }
       return;
    }
    public void doFrame(long p0){
       if (PatchProxy.isSupport(ListPageFirstRenderObserver.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, ListPageFirstRenderObserver.class, "2")) {
          return;
       }
       if (this.d != ListPageFirstRenderObserver$FlagNode.LAUNCH_FINISH_PRE_RENDER) {
          return;
       }
       this.d = ListPageFirstRenderObserver$FlagNode.LAUNCH_FINISH_RENDERED;
       this.b.a();
       return;
    }
}
