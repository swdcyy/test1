package com.yxcorp.gifshow.growth.vfc.model.GrowthVfcServerResponse;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.vfc.model.GrowthVfcServerResponse$a;
import nsd.u;
import com.yxcorp.gifshow.growth.vfc.model.GrowthVfcModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class GrowthVfcServerResponse implements Serializable	// class@0015b4
{
    public final GrowthVfcModel dialog;
    public static final GrowthVfcServerResponse$a Companion;
    public static final long serialVersionUID;

    static {
       GrowthVfcServerResponse.Companion = new GrowthVfcServerResponse$a(null);
    }
    public void GrowthVfcServerResponse(GrowthVfcModel p0){
       super();
       this.dialog = p0;
    }
    public static GrowthVfcServerResponse copy$default(GrowthVfcServerResponse p0,GrowthVfcModel p1,int p2,Object p3){
       GrowthVfcServerResponse dialog;
       if (p2 & 0x01) {
          dialog = p0.dialog;
       }
       return p0.copy(dialog);
    }
    public final GrowthVfcModel component1(){
       return this.dialog;
    }
    public final GrowthVfcServerResponse copy(GrowthVfcModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthVfcServerResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new GrowthVfcServerResponse(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthVfcServerResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof GrowthVfcServerResponse && a.g(this.dialog, p0.dialog))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       GrowthVfcServerResponse obj = PatchProxy.apply(null, this, GrowthVfcServerResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.dialog;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GrowthVfcServerResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GrowthVfcServerResponse\(dialog="+this.dialog+"\)";
    }
}
