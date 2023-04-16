package com.yxcorp.gifshow.ad.detail.presenter.ad.webview.AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.AdWebViewPreloadGuidePresenter;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mxb.j0;
import com.yxcorp.gifshow.photoad.o;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1$a;
import erd.g;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.view.ViewPropertyAnimator;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1$b;
import android.animation.Animator$AnimatorListener;
import lnc.a1;

public final class AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1 extends Lambda implements a	// class@00163e
{
    public final AdWebViewPreloadGuidePresenter this$0;

    public void AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1(AdWebViewPreloadGuidePresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1.class, "1")) {
          return;
       }
       if (this.this$0.x == null) {
          j0 oj0 = o.z();
          int i = 700;
          AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1 tthis$0 = this.this$0;
          Objects.requireNonNull(tthis$0);
          AdWebViewPreloadGuidePresenter uAdWebViewPr = PatchProxy.apply(objArray, tthis$0, AdWebViewPreloadGuidePresenter.class, "6");
          if (uAdWebViewPr != PatchProxyResult.class) {
          }else {
             uAdWebViewPr = tthis$0.r;
             if (uAdWebViewPr == null) {
                a.S("mPhoto");
             }
          }
          oj0.e(i, uAdWebViewPr.mEntity).d(AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1$a.b).a();
          AdWebViewPreloadGuidePresenter v = this.this$0.v;
          if (v != null) {
             FrameLayout uFrameLayout = v.findViewById(R.id.root_webview_mask);
             if (uFrameLayout != null) {
                uFrameLayout.setVisibility(0);
             }
          }
          AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1 tthis$01 = this.this$0;
          AdWebViewPreloadGuidePresenter v1 = tthis$01.v;
          if (v1 != null) {
             objArray = v1.animate();
          }
          tthis$01.z = objArray;
          v = this.this$0.z;
          if (v != null) {
             v.setListener(new AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1$b(this));
          }
          v = this.this$0.v;
          if (v != null) {
             ViewPropertyAnimator viewProperty = v.animate();
             if (viewProperty != null) {
                viewProperty = viewProperty.translationXBy((- (float)a1.d(R.dimen.arg_RES_7f070340)));
                if (viewProperty != null) {
                   viewProperty = viewProperty.setDuration(400);
                   if (viewProperty != null) {
                      viewProperty.start();
                   }
                }
             }
          }
       }
    label_009b :
       return;
    }
}
