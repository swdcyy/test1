package com.yxcorp.gifshow.model.config.IntegrateRedPacketConfig;
import com.yxcorp.gifshow.model.config.UnLoginPopupConfig;
import com.yxcorp.gifshow.model.config.IntegrateRedPacketConfig$PopupBizType;
import com.yxcorp.gifshow.model.config.IntegrateRedPacketConfig$PopupStyle;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class IntegrateRedPacketConfig extends UnLoginPopupConfig	// class@001ed4
{
    public String continueAmountString;
    public int continueDays;
    public String leastAmountString;
    public int popupBizType;
    public int popupStyle;

    public void IntegrateRedPacketConfig(){
       super();
       this.popupBizType = IntegrateRedPacketConfig$PopupBizType.Old56Yuan.getValue();
       this.popupStyle = IntegrateRedPacketConfig$PopupStyle.Old56Yuan.getValue();
       this.leastAmountString = "";
       this.continueAmountString = "";
    }
    public final String getContinueAmountString(){
       return this.continueAmountString;
    }
    public final int getContinueDays(){
       return this.continueDays;
    }
    public final String getLeastAmountString(){
       return this.leastAmountString;
    }
    public final int getPopupBizType(){
       return this.popupBizType;
    }
    public final int getPopupStyle(){
       return this.popupStyle;
    }
    public final void setContinueAmountString(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IntegrateRedPacketConfig.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.continueAmountString = p0;
       return;
    }
    public final void setContinueDays(int p0){
       this.continueDays = p0;
    }
    public final void setLeastAmountString(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IntegrateRedPacketConfig.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.leastAmountString = p0;
       return;
    }
    public final void setPopupBizType(int p0){
       this.popupBizType = p0;
    }
    public final void setPopupStyle(int p0){
       this.popupStyle = p0;
    }
}
