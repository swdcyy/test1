package ci3.b$a;
import android.content.DialogInterface$OnCancelListener;
import ci3.b;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import msd.l;

public final class b$a implements DialogInterface$OnCancelListener	// class@000568
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public final void onCancel(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b$a.class, "1")) {
          return;
       }
       this.b.h.invoke(Boolean.TRUE);
       PatchProxy.onMethodExit(b$a.class, "1");
       return;
    }
}
