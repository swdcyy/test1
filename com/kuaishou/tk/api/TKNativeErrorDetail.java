package com.kuaishou.tk.api.TKNativeErrorDetail;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class TKNativeErrorDetail	// class@000f8b
{
    public String message;
    public String name;
    public List stack;

    public void TKNativeErrorDetail(){
       super();
       this.name = null;
       this.message = null;
       this.stack = null;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKNativeErrorDetail.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof TKNativeErrorDetail && (a.g(this.name, p0.name) && (a.g(this.message, p0.message) && a.g(this.stack, p0.stack))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       TKNativeErrorDetail obj = PatchProxy.apply(null, this, TKNativeErrorDetail.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.name;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       TKNativeErrorDetail tmessage = this.message;
       int i2 = (tmessage != null)? tmessage.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmessage = this.stack;
       if (tmessage != null) {
          i = tmessage.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, TKNativeErrorDetail.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TKNativeErrorDetail\(name="+this.name+", message="+this.message+", stack="+this.stack+"\)";
    }
}
