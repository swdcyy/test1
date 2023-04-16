package com.kuaishou.live.core.basic.model.LiveGiftPanelAndSendWarningConfig;
import java.io.Serializable;
import java.lang.Boolean;
import com.kuaishou.live.core.basic.model.LiveGiftSendWarningConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveGiftPanelAndSendWarningConfig implements Serializable	// class@00086e
{
    public final Boolean disableGiftPanel;
    public final Boolean disableGiftPanelTopBar;
    public final LiveGiftSendWarningConfig giftSendWarningConfig;

    public void LiveGiftPanelAndSendWarningConfig(Boolean p0,Boolean p1,LiveGiftSendWarningConfig p2){
       super();
       this.disableGiftPanelTopBar = p0;
       this.disableGiftPanel = p1;
       this.giftSendWarningConfig = p2;
    }
    public static LiveGiftPanelAndSendWarningConfig copy$default(LiveGiftPanelAndSendWarningConfig p0,Boolean p1,Boolean p2,LiveGiftSendWarningConfig p3,int p4,Object p5){
       LiveGiftPanelAndSendWarningConfig disableGiftP;
       LiveGiftPanelAndSendWarningConfig disableGiftP1;
       LiveGiftPanelAndSendWarningConfig giftSendWarn;
       if (p4 & 0x01) {
          disableGiftP = p0.disableGiftPanelTopBar;
       }
       if (p4 & 0x02) {
          disableGiftP1 = p0.disableGiftPanel;
       }
       if (p4 & 0x04) {
          giftSendWarn = p0.giftSendWarningConfig;
       }
       return p0.copy(disableGiftP, disableGiftP1, giftSendWarn);
    }
    public final Boolean component1(){
       return this.disableGiftPanelTopBar;
    }
    public final Boolean component2(){
       return this.disableGiftPanel;
    }
    public final LiveGiftSendWarningConfig component3(){
       return this.giftSendWarningConfig;
    }
    public final LiveGiftPanelAndSendWarningConfig copy(Boolean p0,Boolean p1,LiveGiftSendWarningConfig p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveGiftPanelAndSendWarningConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveGiftPanelAndSendWarningConfig(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGiftPanelAndSendWarningConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveGiftPanelAndSendWarningConfig && (a.g(this.disableGiftPanelTopBar, p0.disableGiftPanelTopBar) && (a.g(this.disableGiftPanel, p0.disableGiftPanel) && a.g(this.giftSendWarningConfig, p0.giftSendWarningConfig))))) {
          return true;
       }
       return false;
    }
    public final Boolean getDisableGiftPanel(){
       return this.disableGiftPanel;
    }
    public final Boolean getDisableGiftPanelTopBar(){
       return this.disableGiftPanelTopBar;
    }
    public final LiveGiftSendWarningConfig getGiftSendWarningConfig(){
       return this.giftSendWarningConfig;
    }
    public int hashCode(){
       LiveGiftPanelAndSendWarningConfig obj = PatchProxy.apply(null, this, LiveGiftPanelAndSendWarningConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.disableGiftPanelTopBar;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveGiftPanelAndSendWarningConfig tdisableGift = this.disableGiftPanel;
       int i2 = (tdisableGift != null)? tdisableGift.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdisableGift = this.giftSendWarningConfig;
       if (tdisableGift != null) {
          i = tdisableGift.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveGiftPanelAndSendWarningConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveGiftPanelAndSendWarningConfig\(disableGiftPanelTopBar="+this.disableGiftPanelTopBar+", disableGiftPanel="+this.disableGiftPanel+", giftSendWarningConfig="+this.giftSendWarningConfig+"\)";
    }
}
