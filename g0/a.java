package g0.a;
import java.lang.Runnable;
import aegon.chrome.base.task.b;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a implements Runnable	// class@00201e
{
    public final b b;
    public final Object c;

    public void a(b p0,Object p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       a tb = this.b;
       a tc = this.c;
       if (tb.d.get()) {
       }else {
          tb.b(tc);
       }
       tb.c = 2;
       return;
    }
}
