package com.kuaishou.tuna_core.widget.dialog.presenter.TunaProfileTabModuleWebClient;
import l05.a;
import com.kwai.yoda.bridge.YodaBaseWebView;
import android.view.ViewGroup;
import com.kwai.library.widget.refresh.path.PathLoadingView;
import com.yxcorp.gifshow.webview.helper.event.JsNativeEventCommunication;
import smc.c;
import com.yxcorp.gifshow.tuna.webview.config.IPolicyDataModel;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.webkit.WebView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.webview.yoda.g;
import com.kuaishou.tuna_logger.KsLogTunaCoreTag;
import java.util.List;
import com.kuaishou.tuna_core.widget.dialog.presenter.TunaProfileTabModuleWebClient$onPageFinished$1;
import msd.a;
import c15.b;
import java.lang.Boolean;
import android.view.View;

public final class TunaProfileTabModuleWebClient extends a	// class@00113c
{
    public ViewGroup l;
    public PathLoadingView m;

    public void TunaProfileTabModuleWebClient(YodaBaseWebView p0,ViewGroup p1,PathLoadingView p2,JsNativeEventCommunication p3,c p4,IPolicyDataModel p5){
       a.p(p0, "webView");
       a.p(p3, "communication");
       a.p(p4, "urlInterceptPolicy");
       a.p(p5, "dataModel");
       super(p0, p3, p4, p5);
       this.l = p1;
       this.m = p2;
    }
    public void onPageFinished(WebView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TunaProfileTabModuleWebClient.class, "1")) {
          return;
       }
       super.onPageFinished(p0, p1);
       b.b(KsLogTunaCoreTag.TUNA_CLOG.appendTag("TunaWebViewDialogPresenter"), new TunaProfileTabModuleWebClient$onPageFinished$1(p1, p0));
       TunaProfileTabModuleWebClient tl = this.l;
       if (tl != null) {
          tl.setVisibility(0);
       }
       tl = this.m;
       if (PatchProxy.isSupport(TunaProfileTabModuleWebClient.class) && (!PatchProxy.applyVoidTwoRefs(tl, Boolean.FALSE, this, TunaProfileTabModuleWebClient.class, "2") && tl != null)) {
          tl.a();
          tl.setVisibility(8);
       }
       return;
    }
}
