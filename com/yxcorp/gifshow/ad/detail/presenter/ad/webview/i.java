package com.yxcorp.gifshow.ad.detail.presenter.ad.webview.i;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.os.Bundle;
import java.lang.Object;
import k59.t2;
import com.yxcorp.gifshow.commercial.api.web.AdYodaConfig;
import k59.e2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import ekd.x0;
import java.lang.IllegalArgumentException;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import lnc.f;
import nx8.k;
import com.yxcorp.gifshow.photoad.model.PhotoAdDataWrapper;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import ekd.k1;
import com.yxcorp.gifshow.ad.webview.o;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.i$a;
import android.app.Activity;
import sl9.b;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import androidx.fragment.app.Fragment;
import crd.b;
import lnc.b9;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment2;
import yx.j0;
import u09.a0;
import u09.z;
import msd.a;
import lnc.y0;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import u09.y;
import erd.g;

public class i	// class@00164d
{
    public final GifshowActivity a;
    public final WebViewFragment b;
    public final e2 c;
    public final AdYodaConfig d;
    public final o e;
    public WebView f;
    public b g;

    public void i(BaseFeed p0,GifshowActivity p1,Bundle p2){
       super();
       t2 ot2 = new t2();
       this.c = ot2;
       AdYodaConfig uAdYodaConfi = new AdYodaConfig();
       this.d = uAdYodaConfi;
       this.a = p1;
       ot2.a();
       if (PatchProxy.applyVoidThreeRefs(uAdYodaConfi, p2, p0, this, i.class, "1")) {
       }else {
          uAdYodaConfi.mFeed = p0;
          String str = PatchProxy.applyOneRefs(p2, this, i.class, "2");
          if (str != PatchProxyResult.class) {
          }else {
             str = "";
             if (p2 != null) {
                String str1 = "KEY_URL";
                String str2 = p2.getString(str1, str);
                if (!TextUtils.x(str2) && (x0.f(str2) == null || x0.f(str2).getHost() == null)) {
                   p2.putString(str1, str);
                   ExceptionHandler.handleCaughtException(new IllegalArgumentException(a.a.q(uAdYodaConfi.mFeed)));
                }
                str = k.d(f.a(str2, uAdYodaConfi.mFeed), uAdYodaConfi.mFeed);
                p2.putString(str1, str);
             }
          }
          uAdYodaConfi.mUrl = str;
          uAdYodaConfi.mIsPreload = true;
          uAdYodaConfi.mAdPosition = new PhotoAdDataWrapper(p0).getAdPosition();
          uAdYodaConfi.mWebSource = 1;
          uAdYodaConfi.mWebViewType = 2;
          uAdYodaConfi.mEntrySource = p2.getInt("KEY_EXTRA_WEB_FORM_DETAIL_WEB", true);
          uAdYodaConfi.mLogParamAppender = SerializableHook.getSerializable(p2, "KEY_EXTRA_AD_LOG_APPENDER");
          uAdYodaConfi.mAdClickTime = k1.i();
          uAdYodaConfi.mEnterTime = k1.i();
          uAdYodaConfi.mAutoRegisterFragmentLifecycle = false;
       }
       o oo = new o();
       this.e = oo;
       KwaiYodaWebViewFragment kwaiYodaWebV = oo.a(p1, uAdYodaConfi, new i$a(this));
       this.b = kwaiYodaWebV;
       SerializableHook.putSerializable(p2, "KEY_EXTRA", p0);
       SerializableHook.putSerializable(p2, "AD_YODA_CONFIG", uAdYodaConfi);
       kwaiYodaWebV.setArguments(p2);
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       i te = this.e;
       if (te != null) {
          te.b();
       }
       this.c.d();
       b9.a(this.g);
       return;
    }
    public WebViewFragment b(){
       return this.b;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, i.class, "5")) {
          return;
       }
       b9.a(this.g);
       i tb = this.b;
       if (tb instanceof AdYodaFragment2) {
          tb.Rh();
       }
       tb = this.e;
       if (tb != null) {
          tb.g();
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, i.class, "6")) {
          return;
       }
       i te = this.e;
       if (te != null) {
          te.e();
       }
       return;
    }
    public void e(){
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "7")) {
          return;
       }
       if (this.f == null) {
          Object[] objArray1 = new Object[0];
          j0.c("AdWebViewPreloadV2", "realShow webview is null", objArray1);
          return;
       }else {
          this.c.l(new a0(this), new z(this));
          i tb = this.b;
          if (tb instanceof AdYodaFragment2) {
             tb.Th();
          }
          if (!PatchProxy.applyVoid(objArray, this, oi, "8")) {
             b9.a(this.g);
             if (!y0.o(this.a)) {
                this.g = this.a.m().subscribe(new y(this));
             }
          }
          return;
       }
    }
}
