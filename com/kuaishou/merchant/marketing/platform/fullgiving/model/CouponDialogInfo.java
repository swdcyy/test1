package com.kuaishou.merchant.marketing.platform.fullgiving.model.CouponDialogInfo;
import java.io.Serializable;
import com.kuaishou.merchant.marketing.platform.fullgiving.model.CouponDialogInfo$a;
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

public final class CouponDialogInfo implements Serializable	// class@001b22
{
    public List buttonBackgroundCdnUrl;
    public String buttonBackgroundUrl;
    public String buttonName;
    public List couponBackgroundCdnUrl;
    public String couponBackgroundUrl;
    public List couponBeforeBackgroundCdnUrl;
    public String couponBeforeBackgroundUrl;
    public List couponList;
    public Long displayTimestamp;
    public Long expireTimestamp;
    public String jumpUrl;
    public String subTitle;
    public String tips;
    public String title;
    public List topBackgroundCdnUrl;
    public String topBackgroundUrl;
    public static final CouponDialogInfo$a Companion;
    public static final long serialVersionUID;

    static {
       CouponDialogInfo.Companion = new CouponDialogInfo$a(null);
    }
    public void CouponDialogInfo(List p0,String p1,String p2,List p3,String p4,List p5,String p6,List p7,Long p8,Long p9,String p10,String p11,String p12,String p13,List p14,String p15){
       int i = this;
       super();
       i.buttonBackgroundCdnUrl = p0;
       i.buttonBackgroundUrl = p1;
       i.buttonName = p2;
       i.couponBackgroundCdnUrl = p3;
       i.couponBackgroundUrl = p4;
       i.couponBeforeBackgroundCdnUrl = p5;
       i.couponBeforeBackgroundUrl = p6;
       i.couponList = p7;
       i.displayTimestamp = p8;
       i.expireTimestamp = p9;
       i.jumpUrl = p10;
       i.subTitle = p11;
       i.tips = p12;
       i.title = p13;
       i.topBackgroundCdnUrl = p14;
       i.topBackgroundUrl = p15;
    }
    public static CouponDialogInfo copy$default(CouponDialogInfo p0,List p1,String p2,String p3,List p4,String p5,List p6,String p7,List p8,Long p9,Long p10,String p11,String p12,String p13,String p14,List p15,String p16,int p17,Object p18){
       int i1;
       CouponDialogInfo uCouponDialo = p0;
       int i = p17;
       CouponDialogInfo buttonBackgr = (i & 0x01)? uCouponDialo.buttonBackgroundCdnUrl: p1;
       CouponDialogInfo buttonBackgr1 = (i & 0x02)? uCouponDialo.buttonBackgroundUrl: p2;
       CouponDialogInfo buttonName = (i & 0x04)? uCouponDialo.buttonName: p3;
       CouponDialogInfo couponBackgr = (i & 0x08)? uCouponDialo.couponBackgroundCdnUrl: p4;
       CouponDialogInfo couponBackgr1 = (i & 0x10)? uCouponDialo.couponBackgroundUrl: p5;
       CouponDialogInfo couponBefore = (i & 0x20)? uCouponDialo.couponBeforeBackgroundCdnUrl: p6;
       CouponDialogInfo couponBefore1 = (i & 0x40)? uCouponDialo.couponBeforeBackgroundUrl: p7;
       CouponDialogInfo couponList = (i & 0x0080)? uCouponDialo.couponList: p8;
       CouponDialogInfo displayTimes = (i & 0x0100)? uCouponDialo.displayTimestamp: p9;
       CouponDialogInfo expireTimest = (i & 0x0200)? uCouponDialo.expireTimestamp: p10;
       CouponDialogInfo jumpUrl = (i & 0x0400)? uCouponDialo.jumpUrl: p11;
       CouponDialogInfo subTitle = (i & 0x0800)? uCouponDialo.subTitle: p12;
       CouponDialogInfo tips = (i & 0x1000)? uCouponDialo.tips: p13;
       CouponDialogInfo title = (i & 0x2000)? uCouponDialo.title: p14;
       CouponDialogInfo uCouponDialo1 = title;
       title = (i & 0x4000)? uCouponDialo.topBackgroundCdnUrl: p15;
       CouponDialogInfo topBackgroun = (i & 0x8000)? uCouponDialo.topBackgroundUrl: p16;
       return p0.copy(buttonBackgr, buttonBackgr1, buttonName, couponBackgr, couponBackgr1, couponBefore, couponBefore1, couponList, displayTimes, expireTimest, jumpUrl, subTitle, tips, uCouponDialo1, title, topBackgroun);
    }
    public final List component1(){
       return this.buttonBackgroundCdnUrl;
    }
    public final Long component10(){
       return this.expireTimestamp;
    }
    public final String component11(){
       return this.jumpUrl;
    }
    public final String component12(){
       return this.subTitle;
    }
    public final String component13(){
       return this.tips;
    }
    public final String component14(){
       return this.title;
    }
    public final List component15(){
       return this.topBackgroundCdnUrl;
    }
    public final String component16(){
       return this.topBackgroundUrl;
    }
    public final String component2(){
       return this.buttonBackgroundUrl;
    }
    public final String component3(){
       return this.buttonName;
    }
    public final List component4(){
       return this.couponBackgroundCdnUrl;
    }
    public final String component5(){
       return this.couponBackgroundUrl;
    }
    public final List component6(){
       return this.couponBeforeBackgroundCdnUrl;
    }
    public final String component7(){
       return this.couponBeforeBackgroundUrl;
    }
    public final List component8(){
       return this.couponList;
    }
    public final Long component9(){
       return this.displayTimestamp;
    }
    public final CouponDialogInfo copy(List p0,String p1,String p2,List p3,String p4,List p5,String p6,List p7,Long p8,Long p9,String p10,String p11,String p12,String p13,List p14,String p15){
       Object obj;
       if (PatchProxy.isSupport(CouponDialogInfo.class)) {
          Object[] objArray = new Object[16];
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
          objArray[13] = p13;
          objArray[14] = p14;
          objArray[15] = p15;
          obj = PatchProxy.apply(objArray, this, CouponDialogInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       CouponDialogInfo uCouponDialo = new CouponDialogInfo(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CouponDialogInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof CouponDialogInfo && (a.g(this.buttonBackgroundCdnUrl, p0.buttonBackgroundCdnUrl) && (a.g(this.buttonBackgroundUrl, p0.buttonBackgroundUrl) && (a.g(this.buttonName, p0.buttonName) && (a.g(this.couponBackgroundCdnUrl, p0.couponBackgroundCdnUrl) && (a.g(this.couponBackgroundUrl, p0.couponBackgroundUrl) && (a.g(this.couponBeforeBackgroundCdnUrl, p0.couponBeforeBackgroundCdnUrl) && (a.g(this.couponBeforeBackgroundUrl, p0.couponBeforeBackgroundUrl) && (a.g(this.couponList, p0.couponList) && (a.g(this.displayTimestamp, p0.displayTimestamp) && (a.g(this.expireTimestamp, p0.expireTimestamp) && (a.g(this.jumpUrl, p0.jumpUrl) && (a.g(this.subTitle, p0.subTitle) && (a.g(this.tips, p0.tips) && (a.g(this.title, p0.title) && (a.g(this.topBackgroundCdnUrl, p0.topBackgroundCdnUrl) && a.g(this.topBackgroundUrl, p0.topBackgroundUrl)))))))))))))))))) {
          return true;
       }
       return false;
    }
    public final List getButtonBackgroundCdnUrl(){
       return this.buttonBackgroundCdnUrl;
    }
    public final String getButtonBackgroundUrl(){
       return this.buttonBackgroundUrl;
    }
    public final String getButtonName(){
       return this.buttonName;
    }
    public final List getCouponBackgroundCdnUrl(){
       return this.couponBackgroundCdnUrl;
    }
    public final String getCouponBackgroundUrl(){
       return this.couponBackgroundUrl;
    }
    public final List getCouponBeforeBackgroundCdnUrl(){
       return this.couponBeforeBackgroundCdnUrl;
    }
    public final String getCouponBeforeBackgroundUrl(){
       return this.couponBeforeBackgroundUrl;
    }
    public final List getCouponList(){
       return this.couponList;
    }
    public final Long getDisplayTimestamp(){
       return this.displayTimestamp;
    }
    public final Long getExpireTimestamp(){
       return this.expireTimestamp;
    }
    public final String getJumpUrl(){
       return this.jumpUrl;
    }
    public final String getSubTitle(){
       return this.subTitle;
    }
    public final String getTips(){
       return this.tips;
    }
    public final String getTitle(){
       return this.title;
    }
    public final List getTopBackgroundCdnUrl(){
       return this.topBackgroundCdnUrl;
    }
    public final String getTopBackgroundUrl(){
       return this.topBackgroundUrl;
    }
    public int hashCode(){
       CouponDialogInfo obj = PatchProxy.apply(null, this, CouponDialogInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.buttonBackgroundCdnUrl;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       CouponDialogInfo tbuttonBackg = this.buttonBackgroundUrl;
       int i2 = (tbuttonBackg != null)? tbuttonBackg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuttonBackg = this.buttonName;
       i2 = (tbuttonBackg != null)? tbuttonBackg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuttonBackg = this.couponBackgroundCdnUrl;
       i2 = (tbuttonBackg != null)? tbuttonBackg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuttonBackg = this.couponBackgroundUrl;
       i2 = (tbuttonBackg != null)? tbuttonBackg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuttonBackg = this.couponBeforeBackgroundCdnUrl;
       i2 = (tbuttonBackg != null)? tbuttonBackg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuttonBackg = this.couponBeforeBackgroundUrl;
       i2 = (tbuttonBackg != null)? tbuttonBackg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuttonBackg = this.couponList;
       i2 = (tbuttonBackg != null)? tbuttonBackg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuttonBackg = this.displayTimestamp;
       i2 = (tbuttonBackg != null)? tbuttonBackg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuttonBackg = this.expireTimestamp;
       i2 = (tbuttonBackg != null)? tbuttonBackg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuttonBackg = this.jumpUrl;
       i2 = (tbuttonBackg != null)? tbuttonBackg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuttonBackg = this.subTitle;
       i2 = (tbuttonBackg != null)? tbuttonBackg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuttonBackg = this.tips;
       i2 = (tbuttonBackg != null)? tbuttonBackg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuttonBackg = this.title;
       i2 = (tbuttonBackg != null)? tbuttonBackg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuttonBackg = this.topBackgroundCdnUrl;
       i2 = (tbuttonBackg != null)? tbuttonBackg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuttonBackg = this.topBackgroundUrl;
       if (tbuttonBackg != null) {
          i = tbuttonBackg.hashCode();
       }
       return (i1 + i);
    }
    public final void setButtonBackgroundCdnUrl(List p0){
       this.buttonBackgroundCdnUrl = p0;
    }
    public final void setButtonBackgroundUrl(String p0){
       this.buttonBackgroundUrl = p0;
    }
    public final void setButtonName(String p0){
       this.buttonName = p0;
    }
    public final void setCouponBackgroundCdnUrl(List p0){
       this.couponBackgroundCdnUrl = p0;
    }
    public final void setCouponBackgroundUrl(String p0){
       this.couponBackgroundUrl = p0;
    }
    public final void setCouponBeforeBackgroundCdnUrl(List p0){
       this.couponBeforeBackgroundCdnUrl = p0;
    }
    public final void setCouponBeforeBackgroundUrl(String p0){
       this.couponBeforeBackgroundUrl = p0;
    }
    public final void setCouponList(List p0){
       this.couponList = p0;
    }
    public final void setDisplayTimestamp(Long p0){
       this.displayTimestamp = p0;
    }
    public final void setExpireTimestamp(Long p0){
       this.expireTimestamp = p0;
    }
    public final void setJumpUrl(String p0){
       this.jumpUrl = p0;
    }
    public final void setSubTitle(String p0){
       this.subTitle = p0;
    }
    public final void setTips(String p0){
       this.tips = p0;
    }
    public final void setTitle(String p0){
       this.title = p0;
    }
    public final void setTopBackgroundCdnUrl(List p0){
       this.topBackgroundCdnUrl = p0;
    }
    public final void setTopBackgroundUrl(String p0){
       this.topBackgroundUrl = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CouponDialogInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CouponDialogInfo\(buttonBackgroundCdnUrl="+this.buttonBackgroundCdnUrl+", buttonBackgroundUrl="+this.buttonBackgroundUrl+", buttonName="+this.buttonName+", couponBackgroundCdnUrl="+this.couponBackgroundCdnUrl+", couponBackgroundUrl="+this.couponBackgroundUrl+", couponBeforeBackgroundCdnUrl="+this.couponBeforeBackgroundCdnUrl+", couponBeforeBackgroundUrl="+this.couponBeforeBackgroundUrl+", couponList="+this.couponList+", displayTimestamp="+this.displayTimestamp+", expireTimestamp="+this.expireTimestamp+", jumpUrl="+this.jumpUrl+", subTitle="+this.subTitle+", tips="+this.tips+", title="+this.title+", topBackgroundCdnUrl="+this.topBackgroundCdnUrl+", topBackgroundUrl="+this.topBackgroundUrl+"\)";
    }
}
