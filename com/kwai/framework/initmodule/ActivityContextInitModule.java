package com.kwai.framework.initmodule.ActivityContextInitModule;
import com.kwai.framework.init.a;
import d76.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import o56.a;
import androidx.lifecycle.ProcessLifecycleOwnerMultiSupport;
import com.kwai.framework.initmodule.ActivityContextInitModule$a;
import com.kwai.framework.activitycontext.ActivityContext$b;
import com.kwai.framework.activitycontext.ActivityContext;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import android.app.Application$ActivityLifecycleCallbacks;
import kotlin.jvm.internal.a;
import com.pagemanager.PageStack;
import d76.l;
import java.util.Objects;
import d76.m;
import d76.n;
import ek8.c;

public class ActivityContextInitModule extends a	// class@001571
{

    public void ActivityContextInitModule(){
       super();
    }
    public boolean C(){
       return true;
    }
    public boolean H7(){
       return true;
    }
    public int f0(){
       return 21;
    }
    public void n(){
       o oo = o.class;
       String str = "1";
       if (PatchProxy.applyVoid(null, this, ActivityContextInitModule.class, str)) {
          return;
       }
       ProcessLifecycleOwnerMultiSupport.init(a.b());
       ActivityContext.i(new ActivityContextInitModule$a(this));
       ProcessLifecycleOwner.get().getLifecycle().addObserver(ActivityContext.g());
       a.b().registerActivityLifecycleCallbacks(ActivityContext.g());
       Application uApplication = a.b();
       if (!PatchProxy.applyVoidOneRefs(uApplication, null, oo, str)) {
          a.p(uApplication, "applicationContext");
          uApplication.registerActivityLifecycleCallbacks(PageStack.f);
       }
       if (!PatchProxy.applyVoid(null, null, oo, "2")) {
          l ol = new l();
          Objects.requireNonNull(PageStack.f);
          a.p(ol, "animationInit");
          PageStack.c = ol;
          m om = new m();
          a.p(om, "appDelegate");
          PageStack.d = om;
          n on = new n();
          a.p(on, "iLog");
          Objects.requireNonNull(c.b);
          a.p(on, "<set-?>");
          c.a = on;
       }
       return;
    }
}
