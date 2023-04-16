package com.yxcorp.gifshow.growth.vfc.model.ShowShareAwardDialog;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.vfc.model.ShowShareAwardDialog$a;
import nsd.u;
import java.lang.String;
import java.util.List;
import com.yxcorp.gifshow.growth.vfc.model.VfcBtnActionType;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ShowShareAwardDialog implements Serializable	// class@0015c0
{
    public final String assistBtnTitle;
    public final String assistLink;
    public final String background;
    public final VfcBtnActionType btnActionType;
    public final String btnBgImg;
    public final String btnText;
    public final String couponBg;
    public final String couponFg;
    public final List couponList;
    public final String logTracker;
    public final String scrollShadow;
    public final String subTitle;
    public final String title;
    public final String topShadow;
    public static final ShowShareAwardDialog$a Companion;
    public static final long serialVersionUID;

    static {
       ShowShareAwardDialog.Companion = new ShowShareAwardDialog$a(null);
    }
    public void ShowShareAwardDialog(String p0,String p1,String p2,String p3,String p4,String p5,String p6,List p7,String p8,String p9,String p10,String p11,VfcBtnActionType p12,String p13){
       a.p(p0, "background");
       a.p(p1, "couponBg");
       a.p(p2, "couponFg");
       a.p(p3, "title");
       a.p(p4, "subTitle");
       a.p(p5, "assistBtnTitle");
       a.p(p7, "couponList");
       a.p(p12, "btnActionType");
       super();
       this.background = p0;
       this.couponBg = p1;
       this.couponFg = p2;
       this.title = p3;
       this.subTitle = p4;
       this.assistBtnTitle = p5;
       this.scrollShadow = p6;
       this.couponList = p7;
       this.topShadow = p8;
       this.btnText = p9;
       this.btnBgImg = p10;
       this.assistLink = p11;
       this.btnActionType = p12;
       this.logTracker = p13;
    }
    public static ShowShareAwardDialog copy$default(ShowShareAwardDialog p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,List p8,String p9,String p10,String p11,String p12,VfcBtnActionType p13,String p14,int p15,Object p16){
       ShowShareAwardDialog showShareAwa = p0;
       int i = p15;
       ShowShareAwardDialog background = (i & 0x01)? showShareAwa.background: p1;
       ShowShareAwardDialog couponBg = (i & 0x02)? showShareAwa.couponBg: p2;
       ShowShareAwardDialog couponFg = (i & 0x04)? showShareAwa.couponFg: p3;
       ShowShareAwardDialog title = (i & 0x08)? showShareAwa.title: p4;
       ShowShareAwardDialog subTitle = (i & 0x10)? showShareAwa.subTitle: p5;
       ShowShareAwardDialog assistBtnTit = (i & 0x20)? showShareAwa.assistBtnTitle: p6;
       ShowShareAwardDialog scrollShadow = (i & 0x40)? showShareAwa.scrollShadow: p7;
       ShowShareAwardDialog couponList = (i & 0x0080)? showShareAwa.couponList: p8;
       ShowShareAwardDialog topShadow = (i & 0x0100)? showShareAwa.topShadow: p9;
       ShowShareAwardDialog btnText = (i & 0x0200)? showShareAwa.btnText: p10;
       ShowShareAwardDialog btnBgImg = (i & 0x0400)? showShareAwa.btnBgImg: p11;
       ShowShareAwardDialog assistLink = (i & 0x0800)? showShareAwa.assistLink: p12;
       ShowShareAwardDialog btnActionTyp = (i & 0x1000)? showShareAwa.btnActionType: p13;
       ShowShareAwardDialog logTracker = (i & 0x2000)? showShareAwa.logTracker: p14;
       return p0.copy(background, couponBg, couponFg, title, subTitle, assistBtnTit, scrollShadow, couponList, topShadow, btnText, btnBgImg, assistLink, btnActionTyp, logTracker);
    }
    public final String component1(){
       return this.background;
    }
    public final String component10(){
       return this.btnText;
    }
    public final String component11(){
       return this.btnBgImg;
    }
    public final String component12(){
       return this.assistLink;
    }
    public final VfcBtnActionType component13(){
       return this.btnActionType;
    }
    public final String component14(){
       return this.logTracker;
    }
    public final String component2(){
       return this.couponBg;
    }
    public final String component3(){
       return this.couponFg;
    }
    public final String component4(){
       return this.title;
    }
    public final String component5(){
       return this.subTitle;
    }
    public final String component6(){
       return this.assistBtnTitle;
    }
    public final String component7(){
       return this.scrollShadow;
    }
    public final List component8(){
       return this.couponList;
    }
    public final String component9(){
       return this.topShadow;
    }
    public final ShowShareAwardDialog copy(String p0,String p1,String p2,String p3,String p4,String p5,String p6,List p7,String p8,String p9,String p10,String p11,VfcBtnActionType p12,String p13){
       ShowShareAwardDialog obj;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       object oobject5 = p5;
       object oobject6 = p7;
       object oobject7 = p12;
       if (PatchProxy.isSupport(ShowShareAwardDialog.class)) {
          Object[] objArray = new Object[14];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[2] = oobject2;
          objArray[3] = oobject3;
          objArray[4] = oobject4;
          objArray[5] = oobject5;
          objArray[6] = p6;
          objArray[7] = oobject6;
          objArray[8] = p8;
          objArray[9] = p9;
          objArray[10] = p10;
          objArray[11] = p11;
          objArray[12] = oobject7;
          objArray[13] = p13;
          obj = PatchProxy.apply(objArray, this, ShowShareAwardDialog.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(oobject, "background");
       a.p(oobject1, "couponBg");
       a.p(oobject2, "couponFg");
       a.p(oobject3, "title");
       a.p(oobject4, "subTitle");
       a.p(oobject5, "assistBtnTitle");
       a.p(oobject6, "couponList");
       a.p(oobject7, "btnActionType");
       obj = new ShowShareAwardDialog(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13);
       return v16;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ShowShareAwardDialog.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ShowShareAwardDialog && (a.g(this.background, p0.background) && (a.g(this.couponBg, p0.couponBg) && (a.g(this.couponFg, p0.couponFg) && (a.g(this.title, p0.title) && (a.g(this.subTitle, p0.subTitle) && (a.g(this.assistBtnTitle, p0.assistBtnTitle) && (a.g(this.scrollShadow, p0.scrollShadow) && (a.g(this.couponList, p0.couponList) && (a.g(this.topShadow, p0.topShadow) && (a.g(this.btnText, p0.btnText) && (a.g(this.btnBgImg, p0.btnBgImg) && (a.g(this.assistLink, p0.assistLink) && (a.g(this.btnActionType, p0.btnActionType) && a.g(this.logTracker, p0.logTracker)))))))))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       ShowShareAwardDialog obj = PatchProxy.apply(null, this, ShowShareAwardDialog.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.background;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       ShowShareAwardDialog tcouponBg = this.couponBg;
       int i2 = (tcouponBg != null)? tcouponBg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcouponBg = this.couponFg;
       i2 = (tcouponBg != null)? tcouponBg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcouponBg = this.title;
       i2 = (tcouponBg != null)? tcouponBg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcouponBg = this.subTitle;
       i2 = (tcouponBg != null)? tcouponBg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcouponBg = this.assistBtnTitle;
       i2 = (tcouponBg != null)? tcouponBg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcouponBg = this.scrollShadow;
       i2 = (tcouponBg != null)? tcouponBg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcouponBg = this.couponList;
       i2 = (tcouponBg != null)? tcouponBg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcouponBg = this.topShadow;
       i2 = (tcouponBg != null)? tcouponBg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcouponBg = this.btnText;
       i2 = (tcouponBg != null)? tcouponBg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcouponBg = this.btnBgImg;
       i2 = (tcouponBg != null)? tcouponBg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcouponBg = this.assistLink;
       i2 = (tcouponBg != null)? tcouponBg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcouponBg = this.btnActionType;
       i2 = (tcouponBg != null)? tcouponBg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcouponBg = this.logTracker;
       if (tcouponBg != null) {
          i = tcouponBg.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ShowShareAwardDialog.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ShowShareAwardDialog\(background="+this.background+", couponBg="+this.couponBg+", couponFg="+this.couponFg+", title="+this.title+", subTitle="+this.subTitle+", assistBtnTitle="+this.assistBtnTitle+", scrollShadow="+this.scrollShadow+", couponList="+this.couponList+", topShadow="+this.topShadow+", btnText="+this.btnText+", btnBgImg="+this.btnBgImg+", assistLink="+this.assistLink+", btnActionType="+this.btnActionType+", logTracker="+this.logTracker+"\)";
    }
}
