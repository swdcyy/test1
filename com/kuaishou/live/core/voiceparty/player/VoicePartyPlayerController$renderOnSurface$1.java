package com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController$renderOnSurface$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import java.lang.Object;
import com.kwai.video.waynelive.LivePlayerController;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import fu2.f;

public final class VoicePartyPlayerController$renderOnSurface$1 extends Lambda implements l	// class@001833
{
    public final boolean $shouldReleaseCurrentSurfaceTexture;
    public final LivePlayTextureView $textureView;
    public final VoicePartyPlayerController this$0;

    public void VoicePartyPlayerController$renderOnSurface$1(VoicePartyPlayerController p0,LivePlayTextureView p1,boolean p2){
       this.this$0 = p0;
       this.$textureView = p1;
       this.$shouldReleaseCurrentSurfaceTexture = p2;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LivePlayerController p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyPlayerController$renderOnSurface$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       this.this$0.h.b(p0, this.$textureView, this.$shouldReleaseCurrentSurfaceTexture);
       return;
    }
}
