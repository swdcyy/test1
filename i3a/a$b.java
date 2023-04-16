package i3a.a$b;
import android.content.DialogInterface$OnShowListener;
import i3a.a;
import msd.l;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import qrd.l1;
import kotlin.jvm.internal.a;

public final class a$b implements DialogInterface$OnShowListener	// class@00276e
{
    public final a b;
    public final l c;

    public void a$b(a p0,l p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onShow(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a$b.class, "1")) {
          return;
       }
       a e = this.b.e;
       if (e != null) {
          l1 ol1 = e.invoke(Boolean.TRUE);
       }
       a.o(p0, "it");
       this.c.invoke(p0);
       PatchProxy.onMethodExit(a$b.class, "1");
       return;
    }
}
