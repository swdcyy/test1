package com.kwai.video.wayne.player.config.ks_sub.CommonConfig;
import com.kwai.video.wayne.player.config.inerface.CommonConfigInterface;
import com.kwai.video.wayne.player.config.ks_sub.AbstractBaseConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.wayne.player.config.ks_sub.KpMidConfigManager;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.CharSequence;

public class CommonConfig extends AbstractBaseConfig implements CommonConfigInterface	// class@000cf0
{
    public int cacheSocketBufKB;
    public int enableAsyncStreamOpen;
    public int fadeinEndTimeMs;
    public String hevcCodecName;
    public int maxBufferDurMs;
    public String mediacodecDecodeTypeStr;
    public int useAudioGain;
    public int vodLowDevice;

    public void CommonConfig(){
       super();
       this.mediacodecDecodeTypeStr = "";
       this.enableAsyncStreamOpen = -1;
       this.hevcCodecName = "libks265dec";
       this.useAudioGain = -1;
       this.vodLowDevice = 0;
       this.maxBufferDurMs = 0xea60;
       this.fadeinEndTimeMs = -1;
       this.cacheSocketBufKB = -1;
    }
    public static CommonConfig getConfig(){
       CommonConfig uCommonConfi = CommonConfig.class;
       Object obj = PatchProxy.apply(null, null, uCommonConfi, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KpMidConfigManager.instance().getConfig("CommonConfig", uCommonConfi);
    }
    public boolean enableAsyncStreamOpen(){
       boolean b = (this.enableAsyncStreamOpen > null)? true: false;
       return b;
    }
    public int getCacheSocketBufKB(){
       return this.cacheSocketBufKB;
    }
    public int getFadeinEndTimeMs(){
       return this.fadeinEndTimeMs;
    }
    public int getMaxBufferDurMs(){
       return this.maxBufferDurMs;
    }
    public String getMediacodecDecodeTypeStr(){
       return this.mediacodecDecodeTypeStr;
    }
    public String getPrefKey(){
       return "CommonConfig";
    }
    public int getVodLowDevice(){
       return this.vodLowDevice;
    }
    public boolean isEnabledByMediaCodecType(int p0,int p1){
       CommonConfig uCommonConfi = CommonConfig.class;
       if (PatchProxy.isSupport(uCommonConfi)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uCommonConfi, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 == 1 || p0 == 2) {
          if (p1 == 1) {
             return (this.mediacodecDecodeTypeStr).contains("v264");
          }else if(p1 == 2){
             return (this.mediacodecDecodeTypeStr).contains("v265");
          }
       }else if(p0 == 3){
          if (p1 == 1) {
             return (this.mediacodecDecodeTypeStr).contains("v264");
          }else if(p1 == 2){
             return (this.mediacodecDecodeTypeStr).contains("v265");
          }
       }
       return false;
    }
    public boolean useAudioGain(){
       boolean b = (this.useAudioGain > null)? true: false;
       return b;
    }
}
