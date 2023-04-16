package m49.e;
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
import brd.t;
import m49.e$a;
import erd.g;
import crd.b;

public final class e implements u	// class@002df7
{
    public final a b;

    public void e(a p0){
       this.b = p0;
       super();
    }
    public final void a(t p0,View p1){
       b a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "<anonymous parameter 1>");
       a = b.a;
       a.d(this.b, false);
       a.f(this.b, true).subscribe(e$a.b);
       return;
    }
}
