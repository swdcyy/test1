package com.yxcorp.gifshow.growth.ai.KgiRedPacketServerResponse$Companion$KgiRedPacketResponse;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.ai.KgiRedPacketServerResponse$Companion$KgiRedPacketResponse$a;
import nsd.u;
import java.lang.String;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class KgiRedPacketServerResponse$Companion$KgiRedPacketResponse implements Serializable	// class@0012ec
{
    public final int activityId;
    public final int amount;
    public String amountCornerText;
    public int amountMod;
    public final String amountUnitText;
    public final String buttonSubText;
    public final String buttonText;
    public final int dialogType;
    public boolean enableLinkEmpty;
    public boolean isBackupShowToast;
    public final String linkUrl;
    public final String materialUrl;
    public String plainTitleText;
    public final int popupId;
    public int remainTimeOfSeconds;
    public HashMap reportParams;
    public int requestEventType;
    public String subTitleText;
    public long timeRequestComplete;
    public long timeReturnTrue;
    public final String titleText;
    public String tkExtParams;
    public int tkMinBundlerVersion;
    public boolean toOpenWeb;
    public String toastText;
    public final String welcomeText;
    public static final KgiRedPacketServerResponse$Companion$KgiRedPacketResponse$a Companion;
    public static final long serialVersionUID;

    static {
       KgiRedPacketServerResponse$Companion$KgiRedPacketResponse.Companion = new KgiRedPacketServerResponse$Companion$KgiRedPacketResponse$a(null);
    }
    public void KgiRedPacketServerResponse$Companion$KgiRedPacketResponse(int p0,int p1,int p2,String p3,String p4,int p5,int p6,String p7,String p8,String p9,String p10,boolean p11,boolean p12,String p13,String p14,HashMap p15,String p16,String p17,String p18,int p19,String p20,int p21){
       int i = this;
       super();
       i.activityId = p0;
       i.popupId = p1;
       i.dialogType = p2;
       i.welcomeText = p3;
       i.titleText = p4;
       i.amount = p5;
       i.amountMod = p6;
       i.amountUnitText = p7;
       i.buttonText = p8;
       i.buttonSubText = p9;
       i.linkUrl = p10;
       i.enableLinkEmpty = p11;
       i.toOpenWeb = p12;
       i.toastText = p13;
       i.materialUrl = p14;
       i.reportParams = p15;
       i.subTitleText = p16;
       i.amountCornerText = p17;
       i.tkExtParams = p18;
       i.tkMinBundlerVersion = p19;
       i.plainTitleText = p20;
       i.remainTimeOfSeconds = p21;
       i.requestEventType = -1;
    }
    public void KgiRedPacketServerResponse$Companion$KgiRedPacketResponse(int p0,int p1,int p2,String p3,String p4,int p5,int p6,String p7,String p8,String p9,String p10,boolean p11,boolean p12,String p13,String p14,HashMap p15,String p16,String p17,String p18,int p19,String p20,int p21,int p22,u p23){
       int i = p22;
       int i1 = (i & 0x40)? 100: p6;
       boolean b = (i & 0x0800)? false: p11;
       boolean b1 = (i & 0x1000)? true: p12;
       int i2 = (0x80000 & i)? -1: p19;
       int i3 = (i & 0x200000)? 5: p21;
       super(p0, p1, p2, p3, p4, p5, i1, p7, p8, p9, p10, b, b1, p13, p14, p15, p16, p17, p18, i2, p20, i3);
       return;
    }
    public static KgiRedPacketServerResponse$Companion$KgiRedPacketResponse copy$default(KgiRedPacketServerResponse$Companion$KgiRedPacketResponse p0,int p1,int p2,int p3,String p4,String p5,int p6,int p7,String p8,String p9,String p10,String p11,boolean p12,boolean p13,String p14,String p15,HashMap p16,String p17,String p18,String p19,int p20,String p21,int p22,int p23,Object p24){
       int i1;
       KgiRedPacketServerResponse$Companion$KgiRedPacketResponse uCompanion$K = p0;
       int i = p23;
       KgiRedPacketServerResponse$Companion$KgiRedPacketResponse activityId = (i & 0x01)? uCompanion$K.activityId: p1;
       KgiRedPacketServerResponse$Companion$KgiRedPacketResponse popupId = (i & 0x02)? uCompanion$K.popupId: p2;
       KgiRedPacketServerResponse$Companion$KgiRedPacketResponse dialogType = (i & 0x04)? uCompanion$K.dialogType: p3;
       KgiRedPacketServerResponse$Companion$KgiRedPacketResponse welcomeText = (i & 0x08)? uCompanion$K.welcomeText: p4;
       KgiRedPacketServerResponse$Companion$KgiRedPacketResponse titleText = (i & 0x10)? uCompanion$K.titleText: p5;
       KgiRedPacketServerResponse$Companion$KgiRedPacketResponse amount = (i & 0x20)? uCompanion$K.amount: p6;
       KgiRedPacketServerResponse$Companion$KgiRedPacketResponse amountMod = (i & 0x40)? uCompanion$K.amountMod: p7;
       KgiRedPacketServerResponse$Companion$KgiRedPacketResponse amountUnitTe = (i & 0x0080)? uCompanion$K.amountUnitText: p8;
       KgiRedPacketServerResponse$Companion$KgiRedPacketResponse buttonText = (i & 0x0100)? uCompanion$K.buttonText: p9;
       KgiRedPacketServerResponse$Companion$KgiRedPacketResponse buttonSubTex = (i & 0x0200)? uCompanion$K.buttonSubText: p10;
       KgiRedPacketServerResponse$Companion$KgiRedPacketResponse linkUrl = (i & 0x0400)? uCompanion$K.linkUrl: p11;
       KgiRedPacketServerResponse$Companion$KgiRedPacketResponse enableLinkEm = (i & 0x0800)? uCompanion$K.enableLinkEmpty: p12;
       KgiRedPacketServerResponse$Companion$KgiRedPacketResponse toOpenWeb = (i & 0x1000)? uCompanion$K.toOpenWeb: p13;
       KgiRedPacketServerResponse$Companion$KgiRedPacketResponse toastText = (i & 0x2000)? uCompanion$K.toastText: p14;
       KgiRedPacketServerResponse$Companion$KgiRedPacketResponse uCompanion$K1 = toastText;
       toastText = (i & 0x4000)? uCompanion$K.materialUrl: p15;
       KgiRedPacketServerResponse$Companion$KgiRedPacketResponse uCompanion$K2 = toastText;
       toastText = (i & 0x8000)? uCompanion$K.reportParams: p16;
       KgiRedPacketServerResponse$Companion$KgiRedPacketResponse uCompanion$K3 = toastText;
       toastText = (i & 0x10000)? uCompanion$K.subTitleText: p17;
       KgiRedPacketServerResponse$Companion$KgiRedPacketResponse uCompanion$K4 = toastText;
       toastText = (i & 0x20000)? uCompanion$K.amountCornerText: p18;
       KgiRedPacketServerResponse$Companion$KgiRedPacketResponse uCompanion$K5 = toastText;
       toastText = (i & 0x40000)? uCompanion$K.tkExtParams: p19;
       KgiRedPacketServerResponse$Companion$KgiRedPacketResponse uCompanion$K6 = toastText;
       toastText = (i & 0x80000)? uCompanion$K.tkMinBundlerVersion: p20;
       KgiRedPacketServerResponse$Companion$KgiRedPacketResponse uCompanion$K7 = toastText;
       toastText = (i & 0x100000)? uCompanion$K.plainTitleText: p21;
       KgiRedPacketServerResponse$Companion$KgiRedPacketResponse remainTimeOf = (i & 0x200000)? uCompanion$K.remainTimeOfSeconds: p22;
       return p0.copy(activityId, popupId, dialogType, welcomeText, titleText, amount, amountMod, amountUnitTe, buttonText, buttonSubTex, linkUrl, enableLinkEm, toOpenWeb, uCompanion$K1, uCompanion$K2, uCompanion$K3, uCompanion$K4, uCompanion$K5, uCompanion$K6, uCompanion$K7, toastText, remainTimeOf);
    }
    public static void getRequestEventType$annotations(){
    }
    public final int component1(){
       return this.activityId;
    }
    public final String component10(){
       return this.buttonSubText;
    }
    public final String component11(){
       return this.linkUrl;
    }
    public final boolean component12(){
       return this.enableLinkEmpty;
    }
    public final boolean component13(){
       return this.toOpenWeb;
    }
    public final String component14(){
       return this.toastText;
    }
    public final String component15(){
       return this.materialUrl;
    }
    public final HashMap component16(){
       return this.reportParams;
    }
    public final String component17(){
       return this.subTitleText;
    }
    public final String component18(){
       return this.amountCornerText;
    }
    public final String component19(){
       return this.tkExtParams;
    }
    public final int component2(){
       return this.popupId;
    }
    public final int component20(){
       return this.tkMinBundlerVersion;
    }
    public final String component21(){
       return this.plainTitleText;
    }
    public final int component22(){
       return this.remainTimeOfSeconds;
    }
    public final int component3(){
       return this.dialogType;
    }
    public final String component4(){
       return this.welcomeText;
    }
    public final String component5(){
       return this.titleText;
    }
    public final int component6(){
       return this.amount;
    }
    public final int component7(){
       return this.amountMod;
    }
    public final String component8(){
       return this.amountUnitText;
    }
    public final String component9(){
       return this.buttonText;
    }
    public final KgiRedPacketServerResponse$Companion$KgiRedPacketResponse copy(int p0,int p1,int p2,String p3,String p4,int p5,int p6,String p7,String p8,String p9,String p10,boolean p11,boolean p12,String p13,String p14,HashMap p15,String p16,String p17,String p18,int p19,String p20,int p21){
       Object obj;
       if (PatchProxy.isSupport(KgiRedPacketServerResponse$Companion$KgiRedPacketResponse.class)) {
          Object[] objArray = new Object[22];
          objArray[0] = Integer.valueOf(p0);
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = p9;
          objArray[10] = p10;
          objArray[11] = Boolean.valueOf(p11);
          objArray[12] = Boolean.valueOf(p12);
          objArray[13] = p13;
          objArray[14] = p14;
          objArray[15] = p15;
          objArray[16] = p16;
          objArray[17] = p17;
          objArray[18] = p18;
          objArray[19] = Integer.valueOf(p19);
          objArray[20] = p20;
          objArray[21] = Integer.valueOf(p21);
          obj = PatchProxy.apply(objArray, this, KgiRedPacketServerResponse$Companion$KgiRedPacketResponse.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       KgiRedPacketServerResponse$Companion$KgiRedPacketResponse uCompanion$K = new KgiRedPacketServerResponse$Companion$KgiRedPacketResponse(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KgiRedPacketServerResponse$Companion$KgiRedPacketResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof KgiRedPacketServerResponse$Companion$KgiRedPacketResponse && (this.activityId == p0.activityId && (this.popupId == p0.popupId && (this.dialogType == p0.dialogType && (a.g(this.welcomeText, p0.welcomeText) && (a.g(this.titleText, p0.titleText) && (this.amount == p0.amount && (this.amountMod == p0.amountMod && (a.g(this.amountUnitText, p0.amountUnitText) && (a.g(this.buttonText, p0.buttonText) && (a.g(this.buttonSubText, p0.buttonSubText) && (a.g(this.linkUrl, p0.linkUrl) && (this.enableLinkEmpty == p0.enableLinkEmpty && (this.toOpenWeb == p0.toOpenWeb && (a.g(this.toastText, p0.toastText) && (a.g(this.materialUrl, p0.materialUrl) && (a.g(this.reportParams, p0.reportParams) && (a.g(this.subTitleText, p0.subTitleText) && (a.g(this.amountCornerText, p0.amountCornerText) && (a.g(this.tkExtParams, p0.tkExtParams) && (this.tkMinBundlerVersion == p0.tkMinBundlerVersion && (a.g(this.plainTitleText, p0.plainTitleText) && this.remainTimeOfSeconds == p0.remainTimeOfSeconds))))))))))))))))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, KgiRedPacketServerResponse$Companion$KgiRedPacketResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = ((((this.activityId * 31) + this.popupId) * 31) + this.dialogType) * 31;
       KgiRedPacketServerResponse$Companion$KgiRedPacketResponse twelcomeText = this.welcomeText;
       int i1 = 0;
       int i2 = (twelcomeText != null)? twelcomeText.hashCode(): 0;
       i = (i + i2) * 31;
       twelcomeText = this.titleText;
       i2 = (twelcomeText != null)? twelcomeText.hashCode(): 0;
       i = (((((i + i2) * 31) + this.amount) * 31) + this.amountMod) * 31;
       twelcomeText = this.amountUnitText;
       i2 = (twelcomeText != null)? twelcomeText.hashCode(): 0;
       i = (i + i2) * 31;
       twelcomeText = this.buttonText;
       i2 = (twelcomeText != null)? twelcomeText.hashCode(): 0;
       i = (i + i2) * 31;
       twelcomeText = this.buttonSubText;
       i2 = (twelcomeText != null)? twelcomeText.hashCode(): 0;
       i = (i + i2) * 31;
       twelcomeText = this.linkUrl;
       i2 = (twelcomeText != null)? twelcomeText.hashCode(): 0;
       i = (i + i2) * 31;
       twelcomeText = this.enableLinkEmpty;
       int i3 = 1;
       if (twelcomeText != null) {
          i2 = 1;
       }
       i = (i + i2) * 31;
       twelcomeText = this.toOpenWeb;
       if (twelcomeText == null) {
          i3 = twelcomeText;
       }
       i = (i + i3) * 31;
       twelcomeText = this.toastText;
       i2 = (twelcomeText != null)? twelcomeText.hashCode(): 0;
       i = (i + i2) * 31;
       twelcomeText = this.materialUrl;
       i2 = (twelcomeText != null)? twelcomeText.hashCode(): 0;
       i = (i + i2) * 31;
       twelcomeText = this.reportParams;
       i2 = (twelcomeText != null)? twelcomeText.hashCode(): 0;
       i = (i + i2) * 31;
       twelcomeText = this.subTitleText;
       i2 = (twelcomeText != null)? twelcomeText.hashCode(): 0;
       i = (i + i2) * 31;
       twelcomeText = this.amountCornerText;
       i2 = (twelcomeText != null)? twelcomeText.hashCode(): 0;
       i = (i + i2) * 31;
       twelcomeText = this.tkExtParams;
       i2 = (twelcomeText != null)? twelcomeText.hashCode(): 0;
       i = (((i + i2) * 31) + this.tkMinBundlerVersion) * 31;
       twelcomeText = this.plainTitleText;
       if (twelcomeText != null) {
          i1 = twelcomeText.hashCode();
       }
       return (((i + i1) * 31) + this.remainTimeOfSeconds);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KgiRedPacketServerResponse$Companion$KgiRedPacketResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KgiRedPacketResponse\(activityId="+this.activityId+", popupId="+this.popupId+", dialogType="+this.dialogType+", welcomeText="+this.welcomeText+", titleText="+this.titleText+", amount="+this.amount+", amountMod="+this.amountMod+", amountUnitText="+this.amountUnitText+", buttonText="+this.buttonText+", buttonSubText="+this.buttonSubText+", linkUrl="+this.linkUrl+", enableLinkEmpty="+this.enableLinkEmpty+", toOpenWeb="+this.toOpenWeb+", toastText="+this.toastText+", materialUrl="+this.materialUrl+", reportParams="+this.reportParams+", subTitleText="+this.subTitleText+", amountCornerText="+this.amountCornerText+", tkExtParams="+this.tkExtParams+", tkMinBundlerVersion="+this.tkMinBundlerVersion+", plainTitleText="+this.plainTitleText+", remainTimeOfSeconds="+this.remainTimeOfSeconds+"\)";
    }
}
