package i3a.a$d;
import android.content.DialogInterface$OnDismissListener;
import i3a.a;
import msd.l;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import qrd.l1;

public final class a$d implements DialogInterface$OnDismissListener	// class@002770
{
    public final a b;
    public final l c;

    public void a$d(a p0,l p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a$d.class, "1")) {
          return;
       }
       a e = this.b.e;
       if (e != null) {
          l1 ol1 = e.invoke(Boolean.FALSE);
       }
       PatchProxy.onMethodExit(a$d.class, "1");
       return;
    }
}
