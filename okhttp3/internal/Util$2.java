package okhttp3.internal.Util$2;
import java.util.concurrent.ThreadFactory;
import java.lang.String;
import java.lang.Object;
import java.lang.Runnable;
import java.lang.Thread;

public class Util$2 implements ThreadFactory	// class@00209f
{
    public final boolean val$daemon;
    public final String val$name;

    public void Util$2(String p0,boolean p1){
       this.val$name = p0;
       this.val$daemon = p1;
       super();
    }
    public Thread newThread(Runnable p0){
       Thread thread = new Thread(p0, this.val$name);
       thread.setDaemon(this.val$daemon);
       return thread;
    }
}
