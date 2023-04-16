package com.kuaishou.live.common.core.component.multipk.render.LiveMultiPkRenderController$renderViewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.multipk.render.LiveMultiPkRenderController;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.multipk.render.LiveMultiPkRenderController$renderViewModel$2$1;
import com.kuaishou.live.common.core.component.multipk.render.LiveMultiPkRenderController$renderViewModel$2$a;

public final class LiveMultiPkRenderController$renderViewModel$2 extends Lambda implements a	// class@001670
{
    public final LiveMultiPkRenderController this$0;

    public void LiveMultiPkRenderController$renderViewModel$2(LiveMultiPkRenderController p0){
       this.this$0 = p0;
       super(0);
    }
    public final ViewModelProvider$Factory invoke(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkRenderController$renderViewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveMultiPkRenderController$renderViewModel$2$a(new LiveMultiPkRenderController$renderViewModel$2$1(this));
    }
    public Object invoke(){
       return this.invoke();
    }
}
