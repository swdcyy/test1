package com.kwai.feature.api.live.plugin.LiveLiteAdapterPlugin$a;
import java.lang.String;
import com.kwai.feature.api.live.plugin.LiveLiteAdapterPlugin$ScatterPriority;
import msd.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveLiteAdapterPlugin$a	// class@000fed
{
    public final String a;
    public final LiveLiteAdapterPlugin$ScatterPriority b;
    public final a c;

    public void LiveLiteAdapterPlugin$a(String p0,LiveLiteAdapterPlugin$ScatterPriority p1,a p2){
       a.p(p0, "name");
       a.p(p1, "scatterPriority");
       a.p(p2, "factory");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final String a(){
       return this.a;
    }
    public final LiveLiteAdapterPlugin$ScatterPriority b(){
       return this.b;
    }
    public final a c(){
       return this.c;
    }
    public final LiveLiteAdapterPlugin$ScatterPriority d(){
       return this.b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteAdapterPlugin$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveLiteAdapterPlugin$a && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && a.g(this.c, p0.c))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveLiteAdapterPlugin$a obj = PatchProxy.apply(null, this, LiveLiteAdapterPlugin$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveLiteAdapterPlugin$a tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.c;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveLiteAdapterPlugin$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PresenterFactory\(name="+this.a+", scatterPriority="+this.b+", factory="+this.c+"\)";
    }
}
