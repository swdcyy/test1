package com.kuaishou.live.common.core.component.multipk.render.viewcontroller.LiveMultiPkRenderChildViewController$renderChildViewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.LiveMultiPkRenderChildViewController;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.LiveMultiPkRenderChildViewController$renderChildViewModel$2$1;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.LiveMultiPkRenderChildViewController$renderChildViewModel$2$a;

public final class LiveMultiPkRenderChildViewController$renderChildViewModel$2 extends Lambda implements a	// class@001685
{
    public final LiveMultiPkRenderChildViewController this$0;

    public void LiveMultiPkRenderChildViewController$renderChildViewModel$2(LiveMultiPkRenderChildViewController p0){
       this.this$0 = p0;
       super(0);
    }
    public final ViewModelProvider$Factory invoke(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkRenderChildViewController$renderChildViewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveMultiPkRenderChildViewController$renderChildViewModel$2$a(new LiveMultiPkRenderChildViewController$renderChildViewModel$2$1(this));
    }
    public Object invoke(){
       return this.invoke();
    }
}
