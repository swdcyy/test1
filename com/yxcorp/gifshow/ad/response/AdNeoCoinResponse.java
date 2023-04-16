package com.yxcorp.gifshow.ad.response.AdNeoCoinResponse;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.response.AdNeoCoinResponse$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class AdNeoCoinResponse implements Serializable	// class@0017cd
{
    public final int amount;
    public final boolean hasRemaining;
    public static final AdNeoCoinResponse$a Companion;
    public static final long serialVersionUID;

    static {
       AdNeoCoinResponse.Companion = new AdNeoCoinResponse$a(null);
    }
    public void AdNeoCoinResponse(){
       super(0, 0, 3, null);
    }
    public void AdNeoCoinResponse(int p0,boolean p1){
       super();
       this.amount = p0;
       this.hasRemaining = p1;
    }
    public void AdNeoCoinResponse(int p0,boolean p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = 0;
       }
       if (p2 & 0x02) {
          p1 = false;
       }
       super(p0, p1);
       return;
    }
    public static AdNeoCoinResponse copy$default(AdNeoCoinResponse p0,int p1,boolean p2,int p3,Object p4){
       AdNeoCoinResponse amount;
       AdNeoCoinResponse hasRemaining;
       if (p3 & 0x01) {
          amount = p0.amount;
       }
       if (p3 & 0x02) {
          hasRemaining = p0.hasRemaining;
       }
       return p0.copy(amount, hasRemaining);
    }
    public final int component1(){
       return this.amount;
    }
    public final boolean component2(){
       return this.hasRemaining;
    }
    public final AdNeoCoinResponse copy(int p0,boolean p1){
       if (PatchProxy.isSupport(AdNeoCoinResponse.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, AdNeoCoinResponse.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new AdNeoCoinResponse(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof AdNeoCoinResponse && (this.amount == p0.amount && this.hasRemaining == p0.hasRemaining))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, AdNeoCoinResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.amount * 31;
       AdNeoCoinResponse thasRemainin = this.hasRemaining;
       if (thasRemainin != null) {
          thasRemainin = 1;
       }
       return (i + thasRemainin);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AdNeoCoinResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AdNeoCoinResponse\(amount="+this.amount+", hasRemaining="+this.hasRemaining+"\)";
    }
}
