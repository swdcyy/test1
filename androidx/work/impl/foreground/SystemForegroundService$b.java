package androidx.work.impl.foreground.SystemForegroundService$b;
import java.lang.Runnable;
import androidx.work.impl.foreground.SystemForegroundService;
import android.app.Notification;
import java.lang.Object;
import android.os.Build$VERSION;
import android.app.Service;

public class SystemForegroundService$b implements Runnable	// class@000a8b
{
    public final int b;
    public final Notification c;
    public final int d;
    public final SystemForegroundService e;

    public void SystemForegroundService$b(SystemForegroundService p0,int p1,Notification p2,int p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void run(){
       if (Build$VERSION.SDK_INT >= 29) {
          this.e.startForeground(this.b, this.c, this.d);
       }else {
          this.e.startForeground(this.b, this.c);
       }
       return;
    }
}
