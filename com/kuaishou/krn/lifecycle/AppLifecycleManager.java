package com.kuaishou.krn.lifecycle.AppLifecycleManager;
import androidx.lifecycle.LifecycleObserver;
import com.kuaishou.krn.lifecycle.AppLifecycleManager$b;
import nsd.u;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import com.kuaishou.krn.lifecycle.AppLifecycleManager$a;
import java.lang.Runnable;
import com.facebook.react.bridge.UiThreadUtil;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.lifecycle.AppLifecycleManager$c;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.Iterator;

public final class AppLifecycleManager implements LifecycleObserver	// class@0008d6
{
    public final List b;
    public static boolean c;
    public static final AppLifecycleManager$b d;

    static {
       AppLifecycleManager.d = new AppLifecycleManager$b(null);
    }
    public void AppLifecycleManager(){
       super();
       this.b = new CopyOnWriteArrayList();
       if (!AppLifecycleManager.c) {
          UiThreadUtil.runOnUiThread(new AppLifecycleManager$a(this));
       }
       return;
    }
    public void AppLifecycleManager(u p0){
       super();
    }
    public static final AppLifecycleManager a(){
       Object obj = PatchProxy.apply(null, null, AppLifecycleManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AppLifecycleManager.d.a();
    }
    public final void b(AppLifecycleManager$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AppLifecycleManager.class, "1")) {
          return;
       }
       a.p(p0, "lifecycleListener");
       this.b.add(p0);
       return;
    }
    public final void onBackground(){
       if (PatchProxy.applyVoid(null, this, AppLifecycleManager.class, "6")) {
          return;
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().onBackground();
       }
       return;
    }
    public final void onForeground(){
       if (PatchProxy.applyVoid(null, this, AppLifecycleManager.class, "5")) {
          return;
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().onForeground();
       }
       return;
    }
}
