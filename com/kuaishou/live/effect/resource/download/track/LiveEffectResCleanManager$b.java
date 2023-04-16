package com.kuaishou.live.effect.resource.download.track.LiveEffectResCleanManager$b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveEffectResCleanManager$b implements g	// class@001b4f
{
    public static final LiveEffectResCleanManager$b b;

    static {
       LiveEffectResCleanManager$b.b = new LiveEffectResCleanManager$b();
    }
    public void LiveEffectResCleanManager$b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEffectResCleanManager$b.class, "1")) {
       }else {
          b.I(LiveLogTag.LIVE_EFFECT_RESOURCE_CLEAN, "updateDownloadInfo", p0);
       }
       return;
    }
}
