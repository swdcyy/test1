package com.kwai.video.wayne.player.config.ks_sub.HwCodecConfig;
import com.kwai.video.wayne.player.config.ks_sub.AbstractBaseConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.wayne.player.config.ks_sub.KpMidConfigManager;

public class HwCodecConfig extends AbstractBaseConfig	// class@000cf6
{
    public int heightLimit264Hw;
    public int heightLimit265Hw;
    public int liveMaxCnt;
    public int resolutionLimit264Hw;
    public int resolutionLimit265Hw;
    public int vodMaxCnt;
    public int widthLimit264Hw;
    public int widthLimit265Hw;

    public void HwCodecConfig(){
       super();
       this.liveMaxCnt = 1;
       this.vodMaxCnt = 1;
       this.heightLimit264Hw = -1;
       this.heightLimit265Hw = -1;
       this.widthLimit264Hw = -1;
       this.widthLimit265Hw = -1;
       this.resolutionLimit264Hw = -1;
       this.resolutionLimit265Hw = -1;
    }
    public static HwCodecConfig getConfig(){
       HwCodecConfig hwCodecConfi = HwCodecConfig.class;
       Object obj = PatchProxy.apply(null, null, hwCodecConfi, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KpMidConfigManager.instance().getConfig("HwCodecConfig", hwCodecConfi);
    }
    public int getHeightLimit264Hw(){
       return this.heightLimit264Hw;
    }
    public int getHeightLimit265Hw(){
       return this.heightLimit265Hw;
    }
    public int getLiveMaxCnt(){
       HwCodecConfig tliveMaxCnt = this.liveMaxCnt;
       if (tliveMaxCnt > null) {
       }else {
          tliveMaxCnt = 1;
       }
       return tliveMaxCnt;
    }
    public String getPrefKey(){
       return "HwCodecConfig";
    }
    public int getResolutionLimit264Hw(){
       return this.resolutionLimit264Hw;
    }
    public int getResolutionLimit265Hw(){
       return this.resolutionLimit265Hw;
    }
    public int getVodMaxCnt(){
       HwCodecConfig tvodMaxCnt = this.vodMaxCnt;
       if (tvodMaxCnt > null) {
       }else {
          tvodMaxCnt = 1;
       }
       return tvodMaxCnt;
    }
    public int getWidthLimit264Hw(){
       return this.widthLimit264Hw;
    }
    public int getWidthLimit265Hw(){
       return this.widthLimit265Hw;
    }
}
