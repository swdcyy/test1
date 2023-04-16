package androidx.work.impl.foreground.SystemForegroundService$c;
import java.lang.Runnable;
import androidx.work.impl.foreground.SystemForegroundService;
import android.app.Notification;
import java.lang.Object;
import android.app.NotificationManager;

public class SystemForegroundService$c implements Runnable	// class@000a8c
{
    public final int b;
    public final Notification c;
    public final SystemForegroundService d;

    public void SystemForegroundService$c(SystemForegroundService p0,int p1,Notification p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       this.d.e.notify(this.b, this.c);
    }
}
