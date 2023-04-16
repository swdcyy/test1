package c2c.g$h;
import android.content.DialogInterface$OnDismissListener;
import c2c.g;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;

public final class g$h implements DialogInterface$OnDismissListener	// class@000506
{
    public final g b;

    public void g$h(g p0){
       this.b = p0;
       super();
    }
    public final void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$h.class, "1")) {
          return;
       }
       b9.a(this.b.u);
       return;
    }
}
