package com.yxcorp.gifshow.map.data.model.RnLiveEvent;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class RnLiveEvent	// class@001c7c
{
    public final String liveStreamId;

    public void RnLiveEvent(String p0){
       a.p(p0, "liveStreamId");
       super();
       this.liveStreamId = p0;
    }
    public static RnLiveEvent copy$default(RnLiveEvent p0,String p1,int p2,Object p3){
       RnLiveEvent liveStreamId;
       if (p2 & 0x01) {
          liveStreamId = p0.liveStreamId;
       }
       return p0.copy(liveStreamId);
    }
    public final String component1(){
       return this.liveStreamId;
    }
    public final RnLiveEvent copy(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RnLiveEvent.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "liveStreamId");
       return new RnLiveEvent(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RnLiveEvent.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof RnLiveEvent && a.g(this.liveStreamId, p0.liveStreamId))) {
          return true;
       }
       return false;
    }
    public final String getLiveStreamId(){
       return this.liveStreamId;
    }
    public int hashCode(){
       RnLiveEvent obj = PatchProxy.apply(null, this, RnLiveEvent.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.liveStreamId;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RnLiveEvent.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RnLiveEvent\(liveStreamId="+this.liveStreamId+"\)";
    }
}
