package iz9.a$c;
import java.lang.Runnable;
import iz9.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.t0;
import qp7.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import android.app.Application;
import android.content.Context;
import ekd.r0;
import e17.i$b;
import e17.i;

public final class a$c implements Runnable	// class@0028ce
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$c.class, "1")) {
          return;
       }
       a$c tb = this.b;
       if (tb.x != null && (tb.H().B() || this.b.H().j1 != null)) {
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          int i = (!r0.d(uoc.a()))? 0x7f104ef4: 0x7f104f7e;
          i$b uob = i.m();
          uob.x(i);
          uob.o(1000);
          i.z(uob);
       }
       return;
    }
}
