package com.kuaishou.krn.context.KrnContextBindingManager$remove$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import lj0.c;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class KrnContextBindingManager$remove$1 extends Lambda implements l	// class@000850
{
    public final c $krnContext;

    public void KrnContextBindingManager$remove$1(c p0){
       this.$krnContext = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(WeakReference p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnContextBindingManager$remove$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       c uoc = p0.get();
       boolean b = (uoc == null || a.g(uoc, this.$krnContext))? true: false;
       return b;
    }
}
