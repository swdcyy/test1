package com.sina.weibo.sdk.web.WebActivity;
import com.sina.weibo.sdk.web.a;
import android.app.Activity;
import com.sina.weibo.sdk.web.b.b;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Object;
import java.lang.Exception;
import com.sina.weibo.sdk.web.a.b;
import android.widget.LinearLayout;
import android.widget.AbsoluteLayout;
import android.widget.ProgressBar;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.os.Build$VERSION;
import android.view.Window;
import android.view.View;
import android.widget.RelativeLayout;
import android.content.Context;
import android.widget.TextView;
import com.sina.weibo.sdk.web.WebActivity$2;
import android.view.View$OnClickListener;
import android.widget.RelativeLayout$LayoutParams;
import com.sina.weibo.sdk.b.e;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout$LayoutParams;
import android.widget.Button;
import com.sina.weibo.sdk.web.WebActivity$3;
import com.sina.weibo.sdk.web.WebActivity$4;
import com.kuaishou.webkit.WebChromeClient;
import android.content.Intent;
import com.sina.weibo.sdk.web.b.c;
import com.sina.weibo.sdk.web.a.c;
import com.sina.weibo.sdk.web.b.a;
import com.sina.weibo.sdk.web.a.a;
import com.sina.weibo.sdk.web.b.d;
import com.sina.weibo.sdk.web.a.d;
import com.kuaishou.webkit.WebViewClient;
import com.kuaishou.webkit.WebSettings;
import com.sina.weibo.sdk.web.WebActivity$1;
import com.sina.weibo.sdk.web.b.b$a;
import android.view.KeyEvent;

public class WebActivity extends Activity implements a	// class@000bdc
{
    public LinearLayout am;
    public TextView an;
    public TextView ao;
    public WebView ap;
    public ProgressBar aq;
    public b ar;
    public b as;
    public String at;

    public void WebActivity(){
       super();
    }
    public static b a(WebActivity p0){
       return p0.ar;
    }
    public static void a(WebView p0,String p1){
       try{
          Class[] uClassArray = new Class[]{String.class};
          Object[] objArray = new Object[]{p1};
          WebView.class.getDeclaredMethod("removeJavascriptInterface", uClassArray).invoke(p0, objArray);
          return;
       }catch(java.lang.Exception e6){
          e6.printStackTrace();
          return;
       }
    }
    public static WebView b(WebActivity p0){
       return p0.ap;
    }
    public static b c(WebActivity p0){
       return p0.as;
    }
    public static void d(WebActivity p0){
       p0.am.setVisibility(8);
       p0.ap.setVisibility(0);
    }
    public static ProgressBar e(WebActivity p0){
       return p0.aq;
    }
    public static boolean j(String p0){
       if (TextUtils.isEmpty(p0)) {
          return false;
       }
       if (p0.startsWith("https://service.weibo.com/share/mobilesdk.php") || p0.startsWith("https://open.weibo.cn/oauth2/authorize?")) {
          return true;
       }
       return false;
    }
    public static boolean k(String p0){
       return WebActivity.j(p0);
    }
    public Resources getResources(){
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       super.onCreate(p0);
       if (Build$VERSION.SDK_INT >= 23) {
          this.getWindow().getDecorView().setSystemUiVisibility(8192);
       }
       RelativeLayout relativeLayo = new RelativeLayout(this);
       int i = -1;
       relativeLayo.setBackgroundColor(i);
       RelativeLayout relativeLayo1 = new RelativeLayout(this);
       TextView textView = new TextView(this);
       this.an = textView;
       textView.setText("关闭");
       this.an.setTextSize(17.00f);
       this.an.setTextColor(-32256);
       this.an.setOnClickListener(new WebActivity$2(this));
       textView = new TextView(this);
       this.ao = textView;
       textView.setTextSize(18.00f);
       this.ao.setTextColor(-11382190);
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-2, -2);
       RelativeLayout$LayoutParams layoutParams1 = new RelativeLayout$LayoutParams(-2, -2);
       layoutParams.addRule(15);
       this.an.setPadding(e.a(10, this), 0, e.a(10, this), 0);
       layoutParams1.addRule(13);
       relativeLayo1.addView(this.an, layoutParams);
       relativeLayo1.addView(this.ao, layoutParams1);
       relativeLayo.addView(relativeLayo1, new RelativeLayout$LayoutParams(i, e.a(55, this)));
       this.ap = new WebView(this.getApplicationContext());
       RelativeLayout$LayoutParams layoutParams2 = new RelativeLayout$LayoutParams(i, i);
       layoutParams2.topMargin = e.a(55, this);
       relativeLayo.addView(this.ap, layoutParams2);
       this.aq = new ProgressBar(this);
       int i1 = 3;
       layoutParams2 = new RelativeLayout$LayoutParams(i, e.a(i1, this));
       layoutParams2.topMargin = e.a(55, this);
       relativeLayo.addView(this.aq, layoutParams2);
       View view = new View(this);
       view.setBackgroundResource(this.getResources().getIdentifier("weibosdk_common_shadow_top", "drawable", this.getPackageName()));
       RelativeLayout$LayoutParams layoutParams3 = new RelativeLayout$LayoutParams(i, e.a(i1, this));
       layoutParams3.topMargin = e.a(55, this);
       relativeLayo.addView(view, layoutParams3);
       LinearLayout linearLayout = new LinearLayout(this);
       this.am = linearLayout;
       linearLayout.setOrientation(1);
       ImageView imageView = new ImageView(this);
       imageView.setImageResource(this.getResources().getIdentifier("weibosdk_empty_failed", "drawable", this.getPackageName()));
       this.am.addView(imageView);
       TextView textView1 = new TextView(this);
       textView1.setTextSize(14.00f);
       textView1.setTextColor(-4342339);
       LinearLayout$LayoutParams layoutParams4 = new LinearLayout$LayoutParams(-2, -2);
       layoutParams4.topMargin = e.a(18, this);
       layoutParams4.bottomMargin = e.a(20, this);
       this.am.addView(textView1, layoutParams4);
       textView1.setText("网络出错啦，请点击按钮重新加载");
       Button uButton = new Button(this);
       uButton.setTextSize(16.00f);
       uButton.setTextColor(-8882056);
       layoutParams4 = new LinearLayout$LayoutParams(e.a(142, this), e.a(46, this));
       layoutParams4.gravity = 17;
       this.am.addView(uButton, layoutParams4);
       uButton.setBackgroundResource(this.getResources().getIdentifier("retry_btn_selector", "drawable", this.getPackageName()));
       uButton.setText("重新加载");
       uButton.setOnClickListener(new WebActivity$3(this));
       layoutParams2 = new RelativeLayout$LayoutParams(-2, -2);
       layoutParams2.addRule(13);
       relativeLayo.addView(this.am, layoutParams2);
       this.am.setVisibility(8);
       this.ap.setWebChromeClient(new WebActivity$4(this));
       this.setContentView(relativeLayo);
       Intent intent = this.getIntent();
       if (intent == null) {
          this.finish();
          return;
       }else {
          Bundle extras = intent.getExtras();
          if (extras == null) {
             this.finish();
             return;
          }else {
             int intExtra = intent.getIntExtra("web_type", i);
             if (intExtra == i) {
                this.finish();
                return;
             }else {
                i = 2;
                if (intExtra != 1) {
                   if (intExtra != i) {
                      if (intExtra == i1) {
                         c uoc = new c();
                         this.ar = uoc;
                         this.as = new c(this, uoc);
                      }
                   }else {
                      this.at = "微博登录";
                      a uoa = new a();
                      this.ar = uoa;
                      this.as = new a(this, this, uoa);
                   }
                }else {
                   this.at = "微博分享";
                   d uod = new d(this);
                   this.ar = uod;
                   this.as = new d(this, this, uod);
                }
                this.ap.setWebViewClient(this.as);
                this.ar.readFromBundle(extras);
                WebSettings settings = this.ap.getSettings();
                settings.setSavePassword(0);
                settings.setAllowContentAccess(0);
                settings.setUserAgentString(e.o());
                settings.setAllowFileAccess(0);
                settings.setJavaScriptEnabled(1);
                settings.setGeolocationEnabled(0);
                settings.setAllowUniversalAccessFromFileURLs(0);
                this.ap.requestFocus();
                this.ap.setScrollBarStyle(0);
                WebActivity.a(this.ap, "searchBoxJavaBridge_");
                WebActivity.a(this.ap, "accessibility");
                WebActivity.a(this.ap, "accessibilityTraversal");
                settings.setMixedContentMode(i);
                if (this.ar.t()) {
                   this.ar.a(new WebActivity$1(this));
                }else {
                   String url = this.ar.getUrl();
                   if (!TextUtils.isEmpty(url) && WebActivity.j(url)) {
                      this.ap.loadUrl(url);
                   }
                }
                WebActivity tao = this.ao;
                if (tao != null) {
                   tao.setText(this.at);
                }
                return;
             }
          }
       }
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       if (p0 == 4) {
          if (this.as.s()) {
             return true;
          }else if(this.ap.canGoBack()){
             this.ap.goBack();
             return true;
          }
       }
       return super.onKeyDown(p0, p1);
    }
    public final void p(){
       this.am.setVisibility(0);
       this.ap.setVisibility(8);
    }
    public final void q(){
       this.finish();
    }
}
