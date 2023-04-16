package com.kuaishou.live.core.voiceparty.simpleplay.service.LiveVoicePartyPreviewPlayViewServiceImpl$setPlayViewLocation$1$$special$$inlined$let$lambda$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.core.voiceparty.simpleplay.service.LiveVoicePartyPreviewPlayViewServiceImpl$setPlayViewLocation$1;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Point;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Rect;
import com.kwai.feature.api.live.service.voiceparty.LiveVoicePartyPlayViewService$ScaleType;
import com.kuaishou.live.core.voiceparty.video.helper.VoicePartySurfaceUtil$ScaleType;
import com.kuaishou.live.core.voiceparty.video.helper.VoicePartySurfaceUtil;
import com.kuaishou.live.core.voiceparty.simpleplay.service.LiveVoicePartyPreviewPlayViewServiceImpl;
import ot5.a;

public final class LiveVoicePartyPreviewPlayViewServiceImpl$setPlayViewLocation$1$$special$$inlined$let$lambda$1 extends Lambda implements a	// class@001912
{
    public final ViewGroup$LayoutParams $params;
    public final LiveVoicePartyPreviewPlayViewServiceImpl$setPlayViewLocation$1 this$0;

    public void LiveVoicePartyPreviewPlayViewServiceImpl$setPlayViewLocation$1$$special$$inlined$let$lambda$1(ViewGroup$LayoutParams p0,LiveVoicePartyPreviewPlayViewServiceImpl$setPlayViewLocation$1 p1){
       this.$params = p0;
       this.this$0 = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoidWithListener(null, this, LiveVoicePartyPreviewPlayViewServiceImpl$setPlayViewLocation$1$$special$$inlined$let$lambda$1.class, "1")) {
          return;
       }
       LiveVoicePartyPreviewPlayViewServiceImpl$setPlayViewLocation$1 $videoSize = this.this$0.$videoSize;
       if ($videoSize == null || $videoSize.x <= null) {
          PatchProxy.onMethodExit(LiveVoicePartyPreviewPlayViewServiceImpl$setPlayViewLocation$1$$special$$inlined$let$lambda$1.class, "1");
          return;
       }else {
          LiveVoicePartyPreviewPlayViewServiceImpl$setPlayViewLocation$1$$special$$inlined$let$lambda$1 t$params = this.$params;
          if (!t$params instanceof ViewGroup$MarginLayoutParams) {
             t$params = null;
          }
          VoicePartySurfaceUtil.a(t$params, $videoSize, new Point(this.this$0.$viewHolderRect.width(), this.this$0.$viewHolderRect.height()), VoicePartySurfaceUtil.i(this.this$0.$scaleType));
          this.this$0.this$0.d.l(this.$params, null);
          PatchProxy.onMethodExit(LiveVoicePartyPreviewPlayViewServiceImpl$setPlayViewLocation$1$$special$$inlined$let$lambda$1.class, "1");
          return;
       }
    }
}
