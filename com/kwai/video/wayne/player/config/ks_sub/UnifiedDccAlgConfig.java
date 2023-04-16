package com.kwai.video.wayne.player.config.ks_sub.UnifiedDccAlgConfig;
import com.kwai.video.wayne.player.config.inerface.UnifiedDccAlgConfigInterface;
import com.kwai.video.wayne.player.config.ks_sub.UnifiedDccAlgConfig$1;
import java.lang.Object;

public class UnifiedDccAlgConfig implements UnifiedDccAlgConfigInterface	// class@000d03
{
    public int bufferAdjustRatioTh_100;
    public int bufferLowRatioTh_100;
    public int bwAdjustRatioTh_100;
    public boolean enableUnifiedAlg;
    public int maxInitBufferDurMs;
    public int minInitBufferDurMs;
    public static DefaultConfigImplBuilder$UnifiedDccAlgConfigGetter KsUnifiedDccAlgConfigGetter;

    static {
       UnifiedDccAlgConfig.KsUnifiedDccAlgConfigGetter = new UnifiedDccAlgConfig$1();
    }
    public void UnifiedDccAlgConfig(){
       super();
       this.enableUnifiedAlg = true;
       this.bufferLowRatioTh_100 = 95;
       this.bufferAdjustRatioTh_100 = 600;
       this.bwAdjustRatioTh_100 = 0;
       this.maxInitBufferDurMs = 0x2710;
       this.minInitBufferDurMs = 3000;
    }
    public int getBufferAdjustRatioTh_100(){
       return this.bufferAdjustRatioTh_100;
    }
    public int getBufferLowRatioTh_100(){
       return this.bufferLowRatioTh_100;
    }
    public int getBwAdjustRatioTh_100(){
       return this.bwAdjustRatioTh_100;
    }
    public int getMaxInitBufferDurMs(){
       return this.maxInitBufferDurMs;
    }
    public int getMinInitBufferDurMs(){
       return this.minInitBufferDurMs;
    }
    public boolean isEnableUnifiedAlg(){
       return this.enableUnifiedAlg;
    }
}
