package com.kuaishou.live.lite.webview.LiveLiteWebViewPopupPresenter$b;
import vq5.b;
import com.kuaishou.live.lite.webview.LiveLiteWebViewPopupPresenter;
import java.lang.Object;
import vq5.a;
import android.net.Uri;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ekd.x0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import vq5.d;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.app.Activity;
import b93.d;
import com.kuaishou.live.webview.context.LiveWebViewParam;
import b22.a;
import androidx.fragment.app.c;
import e93.c;
import lp3.e;
import kq3.a;
import va1.o0;
import com.kuaishou.live.webview.a;
import com.kuaishou.live.lite.webview.LiveLiteWebViewPopupPresenter$b$a;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.KwaiDialogFragment;

public final class LiveLiteWebViewPopupPresenter$b implements b	// class@000bb6
{
    public final LiveLiteWebViewPopupPresenter a;

    public void LiveLiteWebViewPopupPresenter$b(LiveLiteWebViewPopupPresenter p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return a.a(this);
    }
    public void b(Uri p0){
       Activity activity;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteWebViewPopupPresenter$b.class, "1")) {
          return;
       }
       a.p(p0, "uri");
       String str = x0.a(p0, "url");
       String str1 = x0.a(p0, "redirectUrl");
       if (!TextUtils.x(str1) && LiveLiteWebViewPopupPresenter.c9(this.a).P0(str1)) {
          LiveLiteWebViewPopupPresenter.c9(this.a).r4(str1, this.a.getContext());
          return;
       }else if(!TextUtils.x(str)){
          LiveWebViewParam liveWebViewP = a.a(this.a.getActivity(), p0);
          a.o(liveWebViewP, "LiveWebViewRouteUtils.co¡­omRouteUri\(activity, uri\)");
          activity = this.a.getActivity();
          LiveLiteWebViewPopupPresenter w = this.a.w;
          if (w == null) {
             a.S("liteFragmentService");
          }
          c uoc = w.b();
          LiveLiteWebViewPopupPresenter y = this.a.y;
          if (y == null) {
             a.S("liveServiceManager");
          }
          a uoa = o0.a(activity, uoc, y);
          a.o(uoa, "LiveWebViewFactory.newWe¡­eServiceManager\n        \)");
          uoa.b = liveWebViewP;
          uoa.g("live-lite-web-dialog");
          uoa.f("live-lite-web-fragment");
          a uoa1 = a.c();
          uoa1.f(new LiveLiteWebViewPopupPresenter$b$a(this));
          liveWebViewP.z = uoa1.h(str, uoa);
       }
       return;
    }
}
