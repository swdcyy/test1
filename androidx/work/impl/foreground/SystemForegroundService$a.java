package androidx.work.impl.foreground.SystemForegroundService$a;
import java.lang.Runnable;
import androidx.work.impl.foreground.SystemForegroundService;
import java.lang.Object;
import androidx.work.impl.foreground.a;

public class SystemForegroundService$a implements Runnable	// class@000a8a
{
    public final SystemForegroundService b;

    public void SystemForegroundService$a(SystemForegroundService p0){
       this.b = p0;
       super();
    }
    public void run(){
       this.b.d.j();
    }
}
