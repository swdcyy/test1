package com.kwai.video.wayne.player.config.ks_sub.UnifiedDccAlgConfig$1;
import com.kwai.video.wayne.player.config.impl.DefaultConfigImplBuilder$UnifiedDccAlgConfigGetter;
import java.lang.Object;
import com.kwai.video.wayne.player.config.ks_sub.UnifiedDccAlgConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.wayne.player.config.ks_sub.InjectConfig;

public final class UnifiedDccAlgConfig$1 implements DefaultConfigImplBuilder$UnifiedDccAlgConfigGetter	// class@000d02
{

    public void UnifiedDccAlgConfig$1(){
       super();
    }
    public UnifiedDccAlgConfig getUnifiedDccAlgConfig(int p0){
       UnifiedDccAlgConfig$1 u1 = UnifiedDccAlgConfig$1.class;
       if (PatchProxy.isSupport(u1)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, u1, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == 1) {
          return InjectConfig.getConfig().getUnifiedDccAlgConfig();
       }else {
          return null;
       }
    }
}
