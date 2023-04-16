package com.kuaishou.live.core.show.redpacket.richcard.http.RichCardInfoResponse;
import java.io.Serializable;
import com.kuaishou.live.core.show.redpacket.richcard.http.RichCardInfoResponse$a;
import nsd.u;
import com.kuaishou.live.core.show.redpacket.richcard.http.RichCardInfoResponseData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class RichCardInfoResponse implements Serializable	// class@000f93
{
    public final RichCardInfoResponseData data;
    public static final RichCardInfoResponse$a Companion;
    public static final long serialVersionUID;

    static {
       RichCardInfoResponse.Companion = new RichCardInfoResponse$a(null);
    }
    public void RichCardInfoResponse(RichCardInfoResponseData p0){
       super();
       this.data = p0;
    }
    public static RichCardInfoResponse copy$default(RichCardInfoResponse p0,RichCardInfoResponseData p1,int p2,Object p3){
       RichCardInfoResponse data;
       if (p2 & 0x01) {
          data = p0.data;
       }
       return p0.copy(data);
    }
    public final RichCardInfoResponseData component1(){
       return this.data;
    }
    public final RichCardInfoResponse copy(RichCardInfoResponseData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RichCardInfoResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RichCardInfoResponse(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RichCardInfoResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof RichCardInfoResponse && a.g(this.data, p0.data))) {
          return true;
       }
       return false;
    }
    public final RichCardInfoResponseData getData(){
       return this.data;
    }
    public int hashCode(){
       RichCardInfoResponse obj = PatchProxy.apply(null, this, RichCardInfoResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.data;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RichCardInfoResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RichCardInfoResponse\(data="+this.data+"\)";
    }
}
