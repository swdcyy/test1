package ahc.a$a;
import com.yxcorp.gifshow.widget.m;
import ahc.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ehc.g;
import ehc.b;
import msd.l;
import qrd.l1;

public final class a$a extends m	// class@00011e
{
    public final a c;

    public void a$a(a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       a.p(p0, "view");
       a r = this.c.r;
       if (r != null) {
          g og = r.f();
          if (og != null) {
             og.g();
          }
       }
       r = this.c.r;
       if (r != null) {
          l action = r.getAction();
          if (action != null) {
             action.invoke(p0);
          }
       }
       return;
    }
}
