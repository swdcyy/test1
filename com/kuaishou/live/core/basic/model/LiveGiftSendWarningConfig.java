package com.kuaishou.live.core.basic.model.LiveGiftSendWarningConfig;
import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveGiftSendWarningConfig implements Serializable	// class@000871
{
    public final Integer toastLimitCount;
    public final Integer toastLimitDay;
    public final String warningToast;

    public void LiveGiftSendWarningConfig(Integer p0,Integer p1,String p2){
       super();
       this.toastLimitCount = p0;
       this.toastLimitDay = p1;
       this.warningToast = p2;
    }
    public static LiveGiftSendWarningConfig copy$default(LiveGiftSendWarningConfig p0,Integer p1,Integer p2,String p3,int p4,Object p5){
       LiveGiftSendWarningConfig toastLimitCo;
       LiveGiftSendWarningConfig toastLimitDa;
       LiveGiftSendWarningConfig warningToast;
       if (p4 & 0x01) {
          toastLimitCo = p0.toastLimitCount;
       }
       if (p4 & 0x02) {
          toastLimitDa = p0.toastLimitDay;
       }
       if (p4 & 0x04) {
          warningToast = p0.warningToast;
       }
       return p0.copy(toastLimitCo, toastLimitDa, warningToast);
    }
    public final Integer component1(){
       return this.toastLimitCount;
    }
    public final Integer component2(){
       return this.toastLimitDay;
    }
    public final String component3(){
       return this.warningToast;
    }
    public final LiveGiftSendWarningConfig copy(Integer p0,Integer p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveGiftSendWarningConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveGiftSendWarningConfig(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGiftSendWarningConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveGiftSendWarningConfig && (a.g(this.toastLimitCount, p0.toastLimitCount) && (a.g(this.toastLimitDay, p0.toastLimitDay) && a.g(this.warningToast, p0.warningToast))))) {
          return true;
       }
       return false;
    }
    public final Integer getToastLimitCount(){
       return this.toastLimitCount;
    }
    public final Integer getToastLimitDay(){
       return this.toastLimitDay;
    }
    public final String getWarningToast(){
       return this.warningToast;
    }
    public int hashCode(){
       LiveGiftSendWarningConfig obj = PatchProxy.apply(null, this, LiveGiftSendWarningConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.toastLimitCount;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveGiftSendWarningConfig ttoastLimitD = this.toastLimitDay;
       int i2 = (ttoastLimitD != null)? ttoastLimitD.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttoastLimitD = this.warningToast;
       if (ttoastLimitD != null) {
          i = ttoastLimitD.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveGiftSendWarningConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveGiftSendWarningConfig\(toastLimitCount="+this.toastLimitCount+", toastLimitDay="+this.toastLimitDay+", warningToast="+this.warningToast+"\)";
    }
}
