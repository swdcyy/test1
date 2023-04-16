package com.yxcorp.gifshow.detail.player.panel.config.SlidePlayerPanelConfig;
import java.io.Serializable;
import com.yxcorp.gifshow.detail.player.panel.config.SimplePlayerPanelElementConfig;
import com.yxcorp.gifshow.detail.player.panel.config.SpeedElementConfig;
import com.yxcorp.gifshow.detail.player.panel.config.SaveTrafficElementConfig;
import com.yxcorp.gifshow.detail.player.panel.config.SmallWindowElementConfig;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import com.kwai.feature.api.danmaku.DanmakuSwitchUtil;
import wh5.c;
import android.os.Build$VERSION;
import le5.f;
import ok.x;
import m3a.x;
import xf6.l;
import com.kuaishou.ug.deviceinfo.DeviceInfoManager;
import java.util.List;
import java.util.Collection;
import java.lang.StringBuilder;

public final class SlidePlayerPanelConfig implements Serializable	// class@001620
{
    public final SimplePlayerPanelElementConfig accessibilityElementConfig;
    public final SimplePlayerPanelElementConfig danmakuElementConfig;
    public final boolean enable;
    public final SimplePlayerPanelElementConfig mirrorElementConfig;
    public final SimplePlayerPanelElementConfig qualityElementConfig;
    public SaveTrafficElementConfig saveTrafficConfig;
    public SmallWindowElementConfig smallWindowConfig;
    public final SimplePlayerPanelElementConfig soundEffectElementConfig;
    public final SpeedElementConfig speedElementConfig;

    public void SlidePlayerPanelConfig(boolean p0,SimplePlayerPanelElementConfig p1,SimplePlayerPanelElementConfig p2,SimplePlayerPanelElementConfig p3,SimplePlayerPanelElementConfig p4,SpeedElementConfig p5,SimplePlayerPanelElementConfig p6,SaveTrafficElementConfig p7,SmallWindowElementConfig p8){
       super();
       this.enable = p0;
       this.danmakuElementConfig = p1;
       this.mirrorElementConfig = p2;
       this.accessibilityElementConfig = p3;
       this.qualityElementConfig = p4;
       this.speedElementConfig = p5;
       this.soundEffectElementConfig = p6;
       this.saveTrafficConfig = p7;
       this.smallWindowConfig = p8;
    }
    public void SlidePlayerPanelConfig(boolean p0,SimplePlayerPanelElementConfig p1,SimplePlayerPanelElementConfig p2,SimplePlayerPanelElementConfig p3,SimplePlayerPanelElementConfig p4,SpeedElementConfig p5,SimplePlayerPanelElementConfig p6,SaveTrafficElementConfig p7,SmallWindowElementConfig p8,int p9,u p10){
       int i = p9;
       int i1 = 0;
       int i2 = (i & 0x02)? i1: p1;
       int i3 = (i & 0x04)? i1: p2;
       int i4 = (i & 0x08)? i1: p3;
       int i5 = (i & 0x10)? i1: p4;
       int i6 = (i & 0x20)? i1: p5;
       int i7 = (i & 0x40)? i1: p6;
       int i8 = (i & 0x0080)? i1: p7;
       if (!(i & 0x0100)) {
          i1 = p8;
       }
       super(p0, i2, i3, i4, i5, i6, i7, i8, i1);
       return;
    }
    public static SlidePlayerPanelConfig copy$default(SlidePlayerPanelConfig p0,boolean p1,SimplePlayerPanelElementConfig p2,SimplePlayerPanelElementConfig p3,SimplePlayerPanelElementConfig p4,SimplePlayerPanelElementConfig p5,SpeedElementConfig p6,SimplePlayerPanelElementConfig p7,SaveTrafficElementConfig p8,SmallWindowElementConfig p9,int p10,Object p11){
       SlidePlayerPanelConfig slidePlayerP = p0;
       int i = p10;
       SlidePlayerPanelConfig enable = (i & 0x01)? slidePlayerP.enable: p1;
       SlidePlayerPanelConfig danmakuEleme = (i & 0x02)? slidePlayerP.danmakuElementConfig: p2;
       SlidePlayerPanelConfig mirrorElemen = (i & 0x04)? slidePlayerP.mirrorElementConfig: p3;
       SlidePlayerPanelConfig accessibilit = (i & 0x08)? slidePlayerP.accessibilityElementConfig: p4;
       SlidePlayerPanelConfig qualityEleme = (i & 0x10)? slidePlayerP.qualityElementConfig: p5;
       SlidePlayerPanelConfig speedElement = (i & 0x20)? slidePlayerP.speedElementConfig: p6;
       SlidePlayerPanelConfig soundEffectE = (i & 0x40)? slidePlayerP.soundEffectElementConfig: p7;
       SlidePlayerPanelConfig saveTrafficC = (i & 0x0080)? slidePlayerP.saveTrafficConfig: p8;
       SlidePlayerPanelConfig smallWindowC = (i & 0x0100)? slidePlayerP.smallWindowConfig: p9;
       return p0.copy(enable, danmakuEleme, mirrorElemen, accessibilit, qualityEleme, speedElement, soundEffectE, saveTrafficC, smallWindowC);
    }
    public final boolean component1(){
       return this.enable;
    }
    public final SimplePlayerPanelElementConfig component2(){
       return this.danmakuElementConfig;
    }
    public final SimplePlayerPanelElementConfig component3(){
       return this.mirrorElementConfig;
    }
    public final SimplePlayerPanelElementConfig component4(){
       return this.accessibilityElementConfig;
    }
    public final SimplePlayerPanelElementConfig component5(){
       return this.qualityElementConfig;
    }
    public final SpeedElementConfig component6(){
       return this.speedElementConfig;
    }
    public final SimplePlayerPanelElementConfig component7(){
       return this.soundEffectElementConfig;
    }
    public final SaveTrafficElementConfig component8(){
       return this.saveTrafficConfig;
    }
    public final SmallWindowElementConfig component9(){
       return this.smallWindowConfig;
    }
    public final SlidePlayerPanelConfig copy(boolean p0,SimplePlayerPanelElementConfig p1,SimplePlayerPanelElementConfig p2,SimplePlayerPanelElementConfig p3,SimplePlayerPanelElementConfig p4,SpeedElementConfig p5,SimplePlayerPanelElementConfig p6,SaveTrafficElementConfig p7,SmallWindowElementConfig p8){
       Object obj;
       if (PatchProxy.isSupport(SlidePlayerPanelConfig.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = Boolean.valueOf(p0);
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          obj = PatchProxy.apply(objArray, this, SlidePlayerPanelConfig.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       SlidePlayerPanelConfig slidePlayerP = new SlidePlayerPanelConfig(p0, p1, p2, p3, p4, p5, p6, p7, p8);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SlidePlayerPanelConfig.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SlidePlayerPanelConfig && (this.enable == p0.enable && (a.g(this.danmakuElementConfig, p0.danmakuElementConfig) && (a.g(this.mirrorElementConfig, p0.mirrorElementConfig) && (a.g(this.accessibilityElementConfig, p0.accessibilityElementConfig) && (a.g(this.qualityElementConfig, p0.qualityElementConfig) && (a.g(this.speedElementConfig, p0.speedElementConfig) && (a.g(this.soundEffectElementConfig, p0.soundEffectElementConfig) && (a.g(this.saveTrafficConfig, p0.saveTrafficConfig) && a.g(this.smallWindowConfig, p0.smallWindowConfig))))))))))) {
          return true;
       }
       return false;
    }
    public final SimplePlayerPanelElementConfig getAccessibilityElementConfig(){
       return this.accessibilityElementConfig;
    }
    public final SimplePlayerPanelElementConfig getDanmakuElementConfig(){
       return this.danmakuElementConfig;
    }
    public final boolean getEnable(){
       return this.enable;
    }
    public final SimplePlayerPanelElementConfig getMirrorElementConfig(){
       return this.mirrorElementConfig;
    }
    public final SimplePlayerPanelElementConfig getQualityElementConfig(){
       return this.qualityElementConfig;
    }
    public final SaveTrafficElementConfig getSaveTrafficConfig(){
       return this.saveTrafficConfig;
    }
    public final SmallWindowElementConfig getSmallWindowConfig(){
       return this.smallWindowConfig;
    }
    public final SimplePlayerPanelElementConfig getSoundEffectElementConfig(){
       return this.soundEffectElementConfig;
    }
    public final SpeedElementConfig getSpeedElementConfig(){
       return this.speedElementConfig;
    }
    public int hashCode(){
       int i;
       SlidePlayerPanelConfig obj = PatchProxy.apply(null, this, SlidePlayerPanelConfig.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.enable;
       if (obj != null) {
          i = 1;
       }
       i = i * 31;
       SlidePlayerPanelConfig tdanmakuElem = this.danmakuElementConfig;
       int i1 = 0;
       int i2 = (tdanmakuElem != null)? tdanmakuElem.hashCode(): 0;
       i = (i + i2) * 31;
       tdanmakuElem = this.mirrorElementConfig;
       i2 = (tdanmakuElem != null)? tdanmakuElem.hashCode(): 0;
       i = (i + i2) * 31;
       tdanmakuElem = this.accessibilityElementConfig;
       i2 = (tdanmakuElem != null)? tdanmakuElem.hashCode(): 0;
       i = (i + i2) * 31;
       tdanmakuElem = this.qualityElementConfig;
       i2 = (tdanmakuElem != null)? tdanmakuElem.hashCode(): 0;
       i = (i + i2) * 31;
       tdanmakuElem = this.speedElementConfig;
       i2 = (tdanmakuElem != null)? tdanmakuElem.hashCode(): 0;
       i = (i + i2) * 31;
       tdanmakuElem = this.soundEffectElementConfig;
       i2 = (tdanmakuElem != null)? tdanmakuElem.hashCode(): 0;
       i = (i + i2) * 31;
       tdanmakuElem = this.saveTrafficConfig;
       i2 = (tdanmakuElem != null)? tdanmakuElem.hashCode(): 0;
       i = (i + i2) * 31;
       tdanmakuElem = this.smallWindowConfig;
       if (tdanmakuElem != null) {
          i1 = tdanmakuElem.hashCode();
       }
       return (i + i1);
    }
    public final boolean isAccessibilityEnable(){
       SlidePlayerPanelConfig obj = PatchProxy.apply(null, this, SlidePlayerPanelConfig.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.isPanelEnable()) {
          obj = this.accessibilityElementConfig;
          if (obj != null && obj.getEnable() == b) {
          label_0027 :
             return b;
          }
       }
       b = false;
       goto label_0027 ;
    }
    public final boolean isDanmakuEnable(){
       SlidePlayerPanelConfig obj = PatchProxy.apply(null, this, SlidePlayerPanelConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.isPanelEnable()) {
          obj = this.danmakuElementConfig;
          if (obj != null && (obj.getEnable() == b && (DanmakuSwitchUtil.b.a() > 0 && !c.b()))) {
          label_0035 :
             return b;
          }
       }
    label_0034 :
       b = false;
       goto label_0035 ;
    }
    public final boolean isEnable(){
       Object obj = PatchProxy.apply(null, this, SlidePlayerPanelConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.isPanelEnable() && (!this.isDanmakuEnable() && (!this.isMirrorEnable() && (!this.isAccessibilityEnable() && (this.isQualityEnable() || this.isSpeedEnable())))))? true: false;
       return b;
    }
    public final boolean isMirrorEnable(){
       SlidePlayerPanelConfig obj = PatchProxy.apply(null, this, SlidePlayerPanelConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.isPanelEnable()) {
          obj = this.mirrorElementConfig;
          if (obj != null && obj.getEnable() == b) {
          label_0027 :
             return b;
          }
       }
       b = false;
       goto label_0027 ;
    }
    public final boolean isPanelEnable(){
       boolean b = (Build$VERSION.SDK_INT > 21 && this.enable != null)? true: false;
       return b;
    }
    public final boolean isQualityEnable(){
       SlidePlayerPanelConfig obj = PatchProxy.apply(null, this, SlidePlayerPanelConfig.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.isPanelEnable()) {
          obj = this.qualityElementConfig;
          if (obj != null && (obj.getEnable() == b && (f.v.get().intValue() > 0 && !this.isSaveTrafficEnable()))) {
          label_003b :
             return b;
          }
       }
    label_003a :
       b = false;
       goto label_003b ;
    }
    public final boolean isSaveTrafficEnable(){
       SlidePlayerPanelConfig obj = PatchProxy.apply(null, this, SlidePlayerPanelConfig.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.isPanelEnable()) {
          obj = this.saveTrafficConfig;
          if (obj != null && obj.a() == b) {
          label_0027 :
             return b;
          }
       }
       b = false;
       goto label_0027 ;
    }
    public final boolean isSmallWindowEnable(){
       SlidePlayerPanelConfig obj = PatchProxy.apply(null, this, SlidePlayerPanelConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.isPanelEnable() && x.b.b()) {
          obj = this.smallWindowConfig;
          if (obj == null || (obj.enable == b || (l.c("KEY_ENABLE_PLAYER_PANEL_SMALL_WINDOW", false) && !DeviceInfoManager.d.k()))) {
          label_003e :
             return b;
          }
       }
       b = false;
       goto label_003e ;
    }
    public final boolean isSoundEffectEnable(){
       SlidePlayerPanelConfig obj = PatchProxy.apply(null, this, SlidePlayerPanelConfig.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.isPanelEnable()) {
          obj = this.soundEffectElementConfig;
          if (obj != null && obj.getEnable() == b) {
          label_0027 :
             return b;
          }
       }
       b = false;
       goto label_0027 ;
    }
    public final boolean isSpeedEnable(){
       List speedConfigs;
       SlidePlayerPanelConfig obj = PatchProxy.apply(null, this, SlidePlayerPanelConfig.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.isPanelEnable()) {
          obj = this.speedElementConfig;
          if (obj != null) {
             if (obj.getEnable()) {
                speedConfigs = obj.getSpeedConfigs();
                speedConfigs = (speedConfigs == null || speedConfigs.isEmpty())? 1: 0;
                if (!speedConfigs) {
                   speedConfigs = 1;
                label_003b :
                   if (speedConfigs == 1) {
                      b = true;
                   }
                }
             }
             speedConfigs = 0;
             goto label_003b ;
          }
       }
       return b;
    }
    public final void setSaveTrafficConfig(SaveTrafficElementConfig p0){
       this.saveTrafficConfig = p0;
    }
    public final void setSmallWindowConfig(SmallWindowElementConfig p0){
       this.smallWindowConfig = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SlidePlayerPanelConfig.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SlidePlayerPanelConfig\(enable="+this.enable+", danmakuElementConfig="+this.danmakuElementConfig+", mirrorElementConfig="+this.mirrorElementConfig+", accessibilityElementConfig="+this.accessibilityElementConfig+", qualityElementConfig="+this.qualityElementConfig+", speedElementConfig="+this.speedElementConfig+", soundEffectElementConfig="+this.soundEffectElementConfig+", saveTrafficConfig="+this.saveTrafficConfig+", smallWindowConfig="+this.smallWindowConfig+"\)";
    }
}
