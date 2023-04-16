package b77.e$c;
import erd.g;
import b77.e;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import mkc.b;
import android.view.View;
import mkc.c;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import f37.n0;
import b77.a;
import android.view.View$OnClickListener;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class e$c implements g	// class@0003d4
{
    public final e b;

    public void e$c(e p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$c.class, "1")) {
       }else {
          e$c tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, e.class, "9")) {
             KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
             uoa.b();
             uoa.j(n0.a(p0));
             uoa.p(new a(tb));
             tb.S8(uoa.a(c.h(tb.C, b.g)));
             tb.D.setVisibility(8);
          }
          b.I(LiveLogTag.GZONE, "sport_medal_P", p0);
       }
       return;
    }
}
