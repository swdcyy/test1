package com.kwai.kxb.storage.clean.LowDiskExpConfig$lowDiskNotCleanBundles$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.kxb.service.ExpConfig;
import com.kwai.kxb.storage.clean.LowDiskExpConfig$lowDiskNotCleanBundles$2$a;
import java.lang.reflect.Type;
import el.a;
import kotlin.jvm.internal.a;
import trd.t0;

public final class LowDiskExpConfig$lowDiskNotCleanBundles$2 extends Lambda implements a	// class@0007fe
{
    public static final LowDiskExpConfig$lowDiskNotCleanBundles$2 INSTANCE;

    static {
       LowDiskExpConfig$lowDiskNotCleanBundles$2.INSTANCE = new LowDiskExpConfig$lowDiskNotCleanBundles$2();
    }
    public void LowDiskExpConfig$lowDiskNotCleanBundles$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final Map invoke(){
       Object obj = PatchProxy.apply(null, this, LowDiskExpConfig$lowDiskNotCleanBundles$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Type type = new LowDiskExpConfig$lowDiskNotCleanBundles$2$a().getType();
       a.o(type, "object : TypeToken<Map<P¡­ List<String>>>\(\) {}.type");
       return ExpConfig.f.e("kds_low_disk_not_del_bundles", type, t0.z());
    }
}
