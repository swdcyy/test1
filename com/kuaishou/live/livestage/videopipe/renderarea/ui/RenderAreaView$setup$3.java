package com.kuaishou.live.livestage.videopipe.renderarea.ui.RenderAreaView$setup$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.livestage.videopipe.renderarea.ui.RenderAreaView;
import java.lang.Object;
import msd.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RenderAreaView$setup$3 extends Lambda implements a	// class@000c12
{
    public final RenderAreaView this$0;

    public void RenderAreaView$setup$3(RenderAreaView p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final l invoke(){
       Object obj = PatchProxy.apply(null, this, RenderAreaView$setup$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.getPlayerViewVisibilityObserver();
    }
}
