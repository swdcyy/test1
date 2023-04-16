package com.yxcorp.gifshow.growth.vfc.model.GrowthVfcInviteResponse;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.vfc.model.GrowthVfcInviteResponse$a;
import nsd.u;
import com.yxcorp.gifshow.growth.vfc.model.GrowthVfcInviteDialog;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class GrowthVfcInviteResponse implements Serializable	// class@0015ac
{
    public final GrowthVfcInviteDialog dialog;
    public static final GrowthVfcInviteResponse$a Companion;
    public static final long serialVersionUID;

    static {
       GrowthVfcInviteResponse.Companion = new GrowthVfcInviteResponse$a(null);
    }
    public void GrowthVfcInviteResponse(GrowthVfcInviteDialog p0){
       a.p(p0, "dialog");
       super();
       this.dialog = p0;
    }
    public static GrowthVfcInviteResponse copy$default(GrowthVfcInviteResponse p0,GrowthVfcInviteDialog p1,int p2,Object p3){
       GrowthVfcInviteResponse dialog;
       if (p2 & 0x01) {
          dialog = p0.dialog;
       }
       return p0.copy(dialog);
    }
    public final GrowthVfcInviteDialog component1(){
       return this.dialog;
    }
    public final GrowthVfcInviteResponse copy(GrowthVfcInviteDialog p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthVfcInviteResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "dialog");
       return new GrowthVfcInviteResponse(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthVfcInviteResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof GrowthVfcInviteResponse && a.g(this.dialog, p0.dialog))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       GrowthVfcInviteResponse obj = PatchProxy.apply(null, this, GrowthVfcInviteResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.dialog;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GrowthVfcInviteResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GrowthVfcInviteResponse\(dialog="+this.dialog+"\)";
    }
}
