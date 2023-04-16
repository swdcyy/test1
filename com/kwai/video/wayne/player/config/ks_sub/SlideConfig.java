package com.kwai.video.wayne.player.config.ks_sub.SlideConfig;
import com.kwai.video.wayne.player.config.inerface.SlideConfigInterface;
import com.kwai.video.wayne.player.config.ks_sub.AbstractBaseConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.wayne.player.config.ks_sub.KpMidConfigManager;
import java.lang.Integer;
import java.lang.Boolean;

public class SlideConfig extends AbstractBaseConfig implements SlideConfigInterface	// class@000d00
{
    public int fadeinEndTimeMs;
    public int slidePlayPreLoadType;
    public int useHls264Hw;
    public int useHls265Hw;
    public int useLive264Hw;
    public int useLive265Hw;
    public int useVod264Hw;
    public int useVod265Hw;

    public void SlideConfig(){
       super();
       this.useLive264Hw = -1;
       this.useLive265Hw = -1;
       this.useVod264Hw = -1;
       this.useVod265Hw = -1;
       this.useHls264Hw = -1;
       this.useHls265Hw = -1;
       this.fadeinEndTimeMs = 600;
       this.slidePlayPreLoadType = 3;
    }
    public static SlideConfig getConfig(){
       SlideConfig slideConfig = SlideConfig.class;
       Object obj = PatchProxy.apply(null, null, slideConfig, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KpMidConfigManager.instance().getConfig("SlideConfig", slideConfig);
    }
    public int getFadeinEndTimeMs_slide(){
       return this.fadeinEndTimeMs;
    }
    public String getPrefKey(){
       return "SlideConfig";
    }
    public int getSlidePlayPreLoadType(){
       return this.slidePlayPreLoadType;
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
    public boolean isUseHw(int p0,int p1){
       SlideConfig slideConfig = SlideConfig.class;
       if (PatchProxy.isSupport(slideConfig)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, slideConfig, "2");
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
    public boolean slidePlayUsePreDecode(){
       boolean b = (this.slidePlayPreLoadType == 3)? true: false;
       return b;
    }
}
