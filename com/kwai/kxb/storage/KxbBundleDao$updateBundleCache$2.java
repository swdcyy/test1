package com.kwai.kxb.storage.KxbBundleDao$updateBundleCache$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.util.List;
import java.lang.Object;
import tu6.d;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.jvm.internal.a;

public final class KxbBundleDao$updateBundleCache$2 extends Lambda implements l	// class@0007f3
{
    public final List $bundleEntities;

    public void KxbBundleDao$updateBundleCache$2(List p0){
       this.$bundleEntities = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(d p0){
       KxbBundleDao$updateBundleCache$2 obj = PatchProxy.applyOneRefs(p0, this, KxbBundleDao$updateBundleCache$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.$bundleEntities;
       boolean b = true;
       if (!obj instanceof Collection || !obj.isEmpty()) {
          Iterator iterator = obj.iterator();
          do {
             if (iterator.hasNext()) {
                d uod = iterator.next();
                boolean b1 = (a.g(uod.a(), p0.a()) && (uod.k() == p0.k() && a.g(uod.l(), p0.l())))? true: false;
             }
          } while (b1);
          return b;
       }
       b = false;
       goto label_005e ;
    }
}
