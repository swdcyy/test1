package com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleModel$countDownModel$2$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleModel$countDownModel$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleModel;
import xr1.e;
import java.lang.Long;

public final class LiveMultiLinePuzzleModel$countDownModel$2$1 extends Lambda implements a	// class@0015ac
{
    public final LiveMultiLinePuzzleModel$countDownModel$2 this$0;

    public void LiveMultiLinePuzzleModel$countDownModel$2$1(LiveMultiLinePuzzleModel$countDownModel$2 p0){
       this.this$0 = p0;
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, LiveMultiLinePuzzleModel$countDownModel$2$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.this$0.this$0.v.b();
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
