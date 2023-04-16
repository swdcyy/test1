package com.kuaishou.live.core.basic.model.LivePayBulletResponse;
import java.io.Serializable;
import com.kuaishou.live.core.basic.model.LivePayBulletResponse$a;
import nsd.u;
import java.lang.String;
import com.kuaishou.live.core.basic.model.LivePayBulletTag;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LivePayBulletResponse implements Serializable	// class@00087a
{
    public final String bulletHint;
    public final LivePayBulletTag bulletTag;
    public final float discount;
    public final boolean enablePayBullet;
    public int leftFreeCount;
    public final String livingType;
    public final int livingTypeVal;
    public final int originPrice;
    public final int price;
    public static final LivePayBulletResponse$a Companion;
    public static final long serialVersionUID;

    static {
       LivePayBulletResponse.Companion = new LivePayBulletResponse$a(null);
    }
    public void LivePayBulletResponse(boolean p0,String p1,int p2,int p3,float p4,int p5,int p6,String p7,LivePayBulletTag p8){
       a.p(p1, "livingType");
       a.p(p7, "bulletHint");
       a.p(p8, "bulletTag");
       super();
       this.enablePayBullet = p0;
       this.livingType = p1;
       this.livingTypeVal = p2;
       this.originPrice = p3;
       this.discount = p4;
       this.price = p5;
       this.leftFreeCount = p6;
       this.bulletHint = p7;
       this.bulletTag = p8;
    }
    public static LivePayBulletResponse copy$default(LivePayBulletResponse p0,boolean p1,String p2,int p3,int p4,float p5,int p6,int p7,String p8,LivePayBulletTag p9,int p10,Object p11){
       LivePayBulletResponse livePayBulle = p0;
       int i = p10;
       LivePayBulletResponse enablePayBul = (i & 0x01)? livePayBulle.enablePayBullet: p1;
       LivePayBulletResponse livingType = (i & 0x02)? livePayBulle.livingType: p2;
       LivePayBulletResponse livingTypeVa = (i & 0x04)? livePayBulle.livingTypeVal: p3;
       LivePayBulletResponse originPrice = (i & 0x08)? livePayBulle.originPrice: p4;
       LivePayBulletResponse discount = (i & 0x10)? livePayBulle.discount: p5;
       LivePayBulletResponse price = (i & 0x20)? livePayBulle.price: p6;
       LivePayBulletResponse leftFreeCoun = (i & 0x40)? livePayBulle.leftFreeCount: p7;
       LivePayBulletResponse bulletHint = (i & 0x0080)? livePayBulle.bulletHint: p8;
       LivePayBulletResponse bulletTag = (i & 0x0100)? livePayBulle.bulletTag: p9;
       return p0.copy(enablePayBul, livingType, livingTypeVa, originPrice, discount, price, leftFreeCoun, bulletHint, bulletTag);
    }
    public final boolean component1(){
       return this.enablePayBullet;
    }
    public final String component2(){
       return this.livingType;
    }
    public final int component3(){
       return this.livingTypeVal;
    }
    public final int component4(){
       return this.originPrice;
    }
    public final float component5(){
       return this.discount;
    }
    public final int component6(){
       return this.price;
    }
    public final int component7(){
       return this.leftFreeCount;
    }
    public final String component8(){
       return this.bulletHint;
    }
    public final LivePayBulletTag component9(){
       return this.bulletTag;
    }
    public final LivePayBulletResponse copy(boolean p0,String p1,int p2,int p3,float p4,int p5,int p6,String p7,LivePayBulletTag p8){
       LivePayBulletResponse obj;
       object oobject = p1;
       object oobject1 = p7;
       object oobject2 = p8;
       if (PatchProxy.isSupport(LivePayBulletResponse.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = Boolean.valueOf(p0);
          objArray[1] = oobject;
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Float.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = oobject1;
          objArray[8] = oobject2;
          obj = PatchProxy.apply(objArray, this, LivePayBulletResponse.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(p1, "livingType");
       a.p(oobject1, "bulletHint");
       a.p(oobject2, "bulletTag");
       obj = new LivePayBulletResponse(p0, p1, p2, p3, p4, p5, p6, p7, p8);
       return v11;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LivePayBulletResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LivePayBulletResponse && (this.enablePayBullet == p0.enablePayBullet && (a.g(this.livingType, p0.livingType) && (this.livingTypeVal == p0.livingTypeVal && (this.originPrice == p0.originPrice && (!Float.compare(this.discount, p0.discount) && (this.price == p0.price && (this.leftFreeCount == p0.leftFreeCount && (a.g(this.bulletHint, p0.bulletHint) && a.g(this.bulletTag, p0.bulletTag))))))))))) {
          return true;
       }
       return false;
    }
    public final String getBulletHint(){
       return this.bulletHint;
    }
    public final LivePayBulletTag getBulletTag(){
       return this.bulletTag;
    }
    public final float getDiscount(){
       return this.discount;
    }
    public final boolean getEnablePayBullet(){
       return this.enablePayBullet;
    }
    public final int getLeftFreeCount(){
       return this.leftFreeCount;
    }
    public final String getLivingType(){
       return this.livingType;
    }
    public final int getLivingTypeVal(){
       return this.livingTypeVal;
    }
    public final int getOriginPrice(){
       return this.originPrice;
    }
    public final int getPrice(){
       return this.price;
    }
    public int hashCode(){
       int i;
       LivePayBulletResponse obj = PatchProxy.apply(null, this, LivePayBulletResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.enablePayBullet;
       if (obj != null) {
          i = 1;
       }
       i = i * 31;
       LivePayBulletResponse tlivingType = this.livingType;
       int i1 = 0;
       int i2 = (tlivingType != null)? tlivingType.hashCode(): 0;
       i = (((((((((((i + i2) * 31) + this.livingTypeVal) * 31) + this.originPrice) * 31) + Float.floatToIntBits(this.discount)) * 31) + this.price) * 31) + this.leftFreeCount) * 31;
       tlivingType = this.bulletHint;
       i2 = (tlivingType != null)? tlivingType.hashCode(): 0;
       i = (i + i2) * 31;
       tlivingType = this.bulletTag;
       if (tlivingType != null) {
          i1 = tlivingType.hashCode();
       }
       return (i + i1);
    }
    public final void setLeftFreeCount(int p0){
       this.leftFreeCount = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LivePayBulletResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LivePayBulletResponse\(enablePayBullet="+this.enablePayBullet+", livingType="+this.livingType+", livingTypeVal="+this.livingTypeVal+", originPrice="+this.originPrice+", discount="+this.discount+", price="+this.price+", leftFreeCount="+this.leftFreeCount+", bulletHint="+this.bulletHint+", bulletTag="+this.bulletTag+"\)";
    }
}
