package com.kuaishou.live.common.core.component.multipk.game.vc.score.LiveMultiPkProgressBarDefaultController$progressBarViewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.multipk.game.vc.score.LiveMultiPkProgressBarDefaultController;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.multipk.game.vc.score.LiveMultiPkProgressBarDefaultController$progressBarViewModel$2$1;
import com.kuaishou.live.common.core.component.multipk.game.vc.score.LiveMultiPkProgressBarDefaultController$progressBarViewModel$2$a;

public final class LiveMultiPkProgressBarDefaultController$progressBarViewModel$2 extends Lambda implements a	// class@001640
{
    public final LiveMultiPkProgressBarDefaultController this$0;

    public void LiveMultiPkProgressBarDefaultController$progressBarViewModel$2(LiveMultiPkProgressBarDefaultController p0){
       this.this$0 = p0;
       super(0);
    }
    public final ViewModelProvider$Factory invoke(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkProgressBarDefaultController$progressBarViewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveMultiPkProgressBarDefaultController$progressBarViewModel$2$a(new LiveMultiPkProgressBarDefaultController$progressBarViewModel$2$1(this));
    }
    public Object invoke(){
       return this.invoke();
    }
}
