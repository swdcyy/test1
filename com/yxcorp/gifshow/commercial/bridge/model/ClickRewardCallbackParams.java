package com.yxcorp.gifshow.commercial.bridge.model.ClickRewardCallbackParams;
import java.io.Serializable;
import com.yxcorp.gifshow.commercial.bridge.model.ClickRewardCallbackParams$a;
import nsd.u;
import java.lang.String;
import java.lang.Integer;
import com.yxcorp.gifshow.commercial.response.magnetic.AdNeoMerchantClickResponse$AdCommodityExtraInfo;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ClickRewardCallbackParams implements Serializable	// class@00112a
{
    public final AdNeoMerchantClickResponse$AdCommodityExtraInfo adCommodityExtraInfo;
    public final String creativeId;
    public final String jumpId;
    public final Integer jumpType;
    public static final ClickRewardCallbackParams$a Companion;
    public static final long serialVersionUID;

    static {
       ClickRewardCallbackParams.Companion = new ClickRewardCallbackParams$a(null);
    }
    public void ClickRewardCallbackParams(String p0,Integer p1,String p2,AdNeoMerchantClickResponse$AdCommodityExtraInfo p3){
       super();
       this.jumpId = p0;
       this.jumpType = p1;
       this.creativeId = p2;
       this.adCommodityExtraInfo = p3;
    }
    public static ClickRewardCallbackParams copy$default(ClickRewardCallbackParams p0,String p1,Integer p2,String p3,AdNeoMerchantClickResponse$AdCommodityExtraInfo p4,int p5,Object p6){
       ClickRewardCallbackParams jumpId;
       ClickRewardCallbackParams jumpType;
       ClickRewardCallbackParams creativeId;
       ClickRewardCallbackParams adCommodityE;
       if (p5 & 0x01) {
          jumpId = p0.jumpId;
       }
       if (p5 & 0x02) {
          jumpType = p0.jumpType;
       }
       if (p5 & 0x04) {
          creativeId = p0.creativeId;
       }
       if (p5 & 0x08) {
          adCommodityE = p0.adCommodityExtraInfo;
       }
       return p0.copy(jumpId, jumpType, creativeId, adCommodityE);
    }
    public final String component1(){
       return this.jumpId;
    }
    public final Integer component2(){
       return this.jumpType;
    }
    public final String component3(){
       return this.creativeId;
    }
    public final AdNeoMerchantClickResponse$AdCommodityExtraInfo component4(){
       return this.adCommodityExtraInfo;
    }
    public final ClickRewardCallbackParams copy(String p0,Integer p1,String p2,AdNeoMerchantClickResponse$AdCommodityExtraInfo p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, ClickRewardCallbackParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ClickRewardCallbackParams(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ClickRewardCallbackParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ClickRewardCallbackParams && (a.g(this.jumpId, p0.jumpId) && (a.g(this.jumpType, p0.jumpType) && (a.g(this.creativeId, p0.creativeId) && a.g(this.adCommodityExtraInfo, p0.adCommodityExtraInfo)))))) {
          return true;
       }
       return false;
    }
    public final AdNeoMerchantClickResponse$AdCommodityExtraInfo getAdCommodityExtraInfo(){
       return this.adCommodityExtraInfo;
    }
    public final String getCreativeId(){
       return this.creativeId;
    }
    public final String getJumpId(){
       return this.jumpId;
    }
    public final Integer getJumpType(){
       return this.jumpType;
    }
    public int hashCode(){
       ClickRewardCallbackParams obj = PatchProxy.apply(null, this, ClickRewardCallbackParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.jumpId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       ClickRewardCallbackParams tjumpType = this.jumpType;
       int i2 = (tjumpType != null)? tjumpType.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tjumpType = this.creativeId;
       i2 = (tjumpType != null)? tjumpType.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tjumpType = this.adCommodityExtraInfo;
       if (tjumpType != null) {
          i = tjumpType.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ClickRewardCallbackParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ClickRewardCallbackParams\(jumpId="+this.jumpId+", jumpType="+this.jumpType+", creativeId="+this.creativeId+", adCommodityExtraInfo="+this.adCommodityExtraInfo+"\)";
    }
}
