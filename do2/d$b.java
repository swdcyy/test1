package do2.d$b;
import java.lang.Runnable;
import do2.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import do2.a;

public final class d$b implements Runnable	// class@002565
{
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, d$b.class, "1")) {
          return;
       }
       d$b tb = this.b;
       tb.a.c(tb.b, false, "onFinishPlay");
       return;
    }
}
