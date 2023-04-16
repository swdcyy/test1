package com.yxcorp.gifshow.ad.webview.AdYodaActivity2;
import sl9.d;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import com.yxcorp.gifshow.commercial.api.web.AdYodaConfig;
import java.util.HashSet;
import tyc.k3;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Iterator;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.res.Resources;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.framework.model.feed.BaseFeed;
import android.content.Intent;
import ekd.j0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import nx8.k;
import ekd.x0;
import java.lang.IllegalArgumentException;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import lnc.f;
import java.lang.Number;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import java.lang.System;
import com.yxcorp.gifshow.entity.QPhoto;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.award.pendant.navigation.NeoNavigationPendantPresenter;
import android.view.View;
import im8.c;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.ad.webview.o;
import sl9.b;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import k59.s1;
import uxc.a;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kuaishou.webkit.WebView;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment2;
import com.yxcorp.gifshow.webview.view.c;
import ekd.i;
import androidx.fragment.app.FragmentActivity;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout;
import android.view.ViewGroup$MarginLayoutParams;

public class AdYodaActivity2 extends KwaiYodaWebViewActivity implements d	// class@001898
{
    public final AdYodaConfig J;
    public final Set K;
    public PresenterV2 L;
    public static final int M;

    public void AdYodaActivity2(){
       super();
       this.J = new AdYodaConfig();
       this.K = new HashSet();
       this.L = null;
    }
    public void P0(k3 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdYodaActivity2.class, "10")) {
          return;
       }
       this.K.add(p0);
       return;
    }
    public void T(k3 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdYodaActivity2.class, "11")) {
          return;
       }
       this.K.remove(p0);
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, AdYodaActivity2.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.K.isEmpty()) {
          obj = this.K.iterator();
          while (obj.hasNext()) {
             obj.next().onDispatchTouchEvent(p0);
          }
       }
       return super.dispatchTouchEvent(p0);
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, AdYodaActivity2.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://photoadvertisement/webview";
    }
    public String o(){
       return "AD_YODA";
    }
    public void onCreate(Bundle p0){
       Intent obj;
       int i;
       AdYodaActivity2 uAdYodaActiv = AdYodaActivity2.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uAdYodaActiv, "1")) {
          return;
       }
       AdYodaActivity2 tJ = this.J;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (!PatchProxy.applyVoidOneRefs(tJ, this, uAdYodaActiv, "4")) {
          tJ.mFeed = this.D3();
          Object[] objArray1 = null;
          String str = PatchProxy.apply(objArray1, this, uAdYodaActiv, "5");
          if (str != patchProxyRe) {
          }else {
             obj = this.getIntent();
             String str1 = "";
             if (obj != null) {
                String str2 = j0.f(obj, "KEY_URL");
                if (TextUtils.x(str2)) {
                   str2 = PatchProxy.apply(objArray1, this, uAdYodaActiv, "6");
                   if (str2 != patchProxyRe) {
                   }else {
                      Intent intent = this.getIntent();
                      if (intent != null) {
                         Uri data = intent.getData();
                         if (data != null) {
                            String host = data.getHost();
                            if (("kwai").equals(data.getScheme()) && ("adwebview").equals(host)) {
                               str2 = k.d(data.getQueryParameter("url"), this.J.mFeed);
                            }
                         }
                      }
                      str2 = str1;
                   }
                }
                if (!TextUtils.x(str2) && (x0.f(str2) == null || x0.f(str2).getHost() == null)) {
                   obj.putExtra("KEY_URL", str1);
                   ExceptionHandler.handleCaughtException(new IllegalArgumentException(a.a.q(this.J.mFeed)));
                }
                str1 = k.d(f.a(str2, this.J.mFeed), this.J.mFeed);
                obj.putExtra("KEY_URL", str1);
             }
             str = str1;
          }
          tJ.mUrl = str;
          obj = PatchProxy.apply(objArray1, this, uAdYodaActiv, "7");
          if (obj != patchProxyRe) {
             i = obj.intValue();
          }else if(this.getIntent() == null){
             i = 0;
          }else {
             i = j0.b(this.getIntent(), "extra_detail_ad_position", 0);
          }
          tJ.mAdPosition = i;
          tJ.mEntrySource = j0.b(this.getIntent(), "KEY_EXTRA_WEB_FORM_DETAIL_WEB", 1);
          tJ.mWebViewType = 2;
          tJ.mWebSource = 1;
          tJ.mDisableLandingPageDeepLink = j0.a(this.getIntent(), "KEY_EXTRA_DISABLE_LANDING_PAGE_DEEP_LINK", 0);
          tJ.mShouldDisplayPlayableSplashPopup = j0.a(this.getIntent(), "KEY_EXTRA_DISPLAY_PLAYABLE_POPUP", 0);
          tJ.mShouldAddAvatarHeadInfo = j0.a(this.getIntent(), "KEY_EXTRA_SHOULD_ADD_AVATAR_HEAD_INFO", 0);
          tJ.mLogParamAppender = j0.e(this.getIntent(), "KEY_EXTRA_AD_LOG_APPENDER");
          Object obj1 = PatchProxy.apply(objArray1, this, uAdYodaActiv, "8");
          long l = (obj1 != patchProxyRe)? obj1.longValue(): j0.c(this.getIntent(), "KEY_EXTRA_AD_CLICK_TIME", 0);
          tJ.mAdClickTime = l;
          tJ.mEnterTime = System.currentTimeMillis();
          tJ.mNotifyAdWebViewVisibleChanged = true;
       }
       super.onCreate(p0);
       AdYodaConfig mFeed = this.J.mFeed;
       if (mFeed != null && !TextUtils.x(mFeed.getId())) {
          this.I3("key_qphoto", new QPhoto(this.J.mFeed));
       }
       PresenterV2 presenterV2 = new PresenterV2();
       this.L = presenterV2;
       presenterV2.U7(new NeoNavigationPendantPresenter());
       this.L.f(this.findViewById(0x1020002));
       Object[] objArray = new Object[]{this,new c("LINK_URL", this.J.mUrl)};
       this.L.i(objArray);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, AdYodaActivity2.class, "12")) {
          return;
       }
       super.onDestroy();
       AdYodaActivity2 tL = this.L;
       if (tL != null) {
          tL.destroy();
       }
       return;
    }
    public Fragment u3(){
       Object[] objArray = null;
       KwaiYodaWebViewActivity obj = PatchProxy.apply(objArray, this, AdYodaActivity2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       if (obj != null) {
          return obj;
       }
       KwaiYodaWebViewFragment kwaiYodaWebV = new o().a(this, this.J, objArray);
       this.y = kwaiYodaWebV;
       kwaiYodaWebV.gh(new s1(this));
       if (this.getIntent() != null) {
          objArray = this.getIntent().getExtras();
          if (objArray != null) {
             SerializableHook.putSerializable(objArray, "AD_YODA_CONFIG", this.J);
          }
       }
       this.y.setArguments(objArray);
       return this.y;
    }
    public void w1(WebViewFragment p0,WebView p1){
       int i;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AdYodaActivity2.class, "2")) {
          return;
       }
       if (p0 instanceof AdYodaFragment2 && p0.getArguments() != null) {
          AdYodaFragment2 str = p0.getArguments().getString("KEY_THEME", "0");
          if (!PatchProxy.applyVoidOneRefs(str, p0, AdYodaFragment2.class, "13")) {
             c uoc = p0.vh();
             if (("4").equals(str) && (i.c() && (uoc != null && uoc.l != null))) {
                i = n.A(p0.getActivity());
                ViewGroup$MarginLayoutParams layoutParams = uoc.l.getLayoutParams();
                if (layoutParams != null) {
                   layoutParams.topMargin = i;
                   uoc.l.setLayoutParams(layoutParams);
                }
             }
          }
       }
       return;
    }
}
