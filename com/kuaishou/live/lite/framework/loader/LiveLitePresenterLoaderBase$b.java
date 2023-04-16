package com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase$b;
import com.kwai.feature.api.live.plugin.LiveLiteAdapterPlugin$ScatterPriority;
import b93.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveLitePresenterLoaderBase$b	// class@000923
{
    public final LiveLiteAdapterPlugin$ScatterPriority a;
    public final d b;

    public void LiveLitePresenterLoaderBase$b(LiveLiteAdapterPlugin$ScatterPriority p0,d p1){
       a.p(p0, "priority");
       a.p(p1, "presenter");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final d a(){
       return this.b;
    }
    public final LiveLiteAdapterPlugin$ScatterPriority b(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLitePresenterLoaderBase$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveLitePresenterLoaderBase$b && (a.g(this.a, p0.a) && a.g(this.b, p0.b)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveLitePresenterLoaderBase$b obj = PatchProxy.apply(null, this, LiveLitePresenterLoaderBase$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveLitePresenterLoaderBase$b tb = this.b;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveLitePresenterLoaderBase$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PresenterPriority\(priority="+this.a+", presenter="+this.b+"\)";
    }
}
