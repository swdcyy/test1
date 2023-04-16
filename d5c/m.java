package d5c.m;
import erd.g;
import d5c.g0;
import java.lang.Object;
import j5c.c$a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.utility.n;
import android.view.ViewStub;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import d5c.y;
import android.view.View$OnClickListener;
import a3c.e;
import zf6.j;
import com.google.android.material.appbar.CustomAppBarLayoutBehavior;

public final class m implements g	// class@002102
{
    public final g0 b;

    public void m(g0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       m tb = this.b;
       Objects.requireNonNull(tb);
       p0 = p0.a;
       boolean b = true;
       if (p0 == b) {
          tb.R = b;
       }else if(p0 == 3){
          tb.R = false;
          if (!PatchProxy.applyVoid(null, tb, g0.class, "16")) {
             if (tb.X != null) {
                View[] viewArray = new View[b];
                viewArray[0] = tb.H;
                n.Z(8, viewArray);
             }else {
                g0 h = tb.H;
                if (h instanceof ViewStub) {
                   tb.H = h.inflate();
                }
                KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
                uoa.p(new y(tb));
                uoa.q(b);
                uoa.a(tb.H);
                if (e.a(tb.v)) {
                   g0 h1 = tb.H;
                   h1.setBackgroundColor(j.d(h1, R.color.arg_RES_7f061ca6));
                }
                tb.I.L(false);
             }
          }
       }
       return;
    }
}
