package com.kwai.platform.keventbus.KEventBus$a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class KEventBus$a	// class@001284
{
    public final String a;
    public final Object b;

    public void KEventBus$a(String p0,Object p1){
       a.p(p0, "type");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final String a(){
       return this.a;
    }
    public final Object b(){
       return this.b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KEventBus$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof KEventBus$a && (a.g(this.a, p0.a) && a.g(this.b, p0.b)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       KEventBus$a obj = PatchProxy.apply(null, this, KEventBus$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       KEventBus$a tb = this.b;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KEventBus$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KRawEvent\(type="+this.a+", value="+this.b+"\)";
    }
}
