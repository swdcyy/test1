package com.kuaishou.live.core.show.redpacket.richcard.http.RichCardInfo;
import java.io.Serializable;
import com.kuaishou.live.core.show.redpacket.richcard.http.RichCardInfo$a;
import nsd.u;
import java.lang.Long;
import com.kuaishou.live.core.show.redpacket.richcard.http.BarTitleTextMap;
import com.kuaishou.live.core.show.redpacket.richcard.http.UsingCardInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class RichCardInfo implements Serializable	// class@000f91
{
    public BarTitleTextMap barTitleTextMap;
    public final Long freeCardShowEndTime;
    public final Long serverTime;
    public final UsingCardInfo usingCardInfo;
    public static final RichCardInfo$a Companion;
    public static final long serialVersionUID;

    static {
       RichCardInfo.Companion = new RichCardInfo$a(null);
    }
    public void RichCardInfo(Long p0,Long p1,BarTitleTextMap p2,UsingCardInfo p3){
       super();
       this.serverTime = p0;
       this.freeCardShowEndTime = p1;
       this.barTitleTextMap = p2;
       this.usingCardInfo = p3;
    }
    public static RichCardInfo copy$default(RichCardInfo p0,Long p1,Long p2,BarTitleTextMap p3,UsingCardInfo p4,int p5,Object p6){
       RichCardInfo serverTime;
       RichCardInfo freeCardShow;
       RichCardInfo barTitleText;
       RichCardInfo usingCardInf;
       if (p5 & 0x01) {
          serverTime = p0.serverTime;
       }
       if (p5 & 0x02) {
          freeCardShow = p0.freeCardShowEndTime;
       }
       if (p5 & 0x04) {
          barTitleText = p0.barTitleTextMap;
       }
       if (p5 & 0x08) {
          usingCardInf = p0.usingCardInfo;
       }
       return p0.copy(serverTime, freeCardShow, barTitleText, usingCardInf);
    }
    public final Long component1(){
       return this.serverTime;
    }
    public final Long component2(){
       return this.freeCardShowEndTime;
    }
    public final BarTitleTextMap component3(){
       return this.barTitleTextMap;
    }
    public final UsingCardInfo component4(){
       return this.usingCardInfo;
    }
    public final RichCardInfo copy(Long p0,Long p1,BarTitleTextMap p2,UsingCardInfo p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, RichCardInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RichCardInfo(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RichCardInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof RichCardInfo && (a.g(this.serverTime, p0.serverTime) && (a.g(this.freeCardShowEndTime, p0.freeCardShowEndTime) && (a.g(this.barTitleTextMap, p0.barTitleTextMap) && a.g(this.usingCardInfo, p0.usingCardInfo)))))) {
          return true;
       }
       return false;
    }
    public final BarTitleTextMap getBarTitleTextMap(){
       return this.barTitleTextMap;
    }
    public final Long getFreeCardShowEndTime(){
       return this.freeCardShowEndTime;
    }
    public final Long getServerTime(){
       return this.serverTime;
    }
    public final UsingCardInfo getUsingCardInfo(){
       return this.usingCardInfo;
    }
    public int hashCode(){
       RichCardInfo obj = PatchProxy.apply(null, this, RichCardInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.serverTime;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       RichCardInfo tfreeCardSho = this.freeCardShowEndTime;
       int i2 = (tfreeCardSho != null)? tfreeCardSho.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tfreeCardSho = this.barTitleTextMap;
       i2 = (tfreeCardSho != null)? tfreeCardSho.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tfreeCardSho = this.usingCardInfo;
       if (tfreeCardSho != null) {
          i = tfreeCardSho.hashCode();
       }
       return (i1 + i);
    }
    public final void setBarTitleTextMap(BarTitleTextMap p0){
       this.barTitleTextMap = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RichCardInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RichCardInfo\(serverTime="+this.serverTime+", freeCardShowEndTime="+this.freeCardShowEndTime+", barTitleTextMap="+this.barTitleTextMap+", usingCardInfo="+this.usingCardInfo+"\)";
    }
}
