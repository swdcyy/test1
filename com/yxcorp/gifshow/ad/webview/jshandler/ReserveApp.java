package com.yxcorp.gifshow.ad.webview.jshandler.ReserveApp;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.webview.jshandler.ReserveApp$a;
import nsd.u;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ReserveApp implements Serializable	// class@0018f1
{
    public final List orderIdList;
    public static final ReserveApp$a Companion;
    public static final long serialVersionUID;

    static {
       ReserveApp.Companion = new ReserveApp$a(null);
    }
    public void ReserveApp(List p0){
       super();
       this.orderIdList = p0;
    }
    public static ReserveApp copy$default(ReserveApp p0,List p1,int p2,Object p3){
       ReserveApp orderIdList;
       if (p2 & 0x01) {
          orderIdList = p0.orderIdList;
       }
       return p0.copy(orderIdList);
    }
    public final List component1(){
       return this.orderIdList;
    }
    public final ReserveApp copy(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReserveApp.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ReserveApp(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReserveApp.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ReserveApp && a.g(this.orderIdList, p0.orderIdList))) {
          return true;
       }
       return false;
    }
    public final List getOrderIdList(){
       return this.orderIdList;
    }
    public int hashCode(){
       ReserveApp obj = PatchProxy.apply(null, this, ReserveApp.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.orderIdList;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ReserveApp.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ReserveApp\(orderIdList="+this.orderIdList+"\)";
    }
}
