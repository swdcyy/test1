package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService$scanAppList$$inlined$repeat$lambda$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.lang.Object;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Collection;

public final class GrowthCleanerService$scanAppList$$inlined$repeat$lambda$1 extends Lambda implements p	// class@00133a
{
    public final ArrayList $apkFiles$inlined;
    public final CountDownLatch $latch$inlined;
    public final ArrayList $notSearchFiles$inlined;
    public final GrowthCleanerService this$0;

    public void GrowthCleanerService$scanAppList$$inlined$repeat$lambda$1(GrowthCleanerService p0,ArrayList p1,ArrayList p2,CountDownLatch p3){
       this.this$0 = p0;
       this.$notSearchFiles$inlined = p1;
       this.$apkFiles$inlined = p2;
       this.$latch$inlined = p3;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1.booleanValue());
       return l1.a;
    }
    public final void invoke(ArrayList p0,boolean p1){
       if (PatchProxy.isSupport2(GrowthCleanerService$scanAppList$$inlined$repeat$lambda$1.class, "1") && PatchProxy.applyVoidTwoRefsWithListener(p0, Boolean.valueOf(p1), this, GrowthCleanerService$scanAppList$$inlined$repeat$lambda$1.class, "1")) {
          return;
       }
       a.p(p0, "findApkFiles");
       GrowthCleanerService$scanAppList$$inlined$repeat$lambda$1 t$notSearchF = this.$notSearchFiles$inlined;
       _monitor_enter(t$notSearchF);
       this.$apkFiles$inlined.addAll(p0);
       _monitor_exit(t$notSearchF);
       if (p1) {
          this.$latch$inlined.countDown();
       }
       PatchProxy.onMethodExit(GrowthCleanerService$scanAppList$$inlined$repeat$lambda$1.class, "1");
       return;
    }
}
