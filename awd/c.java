package awd.c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.lang.Object;
import bwd.d;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.a;

public class c	// class@000292
{
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public ExecutorService i;
    public List j;
    public List k;
    public static final ExecutorService l;

    static {
       c.l = Executors.newCachedThreadPool();
    }
    public void c(){
       super();
       this.a = true;
       this.b = true;
       this.c = true;
       this.d = true;
       this.f = true;
       this.i = c.l;
    }
    public c a(d p0){
       if (this.k == null) {
          this.k = new ArrayList();
       }
       this.k.add(p0);
       return this;
    }
    public a b(){
       return new a(this);
    }
}
