package com.yxcorp.gifshow.homepage.kcube.dynamic.KCubeDynamicTabManagerImpl$c;
import ob6.p$b;
import com.yxcorp.gifshow.homepage.kcube.dynamic.KCubeDynamicTabManagerImpl;
import java.lang.Object;
import ob6.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import xn5.a;
import java.util.concurrent.atomic.AtomicInteger;
import com.yxcorp.gifshow.homepage.kcube.dynamic.KCubeDynamicTabManagerImpl$c$a;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Throwable;
import ob6.q;

public final class KCubeDynamicTabManagerImpl$c implements p$b	// class@001729
{
    public final KCubeDynamicTabManagerImpl a;

    public void KCubeDynamicTabManagerImpl$c(KCubeDynamicTabManagerImpl p0){
       this.a = p0;
       super();
    }
    public void a(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KCubeDynamicTabManagerImpl$c.class, "1")) {
          return;
       }
       a.p(p0, "keyConfig");
       a.c.d();
       this.a.i.set(2);
       k1.o(new KCubeDynamicTabManagerImpl$c$a(this, p0));
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KCubeDynamicTabManagerImpl$c.class, "2")) {
          return;
       }
       a.p(p0, "e");
       q.a(this, p0);
       this.a.i.set(3);
       return;
    }
}
