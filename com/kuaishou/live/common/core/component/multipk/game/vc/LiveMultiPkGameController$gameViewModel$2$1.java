package com.kuaishou.live.common.core.component.multipk.game.vc.LiveMultiPkGameController$gameViewModel$2$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.multipk.game.vc.LiveMultiPkGameController$gameViewModel$2;
import com.kuaishou.live.common.core.component.multipk.game.vc.LiveMultiPkGameViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zs1.b;
import com.kuaishou.live.common.core.component.multipk.game.vc.LiveMultiPkGameController;
import ft1.b;
import jt1.a;
import com.kuaishou.live.common.core.component.multipk.game.vc.LiveMultiPkGameController$gameViewModel$2$1$1;
import kt1.d;

public final class LiveMultiPkGameController$gameViewModel$2$1 extends Lambda implements a	// class@0015e4
{
    public final LiveMultiPkGameController$gameViewModel$2 this$0;

    public void LiveMultiPkGameController$gameViewModel$2$1(LiveMultiPkGameController$gameViewModel$2 p0){
       this.this$0 = p0;
       super(0);
    }
    public final LiveMultiPkGameViewModel invoke(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkGameController$gameViewModel$2$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveMultiPkGameViewModel(this.this$0.this$0.Y2(), this.this$0.this$0.W2(), this.this$0.this$0.m, new LiveMultiPkGameController$gameViewModel$2$1$1(this));
    }
    public Object invoke(){
       return this.invoke();
    }
}
