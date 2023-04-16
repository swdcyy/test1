package aegon.chrome.base.JavaHandlerThread$a;
import java.lang.Runnable;
import aegon.chrome.base.JavaHandlerThread;
import java.lang.Object;
import aegon.chrome.base.JavaHandlerThread$d;
import aegon.chrome.base.c;
import K.S;

public class JavaHandlerThread$a implements Runnable	// class@00013d
{
    public final long b;
    public final long c;
    public final JavaHandlerThread d;

    public void JavaHandlerThread$a(JavaHandlerThread p0,long p1,long p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       c.c();
       S.MJcct7gJ(this.b, this.c);
    }
}
