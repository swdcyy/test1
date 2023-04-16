package com.kuaishou.live.common.core.component.gift.domain.effect.bean.RoomData;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class RoomData implements Serializable	// class@0011a9
{
    public final long roomAudienceCount;
    public final String roomId;

    public void RoomData(String p0,long p1){
       a.p(p0, "roomId");
       super();
       this.roomId = p0;
       this.roomAudienceCount = p1;
    }
    public static RoomData copy$default(RoomData p0,String p1,long p2,int p3,Object p4){
       RoomData roomId;
       RoomData roomAudience;
       if (p3 & 0x01) {
          roomId = p0.roomId;
       }
       if (p3 & 0x02) {
          roomAudience = p0.roomAudienceCount;
       }
       return p0.copy(roomId, roomAudience);
    }
    public final String component1(){
       return this.roomId;
    }
    public final long component2(){
       return this.roomAudienceCount;
    }
    public final RoomData copy(String p0,long p1){
       if (PatchProxy.isSupport(RoomData.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, RoomData.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "roomId");
       return new RoomData(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RoomData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof RoomData && (a.g(this.roomId, p0.roomId) && !this.roomAudienceCount - p0.roomAudienceCount))) {
          return true;
       }
       return false;
    }
    public final long getRoomAudienceCount(){
       return this.roomAudienceCount;
    }
    public final String getRoomId(){
       return this.roomId;
    }
    public int hashCode(){
       RoomData obj = PatchProxy.apply(null, this, RoomData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.roomId;
       int i = (obj != null)? obj.hashCode(): 0;
       RoomData troomAudienc = this.roomAudienceCount;
       return ((i * 31) + (int)(troomAudienc ^ (troomAudienc >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RoomData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RoomData\(roomId="+this.roomId+", roomAudienceCount="+this.roomAudienceCount+"\)";
    }
}
