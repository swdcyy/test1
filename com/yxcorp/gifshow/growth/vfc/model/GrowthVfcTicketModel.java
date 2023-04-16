package com.yxcorp.gifshow.growth.vfc.model.GrowthVfcTicketModel;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.vfc.model.GrowthVfcTicketModel$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class GrowthVfcTicketModel implements Serializable	// class@0015b6
{
    public final String amount;
    public final String bgImg;
    public final String cornerBg;
    public final String maskImg;
    public boolean nisEmpty;
    public final String subTitle;
    public final String tip;
    public final String title;
    public static final GrowthVfcTicketModel$a Companion;
    public static final long serialVersionUID;

    static {
       GrowthVfcTicketModel.Companion = new GrowthVfcTicketModel$a(null);
    }
    public void GrowthVfcTicketModel(String p0,String p1,String p2,String p3,String p4,String p5,String p6,boolean p7){
       super();
       this.amount = p0;
       this.cornerBg = p1;
       this.title = p2;
       this.subTitle = p3;
       this.bgImg = p4;
       this.maskImg = p5;
       this.tip = p6;
       this.nisEmpty = p7;
    }
    public void GrowthVfcTicketModel(String p0,String p1,String p2,String p3,String p4,String p5,String p6,boolean p7,int p8,u p9){
       boolean b = (p8 & 0x0080)? false: p7;
       super(p0, p1, p2, p3, p4, p5, p6, b);
       return;
    }
    public static GrowthVfcTicketModel copy$default(GrowthVfcTicketModel p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,boolean p8,int p9,Object p10){
       GrowthVfcTicketModel growthVfcTic = p0;
       int i = p9;
       GrowthVfcTicketModel amount = (i & 0x01)? growthVfcTic.amount: p1;
       GrowthVfcTicketModel cornerBg = (i & 0x02)? growthVfcTic.cornerBg: p2;
       GrowthVfcTicketModel title = (i & 0x04)? growthVfcTic.title: p3;
       GrowthVfcTicketModel subTitle = (i & 0x08)? growthVfcTic.subTitle: p4;
       GrowthVfcTicketModel bgImg = (i & 0x10)? growthVfcTic.bgImg: p5;
       GrowthVfcTicketModel maskImg = (i & 0x20)? growthVfcTic.maskImg: p6;
       GrowthVfcTicketModel tip = (i & 0x40)? growthVfcTic.tip: p7;
       GrowthVfcTicketModel nisEmpty = (i & 0x0080)? growthVfcTic.nisEmpty: p8;
       return p0.copy(amount, cornerBg, title, subTitle, bgImg, maskImg, tip, nisEmpty);
    }
    public final String component1(){
       return this.amount;
    }
    public final String component2(){
       return this.cornerBg;
    }
    public final String component3(){
       return this.title;
    }
    public final String component4(){
       return this.subTitle;
    }
    public final String component5(){
       return this.bgImg;
    }
    public final String component6(){
       return this.maskImg;
    }
    public final String component7(){
       return this.tip;
    }
    public final boolean component8(){
       return this.nisEmpty;
    }
    public final GrowthVfcTicketModel copy(String p0,String p1,String p2,String p3,String p4,String p5,String p6,boolean p7){
       Object obj;
       if (PatchProxy.isSupport(GrowthVfcTicketModel.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6,Boolean.valueOf(p7)};
          obj = PatchProxy.apply(objArray, this, GrowthVfcTicketModel.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       GrowthVfcTicketModel growthVfcTic = new GrowthVfcTicketModel(p0, p1, p2, p3, p4, p5, p6, p7);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthVfcTicketModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof GrowthVfcTicketModel && (a.g(this.amount, p0.amount) && (a.g(this.cornerBg, p0.cornerBg) && (a.g(this.title, p0.title) && (a.g(this.subTitle, p0.subTitle) && (a.g(this.bgImg, p0.bgImg) && (a.g(this.maskImg, p0.maskImg) && (a.g(this.tip, p0.tip) && this.nisEmpty == p0.nisEmpty))))))))) {
          return true;
       }
       return false;
    }
    public final boolean getNisEmpty(){
       return this.nisEmpty;
    }
    public int hashCode(){
       GrowthVfcTicketModel obj = PatchProxy.apply(null, this, GrowthVfcTicketModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.amount;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       GrowthVfcTicketModel tcornerBg = this.cornerBg;
       int i2 = (tcornerBg != null)? tcornerBg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcornerBg = this.title;
       i2 = (tcornerBg != null)? tcornerBg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcornerBg = this.subTitle;
       i2 = (tcornerBg != null)? tcornerBg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcornerBg = this.bgImg;
       i2 = (tcornerBg != null)? tcornerBg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcornerBg = this.maskImg;
       i2 = (tcornerBg != null)? tcornerBg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcornerBg = this.tip;
       if (tcornerBg != null) {
          i = tcornerBg.hashCode();
       }
       i1 = (i1 + i) * 31;
       GrowthVfcTicketModel tnisEmpty = this.nisEmpty;
       if (tnisEmpty != null) {
          tnisEmpty = 1;
       }
       return (i1 + tnisEmpty);
    }
    public final void setNisEmpty(boolean p0){
       this.nisEmpty = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GrowthVfcTicketModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GrowthVfcTicketModel\(amount="+this.amount+", cornerBg="+this.cornerBg+", title="+this.title+", subTitle="+this.subTitle+", bgImg="+this.bgImg+", maskImg="+this.maskImg+", tip="+this.tip+", nisEmpty="+this.nisEmpty+"\)";
    }
}
