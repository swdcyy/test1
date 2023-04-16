package com.kuaishou.live.effect.rescue.LiveEffectTaskSurvivorPool;
import com.kuaishou.live.effect.rescue.LiveEffectTaskSurvivorPool$a;
import java.lang.Object;
import com.kuaishou.live.effect.rescue.LiveEffectTaskSurvivorPool$FIFOTaskSurvivorCache;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public class LiveEffectTaskSurvivorPool	// class@001b1c
{
    public final LiveEffectTaskSurvivorPool$FIFOTaskSurvivorCache a;

    public void LiveEffectTaskSurvivorPool(int p0,LiveEffectTaskSurvivorPool$a p1){
       super();
       this.a = new LiveEffectTaskSurvivorPool$FIFOTaskSurvivorCache(p0, p1);
    }
    public synchronized List a(long p0){
       LiveEffectTaskSurvivorPool liveEffectTa = LiveEffectTaskSurvivorPool.class;
       if (PatchProxy.isSupport(liveEffectTa)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, liveEffectTa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.dequeueTasksByMagicFaceId(p0);
    }
}
