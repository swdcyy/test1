package ef2.b;
import androidx.lifecycle.Observer;
import ef2.d;
import java.lang.Object;
import ef2.e;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wj2.r;
import com.kuaishou.live.core.show.profilecard.LiveProfileMode;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import mkc.b;
import android.view.View;
import mkc.c;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import ef2.c;
import android.view.View$OnClickListener;

public final class b implements Observer	// class@002718
{
    public final d b;

    public void b(d p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       View view;
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, d.class, "7")) {
       }else {
          r m = tb.v.m;
          int i = 1;
          if (m != LiveProfileMode.ANCHOR_VIEW_SELF && (m == LiveProfileMode.ESCROW_VIEW_SELF || (!n.I(tb.getActivity()) && tb.S8()))) {
             view = c.h(tb.y, b.g);
             tb.V8(tb.x, 8);
             b[] uobArray = new b[i];
             uobArray[0] = b.e;
             c.d(tb.x, uobArray);
             tb.V8(tb.y, 0);
          }else {
             b[] uobArray1 = new b[i];
             uobArray1[0] = b.e;
             c.d(tb.w, uobArray1);
             view = c.h(tb.w, b.g);
          }
          KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
          uoa.b();
          uoa.p(new c(tb, p0));
          uoa.a(view);
       }
       return;
    }
}
