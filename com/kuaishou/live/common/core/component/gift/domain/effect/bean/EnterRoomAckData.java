package com.kuaishou.live.common.core.component.gift.domain.effect.bean.EnterRoomAckData;
import java.io.Serializable;
import com.kuaishou.live.common.core.component.gift.domain.effect.bean.RoomData;
import com.kuaishou.live.common.core.component.gift.domain.effect.bean.AnchorData;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class EnterRoomAckData implements Serializable	// class@00119e
{
    public final AnchorData anchor;
    public final RoomData room;

    public void EnterRoomAckData(){
       super(null, null, 3, null);
    }
    public void EnterRoomAckData(RoomData p0,AnchorData p1){
       super();
       this.room = p0;
       this.anchor = p1;
    }
    public void EnterRoomAckData(RoomData p0,AnchorData p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = null;
       }
       if (p2 & 0x02) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
    public static EnterRoomAckData copy$default(EnterRoomAckData p0,RoomData p1,AnchorData p2,int p3,Object p4){
       EnterRoomAckData room;
       EnterRoomAckData anchor;
       if (p3 & 0x01) {
          room = p0.room;
       }
       if (p3 & 0x02) {
          anchor = p0.anchor;
       }
       return p0.copy(room, anchor);
    }
    public final RoomData component1(){
       return this.room;
    }
    public final AnchorData component2(){
       return this.anchor;
    }
    public final EnterRoomAckData copy(RoomData p0,AnchorData p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, EnterRoomAckData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new EnterRoomAckData(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EnterRoomAckData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof EnterRoomAckData && (a.g(this.room, p0.room) && a.g(this.anchor, p0.anchor)))) {
          return true;
       }
       return false;
    }
    public final AnchorData getAnchor(){
       return this.anchor;
    }
    public final RoomData getRoom(){
       return this.room;
    }
    public int hashCode(){
       EnterRoomAckData obj = PatchProxy.apply(null, this, EnterRoomAckData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.room;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       EnterRoomAckData tanchor = this.anchor;
       if (tanchor != null) {
          i = tanchor.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, EnterRoomAckData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "EnterRoomAckData\(room="+this.room+", anchor="+this.anchor+"\)";
    }
}
