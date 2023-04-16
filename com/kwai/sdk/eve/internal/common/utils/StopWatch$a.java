package com.kwai.sdk.eve.internal.common.utils.StopWatch$a;
import java.util.List;
import com.kwai.sdk.eve.internal.common.utils.TimeRangeSetSummary;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class StopWatch$a	// class@0014a6
{
    public final List a;
    public final TimeRangeSetSummary b;

    public void StopWatch$a(List p0,TimeRangeSetSummary p1){
       a.p(p0, "details");
       a.p(p1, "summary");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final List a(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StopWatch$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof StopWatch$a && (a.g(this.a, p0.a) && a.g(this.b, p0.b)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       StopWatch$a obj = PatchProxy.apply(null, this, StopWatch$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       StopWatch$a tb = this.b;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, StopWatch$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Result\(details="+this.a+", summary="+this.b+"\)";
    }
}
