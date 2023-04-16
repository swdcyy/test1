package com.kuaishou.live.core.show.conditionredpacket.model.LiveConditionRedPacketSendResultInformation;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveConditionRedPacketSendResultInformation implements Serializable	// class@000ab8
{
    public final String liveStreamId;
    public final String redPackId;
    public final int redPackType;

    public void LiveConditionRedPacketSendResultInformation(String p0,int p1,String p2){
       a.p(p2, "redPackId");
       super();
       this.liveStreamId = p0;
       this.redPackType = p1;
       this.redPackId = p2;
    }
    public static LiveConditionRedPacketSendResultInformation copy$default(LiveConditionRedPacketSendResultInformation p0,String p1,int p2,String p3,int p4,Object p5){
       LiveConditionRedPacketSendResultInformation liveStreamId;
       LiveConditionRedPacketSendResultInformation redPackType;
       LiveConditionRedPacketSendResultInformation redPackId;
       if (p4 & 0x01) {
          liveStreamId = p0.liveStreamId;
       }
       if (p4 & 0x02) {
          redPackType = p0.redPackType;
       }
       if (p4 & 0x04) {
          redPackId = p0.redPackId;
       }
       return p0.copy(liveStreamId, redPackType, redPackId);
    }
    public final String component1(){
       return this.liveStreamId;
    }
    public final int component2(){
       return this.redPackType;
    }
    public final String component3(){
       return this.redPackId;
    }
    public final LiveConditionRedPacketSendResultInformation copy(String p0,int p1,String p2){
       if (PatchProxy.isSupport(LiveConditionRedPacketSendResultInformation.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, LiveConditionRedPacketSendResultInformation.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p2, "redPackId");
       return new LiveConditionRedPacketSendResultInformation(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveConditionRedPacketSendResultInformation.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveConditionRedPacketSendResultInformation && (a.g(this.liveStreamId, p0.liveStreamId) && (this.redPackType == p0.redPackType && a.g(this.redPackId, p0.redPackId))))) {
          return true;
       }
       return false;
    }
    public final String getLiveStreamId(){
       return this.liveStreamId;
    }
    public final String getRedPackId(){
       return this.redPackId;
    }
    public final int getRedPackType(){
       return this.redPackType;
    }
    public int hashCode(){
       LiveConditionRedPacketSendResultInformation obj = PatchProxy.apply(null, this, LiveConditionRedPacketSendResultInformation.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.liveStreamId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((i1 * 31) + this.redPackType) * 31;
       LiveConditionRedPacketSendResultInformation tredPackId = this.redPackId;
       if (tredPackId != null) {
          i = tredPackId.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveConditionRedPacketSendResultInformation.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveConditionRedPacketSendResultInformation\(liveStreamId="+this.liveStreamId+", redPackType="+this.redPackType+", redPackId="+this.redPackId+"\)";
    }
}
