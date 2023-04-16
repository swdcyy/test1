package com.kuaishou.live.livestage.videopipe.renderarea.ui.RenderAreaView$setup$renderLayoutFlow$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.livestage.videopipe.renderarea.ui.RenderAreaView;
import fe3.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup;

public final class RenderAreaView$setup$renderLayoutFlow$2 extends Lambda implements a	// class@000c15
{
    public final RenderAreaView this$0;

    public void RenderAreaView$setup$renderLayoutFlow$2(RenderAreaView p0){
       this.this$0 = p0;
       super(0);
    }
    public final a invoke(){
       Object obj = PatchProxy.apply(null, this, RenderAreaView$setup$renderLayoutFlow$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this.this$0.getMeasuredWidth(), this.this$0.getMeasuredHeight());
    }
    public Object invoke(){
       return this.invoke();
    }
}
