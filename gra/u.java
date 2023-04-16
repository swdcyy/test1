package gra.u;
import android.view.View$OnClickListener;
import gra.v;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class u implements View$OnClickListener	// class@002bc7
{
    public final v b;

    public void u(v p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "1")) {
          return;
       }
       this.b.j6();
       return;
    }
}
