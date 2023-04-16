package fgd.r$a$a$a;
import java.lang.Runnable;
import fgd.r$a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fgd.r$a;
import fgd.r;
import java.util.concurrent.atomic.AtomicBoolean;
import com.kwai.framework.cache.a;
import bgd.c;

public final class r$a$a$a implements Runnable	// class@000e34
{
    public final r$a$a b;

    public void r$a$a$a(r$a$a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, r$a$a$a.class, "1")) {
          return;
       }
       this.b.b.b.v.set(true);
       a.f().s(true);
       a.f().l(r.S8(this.b.b.b).a());
       a.f().s(false);
       this.b.b.b.v.set(false);
       return;
    }
}
