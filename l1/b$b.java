package l1.b$b;
import java.lang.Runnable;
import android.app.Application;
import l1.b$d;
import java.lang.Object;
import android.app.Application$ActivityLifecycleCallbacks;

public class b$b implements Runnable	// class@0024ed
{
    public final Application b;
    public final b$d c;

    public void b$b(Application p0,b$d p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void run(){
       this.b.unregisterActivityLifecycleCallbacks(this.c);
    }
}
