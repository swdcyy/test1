package com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import zn7.a;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.sdk.eve.internal.task.EveTaskLifecycle;
import java.util.List;

public final class EveInferenceManager$directInferAsync$1 extends Lambda implements a	// class@001549
{
    public final a $task;

    public void EveInferenceManager$directInferAsync$1(a p0){
       this.$task = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       EveInferenceManager$directInferAsync$1 obj = PatchProxy.apply(objArray, this, EveInferenceManager$directInferAsync$1.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.$task;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, a.class, "7");
       boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): a.p.contains(obj.g());
       return b;
    }
}
