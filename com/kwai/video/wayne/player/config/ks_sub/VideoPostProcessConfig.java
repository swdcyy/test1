package com.kwai.video.wayne.player.config.ks_sub.VideoPostProcessConfig;
import com.kwai.video.wayne.player.config.inerface.VideoPostProcessConfigInterface;
import com.kwai.video.wayne.player.config.ks_sub.AbstractBaseConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.wayne.player.config.ks_sub.KpMidConfigManager;
import java.lang.Number;
import com.kwai.video.wayne.player.KpMidLocalDebugConfig;

public class VideoPostProcessConfig extends AbstractBaseConfig implements VideoPostProcessConfigInterface	// class@000d04
{
    public int enableFrc;
    public int enableVppBits;
    public float limitFpsMaxInput;

    public void VideoPostProcessConfig(){
       super();
       this.enableVppBits = 0;
       this.enableFrc = 0;
       this.limitFpsMaxInput = 0;
    }
    public static VideoPostProcessConfig getConfig(){
       VideoPostProcessConfig videoPostPro = VideoPostProcessConfig.class;
       Object obj = PatchProxy.apply(null, null, videoPostPro, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KpMidConfigManager.instance().getConfig("VideoPostProcessConfig", videoPostPro);
    }
    public int getEnableFrc(){
       return this.enableFrc;
    }
    public int getEnableVppBits(){
       return this.enableVppBits;
    }
    public float getLimitFpsMaxInput(){
       return this.limitFpsMaxInput;
    }
    public String getPrefKey(){
       return "VideoPostProcessConfig";
    }
    public int getVppEnableBits(){
       Object obj = PatchProxy.apply(null, this, VideoPostProcessConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int kwaivppBits = KpMidLocalDebugConfig.getKwaivppBits();
       if (kwaivppBits > 0) {
          return kwaivppBits;
       }
       return this.enableVppBits;
    }
    public int getVppEnableFrc(){
       return this.enableFrc;
    }
    public float getVppLimitFpsMaxInput(){
       Object obj = PatchProxy.apply(null, this, VideoPostProcessConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       int kwaivppBits = KpMidLocalDebugConfig.getKwaivppBits();
       if (kwaivppBits > 0) {
          return (float)kwaivppBits;
       }
       return this.limitFpsMaxInput;
    }
}
