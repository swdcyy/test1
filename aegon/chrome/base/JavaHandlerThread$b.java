package aegon.chrome.base.JavaHandlerThread$b;
import java.lang.Runnable;
import aegon.chrome.base.JavaHandlerThread;
import java.lang.Object;
import android.os.HandlerThread;
import aegon.chrome.base.JavaHandlerThread$d;
import aegon.chrome.base.c;
import K.S;

public class JavaHandlerThread$b implements Runnable	// class@00013e
{
    public final long b;
    public final JavaHandlerThread c;

    public void JavaHandlerThread$b(JavaHandlerThread p0,long p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       this.c.a.quit();
       c.c();
       S.MYwg$x8E(this.b);
    }
}
