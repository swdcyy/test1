package com.kwai.video.wayne.player.config.ks_sub.AzerothCommonConfig;
import com.kwai.video.wayne.player.config.ks_sub.AbstractBaseConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.wayne.player.config.ks_sub.KpMidConfigManager;

public class AzerothCommonConfig extends AbstractBaseConfig	// class@000ced
{
    public int abrDeviceInfoFactor;
    public double deviceGeneralScore;

    public void AzerothCommonConfig(){
       super();
       this.abrDeviceInfoFactor = 0;
       this.deviceGeneralScore = 0;
    }
    public static AzerothCommonConfig getConfig(){
       AzerothCommonConfig uAzerothComm = AzerothCommonConfig.class;
       Object obj = PatchProxy.apply(null, null, uAzerothComm, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KpMidConfigManager.instance().getConfig("AzerothCommonConfig", uAzerothComm);
    }
    public int getAbrDeviceInfoFactor(){
       return this.abrDeviceInfoFactor;
    }
    public double getDeviceGeneralScore(){
       return this.deviceGeneralScore;
    }
    public String getPrefKey(){
       return "AzerothCommonConfig";
    }
}
