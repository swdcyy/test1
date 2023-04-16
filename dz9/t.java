package dz9.t;
import com.yxcorp.gifshow.widget.h$a;
import dz9.u;
import java.lang.Object;
import android.view.View;
import tyc.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import e17.i;

public final class t implements h$a	// class@002023
{
    public final u a;

    public void t(u p0){
       this.a = p0;
       super();
    }
    public void a(View p0){
       t.b(this, p0);
    }
    public void b(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "1")) {
          return;
       }
       a.p(p0, "v");
       return;
    }
    public void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "2")) {
          return;
       }
       a.p(p0, "v");
       this.a.X();
       i oi = i.l();
       if (oi != null && oi.s()) {
          oi.h();
       }
       return;
    }
}
