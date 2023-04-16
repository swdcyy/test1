package androidx.work.impl.foreground.SystemForegroundService$d;
import java.lang.Runnable;
import androidx.work.impl.foreground.SystemForegroundService;
import java.lang.Object;
import android.app.NotificationManager;

public class SystemForegroundService$d implements Runnable	// class@000a8d
{
    public final int b;
    public final SystemForegroundService c;

    public void SystemForegroundService$d(SystemForegroundService p0,int p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       this.c.e.cancel(this.b);
    }
}
