package com.kuaishou.live.core.show.redpacket.richcard.http.ExitRichCardResponse;
import java.io.Serializable;
import com.kuaishou.live.core.show.redpacket.richcard.http.ExitRichCardResponse$a;
import nsd.u;
import com.kuaishou.live.core.show.redpacket.richcard.http.ExitRichCardResponseData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ExitRichCardResponse implements Serializable	// class@000f83
{
    public final ExitRichCardResponseData data;
    public static final ExitRichCardResponse$a Companion;
    public static final long serialVersionUID;

    static {
       ExitRichCardResponse.Companion = new ExitRichCardResponse$a(null);
    }
    public void ExitRichCardResponse(ExitRichCardResponseData p0){
       super();
       this.data = p0;
    }
    public static ExitRichCardResponse copy$default(ExitRichCardResponse p0,ExitRichCardResponseData p1,int p2,Object p3){
       ExitRichCardResponse data;
       if (p2 & 0x01) {
          data = p0.data;
       }
       return p0.copy(data);
    }
    public final ExitRichCardResponseData component1(){
       return this.data;
    }
    public final ExitRichCardResponse copy(ExitRichCardResponseData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ExitRichCardResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ExitRichCardResponse(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ExitRichCardResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ExitRichCardResponse && a.g(this.data, p0.data))) {
          return true;
       }
       return false;
    }
    public final ExitRichCardResponseData getData(){
       return this.data;
    }
    public int hashCode(){
       ExitRichCardResponse obj = PatchProxy.apply(null, this, ExitRichCardResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.data;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ExitRichCardResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ExitRichCardResponse\(data="+this.data+"\)";
    }
}
