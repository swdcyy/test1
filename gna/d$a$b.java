package gna.d$a$b;
import android.view.View$OnClickListener;
import gna.d$a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import msd.a;
import qrd.l1;

public final class d$a$b implements View$OnClickListener	// class@002b2e
{
    public final d$a b;

    public void d$a$b(d$a p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a$b.class, "1")) {
          return;
       }
       a uoa = this.b.i();
       if (uoa != null) {
          uoa.invoke();
       }
       return;
    }
}
