package com.kuaishou.live.common.core.component.gift.base.model.Model$b;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class Model$b	// class@001147
{
    public final LifecycleOwner a;
    public final Observer b;

    public void Model$b(LifecycleOwner p0,Observer p1){
       a.p(p1, "lifecycleObserver");
       super();
       this.a = p0;
       this.b = p1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Model$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof Model$b && (a.g(this.a, p0.a) && a.g(this.b, p0.b)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Model$b obj = PatchProxy.apply(null, this, Model$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       Model$b tb = this.b;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, Model$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ObserverWrapper\(lifecycleOwner="+this.a+", lifecycleObserver="+this.b+"\)";
    }
}
