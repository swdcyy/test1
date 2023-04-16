package a32.e$b;
import dt5.b;
import a32.e;
import java.lang.Object;
import dt5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import a32.f;
import java.lang.Runnable;
import ekd.k1;

public class e$b implements b	// class@000021
{
    public final e a;

    public void e$b(e p0){
       this.a = p0;
       super();
    }
    public void a(){
       a.f(this);
    }
    public void b(boolean p0){
       e$b uob = e$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "1")) {
          return;
       }
       k1.o(new f(this, p0));
       return;
    }
    public void c(){
       a.c(this);
    }
    public void d(){
       a.d(this);
    }
    public void e(float p0){
       a.a(this, p0);
    }
    public void f(float p0){
       a.e(this, p0);
    }
    public void g(){
       a.g(this);
    }
}
