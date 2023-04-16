package com.kwai.video.wayne.player.config.ks_sub.AbTestConfig;
import com.kwai.video.wayne.player.config.inerface.AbTestConfigInterface;
import com.kwai.video.wayne.player.config.ks_sub.AbstractBaseConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.wayne.player.config.ks_sub.KpMidConfigManager;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.video.wayne.player.config.ks_sub.InjectConfig;

public class AbTestConfig extends AbstractBaseConfig implements AbTestConfigInterface	// class@000ce9
{
    public String audioStr;
    public int enableClipVodH264CheckSlideConfig;
    public int enableClipVodH265CheckSlideConfig;
    public boolean enableMediaCodecDummySurface;
    public boolean enableSoftwareDecodeLimit;
    public int forTest;
    public int maxBufBspMs;
    public int maxBufStrategy;
    public int maxBufStrategyForSlide;
    public int pdStartPlayMaxMs;
    public int pdStartPlayMaxMsSlide;
    public int pdStartPlayTh;
    public int pdStartPlayThSlide;
    public int softwareDecodeFpsLimit;
    public int softwareDecodeHeightLimit;
    public int softwareDecodeWidthLimit;
    public int videoPictureQueueSize;
    public int vodEnableAvSyncOpt;
    public String vodKs265Params;

    public void AbTestConfig(){
       super();
       this.forTest = -1;
       this.vodKs265Params = "";
       this.audioStr = "0";
       this.vodEnableAvSyncOpt = -1;
       this.enableClipVodH265CheckSlideConfig = -1;
       this.enableClipVodH264CheckSlideConfig = -1;
       this.enableMediaCodecDummySurface = false;
       this.videoPictureQueueSize = 3;
       this.enableSoftwareDecodeLimit = false;
       this.softwareDecodeWidthLimit = 1600;
       this.softwareDecodeHeightLimit = 1600;
       this.softwareDecodeFpsLimit = 30;
       this.pdStartPlayTh = 1000;
       this.pdStartPlayMaxMs = 2000;
       this.maxBufStrategy = 0;
       this.maxBufBspMs = 0x1d4c0;
       this.pdStartPlayThSlide = 850;
       this.pdStartPlayMaxMsSlide = 1700;
       this.maxBufStrategyForSlide = 1;
    }
    public static AbTestConfig getConfig(){
       AbTestConfig uAbTestConfi = AbTestConfig.class;
       Object obj = PatchProxy.apply(null, null, uAbTestConfi, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KpMidConfigManager.instance().getConfig("AbTestConfig", uAbTestConfi);
    }
    public boolean enableClipsCheckSlideConfig(int p0,int p1){
       AbTestConfig uAbTestConfi = AbTestConfig.class;
       if (PatchProxy.isSupport(uAbTestConfi)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uAbTestConfi, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (p0 == 1) {
          if (p1 == 1) {
             if (this.enableClipVodH264CheckSlideConfig > null) {
                b = true;
             }
             return b;
          }else if(p1 == 2){
             if (this.enableClipVodH265CheckSlideConfig > null) {
                b = true;
             }
             return b;
          }
       }else if(p0 == 2){
          if (p1 == 1) {
             return InjectConfig.getConfig().getClipHls264EnableMediacodec();
          }else if(p1 == 2){
             return InjectConfig.getConfig().getClipHls265EnableMediacodec();
          }
       }
       return b;
    }
    public String getAudioStr(){
       return this.audioStr;
    }
    public int getEnableClipVodH264CheckSlideConfig(){
       return this.enableClipVodH264CheckSlideConfig;
    }
    public int getEnableClipVodH265CheckSlideConfig(){
       return this.enableClipVodH265CheckSlideConfig;
    }
    public int getMaxBufBspMs(){
       return this.maxBufBspMs;
    }
    public int getMaxBufStrategy(){
       return this.maxBufStrategy;
    }
    public int getMaxBufStrategyForSlide(){
       return this.maxBufStrategyForSlide;
    }
    public int getPdStartPlayMaxMs(){
       return this.pdStartPlayMaxMs;
    }
    public int getPdStartPlayMaxMsSlide(){
       return this.pdStartPlayMaxMsSlide;
    }
    public int getPdStartPlayTh(){
       return this.pdStartPlayTh;
    }
    public int getPdStartPlayThSlide(){
       return this.pdStartPlayThSlide;
    }
    public String getPrefKey(){
       return "AbTestConfig";
    }
    public int getSoftwareDecodeFpsLimit(){
       return this.softwareDecodeFpsLimit;
    }
    public int getSoftwareDecodeHeightLimit(){
       return this.softwareDecodeHeightLimit;
    }
    public int getSoftwareDecodeWidthLimit(){
       return this.softwareDecodeWidthLimit;
    }
    public int getVideoPictureQueueSize(){
       return this.videoPictureQueueSize;
    }
    public String getVodKs265Params(){
       return this.vodKs265Params;
    }
    public boolean isEnableMediaCodecDummySurface(){
       return this.enableMediaCodecDummySurface;
    }
    public boolean isEnableSoftwareDecodeLimit(){
       return this.enableSoftwareDecodeLimit;
    }
    public boolean isVodEnableAvSyncOpt(){
       boolean b = (this.vodEnableAvSyncOpt > null)? true: false;
       return b;
    }
}
