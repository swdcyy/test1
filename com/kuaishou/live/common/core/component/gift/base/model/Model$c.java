package com.kuaishou.live.common.core.component.gift.base.model.Model$c;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class Model$c	// class@001148
{
    public final String a;
    public final Object b;
    public final Object c;

    public void Model$c(String p0,Object p1,Object p2){
       a.p(p0, "source");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final Object a(){
       return this.c;
    }
    public final Object b(){
       return this.b;
    }
    public final String c(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Model$c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof Model$c && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && a.g(this.c, p0.c))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Model$c obj = PatchProxy.apply(null, this, Model$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       Model$c tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.c;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, Model$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ValueWrapper\(source="+this.a+", oldValue="+this.b+", newValue="+this.c+"\)";
    }
}
