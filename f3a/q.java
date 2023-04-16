package f3a.q;
import u07.u;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.popup.common.c;

public final class q implements u	// class@002295
{
    public static final q b;

    static {
       q.b = new q();
    }
    public void q(){
       super();
    }
    public final void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, q.class, "1")) {
          return;
       }
       a.p(p0, "dialog");
       a.p(p1, "view");
       p0.o();
       return;
    }
}
