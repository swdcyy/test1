package com.yxcorp.gifshow.growth.vfc.model.GrowthVfcRewardServerResponse;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.vfc.model.GrowthVfcRewardServerResponse$a;
import nsd.u;
import com.yxcorp.gifshow.growth.vfc.model.GrowthVfcRewardResponse;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class GrowthVfcRewardServerResponse implements Serializable	// class@0015b2
{
    public final GrowthVfcRewardResponse dialog;
    public static final GrowthVfcRewardServerResponse$a Companion;
    public static final long serialVersionUID;

    static {
       GrowthVfcRewardServerResponse.Companion = new GrowthVfcRewardServerResponse$a(null);
    }
    public void GrowthVfcRewardServerResponse(GrowthVfcRewardResponse p0){
       super();
       this.dialog = p0;
    }
    public static GrowthVfcRewardServerResponse copy$default(GrowthVfcRewardServerResponse p0,GrowthVfcRewardResponse p1,int p2,Object p3){
       GrowthVfcRewardServerResponse dialog;
       if (p2 & 0x01) {
          dialog = p0.dialog;
       }
       return p0.copy(dialog);
    }
    public final GrowthVfcRewardResponse component1(){
       return this.dialog;
    }
    public final GrowthVfcRewardServerResponse copy(GrowthVfcRewardResponse p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthVfcRewardServerResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new GrowthVfcRewardServerResponse(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthVfcRewardServerResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof GrowthVfcRewardServerResponse && a.g(this.dialog, p0.dialog))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       GrowthVfcRewardServerResponse obj = PatchProxy.apply(null, this, GrowthVfcRewardServerResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.dialog;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GrowthVfcRewardServerResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GrowthVfcRewardServerResponse\(dialog="+this.dialog+"\)";
    }
}
