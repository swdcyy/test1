package bf0.a$a;
import java.lang.Runnable;
import bf0.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a$a implements Runnable	// class@000362
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       this.b.e("start");
       return;
    }
}
