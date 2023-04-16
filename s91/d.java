package s91.d;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s91.f;

public class d implements g	// class@003c29
{

    public void d(){
       super();
    }
    public void a(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       f.b(p0);
       return;
    }
    public void accept(Object p0){
       this.a(p0);
    }
}
