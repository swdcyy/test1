package c2c.g$n;
import android.content.DialogInterface$OnClickListener;
import c2c.g;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;

public final class g$n implements DialogInterface$OnClickListener	// class@00050c
{
    public final g b;

    public void g$n(g p0){
       this.b = p0;
       super();
    }
    public final void onClick(DialogInterface p0,int p1){
       if (PatchProxy.isSupport2(g$n.class, "1") && PatchProxy.applyVoidTwoRefsWithListener(p0, Integer.valueOf(p1), this, g$n.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       if (p1 == 0x7f1043c7) {
          this.b.R8();
       }
       PatchProxy.onMethodExit(g$n.class, "1");
       return;
    }
}
