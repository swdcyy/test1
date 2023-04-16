package ln9.k;
import erd.g;
import ln9.l;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.KSStore;
import tvc.c;
import kn9.i;
import java.util.ArrayList;
import tvc.a;

public final class k implements g	// class@002e27
{
    public final l b;
    public final boolean c;

    public void k(l p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
       }else {
          KSStore kSStore = this.b.a();
          if (kSStore != null) {
             kSStore.a(new i(null, p0, this.c));
          }
       }
       return;
    }
}
