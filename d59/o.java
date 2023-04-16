package d59.o;
import java.lang.Runnable;
import d59.r;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkPageConfig;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import com.yxcorp.utility.n;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkFragment;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkFragment$a;
import lnc.a1;
import com.kuaishou.commercial.core.util.ViewClipUtilsKt;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkHalfFrameLayout;
import android.widget.FrameLayout;
import usd.q;

public final class o implements Runnable	// class@002055
{
    public final r b;

    public void o(r p0){
       this.b = p0;
       super();
    }
    public final void run(){
       AdtkFragment$a r;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, o.class, "1")) {
          return;
       }
       Activity activity = this.b.getActivity();
       a.m(activity);
       float f = (float)n.j(activity);
       float f1 = r.P8(this.b).b * f;
       ViewGroup$LayoutParams layoutParams = r.R8(this.b).getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
       r = AdtkFragment.r;
       layoutParams.topMargin = r.a();
       ViewClipUtilsKt.a(r.R8(this.b), a1.e(r.P8(this.b).f));
       r.R8(this.b).requestLayout();
       r t = this.b.t;
       if (t == null) {
          a.S("mStateViewView");
       }
       layoutParams = t.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
       layoutParams.height = (int)f1;
       r.S8(this.b).setVisibility(0);
       layoutParams = r.S8(this.b).getLayoutParams();
       if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
          objArray = layoutParams;
       }
       if (objArray != null) {
          objArray.height = -1;
          r.S8(this.b).requestLayout();
       }
       r.S8(this.b).setDragStyle(0);
       r.S8(this.b).setAnchorTranslationY(q.m(((f - f1) - (float)r.a()), 0));
       r.S8(this.b).d(f, true);
       return;
    }
}
