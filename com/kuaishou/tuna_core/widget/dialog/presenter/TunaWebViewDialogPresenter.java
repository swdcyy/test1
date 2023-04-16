package com.kuaishou.tuna_core.widget.dialog.presenter.TunaWebViewDialogPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.tuna_core.widget.dialog.model.TunaWebDialogModel;
import com.kuaishou.tuna_logger.KsLogTunaCoreTag;
import java.util.List;
import com.kuaishou.tuna_core.widget.dialog.presenter.TunaWebViewDialogPresenter$onBind$1;
import msd.a;
import c15.b;
import android.app.Activity;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.robust.PatchProxyResult;
import com.kwai.yoda.bridge.YodaBaseWebView;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import android.app.Application;
import com.yxcorp.gifshow.webview.yoda.utils.q;
import gy7.l;
import com.yxcorp.gifshow.webview.helper.event.JsNativeEventCommunication;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.webkit.WebView;
import m05.b;
import com.kuaishou.tuna_core.widget.dialog.presenter.TunaProfileTabModuleWebClient;
import com.kwai.framework.model.tuna.button.JumpUrlModel;
import com.kuaishou.tuna_core.webview.config.CommercialUrlInterceptDataModel;
import android.view.ViewGroup;
import com.kwai.library.widget.refresh.path.PathLoadingView;
import smc.c;
import com.yxcorp.gifshow.tuna.webview.config.IPolicyDataModel;
import com.kuaishou.webkit.WebViewClient;
import android.widget.AbsoluteLayout;
import m05.a;
import n05.b;
import com.kuaishou.tuna_core.webview.config.CommercialDownloadInterceptModel;
import smc.b;
import com.kuaishou.webkit.DownloadListener;
import tkd.b;
import tkd.d;
import vxc.f;
import vxc.e;
import com.yxcorp.gifshow.webview.view.c;
import myc.k;
import com.kuaishou.webkit.WebChromeClient;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import android.content.Context;
import ekd.r;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import android.view.View;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import com.kwai.yoda.model.LaunchModel$a;
import com.kwai.yoda.model.LaunchModel;
import rx7.s;
import com.kuaishou.tuna_core.widget.dialog.TunaCommonWebViewDialog;

public final class TunaWebViewDialogPresenter extends PresenterV2	// class@00113e
{
    public TunaWebDialogModel p;
    public TunaCommonWebViewDialog q;
    public ViewGroup r;
    public YodaBaseWebView s;
    public PathLoadingView t;

    public void TunaWebViewDialogPresenter(){
       super();
    }
    public void E8(){
       YodaBaseWebView yodaBaseWebV = this;
       TunaWebViewDialogPresenter tunaWebViewD = TunaWebViewDialogPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, yodaBaseWebV, tunaWebViewD, "3")) {
          return;
       }
       TunaWebViewDialogPresenter p = yodaBaseWebV.p;
       TunaWebDialogModel mWidth = (p != null)? p.mWidth: null;
       TunaWebDialogModel mHeight = (p != null)? p.mHeight: null;
       if (mWidth == null || mHeight == null) {
          b.d(KsLogTunaCoreTag.TUNA_CLOG.appendTag("TunaWebViewDialogPresenter"), TunaWebViewDialogPresenter$onBind$1.INSTANCE);
       }
       Activity activity = this.getActivity();
       TunaWebViewDialogPresenter p1 = yodaBaseWebV.p;
       if (p1 != null) {
          TunaWebDialogModel mJumpUrlMode = p1.mJumpUrlModel;
          if (mJumpUrlMode != null) {
             Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
             c obj = PatchProxy.applyTwoRefsWithListener(activity, mJumpUrlMode, yodaBaseWebV, tunaWebViewD, "4");
             if (obj != PatchProxyResult.class) {
                objArray = obj;
             }else {
                obj = a.a();
                a.o(obj, "AppEnv.get\(\)");
                q.b(obj.a());
                YodaBaseWebView yodaBaseWebV1 = l.d().a(activity);
                if (yodaBaseWebV1 != null) {
                   a.o(yodaBaseWebV1, "WebviewPool.getInstance\(\x20\x02\(activity\) ?: return null\x00");
                   JsNativeEventCommunication jsNativeEven = new JsNativeEventCommunication(activity, objArray, yodaBaseWebV1, 0);
                   CommercialUrlInterceptDataModel uCommercialU = CommercialUrlInterceptDataModel.justWhiteUrls(mJumpUrlMode.mThirdPartyWhiteList);
                   a.o(uCommercialU, "CommercialUrlInterceptDa¡­del.mThirdPartyWhiteList\)");
                   TunaProfileTabModuleWebClient tunaProfileT = v14;
                   CommercialUrlInterceptDataModel uCommercialU1 = uCommercialU;
                   TunaProfileTabModuleWebClient tunaProfileT1 = v14;
                   JsNativeEventCommunication jsNativeEven1 = jsNativeEven;
                   JsNativeEventCommunication jsNativeEven2 = jsNativeEven;
                   tunaProfileT = new TunaProfileTabModuleWebClient(yodaBaseWebV1, yodaBaseWebV.r, yodaBaseWebV.t, jsNativeEven1, new b(), uCommercialU1);
                   yodaBaseWebV1.setWebViewClient(tunaProfileT1);
                   yodaBaseWebV1.setVerticalScrollBarEnabled(0);
                   yodaBaseWebV1.setNestedScrollingEnabled(0);
                   yodaBaseWebV1.setHorizontalScrollBarEnabled(0);
                   yodaBaseWebV1.setDownloadListener(new b(activity, new a(), new CommercialDownloadInterceptModel(mJumpUrlMode.mAllowH5Download)));
                   e uoe = d.a(-1995910978).gL();
                   uoe.d(activity, yodaBaseWebV1, null, jsNativeEven2);
                   yodaBaseWebV1.addJavascriptInterface(uoe, "Kwai");
                   yodaBaseWebV1.setWebChromeClient(new k(yodaBaseWebV1));
                   if (yodaBaseWebV1 instanceof KwaiYodaWebView) {
                      yodaBaseWebV1.setWebViewEmbedded(true);
                   }
                   yodaBaseWebV1.setBackgroundColor(r.b(activity, R.color.arg_RES_7f06008d));
                   PatchProxy.onMethodExit(tunaWebViewD, "4");
                   objArray = yodaBaseWebV1;
                }else {
                   PatchProxy.onMethodExit(tunaWebViewD, "4");
                }
             }
             yodaBaseWebV.s = objArray;
             if (objArray != null) {
                ViewGroup$LayoutParams layoutParams = objArray.getLayoutParams();
                if (layoutParams == null) {
                   layoutParams = new ViewGroup$LayoutParams(mWidth, mHeight);
                }
                layoutParams.width = a1.e((float)mWidth);
                layoutParams.height = a1.e((float)mHeight);
                objArray.setLayoutParams(layoutParams);
                p = yodaBaseWebV.r;
                if (p != null) {
                   p.removeAllViews();
                }
                p = yodaBaseWebV.r;
                if (p != null) {
                   p.addView(objArray);
                }
                p = yodaBaseWebV.t;
                if (PatchProxy.isSupport(tunaWebViewD) && (!PatchProxy.applyVoidTwoRefs(p, Boolean.TRUE, yodaBaseWebV, tunaWebViewD, "5") && p != null)) {
                   p.k();
                   p.setVisibility(0);
                }
                tunaWebViewD = yodaBaseWebV.q;
                if (tunaWebViewD != null) {
                   View view = tunaWebViewD.getView();
                   if (view != null) {
                      view.requestLayout();
                   }
                }
                s.c(objArray, new LaunchModel$a(mJumpUrlMode.mUrl).h("close").a());
             }
          }
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, TunaWebViewDialogPresenter.class, "6")) {
          return;
       }
       TunaWebViewDialogPresenter ts = this.s;
       if (ts != null) {
          ts.stopLoading();
       }
       ts = this.s;
       if (ts != null) {
          ts.destroy();
       }
       this.s = null;
       ts = this.r;
       if (ts != null) {
          ts.removeAllViews();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaWebViewDialogPresenter.class, "2")) {
          return;
       }
       PathLoadingView pathLoadingV = null;
       ViewGroup viewGroup = (p0 != null)? p0.findViewById(R.id.tuna_dialog_webview_container): pathLoadingV;
       this.r = viewGroup;
       if (p0 != null) {
          pathLoadingV = p0.findViewById(0x7f0a32db);
       }
       this.t = pathLoadingV;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, TunaWebViewDialogPresenter.class, "1")) {
          return;
       }
       this.p = this.q8(TunaWebDialogModel.class);
       this.q = this.q8(TunaCommonWebViewDialog.class);
       return;
    }
}
