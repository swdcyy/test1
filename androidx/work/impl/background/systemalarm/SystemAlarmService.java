package androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemalarm.d$c;
import androidx.lifecycle.LifecycleService;
import java.lang.String;
import k3.h;
import java.lang.Throwable;
import v3.m;
import android.app.Service;
import com.kwai.performance.stability.crash.monitor.anr.async.d;
import androidx.work.impl.background.systemalarm.d;
import android.content.Intent;

public class SystemAlarmService extends LifecycleService implements d$c	// class@000a7a
{
    public d b;
    public boolean c;
    public static final String d;

    static {
       SystemAlarmService.d = h.f("SystemAlarmService");
    }
    public void SystemAlarmService(){
       super();
    }
    public void c(){
       this.c = true;
       Throwable[] throwableArr = new Throwable[0];
       h.c().a(SystemAlarmService.d, "All commands completed in dispatcher", throwableArr);
       m.a();
       this.stopSelf();
    }
    public void onCreate(){
       super.onCreate();
       d.a(this);
       this.c = false;
    }
    public void onDestroy(){
       super.onDestroy();
       this.c = true;
       this.b.j();
    }
    public int onStartCommand(Intent p0,int p1,int p2){
       super.onStartCommand(p0, p1, p2);
       if (this.c != null) {
          Throwable[] throwableArr = new Throwable[0];
          h.c().d(SystemAlarmService.d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", throwableArr);
          this.b.j();
          d.a(this);
          this.c = false;
       }
       if (p0 != null) {
          this.b.a(p0, p2);
       }
       return 3;
    }
}
