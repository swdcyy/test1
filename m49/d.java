package m49.d;
import u07.u;
import m49.a;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import m49.b;

public final class d implements u	// class@002df5
{
    public final a b;

    public void d(a p0){
       this.b = p0;
       super();
    }
    public final void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "<anonymous parameter 1>");
       b.a.b(this.b, true);
       return;
    }
}
