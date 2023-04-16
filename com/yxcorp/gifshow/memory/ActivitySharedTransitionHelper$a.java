package com.yxcorp.gifshow.memory.ActivitySharedTransitionHelper$a;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ActivitySharedTransitionHelper$a	// class@001d3c
{
    public final int a;
    public final l b;

    public void ActivitySharedTransitionHelper$a(int p0,l p1){
       a.p(p1, "factory");
       super();
       this.a = p0;
       this.b = p1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ActivitySharedTransitionHelper$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ActivitySharedTransitionHelper$a && (this.a == p0.a && a.g(this.b, p0.b)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, ActivitySharedTransitionHelper$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.a * 31;
       ActivitySharedTransitionHelper$a tb = this.b;
       int i1 = (tb != null)? tb.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ActivitySharedTransitionHelper$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AnimatorFactory\(id="+this.a+", factory="+this.b+"\)";
    }
}
