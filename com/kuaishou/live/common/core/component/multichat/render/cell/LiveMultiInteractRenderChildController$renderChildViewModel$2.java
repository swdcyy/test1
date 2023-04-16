package com.kuaishou.live.common.core.component.multichat.render.cell.LiveMultiInteractRenderChildController$renderChildViewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.multichat.render.cell.LiveMultiInteractRenderChildController;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.multichat.render.cell.LiveMultiInteractRenderChildController$renderChildViewModel$2$1;
import com.kuaishou.live.common.core.component.multichat.render.cell.LiveMultiInteractRenderChildController$renderChildViewModel$2$a;

public final class LiveMultiInteractRenderChildController$renderChildViewModel$2 extends Lambda implements a	// class@0014da
{
    public final LiveMultiInteractRenderChildController this$0;

    public void LiveMultiInteractRenderChildController$renderChildViewModel$2(LiveMultiInteractRenderChildController p0){
       this.this$0 = p0;
       super(0);
    }
    public final ViewModelProvider$Factory invoke(){
       Object obj = PatchProxy.apply(null, this, LiveMultiInteractRenderChildController$renderChildViewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveMultiInteractRenderChildController$renderChildViewModel$2$a(new LiveMultiInteractRenderChildController$renderChildViewModel$2$1(this));
    }
    public Object invoke(){
       return this.invoke();
    }
}
