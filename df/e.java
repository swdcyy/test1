package df.e;
import java.lang.Runnable;
import df.c$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class e implements Runnable	// class@001e51
{
    public final c$c b;

    public void e(c$c p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.b.c();
       return;
    }
}
