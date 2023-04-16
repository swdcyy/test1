package com.kuaishou.krn.instance.cache.KrnInstanceCacheManager$findAvailableInstanceByVersionAndState$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import sj0.b;
import java.lang.Comparable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fk0.a;
import java.lang.Integer;

public final class KrnInstanceCacheManager$findAvailableInstanceByVersionAndState$2 extends Lambda implements l	// class@0008ce
{
    public static final KrnInstanceCacheManager$findAvailableInstanceByVersionAndState$2 INSTANCE;

    static {
       KrnInstanceCacheManager$findAvailableInstanceByVersionAndState$2.INSTANCE = new KrnInstanceCacheManager$findAvailableInstanceByVersionAndState$2();
    }
    public void KrnInstanceCacheManager$findAvailableInstanceByVersionAndState$2(){
       super(1);
    }
    public final Comparable invoke(b p0){
       int i;
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnInstanceCacheManager$findAvailableInstanceByVersionAndState$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a uoa = p0.a();
       uoa = (uoa != null)? uoa.versionCode: 0;
       return Integer.valueOf(uoa);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
