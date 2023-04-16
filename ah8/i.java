package ah8.i;
import nf8.j;
import com.mini.plcmanager.live.a;
import java.lang.ref.WeakReference;
import com.mini.plcmanager.PlcModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.File;

public class i implements j	// class@00009d
{
    public final WeakReference a;
    public final PlcModel b;
    public final a c;

    public void i(a p0,WeakReference p1,PlcModel p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, i.class, "2")) {
          return;
       }
       this.c.c(this.a, null, this.b);
       return;
    }
    public void b(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       this.c.c(this.a, p0, this.b);
       return;
    }
}
