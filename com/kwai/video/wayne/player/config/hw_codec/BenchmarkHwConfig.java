package com.kwai.video.wayne.player.config.hw_codec.BenchmarkHwConfig;
import java.lang.Object;
import com.kwai.video.wayne.player.config.hw_codec.VodMediaCodecConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class BenchmarkHwConfig	// class@000cca
{
    public int heightLimit264Hw;
    public int heightLimit265Hw;
    public int vodMaxCnt;
    public int widthLimit264Hw;
    public int widthLimit265Hw;

    public void BenchmarkHwConfig(){
       super();
       this.vodMaxCnt = 1;
       this.heightLimit264Hw = 0;
       this.heightLimit265Hw = 0;
       this.widthLimit264Hw = 0;
       this.widthLimit265Hw = 0;
    }
    public VodMediaCodecConfig getHWCodecConfig(){
       VodMediaCodecConfig obj = PatchProxy.apply(null, this, BenchmarkHwConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new VodMediaCodecConfig();
       obj.mediaCodecMaxNum = this.vodMaxCnt;
       BenchmarkHwConfig theightLimit = this.heightLimit264Hw;
       boolean b = true;
       boolean b1 = (theightLimit > null)? true: false;
       obj.supportAvcMediaCodec = b1;
       BenchmarkHwConfig theightLimit1 = this.heightLimit265Hw;
       if (theightLimit1 <= null) {
          b = false;
       }
       obj.supportHevcMediaCodec = b;
       if (b1) {
          obj.mediaCodecAvcHeightLimit = theightLimit;
          obj.mediaCodecAvcWidthLimit = this.widthLimit264Hw;
       }
       if (b) {
          obj.mediaCodecHevcWidthLimit = this.widthLimit265Hw;
          obj.mediaCodecHevcHeightLimit = theightLimit1;
       }
       return obj;
    }
}
