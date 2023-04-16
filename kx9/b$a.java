package kx9.b$a;
import xk9.n;
import kx9.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jx9.a;
import java.lang.Integer;

public class b$a implements n	// class@002d15
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "2")) {
          return;
       }
       this.a.p.a();
       return;
    }
    public void b(int p0,int p1){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       b p = this.a.p;
       p.c = p.c + p1;
       return;
    }
}
