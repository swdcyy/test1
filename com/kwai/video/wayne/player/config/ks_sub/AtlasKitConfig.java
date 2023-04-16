package com.kwai.video.wayne.player.config.ks_sub.AtlasKitConfig;
import com.kwai.video.wayne.player.config.inerface.AtlasKitConfigInterface;
import java.lang.Object;

public class AtlasKitConfig implements AtlasKitConfigInterface	// class@000ceb
{
    public double hardDecodeKvcHevcBitrateThres;
    public double hardDecodeKvcHevcBitrateThresForCharging;

    public void AtlasKitConfig(){
       super();
       this.hardDecodeKvcHevcBitrateThres = 0;
       this.hardDecodeKvcHevcBitrateThresForCharging = 0;
    }
    public double getHardDecodeKvcHevcBitrateThres(){
       return this.hardDecodeKvcHevcBitrateThres;
    }
    public double getHardDecodeKvcHevcBitrateThresForCharging(){
       return this.hardDecodeKvcHevcBitrateThresForCharging;
    }
}
