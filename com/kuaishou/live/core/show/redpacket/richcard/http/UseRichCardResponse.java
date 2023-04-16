package com.kuaishou.live.core.show.redpacket.richcard.http.UseRichCardResponse;
import java.io.Serializable;
import com.kuaishou.live.core.show.redpacket.richcard.http.UseRichCardResponse$a;
import nsd.u;
import com.kuaishou.live.core.show.redpacket.richcard.http.UseRichCardResponseData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class UseRichCardResponse implements Serializable	// class@000f99
{
    public final UseRichCardResponseData data;
    public static final UseRichCardResponse$a Companion;
    public static final long serialVersionUID;

    static {
       UseRichCardResponse.Companion = new UseRichCardResponse$a(null);
    }
    public void UseRichCardResponse(UseRichCardResponseData p0){
       super();
       this.data = p0;
    }
    public static UseRichCardResponse copy$default(UseRichCardResponse p0,UseRichCardResponseData p1,int p2,Object p3){
       UseRichCardResponse data;
       if (p2 & 0x01) {
          data = p0.data;
       }
       return p0.copy(data);
    }
    public final UseRichCardResponseData component1(){
       return this.data;
    }
    public final UseRichCardResponse copy(UseRichCardResponseData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UseRichCardResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new UseRichCardResponse(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UseRichCardResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof UseRichCardResponse && a.g(this.data, p0.data))) {
          return true;
       }
       return false;
    }
    public final UseRichCardResponseData getData(){
       return this.data;
    }
    public int hashCode(){
       UseRichCardResponse obj = PatchProxy.apply(null, this, UseRichCardResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.data;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, UseRichCardResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UseRichCardResponse\(data="+this.data+"\)";
    }
}
