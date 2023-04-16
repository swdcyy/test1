package an4.a$a;
import java.lang.Runnable;
import an4.a;
import p55.a;
import java.lang.Object;
import f55.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a$a implements Runnable	// class@00009f
{
    public final a b;
    public final a c;
    public final Object d;
    public final g e;

    public void a$a(a p0,a p1,Object p2,g p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       this.b.g(this.c, this.d, this.e);
       return;
    }
}
