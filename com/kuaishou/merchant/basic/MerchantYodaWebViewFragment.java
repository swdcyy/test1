package com.kuaishou.merchant.basic.MerchantYodaWebViewFragment;
import au3.g;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import com.kuaishou.merchant.basic.MerchantYodaWebViewFragment$WebScrollState;
import bt3.h;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Boolean;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.lang.Integer;
import java.lang.Float;
import com.kwai.yoda.event.d;
import fg6.a;
import com.google.gson.Gson;
import com.kwai.yoda.bridge.YodaBaseWebView;
import lnc.i3;
import n04.a;
import q87.c;
import bt3.f;
import uxc.a;
import bt3.g;
import uxc.b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import ekd.i;
import ym4.d;
import android.view.View;
import java.lang.StringBuilder;
import com.kuaishou.webkit.WebView;
import android.content.Context;
import o56.c;
import o56.a;
import android.view.ViewGroup;
import xm4.a;
import ekd.m1;
import android.widget.TextView;
import ym4.a;
import com.kwai.yoda.bridge.NewYodaJavascriptBridge;
import com.kuaishou.merchant.basic.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import o74.a;
import ny7.a;
import com.kwai.yoda.kernel.bridge.YodaWebBridge;
import com.kuaishou.merchant.live.payresult.bridge.BackToLiveRoomFunction;
import com.kuaishou.merchant.web.bridge.EditAddressFunction;
import com.kuaishou.merchant.web.bridge.RequestMerchantAddressLocationInfoFunction;
import com.kuaishou.merchant.basic.MerchantYodaHostSwitchWebViewClient;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import bt3.i;
import android.view.View$OnTouchListener;
import android.net.Uri;
import d30.c;
import java.util.HashMap;
import z20.h;
import android.util.Base64;
import java.lang.Exception;
import com.kuaishou.cover.a;
import g30.c;
import java.util.Map;
import a30.b;
import android.view.Window;
import a30.e;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kwai.yoda.model.LaunchModel;
import android.app.Application;
import com.kuaishou.merchant.basic.MerchantYodaWebViewActivity;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import android.content.Intent;
import com.kuaishou.webkit.WebViewClient;

public class MerchantYodaWebViewFragment extends KwaiYodaWebViewFragment implements g	// class@0015a3
{
    public MerchantYodaHostSwitchWebViewClient C;
    public MerchantYodaWebViewFragment$WebScrollState D;
    public final int E;
    public final int F;
    public final int G;
    public boolean H;
    public static final int I;

    public void MerchantYodaWebViewFragment(){
       super();
       this.D = new MerchantYodaWebViewFragment$WebScrollState(this, null);
       this.E = 0;
       this.F = 1;
       this.G = 2;
       this.H = true;
    }
    public String Bh(){
       String obj = PatchProxy.apply(null, this, MerchantYodaWebViewFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.Bh();
       if (TextUtils.isEmpty(obj)) {
          obj = "ks://merchant";
       }
       return obj;
    }
    public int M(){
       return 1;
    }
    public final boolean Oh(){
       Object obj = PatchProxy.apply(null, this, MerchantYodaWebViewFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.getArguments() != null && this.getArguments().getBoolean("NEED_JUST_TOP_PADDING"))? true: false;
       return b;
    }
    public void Pg(int p0,float p1){
       MerchantYodaWebViewFragment tD;
       if (PatchProxy.isSupport(MerchantYodaWebViewFragment.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, MerchantYodaWebViewFragment.class, "17")) {
          return;
       }
       if (p0 == 3) {
          p0.status = 0;
       }else {
          int i = 1;
          if (p0 == 4) {
             p0.status = i;
          }else if(p0 == i){
             tD = this.D;
             tD.status = 2;
             tD.slideOffset = p1;
          }
       }
       tD = this.D;
       if (!PatchProxy.applyVoidOneRefs(tD, this, MerchantYodaWebViewFragment.class, "18")) {
          d.f().c(null, "halfWebOnStatusChange", a.a.q(tD));
       }
       return;
    }
    public void Ph(boolean p0){
       this.H = p0;
    }
    public String getPageParams(){
       i3 obj = PatchProxy.apply(null, this, MerchantYodaWebViewFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       obj.d("url", this.getUrl());
       return obj.e();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantYodaWebViewFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       Object[] objArray = new Object[0];
       a.C().w("MerchanrYodaWebViewFragment", "onCreate\(\)", objArray);
       if (this.getArguments() == null || (this.getArguments().getBoolean("BACK_STACK") && !PatchProxy.applyVoid(null, this, MerchantYodaWebViewFragment.class, "8"))) {
          this.gh(new f(this));
          this.kh(new g(this));
       }
    label_004a :
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, MerchantYodaWebViewFragment.class, "12")) {
          return;
       }
       super.onDestroy();
       if (this.getActivity() != null && this.Oh()) {
          i.a(this.getActivity(), 0, 0);
       }
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, MerchantYodaWebViewFragment.class, "15")) {
          return;
       }
       super.onStop();
       if (!this.isHidden()) {
          MerchantYodaWebViewFragment tC = this.C;
          if (tC != null) {
             tC.F();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       h oh;
       int i1;
       String str = "2";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantYodaWebViewFragment.class, str)) {
          return;
       }
       super.onViewCreated(p0, p1);
       a uoa = a.C();
       StringBuilder str1 = "loadWeb\(\):";
       String str2 = (this.Ch() == null)? "webview is null": this.Ch().getUrl();
       int i = 0;
       Object[] objArray = new Object[i];
       uoa.w("MerchanrYodaWebViewFragment", str1+str2, objArray);
       if (this.Oh()) {
          i.b(this.getActivity(), p0);
          i.a(this.getActivity(), -1, true);
       }
       if (a.a().c()) {
          TextView textView = m1.f(a.b(this.getActivity(), R.layout.arg_RES_7f0d15d0, p0), R.id.test_web_tag_tv);
          if (a.a() && this.Ch() != null) {
             textView.setText(this.Ch().getUrl());
          }else {
             textView.setText("MerchantYoda");
          }
       }
       KwaiYodaWebViewFragment tr = this.r;
       String str3 = "1";
       String obj = null;
       if (tr != null && tr.getJavascriptBridge() != null) {
          NewYodaJavascriptBridge javascriptBr = this.r.getJavascriptBridge();
          if (!PatchProxy.applyVoidTwoRefs(javascriptBr, this, obj, MerchantYodaWebViewFragment.class, "7")) {
             String str5 = "registerFunction: not GifshowActivity";
             String str6 = "merchant";
             if (!PatchProxy.applyVoidTwoRefs(javascriptBr, this, obj, a.class, str3)) {
                if (!this.getActivity() instanceof GifshowActivity) {
                   a.g(MerchantCommonLogBiz.WEBVIEW, "ScrollEnableFunction", str5);
                }else {
                   javascriptBr.o(str6, "halfWebDragEnable", new a(this));
                }
             }
             if (!PatchProxy.applyVoidTwoRefs(javascriptBr, this, obj, BackToLiveRoomFunction.class, str3)) {
                javascriptBr.o(str6, "backToLiveRoom", new BackToLiveRoomFunction());
             }
             if (!PatchProxy.applyVoidTwoRefs(javascriptBr, this, obj, EditAddressFunction.class, str3)) {
                if (!this.getActivity() instanceof GifshowActivity) {
                   a.g(MerchantCommonLogBiz.WEBVIEW, "EditAddressFunction", str5);
                }else {
                   javascriptBr.o(str6, "editAddress", new EditAddressFunction(this.getActivity()));
                }
             }
             if (!PatchProxy.applyVoidTwoRefs(javascriptBr, this, obj, RequestMerchantAddressLocationInfoFunction.class, str3)) {
                if (!this.getActivity() instanceof GifshowActivity) {
                   a.g(MerchantCommonLogBiz.WEBVIEW, "MerchantRequestMerchantAddressLocationInfoFunction", "registerFunctionWithActivity: not GifshowActivity");
                }else {
                   javascriptBr.o(str6, "requestMerchantAddressLocationInfo", new RequestMerchantAddressLocationInfoFunction(this.getActivity()));
                }
             }
          }
       }
       if (this.C != null) {
          this.C.J(this.Ch().getUrl());
       }
       if (!PatchProxy.applyVoid(obj, this, MerchantYodaWebViewFragment.class, "4") && (this.Ch() != null && (this.getView().getParent() != null && (this.getView().getParent().getParent() != null && this.getView().getParent().getParent() instanceof CoordinatorLayout)))) {
          this.Ch().setOnTouchListener(new i(this, this.getView().getParent().getParent()));
       }
    label_01a6 :
       if (!PatchProxy.applyVoid(obj, this, MerchantYodaWebViewFragment.class, "3")) {
          if (this.Ch() == null || TextUtils.isEmpty(this.Ch().getUrl())) {
             c.d("MerchanrYodaWebViewFragment handleCover getUrl is null");
          }else {
             String url = this.Ch().getUrl();
             Uri uri = Uri.parse(url);
             if (uri == null) {
                c.d("MerchanrYodaWebViewFragment handleCover uri parse webUrl error, url: "+url);
             }else if(str3.equals(uri.getQueryParameter("kwaishopTaskWidgetForbidAuto"))){
                c.d("MerchanrYodaWebViewFragment handleCover kwaishopTaskWidgetForbidAuto 1");
             }else {
                url = uri.getQueryParameter("kwaishopTaskWidget");
                if (TextUtils.isEmpty(url)) {
                   c.d("MerchanrYodaWebViewFragment handleCover kwaishopTaskWidget is null");
                }else {
                   HashMap hashMap = new HashMap();
                   String str4 = "";
                   obj = PatchProxy.applyOneRefs(url, obj, h.class, str);
                   if (obj != PatchProxyResult.class) {
                      str4 = obj;
                   }else {
                      try{
                         obj = new String(Base64.decode(url, i));
                         if (!TextUtils.isEmpty(obj)) {
                            str4 = obj;
                         }
                      }catch(java.lang.Exception e10){
                         e10.printStackTrace();
                      }
                   }
                }
             }
          }
       }
    }
    public void setArguments(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantYodaWebViewFragment.class, "9")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyOneRefs(p0, this, MerchantYodaWebViewFragment.class, "10");
       if (obj != patchProxyRe) {
          p0 = obj;
       }else if(p0 != null){
          obj = "MERCHANT_ROUTER_TAG";
          if (p0.getBoolean(obj)) {
             p0.remove(obj);
             obj = p0.getString("KEY_MERCHANT_ROUTER_URL");
             Serializable serializable = SerializableHook.getSerializable(p0, "H5_LAUNCH_MODEL");
             if (serializable instanceof LaunchModel) {
             }else {
                serializable = null;
             }
             if (!TextUtils.isEmpty(obj)) {
                Bundle uBundle = PatchProxy.applyTwoRefs(obj, serializable, this, MerchantYodaWebViewFragment.class, "11");
                if (uBundle != patchProxyRe) {
                }else {
                   KwaiYodaWebViewActivity$c uoc = KwaiYodaWebViewActivity.F3(a.b(), MerchantYodaWebViewActivity.class, obj).e("KEY_THEME", "0").f("KEY_ENABLE_SWIPE_BACK", true);
                   if (serializable != null) {
                      uoc.h(serializable);
                   }
                   uBundle = uoc.a().getExtras();
                }
                if (uBundle != null) {
                   uBundle.putAll(p0);
                   p0 = uBundle;
                }
             }
          }
       }
       super.setArguments(p0);
       return;
    }
    public WebViewClient sh(){
       MerchantYodaHostSwitchWebViewClient obj = PatchProxy.apply(null, this, MerchantYodaWebViewFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new MerchantYodaHostSwitchWebViewClient(this.Ch(), this.getWebUrl());
       this.C = obj;
       return obj;
    }
    public boolean wb(){
       Object obj = PatchProxy.apply(null, this, MerchantYodaWebViewFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.Ch() == null) {
          return false;
       }
       return this.H;
    }
}
