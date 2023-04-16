package com.yxcorp.gifshow.ad.award.model.SendCoinData;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.award.model.SendCoinData$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class SendCoinData implements Serializable	// class@00151b
{
    public final String toast;
    public static final SendCoinData$a Companion;
    public static final long serialVersionUID;

    static {
       SendCoinData.Companion = new SendCoinData$a(null);
    }
    public void SendCoinData(String p0){
       super();
       this.toast = p0;
    }
    public static SendCoinData copy$default(SendCoinData p0,String p1,int p2,Object p3){
       SendCoinData toast;
       if (p2 & 0x01) {
          toast = p0.toast;
       }
       return p0.copy(toast);
    }
    public final String component1(){
       return this.toast;
    }
    public final SendCoinData copy(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SendCoinData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SendCoinData(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SendCoinData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SendCoinData && a.g(this.toast, p0.toast))) {
          return true;
       }
       return false;
    }
    public final String getToast(){
       return this.toast;
    }
    public int hashCode(){
       SendCoinData obj = PatchProxy.apply(null, this, SendCoinData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.toast;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SendCoinData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SendCoinData\(toast="+this.toast+"\)";
    }
}
