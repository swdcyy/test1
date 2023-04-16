package com.kwai.video.wayne.player.config.ks_sub.DccOptConfig$1;
import com.kwai.video.wayne.player.config.impl.DefaultConfigImplBuilder$DccOptConfigGetter;
import java.lang.Object;
import com.kwai.video.wayne.player.config.ks_sub.DccOptConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.wayne.player.config.ks_sub.InjectConfig;

public final class DccOptConfig$1 implements DefaultConfigImplBuilder$DccOptConfigGetter	// class@000cf3
{

    public void DccOptConfig$1(){
       super();
    }
    public DccOptConfig getDccOptConfig(int p0){
       DccOptConfig$1 u1 = DccOptConfig$1.class;
       if (PatchProxy.isSupport(u1)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, u1, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return InjectConfig.getConfig().getDccOptConfig();
    }
}
