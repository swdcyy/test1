package hy1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hy1.b;
import hy1.e;

public abstract class a	// class@0027bc
{
    public b a;

    public void a(){
       super();
    }
    public abstract int a();
    public void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       a ta = this.a;
       if (ta == null) {
          return;
       }
       ta.a();
       return;
    }
    public abstract e c();
    public void d(e p0){
    }
    public abstract void e(e p0);
    public void f(b p0){
       this.a = p0;
    }
    public abstract boolean g();
}
