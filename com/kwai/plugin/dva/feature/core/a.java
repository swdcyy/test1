package com.kwai.plugin.dva.feature.core.a;
import com.kwai.plugin.dva.install.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.plugin.dva.feature.core.FeatureManager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.concurrent.CountDownLatch;

public final class a implements a	// class@000e5b
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final void a(String p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, null, FeatureManager.class, "22")) {
       }else {
          a.p(p0, "it");
          FeatureManager.c.await();
          PatchProxy.onMethodExit(FeatureManager.class, "22");
       }
       return;
    }
}
