package ond.d$b;
import qsc.e;
import ond.d;
import java.lang.Object;
import qsc.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class d$b implements e	// class@002027
{
    public final d a;

    public void d$b(d p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0){
       d.e(this, p0);
    }
    public void b(int p0){
       d.c(this, p0);
    }
    public void c(){
       d.d(this);
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, d$b.class, "1")) {
          return;
       }
       this.a.K();
       return;
    }
    public void e(){
       d.f(this);
    }
    public void f(){
       d.b(this);
    }
}
