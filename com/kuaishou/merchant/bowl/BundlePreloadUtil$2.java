package com.kuaishou.merchant.bowl.BundlePreloadUtil$2;
import tx4.f;
import java.lang.String;
import java.lang.Object;
import tx4.w;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import pv.b;
import com.kuaishou.bowl.event.utils.StageName;
import com.kuaishou.merchant.bowl.BundlePreloadUtil$2$2;
import java.util.Map;
import fv.c;
import java.lang.StringBuilder;
import nv.c;
import tx4.e;
import com.kuaishou.merchant.bowl.BundlePreloadUtil$2$1;

public class BundlePreloadUtil$2 implements f	// class@001604
{
    public final String a;

    public void BundlePreloadUtil$2(String p0){
       this.a = p0;
       super();
    }
    public void a(w p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BundlePreloadUtil$2.class, "2")) {
          return;
       }
       String str = b.a().b(this.a, "PageDy");
       if (p0 != null) {
          c.l(StageName.pgy_bundle_preload_fail, this.a, str, new BundlePreloadUtil$2$2(this, p0));
          c.c("preCompile failed bundleId = "+p0.b, p1);
       }else {
          c.c("preCompile failed", p1);
          c.l(StageName.pgy_bundle_preload_fail, this.a, str, null);
       }
       return;
    }
    public void b(boolean p0){
       e.a(this, p0);
    }
    public void c(w p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BundlePreloadUtil$2.class, "1")) {
          return;
       }
       if (p0 != null) {
          c.l(StageName.pgy_bundle_preload_success, this.a, b.a().b(this.a, "PageDy"), new BundlePreloadUtil$2$1(this, p0));
       }
       c.f("preCompile success");
       return;
    }
}
