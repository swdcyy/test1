package lca.d$a;
import android.view.View$OnClickListener;
import lca.d;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import gca.b;
import lca.a;

public final class d$a implements View$OnClickListener	// class@002dab
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
          return;
       }
       d$a tb = this.b;
       d c = tb.c;
       d a = tb.a;
       if (a == null) {
          a.S("mFineTuningItemUiData");
       }
       c.a(a, this.b.b);
       return;
    }
}
