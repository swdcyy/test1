package androidx.work.impl.background.systemalarm.SystemAlarmScheduler;
import l3.e;
import java.lang.String;
import k3.h;
import android.content.Context;
import java.lang.Object;
import u3.r;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.a;
import android.content.ComponentName;
import com.kwai.plugin.dva.feature.core.hook.a;
import java.lang.Throwable;
import ig6.c;

public class SystemAlarmScheduler implements e	// class@000a79
{
    public final Context b;
    public static final String c;

    static {
       SystemAlarmScheduler.c = h.f("SystemAlarmScheduler");
    }
    public void SystemAlarmScheduler(Context p0){
       super();
       this.b = p0.getApplicationContext();
    }
    public void a(r[] p0){
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          this.scheduleWorkSpec(p0[i]);
       }
       return;
    }
    public boolean b(){
       return true;
    }
    public void cancel(String p0){
       a.e(this.b, a.g(this.b, p0));
    }
    public final void scheduleWorkSpec(r p0){
       Object[] objArray = new Object[]{p0.a};
       Throwable[] throwableArr = new Throwable[0];
       h.c().a(SystemAlarmScheduler.c, String.format("Scheduling work with workSpecId %s", objArray), throwableArr);
       a.e(this.b, a.f(this.b, p0.a));
    }
}
