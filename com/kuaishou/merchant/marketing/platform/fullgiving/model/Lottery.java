package com.kuaishou.merchant.marketing.platform.fullgiving.model.Lottery;
import java.io.Serializable;
import com.kuaishou.merchant.marketing.platform.fullgiving.model.Lottery$a;
import nsd.u;
import java.util.List;
import java.lang.String;
import java.lang.Long;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class Lottery implements Serializable	// class@001b26
{
    public List backgroundImage;
    public List buttonImage;
    public String buttonText;
    public String clickUrl;
    public Long delayTime;
    public Long displayTime;
    public List headImage;
    public String subTitle;
    public String title;
    public static final Lottery$a Companion;
    public static final long serialVersionUID;

    static {
       Lottery.Companion = new Lottery$a(null);
    }
    public void Lottery(List p0,List p1,String p2,String p3,Long p4,Long p5,List p6,String p7,String p8){
       super();
       this.backgroundImage = p0;
       this.buttonImage = p1;
       this.buttonText = p2;
       this.clickUrl = p3;
       this.delayTime = p4;
       this.displayTime = p5;
       this.headImage = p6;
       this.title = p7;
       this.subTitle = p8;
    }
    public static Lottery copy$default(Lottery p0,List p1,List p2,String p3,String p4,Long p5,Long p6,List p7,String p8,String p9,int p10,Object p11){
       Lottery lottery = p0;
       int i = p10;
       Lottery backgroundIm = (i & 0x01)? lottery.backgroundImage: p1;
       Lottery buttonImage = (i & 0x02)? lottery.buttonImage: p2;
       Lottery buttonText = (i & 0x04)? lottery.buttonText: p3;
       Lottery clickUrl = (i & 0x08)? lottery.clickUrl: p4;
       Lottery delayTime = (i & 0x10)? lottery.delayTime: p5;
       Lottery displayTime = (i & 0x20)? lottery.displayTime: p6;
       Lottery headImage = (i & 0x40)? lottery.headImage: p7;
       Lottery title = (i & 0x0080)? lottery.title: p8;
       Lottery subTitle = (i & 0x0100)? lottery.subTitle: p9;
       return p0.copy(backgroundIm, buttonImage, buttonText, clickUrl, delayTime, displayTime, headImage, title, subTitle);
    }
    public final List component1(){
       return this.backgroundImage;
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
    public final List component7(){
       return this.headImage;
    }
    public final String component8(){
       return this.title;
    }
    public final String component9(){
       return this.subTitle;
    }
    public final Lottery copy(List p0,List p1,String p2,String p3,Long p4,Long p5,List p6,String p7,String p8){
       Object obj;
       if (PatchProxy.isSupport(Lottery.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          obj = PatchProxy.apply(objArray, this, Lottery.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       Lottery lottery = new Lottery(p0, p1, p2, p3, p4, p5, p6, p7, p8);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Lottery.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof Lottery && (a.g(this.backgroundImage, p0.backgroundImage) && (a.g(this.buttonImage, p0.buttonImage) && (a.g(this.buttonText, p0.buttonText) && (a.g(this.clickUrl, p0.clickUrl) && (a.g(this.delayTime, p0.delayTime) && (a.g(this.displayTime, p0.displayTime) && (a.g(this.headImage, p0.headImage) && (a.g(this.title, p0.title) && a.g(this.subTitle, p0.subTitle))))))))))) {
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
    public final Long getDelayTime(){
       return this.delayTime;
    }
    public final Long getDisplayTime(){
       return this.displayTime;
    }
    public final List getHeadImage(){
       return this.headImage;
    }
    public final String getSubTitle(){
       return this.subTitle;
    }
    public final String getTitle(){
       return this.title;
    }
    public int hashCode(){
       Lottery obj = PatchProxy.apply(null, this, Lottery.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.backgroundImage;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       Lottery tbuttonImage = this.buttonImage;
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
       tbuttonImage = this.headImage;
       i2 = (tbuttonImage != null)? tbuttonImage.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuttonImage = this.title;
       i2 = (tbuttonImage != null)? tbuttonImage.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuttonImage = this.subTitle;
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
    public final void setDelayTime(Long p0){
       this.delayTime = p0;
    }
    public final void setDisplayTime(Long p0){
       this.displayTime = p0;
    }
    public final void setHeadImage(List p0){
       this.headImage = p0;
    }
    public final void setSubTitle(String p0){
       this.subTitle = p0;
    }
    public final void setTitle(String p0){
       this.title = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, Lottery.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Lottery\(backgroundImage="+this.backgroundImage+", buttonImage="+this.buttonImage+", buttonText="+this.buttonText+", clickUrl="+this.clickUrl+", delayTime="+this.delayTime+", displayTime="+this.displayTime+", headImage="+this.headImage+", title="+this.title+", subTitle="+this.subTitle+"\)";
    }
}
