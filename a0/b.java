package a0.b;
import java.lang.Runnable;
import aegon.chrome.base.Callback;
import java.lang.Object;
import aegon.chrome.base.a;

public final class b implements Runnable	// class@00001e
{
    public final Callback b;
    public final Object c;

    public void b(Callback p0,Object p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       a.c(this.b, this.c);
    }
}
