package com.kuaishou.live.common.core.component.multipk.render.LiveMultiPkRenderController$initDataBinding$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.multipk.render.LiveMultiPkRenderController;
import java.lang.Object;
import java.lang.Boolean;
import com.kuaishou.live.viewcontroller.ViewController;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;

public final class LiveMultiPkRenderController$initDataBinding$1 extends Lambda implements p	// class@00166d
{
    public final LiveMultiPkRenderController this$0;

    public void LiveMultiPkRenderController$initDataBinding$1(LiveMultiPkRenderController p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0.booleanValue(), p1);
       return l1.a;
    }
    public final void invoke(boolean p0,ViewController p1){
       if (PatchProxy.isSupport(LiveMultiPkRenderController$initDataBinding$1.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, LiveMultiPkRenderController$initDataBinding$1.class, "1")) {
          return;
       }
       a.p(p1, "childViewController");
       if (p0) {
          LiveMultiPkRenderController$initDataBinding$1 tthis$0 = this.this$0;
          LiveMultiPkRenderController j = tthis$0.j;
          if (j == null) {
             a.S("multiPkRenderContainer");
          }
          tthis$0.y2(j, p1);
       }else {
          this.this$0.O2(p1);
       }
       return;
    }
}
