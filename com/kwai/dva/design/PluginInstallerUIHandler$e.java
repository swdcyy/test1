package com.kwai.dva.design.PluginInstallerUIHandler$e;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.os.Looper;
import com.kwai.plugin.dva.work.WorkExecutors;
import vi5.i;
import java.util.concurrent.Executor;

public final class PluginInstallerUIHandler$e	// class@000d0b
{
    public final Runnable a;
    public boolean b;

    public void PluginInstallerUIHandler$e(Runnable p0){
       a.p(p0, "action");
       super();
       this.a = p0;
       this.b = true;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, PluginInstallerUIHandler$e.class, "1")) {
          return;
       }
       if (this.b != null) {
          if (a.g(Looper.myLooper(), Looper.getMainLooper())) {
             this.a.run();
          }else {
             WorkExecutors.b.execute(new i(this));
          }
       }
       return;
    }
}
