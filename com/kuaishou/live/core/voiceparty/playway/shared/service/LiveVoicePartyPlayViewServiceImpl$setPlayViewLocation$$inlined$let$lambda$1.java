package com.kuaishou.live.core.voiceparty.playway.shared.service.LiveVoicePartyPlayViewServiceImpl$setPlayViewLocation$$inlined$let$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup;
import android.view.View;
import com.kuaishou.live.core.voiceparty.playway.shared.service.LiveVoicePartyPlayViewServiceImpl;
import android.graphics.Point;
import android.graphics.Rect;
import com.kwai.feature.api.live.service.voiceparty.LiveVoicePartyPlayViewService$ScaleType;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.video.helper.VoicePartySurfaceUtil$ScaleType;
import com.kuaishou.live.core.voiceparty.video.helper.VoicePartySurfaceUtil;
import android.view.ViewGroup$LayoutParams;

public final class LiveVoicePartyPlayViewServiceImpl$setPlayViewLocation$$inlined$let$lambda$1 extends Lambda implements l	// class@001887
{
    public final View $livePlayView$inlined;
    public final ViewGroup$MarginLayoutParams $params;
    public final ViewGroup $playViewContainer$inlined;
    public final LiveVoicePartyPlayViewService$ScaleType $scaleType$inlined;
    public final Point $videoSize$inlined;
    public final Rect $viewHolderRect$inlined;
    public final LiveVoicePartyPlayViewServiceImpl this$0;

    public void LiveVoicePartyPlayViewServiceImpl$setPlayViewLocation$$inlined$let$lambda$1(ViewGroup$MarginLayoutParams p0,ViewGroup p1,View p2,LiveVoicePartyPlayViewServiceImpl p3,Point p4,Rect p5,LiveVoicePartyPlayViewService$ScaleType p6){
       this.$params = p0;
       this.$playViewContainer$inlined = p1;
       this.$livePlayView$inlined = p2;
       this.this$0 = p3;
       this.$videoSize$inlined = p4;
       this.$viewHolderRect$inlined = p5;
       this.$scaleType$inlined = p6;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveVoicePartyPlayViewServiceImpl$setPlayViewLocation$$inlined$let$lambda$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       VoicePartySurfaceUtil.a(this.$params, this.$videoSize$inlined, new Point(this.$viewHolderRect$inlined.width(), this.$viewHolderRect$inlined.height()), VoicePartySurfaceUtil.i(this.$scaleType$inlined));
       this.$livePlayView$inlined.setLayoutParams(this.$params);
       PatchProxy.onMethodExit(LiveVoicePartyPlayViewServiceImpl$setPlayViewLocation$$inlined$let$lambda$1.class, "1");
       return;
    }
}
