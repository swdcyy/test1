package com.kwai.plugin.dva.split.a;
import com.kwai.plugin.dva.install.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.plugin.dva.split.SplitManager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.concurrent.CountDownLatch;

public final class a implements a	// class@001388
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final void a(String p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, null, SplitManager.class, "9")) {
       }else {
          a.p(p0, "it");
          SplitManager.d.await();
          PatchProxy.onMethodExit(SplitManager.class, "9");
       }
       return;
    }
}
