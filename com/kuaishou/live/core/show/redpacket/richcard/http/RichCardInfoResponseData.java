package com.kuaishou.live.core.show.redpacket.richcard.http.RichCardInfoResponseData;
import java.io.Serializable;
import com.kuaishou.live.core.show.redpacket.richcard.http.RichCardInfoResponseData$a;
import nsd.u;
import java.lang.String;
import com.kuaishou.live.core.show.redpacket.richcard.http.PendantConfig;
import com.kuaishou.live.core.show.redpacket.richcard.http.RichCardInfo;
import com.kuaishou.live.core.show.redpacket.richcard.http.EffectInfo;
import com.kuaishou.live.core.show.redpacket.richcard.core.model.BottomBarInfo;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class RichCardInfoResponseData implements Serializable	// class@000f95
{
    public final BottomBarInfo bottomBarInfo;
    public final RichCardInfo cardInfo;
    public final int code;
    public final EffectInfo effectInfo;
    public final String msg;
    public final PendantConfig pendantInfo;
    public static final RichCardInfoResponseData$a Companion;
    public static final long serialVersionUID;

    static {
       RichCardInfoResponseData.Companion = new RichCardInfoResponseData$a(null);
    }
    public void RichCardInfoResponseData(int p0,String p1,PendantConfig p2,RichCardInfo p3,EffectInfo p4,BottomBarInfo p5){
       super();
       this.code = p0;
       this.msg = p1;
       this.pendantInfo = p2;
       this.cardInfo = p3;
       this.effectInfo = p4;
       this.bottomBarInfo = p5;
    }
    public static RichCardInfoResponseData copy$default(RichCardInfoResponseData p0,int p1,String p2,PendantConfig p3,RichCardInfo p4,EffectInfo p5,BottomBarInfo p6,int p7,Object p8){
       RichCardInfoResponseData code;
       RichCardInfoResponseData msg;
       RichCardInfoResponseData pendantInfo;
       RichCardInfoResponseData cardInfo;
       RichCardInfoResponseData effectInfo;
       RichCardInfoResponseData bottomBarInf;
       if (p7 & 0x01) {
          code = p0.code;
       }
       if (p7 & 0x02) {
          msg = p0.msg;
       }
       p8 = msg;
       if (p7 & 0x04) {
          pendantInfo = p0.pendantInfo;
       }
       RichCardInfoResponseData richCardInfo = pendantInfo;
       if (p7 & 0x08) {
          cardInfo = p0.cardInfo;
       }
       RichCardInfoResponseData richCardInfo1 = cardInfo;
       if (p7 & 0x10) {
          effectInfo = p0.effectInfo;
       }
       RichCardInfoResponseData richCardInfo2 = effectInfo;
       if (p7 & 0x20) {
          bottomBarInf = p0.bottomBarInfo;
       }
       return p0.copy(code, p8, richCardInfo, richCardInfo1, richCardInfo2, bottomBarInf);
    }
    public final int component1(){
       return this.code;
    }
    public final String component2(){
       return this.msg;
    }
    public final PendantConfig component3(){
       return this.pendantInfo;
    }
    public final RichCardInfo component4(){
       return this.cardInfo;
    }
    public final EffectInfo component5(){
       return this.effectInfo;
    }
    public final BottomBarInfo component6(){
       return this.bottomBarInfo;
    }
    public final RichCardInfoResponseData copy(int p0,String p1,PendantConfig p2,RichCardInfo p3,EffectInfo p4,BottomBarInfo p5){
       Object obj;
       if (PatchProxy.isSupport(RichCardInfoResponseData.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,p4,p5};
          obj = PatchProxy.apply(objArray, this, RichCardInfoResponseData.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       RichCardInfoResponseData richCardInfo = new RichCardInfoResponseData(p0, p1, p2, p3, p4, p5);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RichCardInfoResponseData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof RichCardInfoResponseData && (this.code == p0.code && (a.g(this.msg, p0.msg) && (a.g(this.pendantInfo, p0.pendantInfo) && (a.g(this.cardInfo, p0.cardInfo) && (a.g(this.effectInfo, p0.effectInfo) && a.g(this.bottomBarInfo, p0.bottomBarInfo)))))))) {
          return true;
       }
       return false;
    }
    public final BottomBarInfo getBottomBarInfo(){
       return this.bottomBarInfo;
    }
    public final RichCardInfo getCardInfo(){
       return this.cardInfo;
    }
    public final int getCode(){
       return this.code;
    }
    public final EffectInfo getEffectInfo(){
       return this.effectInfo;
    }
    public final String getMsg(){
       return this.msg;
    }
    public final PendantConfig getPendantInfo(){
       return this.pendantInfo;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, RichCardInfoResponseData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.code * 31;
       RichCardInfoResponseData tmsg = this.msg;
       int i1 = 0;
       int i2 = (tmsg != null)? tmsg.hashCode(): 0;
       i = (i + i2) * 31;
       tmsg = this.pendantInfo;
       i2 = (tmsg != null)? tmsg.hashCode(): 0;
       i = (i + i2) * 31;
       tmsg = this.cardInfo;
       i2 = (tmsg != null)? tmsg.hashCode(): 0;
       i = (i + i2) * 31;
       tmsg = this.effectInfo;
       i2 = (tmsg != null)? tmsg.hashCode(): 0;
       i = (i + i2) * 31;
       tmsg = this.bottomBarInfo;
       if (tmsg != null) {
          i1 = tmsg.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RichCardInfoResponseData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RichCardInfoResponseData\(code="+this.code+", msg="+this.msg+", pendantInfo="+this.pendantInfo+", cardInfo="+this.cardInfo+", effectInfo="+this.effectInfo+", bottomBarInfo="+this.bottomBarInfo+"\)";
    }
}
