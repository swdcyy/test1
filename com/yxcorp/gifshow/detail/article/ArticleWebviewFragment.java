package com.yxcorp.gifshow.detail.article.ArticleWebviewFragment;
import ml8.d;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import com.yxcorp.gifshow.detail.article.ArticleWebviewFragment$a;
import java.util.HashMap;
import com.yxcorp.gifshow.webview.jsmodel.JsEmitParameter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.webview.helper.event.JsNativeEventCommunication;
import android.view.View;
import ekd.m1;
import android.widget.FrameLayout;
import ww9.q;
import android.view.View$OnClickListener;
import ww9.r;
import com.kuaishou.webkit.WebView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.webview.api.WebViewFragment$b;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import uxc.a;
import java.lang.Integer;
import com.yxcorp.gifshow.webview.view.c;
import android.widget.RelativeLayout;
import android.util.Pair;
import java.util.Map;
import uxc.b;
import com.kwai.yoda.bridge.YodaBaseWebView;
import gy7.l;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.trello.rxlifecycle3.components.support.RxFragment;
import android.view.ViewParent;
import android.widget.AbsoluteLayout;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.webview.api.WebViewFragment$d;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.kuaishou.webkit.WebViewClient;
import yxc.h;
import ww9.u;
import com.yxcorp.gifshow.webview.yoda.g$c;
import com.yxcorp.gifshow.webview.yoda.g;
import ww9.s;
import com.kuaishou.webkit.WebChromeClient;
import com.yxcorp.gifshow.webview.config.f;
import com.kuaishou.webkit.DownloadListener;
import ww9.t;
import com.yxcorp.gifshow.webview.api.EnhancedWebView$a;
import tkd.b;
import tkd.d;
import vxc.f;
import vxc.e;
import com.yxcorp.gifshow.webview.api.WebViewFragment$c;
import ekd.i;
import com.yxcorp.utility.n;
import lnc.a1;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.graphics.Color;
import java.lang.Exception;
import com.yxcorp.gifshow.webview.cookie.g;

public class ArticleWebviewFragment extends WebViewFragment implements d	// class@001345
{
    public KwaiYodaWebView k;
    public FrameLayout l;
    public View m;
    public JsNativeEventCommunication n;
    public WebViewFragment$b o;
    public e p;
    public c q;
    public h r;
    public boolean s;
    public b t;
    public a u;
    public Map v;
    public WebViewFragment$c w;
    public boolean x;
    public boolean y;
    public static final int z;

    public void ArticleWebviewFragment(){
       super();
       this.o = new ArticleWebviewFragment$a(this);
       this.s = false;
       this.v = new HashMap();
       this.x = true;
       this.y = true;
    }
    public int M(){
       return 1;
    }
    public void dh(JsEmitParameter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ArticleWebviewFragment.class, "26")) {
          return;
       }
       this.n.c(p0);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ArticleWebviewFragment.class, "1")) {
          return;
       }
       this.m = m1.f(p0, 0x7f0a35e3);
       this.l = m1.f(p0, 0x7f0a0249);
       m1.a(p0, new q(this), R.id.retry_btn);
       m1.a(p0, new r(this), R.id.right_btn);
       return;
    }
    public WebView eh(){
       return this.k;
    }
    public int getPage(){
       Object obj = PatchProxy.apply(null, this, ArticleWebviewFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (TextUtils.equals(this.sh(), "ks://reward_record")) {
          return 67;
       }
       return super.getPage();
    }
    public String getUrl(){
       String obj = PatchProxy.apply(null, this, ArticleWebviewFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (TextUtils.isEmpty(this.sh()))? "ks://webview": this.sh();
       return obj;
    }
    public String getWebUrl(){
       String obj = PatchProxy.apply(null, this, ArticleWebviewFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.o.T1();
       if (TextUtils.isEmpty(obj)) {
          obj = this.getArguments().getString("KEY_URL");
       }
       return obj;
    }
    public void gh(a p0){
       this.u = p0;
    }
    public void hh(int p0){
       if (PatchProxy.isSupport(ArticleWebviewFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ArticleWebviewFragment.class, "19")) {
          return;
       }
       this.q.l.setVisibility(p0);
       return;
    }
    public void ih(Pair p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ArticleWebviewFragment.class, "25")) {
          return;
       }
       Pair first = p0.first;
       if (first != null) {
          p0 = p0.second;
          if (p0 != null) {
             this.v.put(first, p0);
          }
       }
       return;
    }
    public void jh(boolean p0){
       this.y = p0;
    }
    public void kh(b p0){
       this.t = p0;
    }
    public void lh(WebViewFragment$b p0){
       this.o = p0;
    }
    public void mh(int p0){
       if (PatchProxy.isSupport(ArticleWebviewFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ArticleWebviewFragment.class, "17")) {
          return;
       }
       ArticleWebviewFragment tk = this.k;
       if (tk != null) {
          tk.setProgress(p0);
       }
       return;
    }
    public void nh(int p0){
       if (PatchProxy.isSupport(ArticleWebviewFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ArticleWebviewFragment.class, "18")) {
          return;
       }
       ArticleWebviewFragment tk = this.k;
       if (tk != null) {
          tk.setProgressVisibility(p0);
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ArticleWebviewFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       this.k = l.d().a(this.getActivity());
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ArticleWebviewFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d1701, p1, false);
    }
    public void onDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ArticleWebviewFragment.class, "12")) {
          return;
       }
       ArticleWebviewFragment tk = this.k;
       if (tk != null) {
          tk.destroy();
          this.k = objArray;
          l.d().e(a.a().a());
       }
       super.onDestroy();
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, ArticleWebviewFragment.class, "14")) {
          return;
       }
       this.k.onPause();
       super.onPause();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, ArticleWebviewFragment.class, "13")) {
          return;
       }
       super.onResume();
       this.k.onResume();
       this.k.resumeTimers();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       String queryParamet;
       int b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ArticleWebviewFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       if (this.k.getParent() != null) {
          this.k.getParent().removeView(this.k);
       }
       this.l.addView(this.k);
       this.n = new JsNativeEventCommunication(this.getActivity(), this.k);
       int i = 2;
       if (!PatchProxy.applyVoidOneRefs(p0, this, ArticleWebviewFragment.class, "8")) {
          WebViewFragment$d uod = this.o.C1();
          if (uod != null) {
             int i2 = 0x7f0a4571;
             View view = p0.findViewById(i2);
             RelativeLayout$LayoutParams layoutParams1 = view.getLayoutParams();
             WebViewFragment$d b1 = uod.b;
             if (b1 != null) {
                if (b1 != 1) {
                   if (b1 == i) {
                      layoutParams1.addRule(12);
                   }
                }else {
                   layoutParams1.addRule(13);
                }
             }else {
                layoutParams1.addRule(10);
             }
             view.setLayoutParams(layoutParams1);
             e uoe1 = this.getChildFragmentManager().beginTransaction();
             uoe1.f(i2, uod.a);
             uoe1.m();
          }
       }
       int i1 = 8;
       if (!PatchProxy.applyVoidOneRefs(p0, this, ArticleWebviewFragment.class, "9")) {
          c uoc = new c(p0, this.rh());
          this.q = uoc;
          uoc.s(this.k);
          this.q.k(this.u);
          this.k.setWebViewActionBarManager(this.q);
          ArticleWebviewFragment tk = this.k;
          ArticleWebviewFragment uArticleWebv = PatchProxy.apply(null, this, ArticleWebviewFragment.class, "10");
          if (uArticleWebv != PatchProxyResult.class) {
          }else {
             h oh = new h(this.n);
             this.r = oh;
             oh.B(new u(this));
             uArticleWebv = this.r;
          }
          tk.setWebViewClient(uArticleWebv);
          this.k.setWebChromeClient(new s(this, this.getActivity()));
          this.k.setDownloadListener(new f(this.getActivity()));
          this.k.setLoadingCallback(new t(this));
          e uoe = d.a(-1995910978).gL();
          this.p = uoe;
          uoe.d(this.getActivity(), this.k, this.q, this.n);
          this.p.g(this.v);
          this.p.b(this.w);
          this.p.c(this.t);
          this.k.addJavascriptInterface(this.p, "Kwai");
          queryParamet = this.getArguments().getString("KEY_THEME", "0");
          String str1 = "7";
          if (!PatchProxy.applyVoidOneRefs(queryParamet, this, ArticleWebviewFragment.class, str1) && (("11").equals(queryParamet) && i.c())) {
             uArticleWebv = this.q;
             if (uArticleWebv != null && uArticleWebv.l != null) {
                b = n.A(this.getActivity());
                ViewGroup$LayoutParams layoutParams = this.q.l.getLayoutParams();
                layoutParams.height = a1.d(0x7f070fdf) + b;
                this.q.l.setLayoutParams(layoutParams);
                this.q.l.setPadding(0, b, 0, 0);
             }
          }
       label_019d :
          b = (!("3").equals(queryParamet) && ("6".equals(queryParamet) || str1.equals(queryParamet)))? true: false;
          this.s = b;
          this.x = str1.equals(queryParamet) ^ 1;
          this.y = str1.equals(queryParamet) ^ 1;
          c l = this.q.l;
          b = (this.s != null)? 8: 0;
          l.setVisibility(b);
          tk = this.k;
          b = (this.y != null)? 0: 8;
          tk.setProgressVisibility(b);
       }
       this.o.w1(this, this.k);
       if (!PatchProxy.applyVoid(null, this, ArticleWebviewFragment.class, "5") && this.getArguments() != null) {
          String str = "KEY_ACTIONBAR_TOP_ROUND_DP";
          if (!this.getArguments().containsKey(str) && (this.getArguments().containsKey("KEY_ACTIONBAR_BACKGROUND_COLOR") || this.getArguments().containsKey("KEY_ACTIONBAR_BACKGROUND_SHAPE"))) {
             GradientDrawable gradientDraw = new GradientDrawable();
             gradientDraw.setShape(0);
             gradientDraw.setColor(a1.a(R.color.arg_RES_7f061c32));
             float f = (float)a1.e(this.getArguments().getFloat(str, 0));
             float[] uofloatArray = new float[i1];
             uofloatArray[0] = f;
             uofloatArray[1] = f;
             uofloatArray[i] = f;
             uofloatArray[3] = f;
             uofloatArray[4] = 0;
             uofloatArray[5] = 0;
             uofloatArray[6] = 0;
             uofloatArray[7] = 0;
             gradientDraw.setCornerRadii(uofloatArray);
             gradientDraw.setColor(a1.a(this.getArguments().getInt("KEY_ACTIONBAR_BACKGROUND_COLOR", R.color.arg_RES_7f061c32)));
             gradientDraw.setShape(this.getArguments().getInt("KEY_ACTIONBAR_BACKGROUND_SHAPE", 0));
             this.q.l.setBackground(gradientDraw);
          }
       }
       if (!PatchProxy.applyVoid(null, this, ArticleWebviewFragment.class, "6")) {
          try{
             queryParamet = Uri.parse(this.getWebUrl()).getQueryParameter("webview_bgcolor");
             if (queryParamet != null) {
                this.k.setBackgroundColor(Color.parseColor(queryParamet));
             }
          }catch(java.lang.Exception e12){
             e12.printStackTrace();
          }
       }
    }
    public WebViewClient p5(){
       return this.r;
    }
    public void ph(WebViewFragment$c p0){
       this.w = p0;
    }
    public String rh(){
       Object obj = PatchProxy.apply(null, this, ArticleWebviewFragment.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getArguments().getString("KEY_LEFT_TOP_BTN_TYPE");
    }
    public String sh(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, ArticleWebviewFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getArguments() == null) {
          return objArray;
       }
       return this.getArguments().getString("KEY_PAGE_URI");
    }
}
