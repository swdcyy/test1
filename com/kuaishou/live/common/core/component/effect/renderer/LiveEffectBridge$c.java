package com.kuaishou.live.common.core.component.effect.renderer.LiveEffectBridge$c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveEffectBridge$c implements g	// class@0010e8
{
    public static final LiveEffectBridge$c b;

    static {
       LiveEffectBridge$c.b = new LiveEffectBridge$c();
    }
    public void LiveEffectBridge$c(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEffectBridge$c.class, "1")) {
       }else {
          b.c0(LiveLogTag.LIVE_ABILITY, "sendMessage timer exception", "msg", p0.getMessage());
       }
       return;
    }
}
