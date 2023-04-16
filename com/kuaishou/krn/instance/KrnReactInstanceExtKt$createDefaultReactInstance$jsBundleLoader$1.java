package com.kuaishou.krn.instance.KrnReactInstanceExtKt$createDefaultReactInstance$jsBundleLoader$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.krn.utils.Weak;
import vsd.n;
import java.lang.Object;
import iu6.a;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import sj0.b;

public final class KrnReactInstanceExtKt$createDefaultReactInstance$jsBundleLoader$1 extends Lambda implements l	// class@0008c1
{
    public final Weak $reactInstanceWeakReference;
    public final n $reactInstanceWeakReference$metadata;

    public void KrnReactInstanceExtKt$createDefaultReactInstance$jsBundleLoader$1(Weak p0,n p1){
       this.$reactInstanceWeakReference = p0;
       this.$reactInstanceWeakReference$metadata = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnReactInstanceExtKt$createDefaultReactInstance$jsBundleLoader$1.class, "1")) {
          return;
       }
       a.p(p0, "kxbBundleInfo");
       b uob = this.$reactInstanceWeakReference.a(null, this.$reactInstanceWeakReference$metadata);
       if (uob != null) {
          uob.l = p0;
       }
       return;
    }
}
