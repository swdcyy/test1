package com.kwai.video.wayne.player.config.ks_sub.DccAlgSubConfig;
import com.kwai.video.wayne.player.config.inerface.DccAlgSubConfigInterface;
import com.kwai.video.wayne.player.config.ks_sub.AbstractBaseConfig;
import com.kwai.video.wayne.player.config.ks_sub.DccAlgSubConfig$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.wayne.player.config.ks_sub.KpMidConfigManager;

public class DccAlgSubConfig extends AbstractBaseConfig implements DccAlgSubConfigInterface	// class@000cf2
{
    public int dccMBTh_10;
    public int dccPreReadMs;
    public boolean enableDccAlg;
    public static DefaultConfigImplBuilder$DccAlgSubConfigGetter KsDccAlgSubConfigGetter;

    static {
       DccAlgSubConfig.KsDccAlgSubConfigGetter = new DccAlgSubConfig$1();
    }
    public void DccAlgSubConfig(){
       super();
       this.enableDccAlg = true;
       this.dccMBTh_10 = 100;
       this.dccPreReadMs = 5000;
    }
    public static DccAlgSubConfig getConfig(){
       DccAlgSubConfig uDccAlgSubCo = DccAlgSubConfig.class;
       Object obj = PatchProxy.apply(null, null, uDccAlgSubCo, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KpMidConfigManager.instance().getConfig("DccAlgSubConfig", uDccAlgSubCo);
    }
    public int getDccMBTh_10(){
       return this.dccMBTh_10;
    }
    public int getDccPreReadMs(){
       return this.dccPreReadMs;
    }
    public String getPrefKey(){
       return "DccAlgSubConfig";
    }
    public boolean isEnableDccAlg(){
       return this.enableDccAlg;
    }
}
