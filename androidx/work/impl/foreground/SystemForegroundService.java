package androidx.work.impl.foreground.SystemForegroundService;
import androidx.work.impl.foreground.a$b;
import androidx.lifecycle.LifecycleService;
import java.lang.String;
import k3.h;
import androidx.work.impl.foreground.SystemForegroundService$d;
import java.lang.Runnable;
import android.os.Handler;
import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService$c;
import androidx.work.impl.foreground.SystemForegroundService$b;
import android.os.Looper;
import android.content.Context;
import android.app.Service;
import java.lang.Object;
import android.app.NotificationManager;
import androidx.work.impl.foreground.a;
import androidx.work.impl.foreground.SystemForegroundService$a;
import android.content.Intent;
import java.lang.Throwable;
import android.os.Build$VERSION;

public class SystemForegroundService extends LifecycleService implements a$b	// class@000a8e
{
    public Handler b;
    public boolean c;
    public a d;
    public NotificationManager e;
    public static final String f;
    public static SystemForegroundService g;

    static {
       SystemForegroundService.f = h.f("SystemFgService");
       SystemForegroundService.g = null;
    }
    public void SystemForegroundService(){
       super();
    }
    public static SystemForegroundService e(){
       return SystemForegroundService.g;
    }
    public void a(int p0){
       this.b.post(new SystemForegroundService$d(this, p0));
    }
    public void b(int p0,Notification p1){
       this.b.post(new SystemForegroundService$c(this, p0, p1));
    }
    public void d(int p0,int p1,Notification p2){
       this.b.post(new SystemForegroundService$b(this, p0, p2, p1));
    }
    public final void f(){
       this.b = new Handler(Looper.getMainLooper());
       this.e = this.getApplicationContext().getSystemService("notification");
       a uoa = new a(this.getApplicationContext());
       this.d = uoa;
       uoa.m(this);
    }
    public void g(){
       this.b.post(new SystemForegroundService$a(this));
    }
    public void onCreate(){
       super.onCreate();
       SystemForegroundService.g = this;
       this.f();
    }
    public void onDestroy(){
       super.onDestroy();
       this.d.k();
    }
    public int onStartCommand(Intent p0,int p1,int p2){
       super.onStartCommand(p0, p1, p2);
       if (this.c != null) {
          Throwable[] throwableArr = new Throwable[0];
          h.c().d(SystemForegroundService.f, "Re-initializing SystemForegroundService after a request to shut-down.", throwableArr);
          this.d.k();
          this.f();
          this.c = false;
       }
       if (p0 != null) {
          this.d.l(p0);
       }
       return 3;
    }
    public void stop(){
       boolean b = true;
       this.c = b;
       Throwable[] throwableArr = new Throwable[0];
       h.c().a(SystemForegroundService.f, "All commands completed.", throwableArr);
       if (Build$VERSION.SDK_INT >= 26) {
          this.stopForeground(b);
       }
       SystemForegroundService.g = null;
       this.stopSelf();
       return;
    }
}
