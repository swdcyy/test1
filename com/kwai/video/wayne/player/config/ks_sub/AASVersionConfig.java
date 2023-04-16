package com.kwai.video.wayne.player.config.ks_sub.AASVersionConfig;
import java.lang.Object;

public class AASVersionConfig	// class@000ce8
{
    public int aasParseVer;
    public int kvcBitrateThres;
    public int kvcBitrateThresForCharging;
    public int normalBitrateThres;
    public int normalBitrateThresForCharging;
    public int postBitrateThres;
    public int postBitrateThresForCharging;

    public void AASVersionConfig(){
       super();
       this.aasParseVer = 2;
       this.postBitrateThres = 85;
       this.postBitrateThresForCharging = 100;
       this.kvcBitrateThres = 85;
       this.kvcBitrateThresForCharging = 100;
       this.normalBitrateThres = 100;
       this.normalBitrateThresForCharging = 100;
    }
}
