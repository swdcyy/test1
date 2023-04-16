package a58.f;
import java.lang.Runnable;
import com.mini.app.installer.b$b;
import java.util.List;
import java.lang.Throwable;
import java.lang.Object;
import com.mini.app.installer.b;
import java.util.Iterator;
import h88.g;

public final class f implements Runnable	// class@000032
{
    public final b$b b;
    public final List c;
    public final List d;
    public final long e;
    public final long f;
    public final Throwable g;

    public void f(b$b p0,List p1,List p2,long p3,long p4,Throwable p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final void run(){
       f uof = this;
       f b = uof.b;
       f c = uof.c;
       f d = uof.d;
       f e = uof.e;
       f f = uof.f;
       f g = uof.g;
       Iterator iterator = b.a.g.iterator();
       while (iterator.hasNext()) {
          iterator.next().f(c, d, e, f, g);
       }
       b.g();
       return;
    }
}
