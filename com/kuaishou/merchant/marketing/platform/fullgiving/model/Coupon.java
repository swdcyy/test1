package com.kuaishou.merchant.marketing.platform.fullgiving.model.Coupon;
import java.io.Serializable;
import com.kuaishou.merchant.marketing.platform.fullgiving.model.Coupon$a;
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

public final class Coupon implements Serializable	// class@001b20
{
    public List backgroundCdnUrl;
    public String backgroundUrl;
    public Long couponId;
    public String couponTemplateId;
    public String couponTypeDesc;
    public String expireTimeDesc;
    public String fullAmount;
    public Long reduceAmount;
    public static final Coupon$a Companion;
    public static final long serialVersionUID;

    static {
       Coupon.Companion = new Coupon$a(null);
    }
    public void Coupon(List p0,String p1,String p2,String p3,String p4,String p5,Long p6,Long p7){
       super();
       this.backgroundCdnUrl = p0;
       this.backgroundUrl = p1;
       this.couponTypeDesc = p2;
       this.expireTimeDesc = p3;
       this.couponTemplateId = p4;
       this.fullAmount = p5;
       this.reduceAmount = p6;
       this.couponId = p7;
    }
    public static Coupon copy$default(Coupon p0,List p1,String p2,String p3,String p4,String p5,String p6,Long p7,Long p8,int p9,Object p10){
       Coupon uCoupon = p0;
       int i = p9;
       Coupon backgroundCd = (i & 0x01)? uCoupon.backgroundCdnUrl: p1;
       Coupon backgroundUr = (i & 0x02)? uCoupon.backgroundUrl: p2;
       Coupon couponTypeDe = (i & 0x04)? uCoupon.couponTypeDesc: p3;
       Coupon expireTimeDe = (i & 0x08)? uCoupon.expireTimeDesc: p4;
       Coupon couponTempla = (i & 0x10)? uCoupon.couponTemplateId: p5;
       Coupon fullAmount = (i & 0x20)? uCoupon.fullAmount: p6;
       Coupon reduceAmount = (i & 0x40)? uCoupon.reduceAmount: p7;
       Coupon couponId = (i & 0x0080)? uCoupon.couponId: p8;
       return p0.copy(backgroundCd, backgroundUr, couponTypeDe, expireTimeDe, couponTempla, fullAmount, reduceAmount, couponId);
    }
    public final List component1(){
       return this.backgroundCdnUrl;
    }
    public final String component2(){
       return this.backgroundUrl;
    }
    public final String component3(){
       return this.couponTypeDesc;
    }
    public final String component4(){
       return this.expireTimeDesc;
    }
    public final String component5(){
       return this.couponTemplateId;
    }
    public final String component6(){
       return this.fullAmount;
    }
    public final Long component7(){
       return this.reduceAmount;
    }
    public final Long component8(){
       return this.couponId;
    }
    public final Coupon copy(List p0,String p1,String p2,String p3,String p4,String p5,Long p6,Long p7){
       Object obj;
       if (PatchProxy.isSupport(Coupon.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6,p7};
          obj = PatchProxy.apply(objArray, this, Coupon.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       Coupon uCoupon = new Coupon(p0, p1, p2, p3, p4, p5, p6, p7);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Coupon.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof Coupon && (a.g(this.backgroundCdnUrl, p0.backgroundCdnUrl) && (a.g(this.backgroundUrl, p0.backgroundUrl) && (a.g(this.couponTypeDesc, p0.couponTypeDesc) && (a.g(this.expireTimeDesc, p0.expireTimeDesc) && (a.g(this.couponTemplateId, p0.couponTemplateId) && (a.g(this.fullAmount, p0.fullAmount) && (a.g(this.reduceAmount, p0.reduceAmount) && a.g(this.couponId, p0.couponId)))))))))) {
          return true;
       }
       return false;
    }
    public final List getBackgroundCdnUrl(){
       return this.backgroundCdnUrl;
    }
    public final String getBackgroundUrl(){
       return this.backgroundUrl;
    }
    public final Long getCouponId(){
       return this.couponId;
    }
    public final String getCouponTemplateId(){
       return this.couponTemplateId;
    }
    public final String getCouponTypeDesc(){
       return this.couponTypeDesc;
    }
    public final String getExpireTimeDesc(){
       return this.expireTimeDesc;
    }
    public final String getFullAmount(){
       return this.fullAmount;
    }
    public final Long getReduceAmount(){
       return this.reduceAmount;
    }
    public int hashCode(){
       Coupon obj = PatchProxy.apply(null, this, Coupon.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.backgroundCdnUrl;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       Coupon tbackgroundU = this.backgroundUrl;
       int i2 = (tbackgroundU != null)? tbackgroundU.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbackgroundU = this.couponTypeDesc;
       i2 = (tbackgroundU != null)? tbackgroundU.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbackgroundU = this.expireTimeDesc;
       i2 = (tbackgroundU != null)? tbackgroundU.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbackgroundU = this.couponTemplateId;
       i2 = (tbackgroundU != null)? tbackgroundU.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbackgroundU = this.fullAmount;
       i2 = (tbackgroundU != null)? tbackgroundU.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbackgroundU = this.reduceAmount;
       i2 = (tbackgroundU != null)? tbackgroundU.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbackgroundU = this.couponId;
       if (tbackgroundU != null) {
          i = tbackgroundU.hashCode();
       }
       return (i1 + i);
    }
    public final void setBackgroundCdnUrl(List p0){
       this.backgroundCdnUrl = p0;
    }
    public final void setBackgroundUrl(String p0){
       this.backgroundUrl = p0;
    }
    public final void setCouponId(Long p0){
       this.couponId = p0;
    }
    public final void setCouponTemplateId(String p0){
       this.couponTemplateId = p0;
    }
    public final void setCouponTypeDesc(String p0){
       this.couponTypeDesc = p0;
    }
    public final void setExpireTimeDesc(String p0){
       this.expireTimeDesc = p0;
    }
    public final void setFullAmount(String p0){
       this.fullAmount = p0;
    }
    public final void setReduceAmount(Long p0){
       this.reduceAmount = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, Coupon.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Coupon\(backgroundCdnUrl="+this.backgroundCdnUrl+", backgroundUrl="+this.backgroundUrl+", couponTypeDesc="+this.couponTypeDesc+", expireTimeDesc="+this.expireTimeDesc+", couponTemplateId="+this.couponTemplateId+", fullAmount="+this.fullAmount+", reduceAmount="+this.reduceAmount+", couponId="+this.couponId+"\)";
    }
}
