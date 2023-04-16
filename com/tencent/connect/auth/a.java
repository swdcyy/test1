package com.tencent.connect.auth.a;
import android.app.Dialog;
import android.content.Context;
import java.lang.String;
import com.tencent.tauth.IUiListener;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.auth.a$b;
import com.tencent.connect.auth.a$c;
import android.os.Looper;
import com.tencent.open.web.security.b;
import android.view.Window;
import org.json.JSONObject;
import com.tencent.open.utils.k;
import java.lang.CharSequence;
import android.widget.Toast;
import org.json.JSONException;
import com.tencent.open.c.c;
import android.widget.FrameLayout;
import android.os.Handler;
import java.util.HashMap;
import java.lang.StringBuilder;
import com.tencent.open.log.SLog;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.connect.avatar.a;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.graphics.drawable.Drawable;
import android.widget.ImageView$ScaleType;
import com.tencent.connect.auth.a$1;
import android.view.View$OnClickListener;
import android.view.View;
import java.lang.System;
import com.kuaishou.webkit.WebView;
import android.graphics.Paint;
import android.os.Bundle;
import java.lang.Object;
import android.widget.ProgressBar;
import android.widget.LinearLayout$LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import android.graphics.Color;
import android.widget.AbsoluteLayout;
import com.tencent.connect.auth.a$a;
import com.kuaishou.webkit.WebViewClient;
import com.kuaishou.webkit.WebChromeClient;
import com.tencent.connect.auth.a$2;
import android.view.View$OnLongClickListener;
import com.tencent.connect.auth.a$3;
import android.view.View$OnTouchListener;
import com.kuaishou.webkit.WebSettings;
import com.tencent.open.utils.i;
import com.kuaishou.webkit.WebSettings$RenderPriority;
import java.io.File;
import com.tencent.open.web.security.SecureJsInterface;
import com.tencent.open.a$b;
import com.tencent.open.a;
import com.tencent.connect.auth.a$4;
import android.content.DialogInterface$OnDismissListener;
import android.app.Activity;
import java.lang.Throwable;
import com.tencent.open.c.b;
import com.tencent.connect.auth.b;
import com.tencent.connect.auth.b$a;
import com.tencent.open.utils.HttpUtils;

public class a extends Dialog	// class@000e2a
{
    public String a;
    public a$b b;
    public IUiListener c;
    public Handler d;
    public FrameLayout e;
    public LinearLayout f;
    public FrameLayout g;
    public ProgressBar h;
    public String i;
    public c j;
    public Context k;
    public b l;
    public boolean m;
    public int n;
    public String o;
    public String p;
    public long q;
    public long r;
    public HashMap s;

    public void a(Context p0,String p1,String p2,IUiListener p3,QQToken p4){
       super(p0, 0x1030010);
       this.m = false;
       this.q = 0;
       this.r = 0x7530;
       this.k = p0;
       this.a = p2;
       a$b uob = new a$b(this, p1, p2, p4.getAppId(), p3);
       this.b = v0;
       this.d = new a$c(this, this.b, p0.getMainLooper());
       this.c = p3;
       this.i = p1;
       this.l = new b();
       this.getWindow().setSoftInputMode(32);
    }
    public static long a(a p0,long p1){
       p0.q = p1;
       return p1;
    }
    public static Context a(a p0){
       return p0.k;
    }
    public static String a(a p0,String p1){
       return p0.a(p1);
    }
    public static void a(Context p0,String p1){
       a.b(p0, p1);
    }
    public static boolean a(a p0,boolean p1){
       p0.m = p1;
       return p1;
    }
    public static String b(a p0,String p1){
       p0.a = p1;
       return p1;
    }
    public static void b(Context p0,String p1){
       try{
          JSONObject jSONObject = k.d(p1);
          int intx = jSONObject.getInt("type");
          Toast.makeText(p0.getApplicationContext(), jSONObject.getString("msg"), intx).show();
       }catch(org.json.JSONException e2){
          e2.printStackTrace();
       }
       return;
    }
    public static boolean b(a p0){
       return p0.e();
    }
    public static String c(a p0,String p1){
       p0.p = p1;
       return p1;
    }
    public static boolean c(a p0){
       return p0.m;
    }
    public static String d(a p0){
       return p0.a;
    }
    public static String d(a p0,String p1){
       p0.o = p1;
       return p1;
    }
    public static c e(a p0){
       return p0.j;
    }
    public static a$b f(a p0){
       return p0.b;
    }
    public static FrameLayout g(a p0){
       return p0.g;
    }
    public static b h(a p0){
       return p0.l;
    }
    public static String i(a p0){
       return p0.o;
    }
    public static long j(a p0){
       return p0.q;
    }
    public static int k(a p0){
       return p0.n;
    }
    public static long l(a p0){
       return p0.r;
    }
    public static int m(a p0){
       a n = p0.n;
       p0.n = n + 1;
       return n;
    }
    public static Handler n(a p0){
       return p0.d;
    }
    public static String o(a p0){
       return p0.a();
    }
    public static HashMap p(a p0){
       return p0.s;
    }
    public final String a(){
       a ta = this.a;
       SLog.i("openSDK_LOG.AuthDialog", "-->generateDownloadUrl, url: https://imgcache.qq.com/ptlogin/static/qzsjump.html?");
       return "https://imgcache.qq.com/ptlogin/static/qzsjump.html?"+ta.substring((ta.indexOf("?") + 1));
    }
    public final String a(String p0){
       String str = p0;
       if (!TextUtils.isEmpty(this.p)) {
          int i = 4;
          if ((this.p).length() >= i) {
             a tp = this.p;
             str = str+"_u_"+tp.substring((tp.length() - i));
          }
       }
       return str;
    }
    public final void a(ViewGroup p0){
       ImageView imageView = new ImageView(this.k);
       int i = a.a(this.k, 10.00f);
       int i1 = i * 2;
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams((a.a(this.k, 15.60f) + i1), (a.a(this.k, 25.20f) + i1));
       layoutParams.leftMargin = i;
       imageView.setLayoutParams(layoutParams);
       imageView.setPadding(i, i, i, i);
       imageView.setImageDrawable(k.a("h5_qr_back.png", this.k));
       imageView.setScaleType(ImageView$ScaleType.FIT_CENTER);
       imageView.setOnClickListener(new a$1(this));
       p0.addView(imageView);
    }
    public void a(String p0,String p1){
       this.j.loadUrl("javascript:"+p0+"\("+p1+"\);void\("+System.currentTimeMillis()+"\);");
    }
    public final void b(){
       this.c();
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-1, -1);
       c uoc = new c(this.k);
       this.j = uoc;
       uoc.setLayerType(1, null);
       this.j.setLayoutParams(layoutParams);
       FrameLayout uFrameLayout = new FrameLayout(this.k);
       this.e = uFrameLayout;
       layoutParams.gravity = 17;
       uFrameLayout.setLayoutParams(layoutParams);
       this.e.addView(this.j);
       this.e.addView(this.g);
       String str = k.b(this.a).getString("style");
       if (str != null && ("qr").equals(str)) {
          this.a(this.e);
       }
       this.setContentView(this.e);
       return;
    }
    public final void c(){
       TextView textView;
       this.h = new ProgressBar(this.k);
       int i = -2;
       this.h.setLayoutParams(new LinearLayout$LayoutParams(i, i));
       this.f = new LinearLayout(this.k);
       if ((this.i).equals("action_login")) {
          LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(i, i);
          layoutParams.gravity = 16;
          layoutParams.leftMargin = 5;
          textView = new TextView(this.k);
          if ((Locale.getDefault().getLanguage()).equals("zh")) {
             textView.setText("µÇÂ¼ÖÐ...");
          }else {
             textView.setText("Logging in...");
          }
          textView.setTextColor(Color.rgb(255, 255, 255));
          textView.setTextSize(18.00f);
          textView.setLayoutParams(layoutParams);
       }else {
          textView = null;
       }
       FrameLayout$LayoutParams layoutParams1 = new FrameLayout$LayoutParams(i, i);
       i = 17;
       layoutParams1.gravity = i;
       this.f.setLayoutParams(layoutParams1);
       this.f.addView(this.h);
       if (textView != null) {
          this.f.addView(textView);
       }
       this.g = new FrameLayout(this.k);
       layoutParams1 = new FrameLayout$LayoutParams(-1, -1);
       layoutParams1.gravity = i;
       this.g.setLayoutParams(layoutParams1);
       this.g.setBackgroundColor(Color.parseColor("#B3000000"));
       this.g.addView(this.f);
       return;
    }
    public final void d(){
       this.j.setVerticalScrollBarEnabled(false);
       this.j.setHorizontalScrollBarEnabled(false);
       this.j.setWebViewClient(new a$a(this, null));
       this.j.setWebChromeClient(new WebChromeClient());
       this.j.clearFormData();
       this.j.clearSslPreferences();
       this.j.setOnLongClickListener(new a$2(this));
       this.j.setOnTouchListener(new a$3(this));
       WebSettings settings = this.j.getSettings();
       i.a(settings);
       settings.setSaveFormData(false);
       settings.setCacheMode(-1);
       settings.setNeedInitialFocus(false);
       settings.setBuiltInZoomControls(true);
       settings.setSupportZoom(true);
       settings.setRenderPriority(WebSettings$RenderPriority.HIGH);
       settings.setJavaScriptEnabled(true);
       settings.setDatabaseEnabled(true);
       settings.setDatabasePath(this.k.getDir("databases", false).getPath());
       settings.setDomStorageEnabled(true);
       SLog.v("openSDK_LOG.AuthDialog", "-->mUrl : "+this.a);
       a ta = this.a;
       this.o = ta;
       this.j.loadUrl(ta);
       this.j.setVisibility(4);
       this.l.a(new SecureJsInterface(), "SecureJsInterface");
       SecureJsInterface.isPWDEdit = false;
       super.setOnDismissListener(new a$4(this));
    }
    public void dismiss(){
       String str = "openSDK_LOG.AuthDialog";
       this.s.clear();
       a td = this.d;
       try{
          td.removeCallbacksAndMessages(null);
          td = this.k;
          if (td instanceof Activity && (!td.isFinishing() && this.isShowing())) {
             super.dismiss();
             SLog.i(str, "-->dismiss dialog");
          }
       }catch(java.lang.Exception e1){
          SLog.e(str, "-->dismiss dialog exception:", e1);
       }
       a tj = this.j;
       if (tj != null) {
          tj.destroy();
          this.j = null;
       }
       return;
    }
    public final boolean e(){
       b uob = b.a();
       String str = uob.c();
       b$a uoa = new b$a();
       uoa.a = this.c;
       uoa.b = this;
       uoa.c = str;
       a ta = this.a;
       Bundle uBundle = k.b(this.a);
       uBundle.putString("token_key", str);
       uBundle.putString("serial", uob.a(uoa));
       uBundle.putString("browser", "1");
       String str1 = ta.substring(0, ta.indexOf("?"))+"?"+HttpUtils.encodeUrl(uBundle);
       this.a = str1;
       return k.a(this.k, str1);
    }
    public void onBackPressed(){
       if (this.m == null) {
          this.b.onCancel();
       }
       super.onBackPressed();
       return;
    }
    public void onCreate(Bundle p0){
       this.requestWindowFeature(1);
       Window window = this.getWindow();
       if (window != null) {
          window.setFlags(1024, 1024);
       }
       super.onCreate(p0);
       if (window != null) {
          window.getDecorView().setSystemUiVisibility(1280);
       }
       this.b();
       this.d();
       this.s = new HashMap();
       return;
    }
    public void onStop(){
       super.onStop();
    }
}
