package com.yxcorp.gifshow.growth.model.RedPacketModel;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.model.RedPacketModel$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class RedPacketModel implements Serializable	// class@00143b
{
    public final String buttonContent;
    public final String buttonUrl;
    public final String headImg;
    public final long money;
    public final String subTitle;
    public final String title;
    public final String tkExtParams;
    public final String topBackgroundImg;
    public final String traceDetail;
    public final String unit;
    public final String withdrawTips;
    public final String withdrawTipsIcon;
    public static final RedPacketModel$a Companion;
    public static final long serialVersionUID;

    static {
       RedPacketModel.Companion = new RedPacketModel$a(null);
    }
    public void RedPacketModel(String p0,String p1,String p2,String p3,long p4,String p5,String p6,String p7,String p8,String p9,String p10,String p11){
       super();
       this.topBackgroundImg = p0;
       this.headImg = p1;
       this.title = p2;
       this.subTitle = p3;
       this.money = p4;
       this.unit = p5;
       this.buttonContent = p6;
       this.buttonUrl = p7;
       this.withdrawTips = p8;
       this.withdrawTipsIcon = p9;
       this.tkExtParams = p10;
       this.traceDetail = p11;
    }
    public void RedPacketModel(String p0,String p1,String p2,String p3,long p4,String p5,String p6,String p7,String p8,String p9,String p10,String p11,int p12,u p13){
       long l = (p12 & 0x10)? 0: p4;
       super(p0, p1, p2, p3, l, p5, p6, p7, p8, p9, p10, p11);
       return;
    }
    public static RedPacketModel copy$default(RedPacketModel p0,String p1,String p2,String p3,String p4,long p5,String p6,String p7,String p8,String p9,String p10,String p11,String p12,int p13,Object p14){
       RedPacketModel redPacketMod = p0;
       int i = p13;
       RedPacketModel topBackgroun = (i & 0x01)? redPacketMod.topBackgroundImg: p1;
       RedPacketModel headImg = (i & 0x02)? redPacketMod.headImg: p2;
       RedPacketModel title = (i & 0x04)? redPacketMod.title: p3;
       RedPacketModel subTitle = (i & 0x08)? redPacketMod.subTitle: p4;
       RedPacketModel money = (i & 0x10)? redPacketMod.money: p5;
       RedPacketModel unit = (i & 0x20)? redPacketMod.unit: p6;
       RedPacketModel buttonConten = (i & 0x40)? redPacketMod.buttonContent: p7;
       RedPacketModel buttonUrl = (i & 0x0080)? redPacketMod.buttonUrl: p8;
       RedPacketModel withdrawTips = (i & 0x0100)? redPacketMod.withdrawTips: p9;
       RedPacketModel withdrawTips1 = (i & 0x0200)? redPacketMod.withdrawTipsIcon: p10;
       RedPacketModel tkExtParams = (i & 0x0400)? redPacketMod.tkExtParams: p11;
       RedPacketModel traceDetail = (i & 0x0800)? redPacketMod.traceDetail: p12;
       return p0.copy(topBackgroun, headImg, title, subTitle, money, unit, buttonConten, buttonUrl, withdrawTips, withdrawTips1, tkExtParams, traceDetail);
    }
    public final String component1(){
       return this.topBackgroundImg;
    }
    public final String component10(){
       return this.withdrawTipsIcon;
    }
    public final String component11(){
       return this.tkExtParams;
    }
    public final String component12(){
       return this.traceDetail;
    }
    public final String component2(){
       return this.headImg;
    }
    public final String component3(){
       return this.title;
    }
    public final String component4(){
       return this.subTitle;
    }
    public final long component5(){
       return this.money;
    }
    public final String component6(){
       return this.unit;
    }
    public final String component7(){
       return this.buttonContent;
    }
    public final String component8(){
       return this.buttonUrl;
    }
    public final String component9(){
       return this.withdrawTips;
    }
    public final RedPacketModel copy(String p0,String p1,String p2,String p3,long p4,String p5,String p6,String p7,String p8,String p9,String p10,String p11){
       Object obj;
       if (PatchProxy.isSupport(RedPacketModel.class)) {
          Object[] objArray = new Object[12];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = Long.valueOf(p4);
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = p9;
          objArray[10] = p10;
          objArray[11] = p11;
          obj = PatchProxy.apply(objArray, this, RedPacketModel.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       RedPacketModel redPacketMod = new RedPacketModel(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RedPacketModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof RedPacketModel && (a.g(this.topBackgroundImg, p0.topBackgroundImg) && (a.g(this.headImg, p0.headImg) && (a.g(this.title, p0.title) && (a.g(this.subTitle, p0.subTitle) && (!this.money - p0.money && (a.g(this.unit, p0.unit) && (a.g(this.buttonContent, p0.buttonContent) && (a.g(this.buttonUrl, p0.buttonUrl) && (a.g(this.withdrawTips, p0.withdrawTips) && (a.g(this.withdrawTipsIcon, p0.withdrawTipsIcon) && (a.g(this.tkExtParams, p0.tkExtParams) && a.g(this.traceDetail, p0.traceDetail)))))))))))))) {
          return true;
       }
       return false;
    }
    public final String getButtonContent(){
       return this.buttonContent;
    }
    public final String getButtonUrl(){
       return this.buttonUrl;
    }
    public final String getHeadImg(){
       return this.headImg;
    }
    public final long getMoney(){
       return this.money;
    }
    public final String getSubTitle(){
       return this.subTitle;
    }
    public final String getTitle(){
       return this.title;
    }
    public final String getTkExtParams(){
       return this.tkExtParams;
    }
    public final String getTopBackgroundImg(){
       return this.topBackgroundImg;
    }
    public final String getTraceDetail(){
       return this.traceDetail;
    }
    public final String getUnit(){
       return this.unit;
    }
    public final String getWithdrawTips(){
       return this.withdrawTips;
    }
    public final String getWithdrawTipsIcon(){
       return this.withdrawTipsIcon;
    }
    public int hashCode(){
       RedPacketModel obj = PatchProxy.apply(null, this, RedPacketModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.topBackgroundImg;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       RedPacketModel theadImg = this.headImg;
       int i2 = (theadImg != null)? theadImg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       theadImg = this.title;
       i2 = (theadImg != null)? theadImg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       theadImg = this.subTitle;
       i2 = (theadImg != null)? theadImg.hashCode(): 0;
       theadImg = this.money;
       i1 = (((i1 + i2) * 31) + (int)(theadImg ^ (theadImg >> 32))) * 31;
       theadImg = this.unit;
       i2 = (theadImg != null)? theadImg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       theadImg = this.buttonContent;
       i2 = (theadImg != null)? theadImg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       theadImg = this.buttonUrl;
       i2 = (theadImg != null)? theadImg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       theadImg = this.withdrawTips;
       i2 = (theadImg != null)? theadImg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       theadImg = this.withdrawTipsIcon;
       i2 = (theadImg != null)? theadImg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       theadImg = this.tkExtParams;
       i2 = (theadImg != null)? theadImg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       theadImg = this.traceDetail;
       if (theadImg != null) {
          i = theadImg.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RedPacketModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RedPacketModel\(topBackgroundImg="+this.topBackgroundImg+", headImg="+this.headImg+", title="+this.title+", subTitle="+this.subTitle+", money="+this.money+", unit="+this.unit+", buttonContent="+this.buttonContent+", buttonUrl="+this.buttonUrl+", withdrawTips="+this.withdrawTips+", withdrawTipsIcon="+this.withdrawTipsIcon+", tkExtParams="+this.tkExtParams+", traceDetail="+this.traceDetail+"\)";
    }
}
