package com.kwai.kxb.storage.KxbBundleDao$cleanCacheByBundleId$1;
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

public final class KxbBundleDao$cleanCacheByBundleId$1 extends Lambda implements l	// class@0007f1
{
    public final List $bundleIds;

    public void KxbBundleDao$cleanCacheByBundleId$1(List p0){
       this.$bundleIds = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(d p0){
       KxbBundleDao$cleanCacheByBundleId$1 obj = PatchProxy.applyOneRefs(p0, this, KxbBundleDao$cleanCacheByBundleId$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.$bundleIds;
       boolean b = false;
       if (!obj instanceof Collection || !obj.isEmpty()) {
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             if (a.g(p0.a(), iterator.next())) {
                b = true;
                break ;
             }
          }
       }
       return b;
    }
}
