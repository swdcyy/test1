package com.kuaishou.live.core.voiceparty.player.LiveLifecycleAwarePlayerViewRenderDelegate$storePendingSetter$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.player.LiveLifecycleAwarePlayerViewRenderDelegate;
import com.kwai.video.waynelive.LivePlayerController;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class LiveLifecycleAwarePlayerViewRenderDelegate$storePendingSetter$1 extends Lambda implements a	// class@001810
{
    public final LivePlayerController $controller;
    public final boolean $shouldReleaseCurrentSurfaceTexture;
    public final LivePlayTextureView $textureView;
    public final LiveLifecycleAwarePlayerViewRenderDelegate this$0;

    public void LiveLifecycleAwarePlayerViewRenderDelegate$storePendingSetter$1(LiveLifecycleAwarePlayerViewRenderDelegate p0,LivePlayerController p1,LivePlayTextureView p2,boolean p3){
       this.this$0 = p0;
       this.$controller = p1;
       this.$textureView = p2;
       this.$shouldReleaseCurrentSurfaceTexture = p3;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, LiveLifecycleAwarePlayerViewRenderDelegate$storePendingSetter$1.class, "1")) {
          return;
       }
       this.this$0.b(this.$controller, this.$textureView, this.$shouldReleaseCurrentSurfaceTexture);
       return;
    }
}
