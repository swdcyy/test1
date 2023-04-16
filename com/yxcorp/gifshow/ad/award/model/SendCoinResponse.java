package com.yxcorp.gifshow.ad.award.model.SendCoinResponse;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.award.model.SendCoinResponse$a;
import nsd.u;
import com.yxcorp.gifshow.ad.award.model.SendCoinData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class SendCoinResponse implements Serializable	// class@00151d
{
    public final SendCoinData data;
    public static final SendCoinResponse$a Companion;
    public static final long serialVersionUID;

    static {
       SendCoinResponse.Companion = new SendCoinResponse$a(null);
    }
    public void SendCoinResponse(SendCoinData p0){
       super();
       this.data = p0;
    }
    public static SendCoinResponse copy$default(SendCoinResponse p0,SendCoinData p1,int p2,Object p3){
       SendCoinResponse data;
       if (p2 & 0x01) {
          data = p0.data;
       }
       return p0.copy(data);
    }
    public final SendCoinData component1(){
       return this.data;
    }
    public final SendCoinResponse copy(SendCoinData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SendCoinResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SendCoinResponse(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SendCoinResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SendCoinResponse && a.g(this.data, p0.data))) {
          return true;
       }
       return false;
    }
    public final SendCoinData getData(){
       return this.data;
    }
    public int hashCode(){
       SendCoinResponse obj = PatchProxy.apply(null, this, SendCoinResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.data;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SendCoinResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SendCoinResponse\(data="+this.data+"\)";
    }
}
