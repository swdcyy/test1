package com.kwai.video.aemonplayer.surface.KwaiGpuContextFactory;
import java.lang.Object;
import com.kwai.video.aemonplayer.surface.KwaiGpuContext;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.aemonplayer.surface.KwaiSharedGpuContext;
import com.kwai.video.aemonplayer.surface.KwaiSimpleGpuContext;

public class KwaiGpuContextFactory	// class@0019de
{

    public void KwaiGpuContextFactory(){
       super();
    }
    public static KwaiGpuContext createEGL14(boolean p0){
       KwaiGpuContextFactory kwaiGpuConte = KwaiGpuContextFactory.class;
       if (PatchProxy.isSupport(kwaiGpuConte)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), null, kwaiGpuConte, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0) {
          return KwaiSharedGpuContext.init();
       }else {
          return new KwaiSimpleGpuContext();
       }
    }
}
