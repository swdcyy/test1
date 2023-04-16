package k59.a2;
import com.yxcorp.gifshow.webview.yoda.view.c;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import com.kwai.framework.model.feed.BaseFeed;
import my7.j;
import myc.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k59.c;
import androidx.fragment.app.Fragment;
import com.kwai.yoda.controller.YodaWebViewFragmentController;
import androidx.fragment.app.FragmentActivity;
import com.kwai.yoda.bridge.YodaBaseWebView;
import android.app.Activity;
import android.view.View;
import ekd.m1;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.commercial.AdOverScrollWebView;
import android.content.Context;
import com.kuaishou.webkit.WebView;

public class a2 extends c	// class@002ac3
{
    public final BaseFeed l;
    public c m;
    public final boolean n;

    public void a2(KwaiYodaWebViewFragment p0,BaseFeed p1,boolean p2){
       super(p0);
       this.l = p1;
       this.n = p2;
    }
    public j a(){
       return this.f();
    }
    public h f(){
       Object obj = PatchProxy.apply(null, this, a2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.m == null) {
          this.m = new c(this.e().getActivity(), this.getWebView(), this.l);
       }
       return this.m;
    }
    public YodaBaseWebView findWebView(){
       Object obj = PatchProxy.apply(null, this, a2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.n == null) {
          return super.findWebView();
       }
       AdOverScrollWebView uAdOverScrol = new AdOverScrollWebView(this.e().requireActivity());
       uAdOverScrol.setScrollBarStyle(0);
       m1.f(this.e().getView(), R.id.webView).addView(uAdOverScrol);
       return uAdOverScrol;
    }
}
