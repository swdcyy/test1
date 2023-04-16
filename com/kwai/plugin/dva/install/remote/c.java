package com.kwai.plugin.dva.install.remote.c;
import android.content.Context;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import android.app.Application;
import com.kwai.plugin.dva.install.remote.c$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qj7.d;
import android.content.Intent;
import com.kwai.plugin.dva.install.remote.PluginInstallService;
import android.content.ServiceConnection;
import com.kwai.plugin.dva.feature.core.hook.a;
import java.lang.Throwable;
import java.lang.Exception;
import android.os.Looper;
import android.os.Handler;
import java.lang.Thread;
import android.os.HandlerThread;
import java.lang.IllegalThreadStateException;
import com.kwai.plugin.dva.install.remote.c$a;
import qj7.h;
import fj7.b;
import jj7.g;
import java.lang.Runnable;
import fj7.c;
import jj7.h;
import fj7.a;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import gj7.b;
import gj7.a;
import jj7.f;

public class c	// class@000ea6
{
    public final Context a;
    public final c$b b;
    public boolean c;
    public a d;
    public a e;
    public List f;
    public Handler g;

    public void c(Context p0){
       super();
       this.c = false;
       this.f = new CopyOnWriteArrayList();
       if (p0 instanceof Application) {
       }else {
          p0 = p0.getApplicationContext();
       }
       this.a = p0;
       this.b = new c$b(this);
       return;
    }
    public synchronized void a(){
       if (PatchProxy.applyVoid(null, this, c.class, "9")) {
          return;
       }
       this.b();
       if (this.c == null) {
          if (this.c == null) {
             boolean b = true;
             this.c = b;
             d.c("RemoteContractor start bindService");
             Intent intent = new Intent();
             c ta = this.a;
             PluginInstallService pluginInstal = PluginInstallService.class;
             try{
                intent.setClass(ta, pluginInstal);
                a.a(this.a, intent, this.b, b);
             }catch(java.lang.Exception e0){
                this.c = false;
                d.b("bind PluginInstallService failed", e0);
                e0.printStackTrace();
             }
          }
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, c.class, "11")) {
          return;
       }
       if (this.g.getLooper() == Thread.currentThread().getLooper()) {
          return;
       }
       throw new IllegalThreadStateException("This method should call in work thread");
    }
    public synchronized final void c(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "10")) {
          return;
       }
       this.b();
       p0.printStackTrace();
       this.c = true;
       this.d = null;
       this.a.unbindService(this.b);
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       if (this.g == null) {
          _monitor_enter(this);
          if (this.g == null) {
             this.e = new c$a(this.a);
             if (h.b(this.a)) {
                this.d = this.e;
             }
             HandlerThread handlerThrea = new HandlerThread("DvaRemoteContractor", 10);
             handlerThrea.start();
             this.g = new Handler(handlerThrea.getLooper());
          }
          _monitor_exit(this);
       }
       return;
    }
    public void e(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "6")) {
          return;
       }
       this.d();
       this.g.post(new g(this, p0));
       return;
    }
    public void f(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       this.d();
       this.g.post(new h(this, p0));
       return;
    }
    public void g(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.d();
       if (this.e != null && Dva.instance().getPluginInstallManager().t(p0.a)) {
          this.e.z1(p0.a, p0.b, p0.c, p0.d, p0.a());
       }else {
          this.g.post(new f(this, p0));
       }
       return;
    }
}
