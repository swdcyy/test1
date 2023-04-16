package com.yxcorp.gifshow.ad.award.model.SendCoinBody;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.award.model.SendCoinBody$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import fg6.a;
import com.google.gson.Gson;
import java.lang.StringBuilder;

public final class SendCoinBody implements Serializable	// class@001519
{
    public final int displayType;
    public final String neoParams;
    public static final SendCoinBody$a Companion;
    public static final long serialVersionUID;

    static {
       SendCoinBody.Companion = new SendCoinBody$a(null);
    }
    public void SendCoinBody(int p0,String p1){
       super();
       this.displayType = p0;
       this.neoParams = p1;
    }
    public static SendCoinBody copy$default(SendCoinBody p0,int p1,String p2,int p3,Object p4){
       SendCoinBody displayType;
       SendCoinBody neoParams;
       if (p3 & 0x01) {
          displayType = p0.displayType;
       }
       if (p3 & 0x02) {
          neoParams = p0.neoParams;
       }
       return p0.copy(displayType, neoParams);
    }
    public final int component1(){
       return this.displayType;
    }
    public final String component2(){
       return this.neoParams;
    }
    public final SendCoinBody copy(int p0,String p1){
       if (PatchProxy.isSupport(SendCoinBody.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, SendCoinBody.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new SendCoinBody(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SendCoinBody.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SendCoinBody && (this.displayType == p0.displayType && a.g(this.neoParams, p0.neoParams)))) {
          return true;
       }
       return false;
    }
    public final int getDisplayType(){
       return this.displayType;
    }
    public final String getNeoParams(){
       return this.neoParams;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, SendCoinBody.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.displayType * 31;
       SendCoinBody tneoParams = this.neoParams;
       int i1 = (tneoParams != null)? tneoParams.hashCode(): 0;
       return (i + i1);
    }
    public final String toBodyString(){
       String obj = PatchProxy.apply(null, this, SendCoinBody.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a.q(this);
       a.o(obj, "Gsons.KWAI_GSON.toJson\(this\)");
       return obj;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SendCoinBody.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SendCoinBody\(displayType="+this.displayType+", neoParams="+this.neoParams+"\)";
    }
}
