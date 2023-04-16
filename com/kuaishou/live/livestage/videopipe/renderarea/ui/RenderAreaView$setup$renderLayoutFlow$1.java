package com.kuaishou.live.livestage.videopipe.renderarea.ui.RenderAreaView$setup$renderLayoutFlow$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.livestage.videopipe.renderarea.ui.RenderAreaView;
import java.lang.Object;
import re3.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RenderAreaView$setup$renderLayoutFlow$1 extends Lambda implements a	// class@000c14
{
    public final RenderAreaView this$0;

    public void RenderAreaView$setup$renderLayoutFlow$1(RenderAreaView p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final e invoke(){
       Object obj = PatchProxy.apply(null, this, RenderAreaView$setup$renderLayoutFlow$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.getPositionCalculator();
    }
}
