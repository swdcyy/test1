package bf9.a;
import android.view.View$OnClickListener;
import bf9.h;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import crd.b;
import lnc.b9;
import brd.t;
import ye9.j;
import bf9.f;
import bf9.g;
import erd.g;

public final class a implements View$OnClickListener	// class@00048b
{
    public final h b;

    public void a(h p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, h.class, "12")) {
       }else {
          h u = tb.u;
          if (u != null && !u.isEmpty()) {
             b9.a(tb.v);
             tb.v = j.f(tb.u).subscribe(new f(tb), new g(tb));
          }
       }
       return;
    }
}
