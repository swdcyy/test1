package com.kwai.sdk.eve.internal.common.scheduler.internal.a$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a$a	// class@001495
{
    public final Object a;
    public final long b;

    public void a$a(Object p0,long p1){
       a.p(p0, "data");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final long a(){
       return this.b;
    }
    public final Object b(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a$a && (a.g(this.a, p0.a) && !this.b - p0.b))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       a$a obj = PatchProxy.apply(null, this, a$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       a$a tb = this.b;
       return ((i * 31) + (int)(tb ^ (tb >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Node\(data="+this.a+", createdTimestamp="+this.b+"\)";
    }
}
