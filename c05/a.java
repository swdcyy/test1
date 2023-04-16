package c05.a;
import erd.g;
import com.kuaishou.tuna_core.multi_web_page.presenter.TunaMultiWebContentPresenter;
import java.util.List;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import java.util.Objects;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kuaishou.webkit.WebView;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.tuna_logger.KsLogTunaCoreTag;
import java.lang.Throwable;
import c15.b;

public final class a implements g	// class@0003f6
{
    public final TunaMultiWebContentPresenter b;
    public final List c;

    public void a(TunaMultiWebContentPresenter p0,List p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          p0 = this.c;
          if (p0 != null) {
             p0 = p0.iterator();
             while (p0.hasNext()) {
                Fragment uFragment = p0.next();
                if (uFragment instanceof KwaiYodaWebViewFragment && uFragment.isVisible()) {
                   a tb = this.b;
                   Objects.requireNonNull(tb);
                   if (PatchProxy.applyVoidOneRefs(uFragment, tb, TunaMultiWebContentPresenter.class, "7")) {
                      continue ;
                   }else {
                      YodaBaseWebView yodaBaseWebV = uFragment.Ch();
                      if (yodaBaseWebV != null && yodaBaseWebV.canGoBack() == true) {
                         YodaBaseWebView yodaBaseWebV1 = uFragment.Ch();
                         if (yodaBaseWebV1 != null) {
                            yodaBaseWebV1.goBack();
                         }
                      }else {
                         Activity activity = tb.getActivity();
                         if (activity != null) {
                            activity.onBackPressed();
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
