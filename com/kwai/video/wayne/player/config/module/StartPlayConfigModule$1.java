package com.kwai.video.wayne.player.config.module.StartPlayConfigModule$1;
import com.kwai.video.wayne.player.config.module.StartPlayConfigModule$StartPlayConfigModuleGetter;
import java.lang.Object;
import com.kwai.video.wayne.player.config.module.StartPlayConfigModule;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public final class StartPlayConfigModule$1 implements StartPlayConfigModule$StartPlayConfigModuleGetter	// class@000d0a
{

    public void StartPlayConfigModule$1(){
       super();
    }
    public StartPlayConfigModule getStartPlayConfig(int p0,boolean p1){
       if (PatchProxy.isSupport(StartPlayConfigModule$1.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, StartPlayConfigModule$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new StartPlayConfigModule();
    }
}
