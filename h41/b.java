package h41.b;
import h41.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class b	// class@00261e
{
    public LiveSlidePlayService a;
    public a b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public c g;
    public b$a h;

    public void b(b$a p0){
       super();
       this.h = p0;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       b th = this.h;
       if (th != null) {
          th.x(this.c);
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       b th = this.h;
       if (th != null) {
          th.Q(this.c);
       }
       return;
    }
}
