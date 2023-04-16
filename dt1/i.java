package dt1.i;
import com.yxcorp.gifshow.widget.m;
import dt1.e;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dt1.a$a;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multipk.game.cohesion.rank.LiveMultiPkCohesionRankVC$a;

public final class i extends m	// class@00201f
{
    public final e c;

    public void i(e p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       i tc = this.c;
       a$a a = a$a.a;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(a, tc, e.class, "2")) {
          a.p(a, "intent");
          if (a.g(a, a)) {
             tc.d.a();
          }
       }
       return;
    }
}
