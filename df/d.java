package df.d;
import java.lang.Runnable;
import df.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class d implements Runnable	// class@001e50
{
    public final c b;

    public void d(c p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.b.h();
       return;
    }
}
