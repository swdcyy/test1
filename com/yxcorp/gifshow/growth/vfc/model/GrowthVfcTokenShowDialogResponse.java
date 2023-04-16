package com.yxcorp.gifshow.growth.vfc.model.GrowthVfcTokenShowDialogResponse;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.vfc.model.GrowthVfcTokenShowDialogResponse$a;
import nsd.u;
import java.lang.String;
import com.yxcorp.gifshow.growth.vfc.model.VfcActivityType;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class GrowthVfcTokenShowDialogResponse implements Serializable	// class@0015b8
{
    public final VfcActivityType activityType;
    public final String amount;
    public final String amountUnit;
    public final String background;
    public final String btnBgImg;
    public final String btnText;
    public final String headImg;
    public final String logTracker;
    public final String subTitle;
    public final String title;
    public static final GrowthVfcTokenShowDialogResponse$a Companion;
    public static final long serialVersionUID;

    static {
       GrowthVfcTokenShowDialogResponse.Companion = new GrowthVfcTokenShowDialogResponse$a(null);
    }
    public void GrowthVfcTokenShowDialogResponse(String p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,VfcActivityType p8,String p9){
       a.p(p8, "activityType");
       super();
       this.headImg = p0;
       this.title = p1;
       this.subTitle = p2;
       this.amount = p3;
       this.btnText = p4;
       this.btnBgImg = p5;
       this.amountUnit = p6;
       this.background = p7;
       this.activityType = p8;
       this.logTracker = p9;
    }
    public static GrowthVfcTokenShowDialogResponse copy$default(GrowthVfcTokenShowDialogResponse p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,String p8,VfcActivityType p9,String p10,int p11,Object p12){
       GrowthVfcTokenShowDialogResponse growthVfcTok = p0;
       int i = p11;
       GrowthVfcTokenShowDialogResponse headImg = (i & 0x01)? growthVfcTok.headImg: p1;
       GrowthVfcTokenShowDialogResponse title = (i & 0x02)? growthVfcTok.title: p2;
       GrowthVfcTokenShowDialogResponse subTitle = (i & 0x04)? growthVfcTok.subTitle: p3;
       GrowthVfcTokenShowDialogResponse amount = (i & 0x08)? growthVfcTok.amount: p4;
       GrowthVfcTokenShowDialogResponse btnText = (i & 0x10)? growthVfcTok.btnText: p5;
       GrowthVfcTokenShowDialogResponse btnBgImg = (i & 0x20)? growthVfcTok.btnBgImg: p6;
       GrowthVfcTokenShowDialogResponse amountUnit = (i & 0x40)? growthVfcTok.amountUnit: p7;
       GrowthVfcTokenShowDialogResponse background = (i & 0x0080)? growthVfcTok.background: p8;
       GrowthVfcTokenShowDialogResponse activityType = (i & 0x0100)? growthVfcTok.activityType: p9;
       GrowthVfcTokenShowDialogResponse logTracker = (i & 0x0200)? growthVfcTok.logTracker: p10;
       return p0.copy(headImg, title, subTitle, amount, btnText, btnBgImg, amountUnit, background, activityType, logTracker);
    }
    public final String component1(){
       return this.headImg;
    }
    public final String component10(){
       return this.logTracker;
    }
    public final String component2(){
       return this.title;
    }
    public final String component3(){
       return this.subTitle;
    }
    public final String component4(){
       return this.amount;
    }
    public final String component5(){
       return this.btnText;
    }
    public final String component6(){
       return this.btnBgImg;
    }
    public final String component7(){
       return this.amountUnit;
    }
    public final String component8(){
       return this.background;
    }
    public final VfcActivityType component9(){
       return this.activityType;
    }
    public final GrowthVfcTokenShowDialogResponse copy(String p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,VfcActivityType p8,String p9){
       GrowthVfcTokenShowDialogResponse obj;
       object oobject = p8;
       if (PatchProxy.isSupport(GrowthVfcTokenShowDialogResponse.class)) {
          Object[] objArray = new Object[10];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = oobject;
          objArray[9] = p9;
          obj = PatchProxy.apply(objArray, this, GrowthVfcTokenShowDialogResponse.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(oobject, "activityType");
       obj = new GrowthVfcTokenShowDialogResponse(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
       return v12;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthVfcTokenShowDialogResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof GrowthVfcTokenShowDialogResponse && (a.g(this.headImg, p0.headImg) && (a.g(this.title, p0.title) && (a.g(this.subTitle, p0.subTitle) && (a.g(this.amount, p0.amount) && (a.g(this.btnText, p0.btnText) && (a.g(this.btnBgImg, p0.btnBgImg) && (a.g(this.amountUnit, p0.amountUnit) && (a.g(this.background, p0.background) && (a.g(this.activityType, p0.activityType) && a.g(this.logTracker, p0.logTracker)))))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       GrowthVfcTokenShowDialogResponse obj = PatchProxy.apply(null, this, GrowthVfcTokenShowDialogResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.headImg;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       GrowthVfcTokenShowDialogResponse ttitle = this.title;
       int i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.subTitle;
       i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.amount;
       i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.btnText;
       i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.btnBgImg;
       i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.amountUnit;
       i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.background;
       i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.activityType;
       i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.logTracker;
       if (ttitle != null) {
          i = ttitle.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GrowthVfcTokenShowDialogResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GrowthVfcTokenShowDialogResponse\(headImg="+this.headImg+", title="+this.title+", subTitle="+this.subTitle+", amount="+this.amount+", btnText="+this.btnText+", btnBgImg="+this.btnBgImg+", amountUnit="+this.amountUnit+", background="+this.background+", activityType="+this.activityType+", logTracker="+this.logTracker+"\)";
    }
}
