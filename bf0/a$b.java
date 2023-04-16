package bf0.a$b;
import java.lang.Runnable;
import bf0.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a$b implements Runnable	// class@000363
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
          return;
       }
       this.b.e("timer");
       return;
    }
}
