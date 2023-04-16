package com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$o;
import erd.g;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.post.api.feature.memory.MemoryStageEvent;
import com.kwai.feature.post.api.feature.memory.MemorySceneType;
import java.util.List;
import o69.c;
import nsd.u;
import com.kwai.feature.post.api.feature.memory.MemoryLogger;

public final class AICutAnnualMemoryProject$o implements g	// class@00195f
{
    public final AICutAnnualMemoryProject b;

    public void AICutAnnualMemoryProject$o(AICutAnnualMemoryProject p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AICutAnnualMemoryProject$o.class, "1")) {
       }else {
          MemorySceneType memorySceneT = this.b.V0();
          if (memorySceneT == null) {
             memorySceneT = MemorySceneType.AICUT_LOADING;
          }
          MemoryStageEvent memoryStageE = new MemoryStageEvent(memorySceneT, "memorykit", -1, null, 0, this.b.M().size(), false, p0.toString(), 88, null);
          MemoryLogger.c(v0);
       }
       return;
    }
}
