package dz9.q;
import u07.u;
import dz9.u;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.popup.common.c;
import wkd.b;
import ho5.a;
import e17.i$b;
import android.app.Activity;
import e17.i;

public final class q implements u	// class@00201f
{
    public final u b;

    public void q(u p0){
       this.b = p0;
       super();
    }
    public final void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, q.class, "1")) {
          return;
       }
       a.p(p0, "dialog");
       a.p(p1, "view");
       q tb = this.b;
       p0.o();
       tb.Y(false);
       if (tb.F != null) {
          b.a(-607332832).x(true);
          i$b uob = new i$b();
          uob.x(R.string.arg_RES_7f1046f2);
          uob.k(tb.C);
          uob.o(2000);
          i.z(uob);
       }
       return;
    }
}
