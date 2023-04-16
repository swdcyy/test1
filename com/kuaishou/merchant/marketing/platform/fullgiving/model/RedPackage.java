package com.kuaishou.merchant.marketing.platform.fullgiving.model.RedPackage;
import java.io.Serializable;
import com.kuaishou.merchant.marketing.platform.fullgiving.model.RedPackage$a;
import nsd.u;
import java.util.List;
import java.lang.String;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class RedPackage implements Serializable	// class@001b2c
{
    public List backgroundImage;
    public List buttonImage;
    public String buttonText;
    public String clickUrl;
    public String couponTemplateId;
    public Long delayTime;
    public Long displayTime;
    public Long endTime;
    public Long price;
    public String subTitle;
    public String threshold;
    public String title;
    public Integer type;
    public static final RedPackage$a Companion;
    public static final long serialVersionUID;

    static {
       RedPackage.Companion = new RedPackage$a(null);
    }
    public void RedPackage(List p0,List p1,String p2,String p3,Long p4,Long p5,Long p6,Long p7,String p8,String p9,String p10,String p11,Integer p12){
       super();
       this.backgroundImage = p0;
       this.buttonImage = p1;
       this.buttonText = p2;
       this.clickUrl = p3;
       this.delayTime = p4;
       this.displayTime = p5;
       this.endTime = p6;
       this.price = p7;
       this.subTitle = p8;
       this.threshold = p9;
       this.title = p10;
       this.couponTemplateId = p11;
       this.type = p12;
    }
    public static RedPackage copy$default(RedPackage p0,List p1,List p2,String p3,String p4,Long p5,Long p6,Long p7,Long p8,String p9,String p10,String p11,String p12,Integer p13,int p14,Object p15){
       RedPackage redPackage = p0;
       int i = p14;
       RedPackage backgroundIm = (i & 0x01)? redPackage.backgroundImage: p1;
       RedPackage buttonImage = (i & 0x02)? redPackage.buttonImage: p2;
       RedPackage buttonText = (i & 0x04)? redPackage.buttonText: p3;
       RedPackage clickUrl = (i & 0x08)? redPackage.clickUrl: p4;
       RedPackage delayTime = (i & 0x10)? redPackage.delayTime: p5;
       RedPackage displayTime = (i & 0x20)? redPackage.displayTime: p6;
       RedPackage endTime = (i & 0x40)? redPackage.endTime: p7;
       RedPackage price = (i & 0x0080)? redPackage.price: p8;
       RedPackage subTitle = (i & 0x0100)? redPackage.subTitle: p9;
       RedPackage threshold = (i & 0x0200)? redPackage.threshold: p10;
       RedPackage title = (i & 0x0400)? redPackage.title: p11;
       RedPackage couponTempla = (i & 0x0800)? redPackage.couponTemplateId: p12;
       RedPackage type = (i & 0x1000)? redPackage.type: p13;
       return p0.copy(backgroundIm, buttonImage, buttonText, clickUrl, delayTime, displayTime, endTime, price, subTitle, threshold, title, couponTempla, type);
    }
    public final List component1(){
       return this.backgroundImage;
    }
    public final String component10(){
       return this.threshold;
    }
    public final String component11(){
       return this.title;
    }
    public final String component12(){
       return this.couponTemplateId;
    }
    public final Integer component13(){
       return this.type;
    }
    public final List component2(){
       return this.buttonImage;
    }
    public final String component3(){
       return this.buttonText;
    }
    public final String component4(){
       return this.clickUrl;
    }
    public final Long component5(){
       return this.delayTime;
    }
    public final Long component6(){
       return this.displayTime;
    }
    public final Long component7(){
       return this.endTime;
    }
    public final Long component8(){
       return this.price;
    }
    public final String component9(){
       return this.subTitle;
    }
    public final RedPackage copy(List p0,List p1,String p2,String p3,Long p4,Long p5,Long p6,Long p7,String p8,String p9,String p10,String p11,Integer p12){
       Object obj;
       if (PatchProxy.isSupport(RedPackage.class)) {
          Object[] objArray = new Object[13];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = p9;
          objArray[10] = p10;
          objArray[11] = p11;
          objArray[12] = p12;
          obj = PatchProxy.apply(objArray, this, RedPackage.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       RedPackage redPackage = new RedPackage(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RedPackage.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof RedPackage && (a.g(this.backgroundImage, p0.backgroundImage) && (a.g(this.buttonImage, p0.buttonImage) && (a.g(this.buttonText, p0.buttonText) && (a.g(this.clickUrl, p0.clickUrl) && (a.g(this.delayTime, p0.delayTime) && (a.g(this.displayTime, p0.displayTime) && (a.g(this.endTime, p0.endTime) && (a.g(this.price, p0.price) && (a.g(this.subTitle, p0.subTitle) && (a.g(this.threshold, p0.threshold) && (a.g(this.title, p0.title) && (a.g(this.couponTemplateId, p0.couponTemplateId) && a.g(this.type, p0.type))))))))))))))) {
          return true;
       }
       return false;
    }
    public final List getBackgroundImage(){
       return this.backgroundImage;
    }
    public final List getButtonImage(){
       return this.buttonImage;
    }
    public final String getButtonText(){
       return this.buttonText;
    }
    public final String getClickUrl(){
       return this.clickUrl;
    }
    public final String getCouponTemplateId(){
       return this.couponTemplateId;
    }
    public final Long getDelayTime(){
       return this.delayTime;
    }
    public final Long getDisplayTime(){
       return this.displayTime;
    }
    public final Long getEndTime(){
       return this.endTime;
    }
    public final Long getPrice(){
       return this.price;
    }
    public final String getSubTitle(){
       return this.subTitle;
    }
    public final String getThreshold(){
       return this.threshold;
    }
    public final String getTitle(){
       return this.title;
    }
    public final Integer getType(){
       return this.type;
    }
    public int hashCode(){
       RedPackage obj = PatchProxy.apply(null, this, RedPackage.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.backgroundImage;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       RedPackage tbuttonImage = this.buttonImage;
       int i2 = (tbuttonImage != null)? tbuttonImage.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuttonImage = this.buttonText;
       i2 = (tbuttonImage != null)? tbuttonImage.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuttonImage = this.clickUrl;
       i2 = (tbuttonImage != null)? tbuttonImage.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuttonImage = this.delayTime;
       i2 = (tbuttonImage != null)? tbuttonImage.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuttonImage = this.displayTime;
       i2 = (tbuttonImage != null)? tbuttonImage.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuttonImage = this.endTime;
       i2 = (tbuttonImage != null)? tbuttonImage.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuttonImage = this.price;
       i2 = (tbuttonImage != null)? tbuttonImage.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuttonImage = this.subTitle;
       i2 = (tbuttonImage != null)? tbuttonImage.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuttonImage = this.threshold;
       i2 = (tbuttonImage != null)? tbuttonImage.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuttonImage = this.title;
       i2 = (tbuttonImage != null)? tbuttonImage.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuttonImage = this.couponTemplateId;
       i2 = (tbuttonImage != null)? tbuttonImage.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuttonImage = this.type;
       if (tbuttonImage != null) {
          i = tbuttonImage.hashCode();
       }
       return (i1 + i);
    }
    public final void setBackgroundImage(List p0){
       this.backgroundImage = p0;
    }
    public final void setButtonImage(List p0){
       this.buttonImage = p0;
    }
    public final void setButtonText(String p0){
       this.buttonText = p0;
    }
    public final void setClickUrl(String p0){
       this.clickUrl = p0;
    }
    public final void setCouponTemplateId(String p0){
       this.couponTemplateId = p0;
    }
    public final void setDelayTime(Long p0){
       this.delayTime = p0;
    }
    public final void setDisplayTime(Long p0){
       this.displayTime = p0;
    }
    public final void setEndTime(Long p0){
       this.endTime = p0;
    }
    public final void setPrice(Long p0){
       this.price = p0;
    }
    public final void setSubTitle(String p0){
       this.subTitle = p0;
    }
    public final void setThreshold(String p0){
       this.threshold = p0;
    }
    public final void setTitle(String p0){
       this.title = p0;
    }
    public final void setType(Integer p0){
       this.type = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RedPackage.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RedPackage\(backgroundImage="+this.backgroundImage+", buttonImage="+this.buttonImage+", buttonText="+this.buttonText+", clickUrl="+this.clickUrl+", delayTime="+this.delayTime+", displayTime="+this.displayTime+", endTime="+this.endTime+", price="+this.price+", subTitle="+this.subTitle+", threshold="+this.threshold+", title="+this.title+", couponTemplateId="+this.couponTemplateId+", type="+this.type+"\)";
    }
}
