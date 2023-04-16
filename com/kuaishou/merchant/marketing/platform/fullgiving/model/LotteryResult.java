package com.kuaishou.merchant.marketing.platform.fullgiving.model.LotteryResult;
import java.io.Serializable;
import com.kuaishou.merchant.marketing.platform.fullgiving.model.LotteryResult$a;
import nsd.u;
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

public final class LotteryResult implements Serializable	// class@001b28
{
    public String button;
    public String clickUrl;
    public String content;
    public Long displayTime;
    public Integer price;
    public String title;
    public static final LotteryResult$a Companion;
    public static final long serialVersionUID;

    static {
       LotteryResult.Companion = new LotteryResult$a(null);
    }
    public void LotteryResult(String p0,String p1,String p2,Long p3,Integer p4,String p5){
       super();
       this.button = p0;
       this.clickUrl = p1;
       this.content = p2;
       this.displayTime = p3;
       this.price = p4;
       this.title = p5;
    }
    public static LotteryResult copy$default(LotteryResult p0,String p1,String p2,String p3,Long p4,Integer p5,String p6,int p7,Object p8){
       LotteryResult button;
       LotteryResult clickUrl;
       LotteryResult content;
       LotteryResult displayTime;
       LotteryResult price;
       LotteryResult title;
       if (p7 & 0x01) {
          button = p0.button;
       }
       if (p7 & 0x02) {
          clickUrl = p0.clickUrl;
       }
       p8 = clickUrl;
       if (p7 & 0x04) {
          content = p0.content;
       }
       LotteryResult lotteryResul = content;
       if (p7 & 0x08) {
          displayTime = p0.displayTime;
       }
       LotteryResult lotteryResul1 = displayTime;
       if (p7 & 0x10) {
          price = p0.price;
       }
       LotteryResult lotteryResul2 = price;
       if (p7 & 0x20) {
          title = p0.title;
       }
       return p0.copy(button, p8, lotteryResul, lotteryResul1, lotteryResul2, title);
    }
    public final String component1(){
       return this.button;
    }
    public final String component2(){
       return this.clickUrl;
    }
    public final String component3(){
       return this.content;
    }
    public final Long component4(){
       return this.displayTime;
    }
    public final Integer component5(){
       return this.price;
    }
    public final String component6(){
       return this.title;
    }
    public final LotteryResult copy(String p0,String p1,String p2,Long p3,Integer p4,String p5){
       Object obj;
       if (PatchProxy.isSupport(LotteryResult.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          obj = PatchProxy.apply(objArray, this, LotteryResult.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       LotteryResult lotteryResul = new LotteryResult(p0, p1, p2, p3, p4, p5);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LotteryResult.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LotteryResult && (a.g(this.button, p0.button) && (a.g(this.clickUrl, p0.clickUrl) && (a.g(this.content, p0.content) && (a.g(this.displayTime, p0.displayTime) && (a.g(this.price, p0.price) && a.g(this.title, p0.title)))))))) {
          return true;
       }
       return false;
    }
    public final String getButton(){
       return this.button;
    }
    public final String getClickUrl(){
       return this.clickUrl;
    }
    public final String getContent(){
       return this.content;
    }
    public final Long getDisplayTime(){
       return this.displayTime;
    }
    public final Integer getPrice(){
       return this.price;
    }
    public final String getTitle(){
       return this.title;
    }
    public int hashCode(){
       LotteryResult obj = PatchProxy.apply(null, this, LotteryResult.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.button;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LotteryResult tclickUrl = this.clickUrl;
       int i2 = (tclickUrl != null)? tclickUrl.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tclickUrl = this.content;
       i2 = (tclickUrl != null)? tclickUrl.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tclickUrl = this.displayTime;
       i2 = (tclickUrl != null)? tclickUrl.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tclickUrl = this.price;
       i2 = (tclickUrl != null)? tclickUrl.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tclickUrl = this.title;
       if (tclickUrl != null) {
          i = tclickUrl.hashCode();
       }
       return (i1 + i);
    }
    public final void setButton(String p0){
       this.button = p0;
    }
    public final void setClickUrl(String p0){
       this.clickUrl = p0;
    }
    public final void setContent(String p0){
       this.content = p0;
    }
    public final void setDisplayTime(Long p0){
       this.displayTime = p0;
    }
    public final void setPrice(Integer p0){
       this.price = p0;
    }
    public final void setTitle(String p0){
       this.title = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LotteryResult.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LotteryResult\(button="+this.button+", clickUrl="+this.clickUrl+", content="+this.content+", displayTime="+this.displayTime+", price="+this.price+", title="+this.title+"\)";
    }
}
