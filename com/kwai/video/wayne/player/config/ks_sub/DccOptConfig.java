package com.kwai.video.wayne.player.config.ks_sub.DccOptConfig;
import com.kwai.video.wayne.player.config.inerface.DccOptConfigInterface;
import com.kwai.video.wayne.player.config.ks_sub.DccOptConfig$1;
import java.lang.Object;

public class DccOptConfig implements DccOptConfigInterface	// class@000cf4
{
    public int bufferLowRatioTh_10;
    public int bufferLowRatioTh_10_ForHls;
    public boolean enableHlsDccOpt;
    public boolean enableVodDccOpt;
    public int firstHighBufferMs;
    public int firstHighBufferMsForHls;
    public boolean useVodAdaptive;
    public static DefaultConfigImplBuilder$DccOptConfigGetter KsDccOptConfigGetter;

    static {
       DccOptConfig.KsDccOptConfigGetter = new DccOptConfig$1();
    }
    public void DccOptConfig(){
       super();
       this.enableVodDccOpt = true;
       this.enableHlsDccOpt = true;
       this.bufferLowRatioTh_10 = 8;
       this.firstHighBufferMs = 0x2710;
       this.bufferLowRatioTh_10_ForHls = 8;
       this.firstHighBufferMsForHls = 0x4e20;
       this.useVodAdaptive = false;
    }
    public int getBufferLowRatioTh_10(){
       return this.bufferLowRatioTh_10;
    }
    public int getBufferLowRatioTh_10_ForHls(){
       return this.bufferLowRatioTh_10_ForHls;
    }
    public int getFirstHighBufferMs(){
       return this.firstHighBufferMs;
    }
    public int getFirstHighBufferMs_ForHls(){
       return this.firstHighBufferMsForHls;
    }
    public boolean isEnableHlsDccOpt(){
       return this.enableHlsDccOpt;
    }
    public boolean isEnableVodDccOpt(){
       return this.enableVodDccOpt;
    }
    public boolean isUseVodAdaptive(){
       return this.useVodAdaptive;
    }
}
