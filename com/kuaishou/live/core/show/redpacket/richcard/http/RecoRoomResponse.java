package com.kuaishou.live.core.show.redpacket.richcard.http.RecoRoomResponse;
import java.io.Serializable;
import com.kuaishou.live.core.show.redpacket.richcard.http.RecoRoomResponse$a;
import nsd.u;
import com.kuaishou.live.core.show.redpacket.richcard.http.RecoRoomResponseData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class RecoRoomResponse implements Serializable	// class@000f8d
{
    public final RecoRoomResponseData data;
    public static final RecoRoomResponse$a Companion;
    public static final long serialVersionUID;

    static {
       RecoRoomResponse.Companion = new RecoRoomResponse$a(null);
    }
    public void RecoRoomResponse(RecoRoomResponseData p0){
       super();
       this.data = p0;
    }
    public static RecoRoomResponse copy$default(RecoRoomResponse p0,RecoRoomResponseData p1,int p2,Object p3){
       RecoRoomResponse data;
       if (p2 & 0x01) {
          data = p0.data;
       }
       return p0.copy(data);
    }
    public final RecoRoomResponseData component1(){
       return this.data;
    }
    public final RecoRoomResponse copy(RecoRoomResponseData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecoRoomResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RecoRoomResponse(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecoRoomResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof RecoRoomResponse && a.g(this.data, p0.data))) {
          return true;
       }
       return false;
    }
    public final RecoRoomResponseData getData(){
       return this.data;
    }
    public int hashCode(){
       RecoRoomResponse obj = PatchProxy.apply(null, this, RecoRoomResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.data;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RecoRoomResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RecoRoomResponse\(data="+this.data+"\)";
    }
}
