package com.yxcorp.gifshow.growth.vfc.model.NormalReceiveCouponDialogModel;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.vfc.model.NormalReceiveCouponDialogModel$a;
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

public final class NormalReceiveCouponDialogModel implements Serializable	// class@0015be
{
    public final String background;
    public final VfcBtnActionType btnActionType;
    public final String btnBgImg;
    public final String btnText;
    public final String couponBg;
    public final String couponFg;
    public final List couponList;
    public final String linkUrl;
    public final String logTracker;
    public final String subTitle;
    public final String title;
    public final String topShadow;
    public static final NormalReceiveCouponDialogModel$a Companion;
    public static final long serialVersionUID;

    static {
       NormalReceiveCouponDialogModel.Companion = new NormalReceiveCouponDialogModel$a(null);
    }
    public void NormalReceiveCouponDialogModel(String p0,String p1,String p2,List p3,String p4,String p5,String p6,String p7,String p8,String p9,String p10,VfcBtnActionType p11){
       a.p(p3, "couponList");
       a.p(p11, "btnActionType");
       super();
       this.title = p0;
       this.subTitle = p1;
       this.logTracker = p2;
       this.couponList = p3;
       this.btnText = p4;
       this.btnBgImg = p5;
       this.linkUrl = p6;
       this.background = p7;
       this.topShadow = p8;
       this.couponBg = p9;
       this.couponFg = p10;
       this.btnActionType = p11;
    }
    public static NormalReceiveCouponDialogModel copy$default(NormalReceiveCouponDialogModel p0,String p1,String p2,String p3,List p4,String p5,String p6,String p7,String p8,String p9,String p10,String p11,VfcBtnActionType p12,int p13,Object p14){
       NormalReceiveCouponDialogModel normalReceiv = p0;
       int i = p13;
       NormalReceiveCouponDialogModel title = (i & 0x01)? normalReceiv.title: p1;
       NormalReceiveCouponDialogModel subTitle = (i & 0x02)? normalReceiv.subTitle: p2;
       NormalReceiveCouponDialogModel logTracker = (i & 0x04)? normalReceiv.logTracker: p3;
       NormalReceiveCouponDialogModel couponList = (i & 0x08)? normalReceiv.couponList: p4;
       NormalReceiveCouponDialogModel btnText = (i & 0x10)? normalReceiv.btnText: p5;
       NormalReceiveCouponDialogModel btnBgImg = (i & 0x20)? normalReceiv.btnBgImg: p6;
       NormalReceiveCouponDialogModel linkUrl = (i & 0x40)? normalReceiv.linkUrl: p7;
       NormalReceiveCouponDialogModel background = (i & 0x0080)? normalReceiv.background: p8;
       NormalReceiveCouponDialogModel topShadow = (i & 0x0100)? normalReceiv.topShadow: p9;
       NormalReceiveCouponDialogModel couponBg = (i & 0x0200)? normalReceiv.couponBg: p10;
       NormalReceiveCouponDialogModel couponFg = (i & 0x0400)? normalReceiv.couponFg: p11;
       NormalReceiveCouponDialogModel btnActionTyp = (i & 0x0800)? normalReceiv.btnActionType: p12;
       return p0.copy(title, subTitle, logTracker, couponList, btnText, btnBgImg, linkUrl, background, topShadow, couponBg, couponFg, btnActionTyp);
    }
    public final String component1(){
       return this.title;
    }
    public final String component10(){
       return this.couponBg;
    }
    public final String component11(){
       return this.couponFg;
    }
    public final VfcBtnActionType component12(){
       return this.btnActionType;
    }
    public final String component2(){
       return this.subTitle;
    }
    public final String component3(){
       return this.logTracker;
    }
    public final List component4(){
       return this.couponList;
    }
    public final String component5(){
       return this.btnText;
    }
    public final String component6(){
       return this.btnBgImg;
    }
    public final String component7(){
       return this.linkUrl;
    }
    public final String component8(){
       return this.background;
    }
    public final String component9(){
       return this.topShadow;
    }
    public final NormalReceiveCouponDialogModel copy(String p0,String p1,String p2,List p3,String p4,String p5,String p6,String p7,String p8,String p9,String p10,VfcBtnActionType p11){
       NormalReceiveCouponDialogModel obj;
       object oobject = p3;
       object oobject1 = p11;
       if (PatchProxy.isSupport(NormalReceiveCouponDialogModel.class)) {
          Object[] objArray = new Object[12];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = oobject;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = p9;
          objArray[10] = p10;
          objArray[11] = oobject1;
          obj = PatchProxy.apply(objArray, this, NormalReceiveCouponDialogModel.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(oobject, "couponList");
       a.p(oobject1, "btnActionType");
       obj = new NormalReceiveCouponDialogModel(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
       return v14;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NormalReceiveCouponDialogModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof NormalReceiveCouponDialogModel && (a.g(this.title, p0.title) && (a.g(this.subTitle, p0.subTitle) && (a.g(this.logTracker, p0.logTracker) && (a.g(this.couponList, p0.couponList) && (a.g(this.btnText, p0.btnText) && (a.g(this.btnBgImg, p0.btnBgImg) && (a.g(this.linkUrl, p0.linkUrl) && (a.g(this.background, p0.background) && (a.g(this.topShadow, p0.topShadow) && (a.g(this.couponBg, p0.couponBg) && (a.g(this.couponFg, p0.couponFg) && a.g(this.btnActionType, p0.btnActionType)))))))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       NormalReceiveCouponDialogModel obj = PatchProxy.apply(null, this, NormalReceiveCouponDialogModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.title;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       NormalReceiveCouponDialogModel tsubTitle = this.subTitle;
       int i2 = (tsubTitle != null)? tsubTitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tsubTitle = this.logTracker;
       i2 = (tsubTitle != null)? tsubTitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tsubTitle = this.couponList;
       i2 = (tsubTitle != null)? tsubTitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tsubTitle = this.btnText;
       i2 = (tsubTitle != null)? tsubTitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tsubTitle = this.btnBgImg;
       i2 = (tsubTitle != null)? tsubTitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tsubTitle = this.linkUrl;
       i2 = (tsubTitle != null)? tsubTitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tsubTitle = this.background;
       i2 = (tsubTitle != null)? tsubTitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tsubTitle = this.topShadow;
       i2 = (tsubTitle != null)? tsubTitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tsubTitle = this.couponBg;
       i2 = (tsubTitle != null)? tsubTitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tsubTitle = this.couponFg;
       i2 = (tsubTitle != null)? tsubTitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tsubTitle = this.btnActionType;
       if (tsubTitle != null) {
          i = tsubTitle.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, NormalReceiveCouponDialogModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NormalReceiveCouponDialogModel\(title="+this.title+", subTitle="+this.subTitle+", logTracker="+this.logTracker+", couponList="+this.couponList+", btnText="+this.btnText+", btnBgImg="+this.btnBgImg+", linkUrl="+this.linkUrl+", background="+this.background+", topShadow="+this.topShadow+", couponBg="+this.couponBg+", couponFg="+this.couponFg+", btnActionType="+this.btnActionType+"\)";
    }
}
