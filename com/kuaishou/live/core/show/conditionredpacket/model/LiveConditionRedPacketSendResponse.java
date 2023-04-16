package com.kuaishou.live.core.show.conditionredpacket.model.LiveConditionRedPacketSendResponse;
import java.io.Serializable;
import com.kuaishou.live.core.show.conditionredpacket.model.LiveConditionRedPacketSendResultInformation;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveConditionRedPacketSendResponse implements Serializable	// class@000ab7
{
    public final LiveConditionRedPacketSendResultInformation mLiveConditionRedPacketSendResultInformation;

    public void LiveConditionRedPacketSendResponse(LiveConditionRedPacketSendResultInformation p0){
       super();
       this.mLiveConditionRedPacketSendResultInformation = p0;
    }
    public static LiveConditionRedPacketSendResponse copy$default(LiveConditionRedPacketSendResponse p0,LiveConditionRedPacketSendResultInformation p1,int p2,Object p3){
       LiveConditionRedPacketSendResponse mLiveConditi;
       if (p2 & 0x01) {
          mLiveConditi = p0.mLiveConditionRedPacketSendResultInformation;
       }
       return p0.copy(mLiveConditi);
    }
    public final LiveConditionRedPacketSendResultInformation component1(){
       return this.mLiveConditionRedPacketSendResultInformation;
    }
    public final LiveConditionRedPacketSendResponse copy(LiveConditionRedPacketSendResultInformation p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveConditionRedPacketSendResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveConditionRedPacketSendResponse(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveConditionRedPacketSendResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveConditionRedPacketSendResponse && a.g(this.mLiveConditionRedPacketSendResultInformation, p0.mLiveConditionRedPacketSendResultInformation))) {
          return true;
       }
       return false;
    }
    public final LiveConditionRedPacketSendResultInformation getMLiveConditionRedPacketSendResultInformation(){
       return this.mLiveConditionRedPacketSendResultInformation;
    }
    public int hashCode(){
       LiveConditionRedPacketSendResponse obj = PatchProxy.apply(null, this, LiveConditionRedPacketSendResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mLiveConditionRedPacketSendResultInformation;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveConditionRedPacketSendResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveConditionRedPacketSendResponse\(mLiveConditionRedPacketSendResultInformation="+this.mLiveConditionRedPacketSendResultInformation+"\)";
    }
}
