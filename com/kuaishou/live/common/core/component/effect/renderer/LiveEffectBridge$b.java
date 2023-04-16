package com.kuaishou.live.common.core.component.effect.renderer.LiveEffectBridge$b;
import erd.g;
import com.kuaishou.live.common.core.component.effect.renderer.LiveEffectBridge;
import java.lang.String;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Integer;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Map;
import lnc.i3;
import java.lang.Number;
import k2b.u1;

public final class LiveEffectBridge$b implements g	// class@0010e7
{
    public final LiveEffectBridge b;
    public final String c;
    public final int d;

    public void LiveEffectBridge$b(LiveEffectBridge p0,String p1,int p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEffectBridge$b.class, "1")) {
       }else {
          p0 = this.b;
          LiveEffectBridge$b tc = this.c;
          LiveEffectBridge$b td = this.d;
          Objects.requireNonNull(p0);
          LiveEffectBridge liveEffectBr = LiveEffectBridge.class;
          if (!PatchProxy.isSupport(liveEffectBr) || !PatchProxy.applyVoidTwoRefs(tc, Integer.valueOf(td), p0, liveEffectBr, "3")) {
             b.d0(LiveLogTag.LIVE_ABILITY, "handleWaitTimeout", "waitKey", tc, "reqType", Integer.valueOf(td));
             p0.a.remove(tc);
             p0 = i3.f();
             p0.c("reqType", Integer.valueOf(td));
             u1.R("KEY_FOR_EFFECT_BRIDGE_TIME_OUT", p0.e(), 3);
          }
       }
       return;
    }
}
