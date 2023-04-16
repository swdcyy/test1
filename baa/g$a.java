package baa.g$a;
import io.reactivex.g;
import daa.i;
import android.content.Context;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.airbnb.lottie.a;
import w4.m;
import com.airbnb.lottie.network.b;
import java.lang.Throwable;
import brd.g;
import w4.e;
import baa.p;
import qrd.l1;

public final class g$a implements g	// class@000433
{
    public final i b;
    public final Context c;

    public void g$a(i p0,Context p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       l1 a;
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       String str = this.b.b();
       if (str != null) {
          m om = b.b(this.c.getApplicationContext(), str);
          a.o(om, "result");
          Throwable throwable = om.a();
          if (throwable != null) {
             p0.onError(throwable);
          }
          if (om.b() != null) {
             p.a(p0);
             a = l1.a;
          }else {
             a = null;
          }
          if (a != null) {
          label_0049 :
             return;
          }
       }
       p.a(p0);
       l1 a1 = l1.a;
       goto label_0049 ;
    }
}
