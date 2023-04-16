package com.kuaishou.merchant.marketing.shop.ginsengfruit.model.SendCouponResult;
import java.io.Serializable;
import com.kuaishou.merchant.marketing.shop.ginsengfruit.model.SendCouponResult$a;
import nsd.u;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class SendCouponResult implements Serializable	// class@001beb
{
    public Boolean sendCouponSuc;
    public static final SendCouponResult$a Companion;
    public static final long serialVersionUID;

    static {
       SendCouponResult.Companion = new SendCouponResult$a(null);
    }
    public void SendCouponResult(Boolean p0){
       super();
       this.sendCouponSuc = p0;
    }
    public static SendCouponResult copy$default(SendCouponResult p0,Boolean p1,int p2,Object p3){
       SendCouponResult sendCouponSu;
       if (p2 & 0x01) {
          sendCouponSu = p0.sendCouponSuc;
       }
       return p0.copy(sendCouponSu);
    }
    public final Boolean component1(){
       return this.sendCouponSuc;
    }
    public final SendCouponResult copy(Boolean p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SendCouponResult.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SendCouponResult(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SendCouponResult.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SendCouponResult && a.g(this.sendCouponSuc, p0.sendCouponSuc))) {
          return true;
       }
       return false;
    }
    public final Boolean getSendCouponSuc(){
       return this.sendCouponSuc;
    }
    public int hashCode(){
       SendCouponResult obj = PatchProxy.apply(null, this, SendCouponResult.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.sendCouponSuc;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public final void setSendCouponSuc(Boolean p0){
       this.sendCouponSuc = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SendCouponResult.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SendCouponResult\(sendCouponSuc="+this.sendCouponSuc+"\)";
    }
}
