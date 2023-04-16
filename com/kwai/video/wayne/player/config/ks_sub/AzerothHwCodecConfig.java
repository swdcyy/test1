package com.kwai.video.wayne.player.config.ks_sub.AzerothHwCodecConfig;
import com.kwai.video.wayne.player.config.ks_sub.AbstractBaseConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.wayne.player.config.ks_sub.KpMidConfigManager;
import java.lang.Integer;
import java.lang.Boolean;

public class AzerothHwCodecConfig extends AbstractBaseConfig	// class@000cef
{
    public int fadeinEndTimeMs;
    public int heightLimit264Hw;
    public int heightLimit265Hw;
    public int liveMaxCnt;
    public int useDevicePersona;
    public int useHls264Hw;
    public int useHls265Hw;
    public int useLive264Hw;
    public int useLive265Hw;
    public int useVod264Hw;
    public int useVod265Hw;
    public int vodMaxCnt;
    public int widthLimit264Hw;
    public int widthLimit265Hw;

    public void AzerothHwCodecConfig(){
       super();
       this.useDevicePersona = 0;
       this.vodMaxCnt = 1;
       this.liveMaxCnt = 0;
       this.heightLimit264Hw = -1;
       this.heightLimit265Hw = -1;
       this.widthLimit265Hw = -1;
       this.widthLimit264Hw = -1;
       this.fadeinEndTimeMs = 600;
       this.useLive265Hw = 0;
       this.useLive264Hw = 0;
       this.useVod264Hw = 0;
       this.useVod265Hw = 0;
       this.useHls264Hw = 0;
       this.useHls265Hw = 0;
    }
    public static AzerothHwCodecConfig getConfig(){
       AzerothHwCodecConfig uAzerothHwCo = AzerothHwCodecConfig.class;
       Object obj = PatchProxy.apply(null, null, uAzerothHwCo, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KpMidConfigManager.instance().getConfig("AzerothHwCodecConfig", uAzerothHwCo);
    }
    public int getHeightLimit264Hw(){
       return this.heightLimit264Hw;
    }
    public int getHeightLimit265Hw(){
       return this.heightLimit265Hw;
    }
    public int getLiveMaxCnt(){
       AzerothHwCodecConfig tliveMaxCnt = this.liveMaxCnt;
       if (tliveMaxCnt > null) {
       }else {
          tliveMaxCnt = 1;
       }
       return tliveMaxCnt;
    }
    public String getPrefKey(){
       return "AzerothHwCodecConfig";
    }
    public boolean getUseDevicePersona(){
       boolean b = true;
       if (b == this.useDevicePersona) {
       }else {
          b = false;
       }
       return b;
    }
    public final boolean getUseHls264HW(){
       boolean b = true;
       if (b == this.useHls264Hw) {
       }else {
          b = false;
       }
       return b;
    }
    public final boolean getUseHls265HW(){
       boolean b = true;
       if (b == this.useHls265Hw) {
       }else {
          b = false;
       }
       return b;
    }
    public boolean getUseLive264HW(){
       boolean b = true;
       if (b == this.useLive264Hw) {
       }else {
          b = false;
       }
       return b;
    }
    public final boolean getUseLive265HW(){
       boolean b = true;
       if (b == this.useLive265Hw) {
       }else {
          b = false;
       }
       return b;
    }
    public final boolean getUseVod264HW(){
       boolean b = true;
       if (b == this.useVod264Hw) {
       }else {
          b = false;
       }
       return b;
    }
    public final boolean getUseVod265HW(){
       boolean b = true;
       if (b == this.useVod265Hw) {
       }else {
          b = false;
       }
       return b;
    }
    public int getVodMaxCnt(){
       AzerothHwCodecConfig tvodMaxCnt = this.vodMaxCnt;
       if (tvodMaxCnt > null) {
       }else {
          tvodMaxCnt = 1;
       }
       return tvodMaxCnt;
    }
    public int getWidthLimit264Hw(){
       return this.widthLimit264Hw;
    }
    public int getWidthLimit265Hw(){
       return this.widthLimit265Hw;
    }
    public boolean isUseHw(int p0,int p1){
       AzerothHwCodecConfig uAzerothHwCo = AzerothHwCodecConfig.class;
       if (PatchProxy.isSupport(uAzerothHwCo)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uAzerothHwCo, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 == 1) {
          if (p1 == 1) {
             return this.getUseVod264HW();
          }else if(p1 == 2){
             return this.getUseVod265HW();
          }else {
             return false;
          }
       }else if(p0 == 2){
          if (p1 == 1) {
             return this.getUseHls264HW();
          }else if(p1 == 2){
             return this.getUseHls265HW();
          }else {
             return false;
          }
       }else if(p0 == 3){
          if (p1 == 1) {
             return this.getUseLive265HW();
          }else if(p1 == 2){
             return this.getUseLive265HW();
          }
       }
       return false;
    }
}
