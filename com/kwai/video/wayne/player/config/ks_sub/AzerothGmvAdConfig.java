package com.kwai.video.wayne.player.config.ks_sub.AzerothGmvAdConfig;
import com.kwai.video.wayne.player.config.ks_sub.AbstractBaseConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.wayne.player.config.ks_sub.KpMidConfigManager;

public class AzerothGmvAdConfig extends AbstractBaseConfig	// class@000cee
{
    public int userAdUplift;
    public int userAdValue;
    public int userGmvUplift;
    public int userGmvValue;

    public void AzerothGmvAdConfig(){
       super();
       this.userGmvValue = 1;
       this.userGmvUplift = 0;
       this.userAdValue = 1;
       this.userAdUplift = 0;
    }
    public static AzerothGmvAdConfig getConfig(){
       AzerothGmvAdConfig uAzerothGmvA = AzerothGmvAdConfig.class;
       Object obj = PatchProxy.apply(null, null, uAzerothGmvA, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KpMidConfigManager.instance().getConfig("AzerothGmvAdConfig", uAzerothGmvA);
    }
    public String getPrefKey(){
       return "AzerothGmvAdConfig";
    }
    public int getUserAdUplift(){
       return this.userAdUplift;
    }
    public int getUserAdValue(){
       return this.userAdValue;
    }
    public int getUserGmvUplift(){
       return this.userGmvUplift;
    }
    public int getUserGmvValue(){
       return this.userGmvValue;
    }
}
