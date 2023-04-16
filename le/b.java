package le.b;
import java.lang.Runnable;
import le.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.modules.core.a;
import com.facebook.react.modules.core.a$a;

public class b implements Runnable	// class@00254b
{
    public final c b;
    public final c c;

    public void b(c p0,c p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.c.c = a.a();
       this.c.c.b(this.b);
       return;
    }
}
