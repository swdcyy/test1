package com.yxcorp.gifshow.activity.web.presenter.OperateWebViewPresenter$a;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import com.yxcorp.gifshow.activity.web.presenter.OperateWebViewPresenter;
import java.lang.Object;
import uxc.f;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.yoda.YodaWebView;
import com.kwai.yoda.model.LaunchModel;
import com.yxcorp.gifshow.webview.yoda.c;
import com.yxcorp.gifshow.webview.yoda.view.c;
import tra.b;
import q87.c;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.webkit.WebBackForwardList;
import com.kuaishou.webkit.WebHistoryItem;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import uv8.g0;
import isa.a;
import wo5.b;
import java.util.concurrent.TimeUnit;
import brd.t;
import com.yxcorp.gifshow.activity.web.presenter.c;
import com.kuaishou.live.common.core.basic.tools.h;
import erd.g;
import crd.b;
import java.lang.Integer;

public class OperateWebViewPresenter$a implements WebViewFragment$a	// class@0014bf
{
    public final OperateWebViewPresenter a;

    public void OperateWebViewPresenter$a(OperateWebViewPresenter p0){
       this.a = p0;
       super();
    }
    public void a(){
       f.c(this);
    }
    public void b(WebView p0,String p1,boolean p2){
       if (PatchProxy.isSupport(OperateWebViewPresenter$a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, OperateWebViewPresenter$a.class, "1")) {
          return;
       }
       YodaBaseWebView yodaBaseWebV = this.a.p.Ch();
       String str = "about:blank";
       if (TextUtils.n(str, p1) && (yodaBaseWebV instanceof YodaWebView && yodaBaseWebV.getLaunchModel() != null)) {
          this.a.Z8();
          this.a.y.g().m();
          Object[] objArray = new Object[0];
          b.C().w("OperateWebViewPresenter", "BLANK_PAGE onFinished", objArray);
          if (this.a.p.Vg().c()) {
             this.a.X8();
          }
       }
       WebBackForwardList webBackForwa = yodaBaseWebV.copyBackForwardList();
       if (webBackForwa != null && (webBackForwa.getCurrentIndex() > 0 && TextUtils.n(str, webBackForwa.getItemAtIndex((webBackForwa.getCurrentIndex() - 1)).getUrl()))) {
          yodaBaseWebV.clearHistory();
       }
    label_008d :
       g0.o0(this.a.getActivity()).p0(this.a.w.m()).c("success");
       if (!TextUtils.x(this.a.w.m())) {
          this.a.w.m();
       }
       this.a.X7(t.timer(30, TimeUnit.SECONDS).subscribe(c.b, h.b));
       return;
    }
    public void c(WebView p0,int p1,String p2,String p3){
       if (PatchProxy.isSupport(OperateWebViewPresenter$a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, OperateWebViewPresenter$a.class, "2")) {
          return;
       }
       g0.o0(this.a.getActivity()).p0(this.a.w.m()).c("error");
       return;
    }
    public void d(WebView p0,int p1){
    }
}
