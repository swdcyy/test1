package com.yxcorp.gifshow.growth.invitecode.model.GrowthC2CPopupResponse;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.invitecode.model.GrowthC2CPopupResponse$a;
import nsd.u;
import com.yxcorp.gifshow.growth.invitecode.model.GrowthC2CPopupModel;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class GrowthC2CPopupResponse implements Serializable	// class@0013d6
{
    public final GrowthC2CPopupModel popup;
    public final int result;
    public static final GrowthC2CPopupResponse$a Companion;
    public static final long serialVersionUID;

    static {
       GrowthC2CPopupResponse.Companion = new GrowthC2CPopupResponse$a(null);
    }
    public void GrowthC2CPopupResponse(int p0,GrowthC2CPopupModel p1){
       super();
       this.result = p0;
       this.popup = p1;
    }
    public void GrowthC2CPopupResponse(int p0,GrowthC2CPopupModel p1,int p2,u p3){
       if (p2 & 0x02) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
    public static GrowthC2CPopupResponse copy$default(GrowthC2CPopupResponse p0,int p1,GrowthC2CPopupModel p2,int p3,Object p4){
       GrowthC2CPopupResponse result;
       GrowthC2CPopupResponse popup;
       if (p3 & 0x01) {
          result = p0.result;
       }
       if (p3 & 0x02) {
          popup = p0.popup;
       }
       return p0.copy(result, popup);
    }
    public final int component1(){
       return this.result;
    }
    public final GrowthC2CPopupModel component2(){
       return this.popup;
    }
    public final GrowthC2CPopupResponse copy(int p0,GrowthC2CPopupModel p1){
       if (PatchProxy.isSupport(GrowthC2CPopupResponse.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, GrowthC2CPopupResponse.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new GrowthC2CPopupResponse(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthC2CPopupResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof GrowthC2CPopupResponse && (this.result == p0.result && a.g(this.popup, p0.popup)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, GrowthC2CPopupResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.result * 31;
       GrowthC2CPopupResponse tpopup = this.popup;
       int i1 = (tpopup != null)? tpopup.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GrowthC2CPopupResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GrowthC2CPopupResponse\(result="+this.result+", popup="+this.popup+"\)";
    }
}
