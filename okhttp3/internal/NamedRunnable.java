package okhttp3.internal.NamedRunnable;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import okhttp3.internal.Util;
import java.lang.Thread;

public abstract class NamedRunnable implements Runnable	// class@00209d
{
    public final String name;

    public void NamedRunnable(String p0,Object[] p1){
       super();
       this.name = Util.format(p0, p1);
    }
    public abstract void execute();
    public final void run(){
       Thread.currentThread().setName(this.name);
       this.execute();
       Thread.currentThread().setName(Thread.currentThread().getName());
    }
}
