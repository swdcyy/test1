package com.kuaishou.krn.lifecycle.AppLifecycleManager$a;
import java.lang.Runnable;
import com.kuaishou.krn.lifecycle.AppLifecycleManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ek0.d;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import kotlin.jvm.internal.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;

public final class AppLifecycleManager$a implements Runnable	// class@0008d2
{
    public final AppLifecycleManager b;

    public void AppLifecycleManager$a(AppLifecycleManager p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, AppLifecycleManager$a.class, "1")) {
          return;
       }
       d.e("AppLifecycleManager registers the listener internally");
       LifecycleOwner lifecycleOwn = ProcessLifecycleOwner.get();
       a.o(lifecycleOwn, "ProcessLifecycleOwner.get\(\)");
       lifecycleOwn.getLifecycle().addObserver(this.b);
       return;
    }
}
