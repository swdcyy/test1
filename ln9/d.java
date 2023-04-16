package ln9.d;
import erd.g;
import ln9.l;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.KSStore;
import tvc.c;
import kn9.g;
import java.util.ArrayList;
import tvc.a;

public final class d implements g	// class@002e20
{
    public final l b;
    public final boolean c;
    public final boolean d;

    public void d(l p0,boolean p1,boolean p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          KSStore kSStore = this.b.a();
          if (kSStore != null) {
             kSStore.a(new g(null, p0, this.c, this.d));
          }
       }
       return;
    }
}
