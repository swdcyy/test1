package nw9.a;
import java.lang.Runnable;
import com.yxcorp.gifshow.designercreation.preview.presenter.TemplatePreviewPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import ow9.a;
import lnc.a1;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import com.kwai.library.groot.slide.viewpager.KwaiGrootViewPager;
import java.util.Objects;
import android.widget.FrameLayout$LayoutParams;

public final class a implements Runnable	// class@003201
{
    public final TemplatePreviewPresenter b;

    public void a(TemplatePreviewPresenter p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       a tb = this.b;
       TemplatePreviewPresenter u = tb.u;
       if (u != null) {
          Activity activity = tb.getActivity();
          if (activity != null) {
             a.o(activity, "activity ?: return@post");
             if (a.a.b(activity)) {
                u.setBackgroundColor(a1.a(R.color.arg_RES_7f062057));
                TemplatePreviewPresenter q = this.b.q;
                if (q != null) {
                   ViewGroup$LayoutParams layoutParams = q.getLayoutParams();
                   Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                   layoutParams.bottomMargin = 0;
                   q.setLayoutParams(layoutParams);
                }
             }
          }
       }
       return;
    }
}
