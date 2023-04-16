package com.yxcorp.gifshow.ad.response.ARScanDialogResponse;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.response.ARScanDialogResponse$a;
import nsd.u;
import com.yxcorp.gifshow.ad.response.JumpUrlData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ARScanDialogResponse implements Serializable	// class@0017cb
{
    public JumpUrlData data;
    public static final ARScanDialogResponse$a Companion;
    public static final long serialVersionUID;

    static {
       ARScanDialogResponse.Companion = new ARScanDialogResponse$a(null);
    }
    public void ARScanDialogResponse(){
       super(null, 1, null);
    }
    public void ARScanDialogResponse(JumpUrlData p0){
       a.p(p0, "data");
       super();
       this.data = p0;
    }
    public void ARScanDialogResponse(JumpUrlData p0,int p1,u p2){
       if (p1 & 1) {
          p0 = new JumpUrlData(null, 1, null);
       }
       super(p0);
       return;
    }
    public static ARScanDialogResponse copy$default(ARScanDialogResponse p0,JumpUrlData p1,int p2,Object p3){
       ARScanDialogResponse data;
       if (p2 & 0x01) {
          data = p0.data;
       }
       return p0.copy(data);
    }
    public final JumpUrlData component1(){
       return this.data;
    }
    public final ARScanDialogResponse copy(JumpUrlData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ARScanDialogResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "data");
       return new ARScanDialogResponse(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ARScanDialogResponse.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ARScanDialogResponse && a.g(this.data, p0.data))) {
          return true;
       }
       return false;
    }
    public final JumpUrlData getData(){
       return this.data;
    }
    public int hashCode(){
       ARScanDialogResponse obj = PatchProxy.apply(null, this, ARScanDialogResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.data;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public final void setData(JumpUrlData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ARScanDialogResponse.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.data = p0;
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ARScanDialogResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ARScanDialogResponse\(data="+this.data+"\)";
    }
}
