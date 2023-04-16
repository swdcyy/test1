package com.kwaishou.merchant.daccore.mount.delegate.base.BaseMountDelegate$a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class BaseMountDelegate$a	// class@001327
{
    public String a;
    public Object b;

    public void BaseMountDelegate$a(String p0,Object p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof BaseMountDelegate$a && (a.g(this.a, p0.a) && a.g(this.b, p0.b)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       BaseMountDelegate$a ta = this.a;
       int i = 0;
       int i1 = (ta != null)? ta.hashCode(): 0;
       i1 = i1 * 31;
       BaseMountDelegate$a tb = this.b;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       return "TempItem\(pendantId="+this.a+", item="+this.b+"\)";
    }
}
