package kf9.g;
import java.lang.Object;
import java.util.ArrayList;
import kf9.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class g	// class@002c83
{
    public final ArrayList a;

    public void g(){
       super();
       this.a = new ArrayList();
    }
    public final void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       a.p(p0, "listener");
       if (this.a.contains(p0)) {
          return;
       }
       this.a.add(p0);
       return;
    }
}
