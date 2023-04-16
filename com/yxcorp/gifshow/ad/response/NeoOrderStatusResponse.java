package com.yxcorp.gifshow.ad.response.NeoOrderStatusResponse;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.response.NeoOrderStatusResponse$a;
import nsd.u;
import com.yxcorp.gifshow.ad.response.NeoOrderStatusData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class NeoOrderStatusResponse implements Serializable	// class@0017e4
{
    public final NeoOrderStatusData data;
    public static final NeoOrderStatusResponse$a Companion;
    public static final long serialVersionUID;

    static {
       NeoOrderStatusResponse.Companion = new NeoOrderStatusResponse$a(null);
    }
    public void NeoOrderStatusResponse(NeoOrderStatusData p0){
       super();
       this.data = p0;
    }
    public static NeoOrderStatusResponse copy$default(NeoOrderStatusResponse p0,NeoOrderStatusData p1,int p2,Object p3){
       NeoOrderStatusResponse data;
       if (p2 & 0x01) {
          data = p0.data;
       }
       return p0.copy(data);
    }
    public final NeoOrderStatusData component1(){
       return this.data;
    }
    public final NeoOrderStatusResponse copy(NeoOrderStatusData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NeoOrderStatusResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new NeoOrderStatusResponse(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NeoOrderStatusResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof NeoOrderStatusResponse && a.g(this.data, p0.data))) {
          return true;
       }
       return false;
    }
    public final NeoOrderStatusData getData(){
       return this.data;
    }
    public int hashCode(){
       NeoOrderStatusResponse obj = PatchProxy.apply(null, this, NeoOrderStatusResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.data;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, NeoOrderStatusResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NeoOrderStatusResponse\(data="+this.data+"\)";
    }
}
