package com.kuaishou.tk.api.TKErrorDetail;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import com.kuaishou.tk.api.TKJsErrorDetail;
import com.kuaishou.tk.api.TKNativeErrorDetail;
import java.lang.StringBuilder;

public final class TKErrorDetail	// class@000f89
{
    public TKJsErrorDetail jsErrorDetail;
    public TKNativeErrorDetail nativeErrorDetail;
    public String title;

    public void TKErrorDetail(){
       super();
       this.title = null;
       this.jsErrorDetail = null;
       this.nativeErrorDetail = null;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKErrorDetail.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof TKErrorDetail && (a.g(this.title, p0.title) && (a.g(this.jsErrorDetail, p0.jsErrorDetail) && a.g(this.nativeErrorDetail, p0.nativeErrorDetail))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       TKErrorDetail obj = PatchProxy.apply(null, this, TKErrorDetail.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.title;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       TKErrorDetail tjsErrorDeta = this.jsErrorDetail;
       int i2 = (tjsErrorDeta != null)? tjsErrorDeta.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tjsErrorDeta = this.nativeErrorDetail;
       if (tjsErrorDeta != null) {
          i = tjsErrorDeta.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, TKErrorDetail.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TKErrorDetail\(title="+this.title+", jsErrorDetail="+this.jsErrorDetail+", nativeErrorDetail="+this.nativeErrorDetail+"\)";
    }
}
