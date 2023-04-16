package com.kuaishou.krn.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import java.lang.String;
import com.kuaishou.krn.experiment.ExpConfigKt;
import com.kuaishou.krn.c;
import kotlin.jvm.internal.a;
import android.content.Context;
import com.facebook.react.modules.diskcache.MetaDiskCache;
import java.io.File;
import com.facebook.cache.common.CacheEventListener;
import com.facebook.cache.common.CacheErrorLogger;
import ua.a$b;
import ua.a;
import com.facebook.react.modules.diskcache.e;
import java.util.Objects;
import ne.f;
import com.facebook.cache.disk.f;
import java.lang.Runnable;

public final class d	// class@000854
{
    public static final d a;

    static {
       d.a = new d();
    }
    public void d(){
       super();
    }
    public final void a(double p0,double p1){
       MetaDiskCache a;
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Double.valueOf(p0), Double.valueOf(p1), this, uod, "1")) {
          return;
       }
       if (ExpConfigKt.g()) {
          c uoc = c.b();
          a.o(uoc, "KrnManager.get\(\)");
          Context uContext = uoc.d();
          if (!PatchProxy.isSupport(MetaDiskCache.class) || !PatchProxy.applyVoidThreeRefs(uContext, Double.valueOf(p0), Double.valueOf(p1), null, MetaDiskCache.class, "2")) {
             if (p1 - p0 < 0) {
                p1 = p0;
             }
             String absolutePath = uContext.getFilesDir().getAbsolutePath();
             a$b uob = MetaDiskCache.a(absolutePath, null, null);
             uob.e = (long)(p1 * 1048576.00f);
             uob.f = (long)(p0 * 1048576.00f);
             MetaDiskCache metaDiskCach = MetaDiskCache.c(uob.a(), absolutePath, null);
             Objects.requireNonNull(metaDiskCach);
             if (!PatchProxy.applyVoid(null, metaDiskCach, MetaDiskCache.class, "22")) {
                a = metaDiskCach.a;
                Objects.requireNonNull(a);
                metaDiskCach.h(new f(a));
             }
          }
       }
       return;
    }
}
