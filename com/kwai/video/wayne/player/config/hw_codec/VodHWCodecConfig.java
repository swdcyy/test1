package com.kwai.video.wayne.player.config.hw_codec.VodHWCodecConfig;
import java.lang.Object;
import com.kwai.video.wayne.player.config.hw_codec.VodMediaCodecConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public class VodHWCodecConfig	// class@000ccc
{
    public int heightLimit264Hw;
    public int heightLimit265Hw;
    public int useHls264Hw;
    public int useHls265Hw;
    public int useVod264Hw;
    public int useVod265Hw;
    public int vodMaxCnt;
    public int widthLimit264Hw;
    public int widthLimit265Hw;

    public void VodHWCodecConfig(){
       super();
       this.vodMaxCnt = 1;
       this.heightLimit264Hw = 2160;
       this.heightLimit265Hw = 2160;
       this.widthLimit264Hw = 1920;
       this.widthLimit265Hw = 1920;
       this.useVod264Hw = 0;
       this.useVod265Hw = 0;
       this.useHls264Hw = 0;
       this.useHls265Hw = 0;
    }
    public VodMediaCodecConfig getHWCodecConfig(boolean p0){
       VodMediaCodecConfig obj;
       boolean b1;
       VodHWCodecConfig vodHWCodecCo = VodHWCodecConfig.class;
       if (PatchProxy.isSupport(vodHWCodecCo)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, vodHWCodecCo, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new VodMediaCodecConfig();
       obj.mediaCodecMaxNum = this.vodMaxCnt;
       boolean b = false;
       if (p0) {
          if (this.useHls264Hw == 1) {
          label_002f :
             b1 = true;
          label_0032 :
             obj.supportAvcMediaCodec = b1;
             if (p0) {
                if (this.useHls265Hw == 1) {
                label_003f :
                   b = true;
                }
             }else if(this.useVod265Hw == 1){
                goto label_003f ;
             }
             obj.supportHevcMediaCodec = b;
             if (b1) {
                obj.mediaCodecAvcHeightLimit = this.heightLimit264Hw;
                obj.mediaCodecAvcWidthLimit = this.widthLimit264Hw;
             }
             if (b) {
                obj.mediaCodecHevcWidthLimit = this.widthLimit265Hw;
                obj.mediaCodecHevcHeightLimit = this.heightLimit265Hw;
             }
             return obj;
          }
       }else if(this.useVod264Hw == 1){
          goto label_002f ;
       }
       b1 = false;
       goto label_0032 ;
    }
}
