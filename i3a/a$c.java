package i3a.a$c;
import android.content.DialogInterface$OnCancelListener;
import i3a.a;
import msd.l;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import qrd.l1;

public final class a$c implements DialogInterface$OnCancelListener	// class@00276f
{
    public final a b;
    public final l c;

    public void a$c(a p0,l p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onCancel(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a$c.class, "1")) {
          return;
       }
       a e = this.b.e;
       if (e != null) {
          l1 ol1 = e.invoke(Boolean.FALSE);
       }
       PatchProxy.onMethodExit(a$c.class, "1");
       return;
    }
}
