package aq1.g$a;
import android.view.View$OnClickListener;
import aq1.g;
import zp1.m;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zp1.c;
import androidx.lifecycle.LiveData;
import java.lang.Boolean;
import k2b.e0;
import yp1.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.util.Map;
import kotlin.jvm.internal.a;
import yp1.a;
import zp1.q$f;
import zp1.q;

public final class g$a implements View$OnClickListener	// class@000284
{
    public final g b;
    public final m c;

    public void g$a(g p0,m p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       Boolean value;
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "1")) {
          return;
       }
       String str = "it1";
       if (this.b.y3()) {
          value = this.c.y0().getValue();
          if (value != null) {
             g$a tb = this.b;
             a.o(value, str);
             a.d(this.b.J.d(), this.b.J.f(), tb.J.e(tb.I), value.booleanValue(), this.b.z3(), this.b.I);
          }
       }else {
          value = this.c.y0().getValue();
          if (value != null) {
             a.o(value, str);
             a.g(this.b.J.d(), this.b.J.f(), value.booleanValue(), this.b.z3(), this.b.I);
          }
       }
       this.c.x0(q$f.a);
       return;
    }
}
