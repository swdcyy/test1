package k3.a;
import k3.a$a;
import java.lang.Object;
import java.util.concurrent.Executor;
import k3.n;
import k3.g;
import l3.a;
import java.lang.Runtime;
import java.lang.Math;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import android.os.Build$VERSION;
import k3.k;

public final class a	// class@00246a
{
    public final Executor a;
    public final Executor b;
    public final n c;
    public final g d;
    public final k e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final boolean j;

    public void a(a$a p0){
       super();
       a$a a = p0.a;
       this.a = (a == null)? this.a(): a;
       a = p0.d;
       if (a == null) {
          this.j = true;
          this.b = this.a();
       }else {
          this.j = false;
          this.b = a;
       }
       a = p0.b;
       this.c = (a == null)? n.c(): a;
       a = p0.c;
       this.d = (a == null)? g.c(): a;
       a = p0.e;
       this.e = (a == null)? new a(): a;
       this.f = p0.f;
       this.g = p0.g;
       this.h = p0.h;
       this.i = p0.i;
       return;
    }
    public final Executor a(){
       return Executors.newFixedThreadPool(Math.max(2, Math.min((Runtime.getRuntime().availableProcessors() - 1), 4)));
    }
    public Executor b(){
       return this.a;
    }
    public g c(){
       return this.d;
    }
    public int d(){
       return this.h;
    }
    public int e(){
       if (Build$VERSION.SDK_INT == 23) {
          return (this.i / 2);
       }
       return this.i;
    }
    public int f(){
       return this.g;
    }
    public int g(){
       return this.f;
    }
    public k h(){
       return this.e;
    }
    public Executor i(){
       return this.b;
    }
    public n j(){
       return this.c;
    }
}
