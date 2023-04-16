package com.kwai.component.stargateegg.log.StargateEggIntervalLogger$a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class StargateEggIntervalLogger$a	// class@000b37
{
    public final String a;
    public final String b;

    public void StargateEggIntervalLogger$a(String p0,String p1){
       a.p(p0, "id");
       a.p(p1, "type");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final String a(){
       return this.a;
    }
    public final String b(){
       return this.b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StargateEggIntervalLogger$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof StargateEggIntervalLogger$a && (a.g(this.a, p0.a) && a.g(this.b, p0.b)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       StargateEggIntervalLogger$a obj = PatchProxy.apply(null, this, StargateEggIntervalLogger$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       StargateEggIntervalLogger$a tb = this.b;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, StargateEggIntervalLogger$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "StargateEggLoggerModel\(id="+this.a+", type="+this.b+"\)";
    }
}
