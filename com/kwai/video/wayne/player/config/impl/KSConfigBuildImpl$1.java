package com.kwai.video.wayne.player.config.impl.KSConfigBuildImpl$1;
import com.kwai.video.wayne.player.config.impl.DefaultConfigImplBuilder$HwConfigGetter;
import java.lang.Object;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.video.wayne.player.config.hw_codec.VodMediaCodecConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.wayne.player.config.ks_sub.InjectConfig;
import ai7.d;
import com.kwai.video.wayne.player.config.ks_sub.AzerothHwCodecConfig;
import com.kwai.video.wayne.player.config.ks_sub.CommonConfig;
import com.kwai.video.wayne.player.config.ks_sub.AbTestConfig;
import java.lang.StringBuilder;
import com.kwai.video.wayne.player.util.DebugLog;
import com.kwai.video.wayne.player.util.VodPlayerUtils;
import com.kwai.video.wayne.player.config.ks_sub.SlideConfig;
import com.kwai.video.wayne.player.config.ks_sub.HwCodecConfig;

public final class KSConfigBuildImpl$1 implements DefaultConfigImplBuilder$HwConfigGetter	// class@000cd5
{

    public void KSConfigBuildImpl$1(){
       super();
    }
    public VodMediaCodecConfig getHwConfig(WayneBuildData p0,boolean p1,boolean p2){
       CommonConfig obj;
       AzerothHwCodecConfig this;
       boolean b2;
       int b3;
       VodMediaCodecConfig vodMediaCode;
       if (PatchProxy.isSupport(KSConfigBuildImpl$1.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, KSConfigBuildImpl$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int b = false;
       boolean booleanx = InjectConfig.getConfig().getSwitchProvider().getBoolean("enableHWForDefaultPolicy", b);
       boolean booleanx1 = InjectConfig.getConfig().getSwitchProvider().getBoolean("wayne_use_azeroth_hwconfig", b);
       boolean b1 = (booleanx)? false: p2;
       this = AzerothHwCodecConfig.getConfig();
       int i = 2;
       int i1 = 1;
       if (booleanx1 && this.getUseDevicePersona()) {
          obj = CommonConfig.getConfig();
          booleanx1 = (p1)? 2: 1;
          booleanx = obj.isEnabledByMediaCodecType(booleanx1, i1);
          AbTestConfig config = AbTestConfig.getConfig();
          int i2 = (p1)? 2: 1;
          booleanx1 = config.enableClipsCheckSlideConfig(i2, i1);
          if (p1) {
             if (this.useHls264Hw > null) {
             label_007c :
                i2 = 1;
             label_007f :
                if (b1) {
                   b2 = (booleanx || (booleanx1 && i2))? true: false;
                }else {
                   b2 = i2;
                }
                AzerothHwCodecConfig widthLimit26 = this.widthLimit264Hw;
                AzerothHwCodecConfig heightLimit2 = this.heightLimit264Hw;
                obj = CommonConfig.getConfig();
                booleanx1 = (p1)? 2: 1;
                booleanx = obj.isEnabledByMediaCodecType(booleanx1, i);
                config = AbTestConfig.getConfig();
                i2 = (p1)? 2: 1;
                booleanx1 = config.enableClipsCheckSlideConfig(i2, i);
                if (p1) {
                   if (this.useHls265Hw > null) {
                   label_00b6 :
                      i = 1;
                   label_00b9 :
                      if (b1) {
                         b3 = (booleanx || (booleanx1 && i))? true: false;
                      }else {
                         b3 = i;
                      }
                      vodMediaCode = new VodMediaCodecConfig(false, b2, widthLimit26, heightLimit2, b3, this.widthLimit265Hw, this.heightLimit265Hw, this.vodMaxCnt);
                      DebugLog.i("KSConfigBuildImpl", "useAzerothHwConfig "+booleanx1.toString());
                      return booleanx1;
                   }
                }else if(this.useVod265Hw > null){
                   goto label_00b6 ;
                }
                i = 0;
                goto label_00b9 ;
             }
          }else if(this.useVod264Hw > null){
             goto label_007c ;
          }
          vodMediaCode = 0;
          goto label_007f ;
       }else if(VodPlayerUtils.isKirin() && VodPlayerUtils.isEmui()){
          booleanx1 = true;
       }else {
          booleanx1 = false;
       }
       boolean booleanx2 = InjectConfig.getConfig().getSwitchProvider().getBoolean("enable_kirin_hw_for_latest_version", b);
       String str = InjectConfig.getConfig().getSwitchProvider().getString("kirin_emui_latest_version", "3.0.0.202");
       CommonConfig config1 = CommonConfig.getConfig();
       int i3 = (p1)? 2: 1;
       boolean b4 = config1.isEnabledByMediaCodecType(i3, i1);
       AbTestConfig config2 = AbTestConfig.getConfig();
       boolean i4 = (p1)? 2: 1;
       i3 = config2.enableClipsCheckSlideConfig(i4, i1);
       SlideConfig config3 = SlideConfig.getConfig();
       b3 = (p1)? 2: 1;
       i4 = config3.isUseHw(b3, i1);
       if (b1) {
          config3 = (b4 || (i3 && i4))? 1: 0;
       }
    label_014f :
       HwCodecConfig widthLimit261 = HwCodecConfig.getConfig().widthLimit264Hw;
       HwCodecConfig heightLimit21 = HwCodecConfig.getConfig().heightLimit264Hw;
       config1 = CommonConfig.getConfig();
       i3 = (p1)? 2: 1;
       b4 = config1.isEnabledByMediaCodecType(i3, i);
       config2 = AbTestConfig.getConfig();
       int i5 = (p1)? 2: 1;
       i3 = config2.enableClipsCheckSlideConfig(i5, i);
       SlideConfig config4 = SlideConfig.getConfig();
       b = (p1)? 2: 1;
       b = config4.isUseHw(b, i);
       if (b1) {
          if (!b4 && (!i3 || !b)) {
             i1 = 0;
          }
       }else {
          i1 = b;
       }
       HwCodecConfig widthLimit262 = HwCodecConfig.getConfig().widthLimit265Hw;
       HwCodecConfig heightLimit22 = HwCodecConfig.getConfig().heightLimit265Hw;
       HwCodecConfig vodMaxCnt = HwCodecConfig.getConfig().vodMaxCnt;
       if (booleanx2 && (booleanx1 && (!str.isEmpty() && VodPlayerUtils.isEmuiPreviousVersion(str)))) {
          DebugLog.i("KSConfigBuildImpl", "disable kirin hw for previous version.");
          i1 = 0;
          i3 = false;
       }else {
          i3 = config3;
       }
       VodMediaCodecConfig vodMediaCode1 = new VodMediaCodecConfig(false, i3, widthLimit261, heightLimit21, i1, widthLimit262, heightLimit22, vodMaxCnt);
       DebugLog.i("KSConfigBuildImpl", "useKswtich  cur_isDoubleColumn "+b1+"enableHWForDefaultPolicy "+booleanx+booleanx1.toString());
       return booleanx1;
    }
}
