package f3a.o;
import u07.u;
import f3a.l;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.popup.common.c;

public final class o implements u	// class@002293
{
    public final l b;
    public final boolean c;

    public void o(l p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, o.class, "1")) {
          return;
       }
       a.p(p0, "dialog");
       a.p(p1, "<anonymous parameter 1>");
       this.b.W8(this.c);
       this.b.X8("COPY_SUCCESS_DIALOG", "", "", "3716332");
       p0.o();
       PatchProxy.onMethodExit(o.class, "1");
       return;
    }
}
