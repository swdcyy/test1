package bf0.b;
import java.lang.Runnable;
import bf0.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class b implements Runnable	// class@000365
{
    public final a b;
    public final String c;

    public void b(a p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.b.e(this.c);
       return;
    }
}
