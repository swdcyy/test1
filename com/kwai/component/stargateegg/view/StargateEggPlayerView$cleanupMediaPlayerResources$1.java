package com.kwai.component.stargateegg.view.StargateEggPlayerView$cleanupMediaPlayerResources$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.component.stargateegg.view.StargateEggPlayerView;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.tk.api.view.player.TextureRenderView;
import java.util.Objects;
import android.view.View;
import android.widget.FrameLayout;

public final class StargateEggPlayerView$cleanupMediaPlayerResources$1 extends Lambda implements a	// class@000b4d
{
    public final StargateEggPlayerView this$0;

    public void StargateEggPlayerView$cleanupMediaPlayerResources$1(StargateEggPlayerView p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, StargateEggPlayerView$cleanupMediaPlayerResources$1.class, "1")) {
          return;
       }
       StargateEggPlayerView$cleanupMediaPlayerResources$1 tthis$0 = this.this$0;
       tthis$0.u = false;
       StargateEggPlayerView b = tthis$0.B;
       if (b instanceof TextureRenderView) {
          Objects.requireNonNull(b, "null cannot be cast to non-null type com.kuaishou.tk.api.view.player.TextureRenderView");
          tthis$0.removeView(b);
       }
       this.this$0.f();
       this.this$0.B = null;
       return;
    }
}
