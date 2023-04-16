package ln9.e;
import erd.a;
import ln9.l;
import java.lang.String;
import com.yxcorp.gifshow.component.postlistcomponent.SelectScrollOption;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import nn9.b;
import mn9.a;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.framework.KSStore;
import tvc.c;
import kn9.k;
import tvc.a;

public final class e implements a	// class@002e21
{
    public final l b;
    public final String c;
    public final SelectScrollOption d;

    public void e(l p0,String p1,SelectScrollOption p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       b uob = this.b.d(this.c);
       if (uob != null) {
          a uoa = uob.g();
          if (uoa != null && (uoa.d() == true && a.g(this.b.e, uob.b()))) {
             KSStore kSStore = this.b.a();
             if (kSStore != null) {
                kSStore.a(new k(uob.c(), true, this.d));
             }
          }
       }
       return;
    }
}
