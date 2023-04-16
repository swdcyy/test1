package ci3.b$b;
import android.content.DialogInterface$OnDismissListener;
import ci3.b;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import msd.l;

public final class b$b implements DialogInterface$OnDismissListener	// class@000569
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public final void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b$b.class, "1")) {
          return;
       }
       this.b.h.invoke(Boolean.TRUE);
       PatchProxy.onMethodExit(b$b.class, "1");
       return;
    }
}
