package com.kwai.video.wayne.player.config.ks_sub.DccAlgSubConfig$1;
import com.kwai.video.wayne.player.config.impl.DefaultConfigImplBuilder$DccAlgSubConfigGetter;
import java.lang.Object;
import com.kwai.video.wayne.player.config.ks_sub.DccAlgSubConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.wayne.player.config.ks_sub.InjectConfig;
import com.kwai.video.wayne.player.config.ks_sub.SegmentConfig;

public final class DccAlgSubConfig$1 implements DefaultConfigImplBuilder$DccAlgSubConfigGetter	// class@000cf1
{

    public void DccAlgSubConfig$1(){
       super();
    }
    public DccAlgSubConfig getDccAlgSubConfig(int p0){
       DccAlgSubConfig$1 u1 = DccAlgSubConfig$1.class;
       if (PatchProxy.isSupport(u1)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, u1, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == 2) {
          return InjectConfig.getConfig().getSegmentConfig().dccAlgConfig;
       }else {
          return DccAlgSubConfig.getConfig();
       }
    }
}
