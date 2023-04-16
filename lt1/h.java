package lt1.h;
import android.view.View$OnClickListener;
import lt1.i;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lt1.a$a;
import java.util.Objects;
import kotlin.jvm.internal.a;
import pu1.b;
import msd.a;
import zh3.c;
import st1.a;

public final class h implements View$OnClickListener	// class@00302c
{
    public final i b;

    public void h(i p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       h tb = this.b;
       a$a a = a$a.a;
       Objects.requireNonNull(tb);
       i oi = i.class;
       if (!PatchProxy.applyVoidOneRefs(a, tb, oi, "2")) {
          a.p(a, "intent");
          if (a instanceof a$a && !PatchProxy.applyVoid(null, tb, oi, "3")) {
             b.a.a(tb.c.invoke(), tb.d.invoke(), tb.e);
          }
       }
       return;
    }
}
