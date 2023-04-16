package androidx.core.app.JobIntentService$c;
import androidx.core.app.JobIntentService$h;
import android.content.Context;
import android.content.ComponentName;
import java.lang.String;
import java.lang.Object;
import android.os.PowerManager;
import java.lang.StringBuilder;
import android.os.PowerManager$WakeLock;
import android.content.Intent;
import com.kwai.plugin.dva.feature.core.hook.a;

public final class JobIntentService$c extends JobIntentService$h	// class@0006d5
{
    public final Context d;
    public final PowerManager$WakeLock e;
    public final PowerManager$WakeLock f;
    public boolean g;
    public boolean h;

    public void JobIntentService$c(Context p0,ComponentName p1){
       super(p1);
       this.d = p0.getApplicationContext();
       PowerManager systemServic = p0.getSystemService("power");
       PowerManager$WakeLock wakeLock = systemServic.newWakeLock(1, p1.getClassName()+":launch");
       this.e = wakeLock;
       wakeLock.setReferenceCounted(false);
       PowerManager$WakeLock wakeLock1 = systemServic.newWakeLock(1, p1.getClassName()+":run");
       this.f = wakeLock1;
       wakeLock1.setReferenceCounted(false);
    }
    public void a(Intent p0){
       Intent intent = new Intent(p0);
       intent.setComponent(this.a);
       if (a.e(this.d, intent) != null) {
          _monitor_enter(this);
          if (this.g == null) {
             this.g = true;
             if (this.h == null) {
                this.e.acquire(0xea60);
             }
          }
          _monitor_exit(this);
       }
       return;
    }
    public void c(){
       _monitor_enter(this);
       if (this.h != null) {
          if (this.g != null) {
             this.e.acquire(0xea60);
          }
          this.h = false;
          this.f.release();
       }
       _monitor_exit(this);
       return;
    }
    public void d(){
       _monitor_enter(this);
       if (this.h == null) {
          this.h = true;
          this.f.acquire(0x927c0);
          this.e.release();
       }
       _monitor_exit(this);
       return;
    }
    public void e(){
       _monitor_enter(this);
       this.g = false;
       _monitor_exit(this);
    }
}
