package f11.m$a;
import ho1.j;
import f11.m;
import java.lang.Object;
import android.widget.TextView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.like.count.i;
import ho1.a;
import ho1.i;
import java.lang.Integer;
import java.util.Objects;
import yq5.b;
import yq5.c;
import e93.f;
import f11.l;
import java.lang.Runnable;

public class m$a implements j	// class@002279
{
    public final m a;

    public void m$a(m p0){
       this.a = p0;
       super();
    }
    public void a(TextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$a.class, "1")) {
          return;
       }
       m c = this.a.C;
       if (c != null) {
          c.a(p0);
       }
       return;
    }
    public void b(a p0){
       i.b(this, p0);
    }
    public void c(a p0){
       i.c(this, p0);
    }
    public void d(int p0){
       m$a uoa = m$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "3")) {
          return;
       }
       m c = this.a.C;
       if (c != null) {
          c.d(p0);
       }
       m$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, m.class, "6")) {
          ta.y.a(ta.G);
          ta.y.d(false);
          f.g(ta);
          f.k("TopBarSlidePendantService.setFlipping", new l(ta), ta, ta.G.c1());
       }
       return;
    }
    public void e(TextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$a.class, "2")) {
          return;
       }
       m c = this.a.C;
       if (c != null) {
          c.e(p0);
       }
       return;
    }
}
