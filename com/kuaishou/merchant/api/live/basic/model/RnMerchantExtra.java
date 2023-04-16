package com.kuaishou.merchant.api.live.basic.model.RnMerchantExtra;
import java.io.Serializable;
import java.lang.String;
import com.kuaishou.merchant.api.live.basic.model.RnAnchorInfo;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class RnMerchantExtra implements Serializable	// class@001566
{
    public final RnAnchorInfo anchor;
    public final Boolean isAnchor;
    public final String liveStreamId;
    public final Integer liveStreamPatternType;
    public final Integer liveType;
    public final String uId;

    public void RnMerchantExtra(String p0,String p1,RnAnchorInfo p2,Integer p3,Integer p4,Boolean p5){
       super();
       this.uId = p0;
       this.liveStreamId = p1;
       this.anchor = p2;
       this.liveType = p3;
       this.liveStreamPatternType = p4;
       this.isAnchor = p5;
    }
    public static RnMerchantExtra copy$default(RnMerchantExtra p0,String p1,String p2,RnAnchorInfo p3,Integer p4,Integer p5,Boolean p6,int p7,Object p8){
       RnMerchantExtra uId;
       RnMerchantExtra liveStreamId;
       RnMerchantExtra anchor;
       RnMerchantExtra liveType;
       RnMerchantExtra liveStreamPa;
       RnMerchantExtra isAnchor;
       if (p7 & 0x01) {
          uId = p0.uId;
       }
       if (p7 & 0x02) {
          liveStreamId = p0.liveStreamId;
       }
       p8 = liveStreamId;
       if (p7 & 0x04) {
          anchor = p0.anchor;
       }
       RnMerchantExtra rnMerchantEx = anchor;
       if (p7 & 0x08) {
          liveType = p0.liveType;
       }
       RnMerchantExtra rnMerchantEx1 = liveType;
       if (p7 & 0x10) {
          liveStreamPa = p0.liveStreamPatternType;
       }
       RnMerchantExtra rnMerchantEx2 = liveStreamPa;
       if (p7 & 0x20) {
          isAnchor = p0.isAnchor;
       }
       return p0.copy(uId, p8, rnMerchantEx, rnMerchantEx1, rnMerchantEx2, isAnchor);
    }
    public final String component1(){
       return this.uId;
    }
    public final String component2(){
       return this.liveStreamId;
    }
    public final RnAnchorInfo component3(){
       return this.anchor;
    }
    public final Integer component4(){
       return this.liveType;
    }
    public final Integer component5(){
       return this.liveStreamPatternType;
    }
    public final Boolean component6(){
       return this.isAnchor;
    }
    public final RnMerchantExtra copy(String p0,String p1,RnAnchorInfo p2,Integer p3,Integer p4,Boolean p5){
       Object obj;
       if (PatchProxy.isSupport(RnMerchantExtra.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          obj = PatchProxy.apply(objArray, this, RnMerchantExtra.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       RnMerchantExtra rnMerchantEx = new RnMerchantExtra(p0, p1, p2, p3, p4, p5);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RnMerchantExtra.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof RnMerchantExtra && (a.g(this.uId, p0.uId) && (a.g(this.liveStreamId, p0.liveStreamId) && (a.g(this.anchor, p0.anchor) && (a.g(this.liveType, p0.liveType) && (a.g(this.liveStreamPatternType, p0.liveStreamPatternType) && a.g(this.isAnchor, p0.isAnchor)))))))) {
          return true;
       }
       return false;
    }
    public final RnAnchorInfo getAnchor(){
       return this.anchor;
    }
    public final String getLiveStreamId(){
       return this.liveStreamId;
    }
    public final Integer getLiveStreamPatternType(){
       return this.liveStreamPatternType;
    }
    public final Integer getLiveType(){
       return this.liveType;
    }
    public final String getUId(){
       return this.uId;
    }
    public int hashCode(){
       RnMerchantExtra obj = PatchProxy.apply(null, this, RnMerchantExtra.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.uId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       RnMerchantExtra tliveStreamI = this.liveStreamId;
       int i2 = (tliveStreamI != null)? tliveStreamI.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tliveStreamI = this.anchor;
       i2 = (tliveStreamI != null)? tliveStreamI.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tliveStreamI = this.liveType;
       i2 = (tliveStreamI != null)? tliveStreamI.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tliveStreamI = this.liveStreamPatternType;
       i2 = (tliveStreamI != null)? tliveStreamI.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tliveStreamI = this.isAnchor;
       if (tliveStreamI != null) {
          i = tliveStreamI.hashCode();
       }
       return (i1 + i);
    }
    public final Boolean isAnchor(){
       return this.isAnchor;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RnMerchantExtra.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RnMerchantExtra\(uId="+this.uId+", liveStreamId="+this.liveStreamId+", anchor="+this.anchor+", liveType="+this.liveType+", liveStreamPatternType="+this.liveStreamPatternType+", isAnchor="+this.isAnchor+"\)";
    }
}
