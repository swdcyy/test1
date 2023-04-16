package f21.d$a;
import android.view.View$OnClickListener;
import f21.d;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.bottombar.component.widget.d;
import f21.d$a$a;
import lnc.c3$a;
import lnc.c3;

public final class d$a implements View$OnClickListener	// class@0022a0
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
       c3.c(this.b.i, new d$a$a(this));
       return;
    }
}
