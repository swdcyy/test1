package com.yxcorp.gifshow.init.module.PerfAutoTestInitModule;
import com.kwai.framework.init.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.d;
import android.app.Application;
import o56.a;
import q45.a;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.init.module.m0;
import ekd.v0;
import java.util.ArrayList;

public class PerfAutoTestInitModule extends a	// class@001992
{
    public static final int q;

    public void PerfAutoTestInitModule(){
       super();
    }
    public int f0(){
       return 19;
    }
    public void n(){
       m0 a;
       if (PatchProxy.applyVoidWithListener(null, this, PerfAutoTestInitModule.class, "1")) {
          return;
       }
       if (d.i) {
          Application uApplication = a.b();
          if (!PatchProxy.applyVoidOneRefsWithListener(uApplication, this, PerfAutoTestInitModule.class, "2")) {
             Objects.requireNonNull(a.a);
             a.q(uApplication, "context");
             a = m0.a;
             if (a.a == null) {
                a.a = new ArrayList();
             }
             a.a.add(a);
             PatchProxy.onMethodExit(PerfAutoTestInitModule.class, "2");
          }
          Objects.requireNonNull(a.a);
          a.q(a.b(), "application");
       }
       PatchProxy.onMethodExit(PerfAutoTestInitModule.class, "1");
       return;
    }
}
