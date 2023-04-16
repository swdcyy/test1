package dz9.b;
import android.content.DialogInterface$OnDismissListener;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import vo5.b;

public final class b implements DialogInterface$OnDismissListener	// class@002009
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       b uob = d.a(0x3a21af1e);
       if (uob != null) {
          uob.destroy();
       }
       return;
    }
}
