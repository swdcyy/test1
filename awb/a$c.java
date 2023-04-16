package awb.a$c;
import android.view.View$OnClickListener;
import awb.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import y8c.d;
import yvb.e$b;

public final class a$c implements View$OnClickListener	// class@00033f
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
          return;
       }
       a$c tb = this.b;
       a r = tb.r;
       if (r != null && r != null) {
          a u = tb.u;
          if (u == null) {
             a.S("mPosition");
          }
          r.a(u.get(), -1);
       }
       return;
    }
}
