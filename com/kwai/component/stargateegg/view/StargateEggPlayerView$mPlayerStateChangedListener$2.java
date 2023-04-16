package com.kwai.component.stargateegg.view.StargateEggPlayerView$mPlayerStateChangedListener$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.component.stargateegg.view.StargateEggPlayerView;
import com.kwai.framework.player.core.b$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.component.stargateegg.view.StargateEggPlayerView$mPlayerStateChangedListener$2$a;

public final class StargateEggPlayerView$mPlayerStateChangedListener$2 extends Lambda implements a	// class@000b5e
{
    public final StargateEggPlayerView this$0;

    public void StargateEggPlayerView$mPlayerStateChangedListener$2(StargateEggPlayerView p0){
       this.this$0 = p0;
       super(0);
    }
    public final b$b invoke(){
       Object obj = PatchProxy.apply(null, this, StargateEggPlayerView$mPlayerStateChangedListener$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new StargateEggPlayerView$mPlayerStateChangedListener$2$a(this);
    }
    public Object invoke(){
       return this.invoke();
    }
}
