package com.yxcorp.gifshow.activity.f$b;
import cta.c;
import com.yxcorp.gifshow.activity.f;
import java.lang.Object;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig$Status;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hsa.f;

public class f$b implements c	// class@001349
{
    public final f a;

    public void f$b(f p0){
       this.a = p0;
       super();
    }
    public void a(DynamicTabConfig p0,DynamicTabConfig$Status p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f$b.class, "1")) {
          return;
       }
       if (p1 == DynamicTabConfig$Status.CHANGE) {
          p1.e = new f(p0);
          this.a.t();
       }
       return;
    }
}
