package com.kwai.video.wayne.player.config.ks_sub.KwaiVPPConfig;
import java.lang.Object;

public class KwaiVPPConfig	// class@000cfb
{
    public long bits;
    public String ext;
    public float ext_sr_alpha;
    public long hardwareBits;
    public int limitBatteryCharging;
    public int limitBatteryLevel;
    public String limitBizType;
    public long limitFps;
    public long limitResolutionVideo;
    public long limitResolutionViewport;
    public long mode;

    public void KwaiVPPConfig(){
       super();
       this.mode = 0;
       this.bits = 0;
       this.hardwareBits = 0;
       this.limitFps = 0;
       this.limitResolutionVideo = 0;
       this.limitResolutionViewport = 0;
       this.limitBatteryCharging = 0;
       this.limitBatteryLevel = 0;
       this.limitBizType = "";
       this.ext = "";
       this.ext_sr_alpha = 0x3f99999a;
    }
}
