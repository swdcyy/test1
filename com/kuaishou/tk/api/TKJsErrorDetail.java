package com.kuaishou.tk.api.TKJsErrorDetail;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class TKJsErrorDetail	// class@000f8a
{
    public String message;
    public String name;
    public String stack;

    public void TKJsErrorDetail(){
       super();
       this.name = null;
       this.message = null;
       this.stack = null;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKJsErrorDetail.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof TKJsErrorDetail && (a.g(this.name, p0.name) && (a.g(this.message, p0.message) && a.g(this.stack, p0.stack))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       TKJsErrorDetail obj = PatchProxy.apply(null, this, TKJsErrorDetail.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.name;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       TKJsErrorDetail tmessage = this.message;
       int i2 = (tmessage != null)? tmessage.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmessage = this.stack;
       if (tmessage != null) {
          i = tmessage.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, TKJsErrorDetail.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TKJsErrorDetail\(name="+this.name+", message="+this.message+", stack="+this.stack+"\)";
    }
}
