package com.unionpay.UPPayWapActivity;
import android.app.Activity;
import android.app.AlertDialog;
import java.lang.String;
import android.widget.LinearLayout;
import org.json.JSONObject;
import java.lang.Object;
import org.json.JSONException;
import android.content.Intent;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.view.Window;
import android.content.Context;
import android.view.View;
import com.kuaishou.webkit.WebView;
import com.unionpay.c;
import java.lang.StringBuilder;
import com.unionpay.utils.k;
import com.unionpay.f;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.RelativeLayout;
import android.view.ViewGroup$LayoutParams;
import com.unionpay.utils.f;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.unionpay.utils.h;
import android.graphics.drawable.Drawable;
import com.unionpay.utils.g;
import android.widget.TextView;
import java.lang.CharSequence;
import android.text.TextUtils$TruncateAt;
import com.unionpay.WebViewJavascriptBridge;
import com.unionpay.u;
import com.unionpay.i;
import com.unionpay.j;
import com.unionpay.k;
import com.unionpay.l;
import com.unionpay.m;
import com.unionpay.n;
import com.unionpay.o;
import com.unionpay.d;
import com.unionpay.e;
import android.view.KeyEvent;

public class UPPayWapActivity extends Activity	// class@000fed
{
    public LinearLayout a;
    public WebView b;
    public WebViewJavascriptBridge c;
    public AlertDialog d;
    public boolean e;

    public void UPPayWapActivity(){
       this.e = false;
    }
    public static AlertDialog a(UPPayWapActivity p0){
       return p0.d;
    }
    public static AlertDialog a(UPPayWapActivity p0,AlertDialog p1){
       p0.d = p1;
       return p1;
    }
    public static String a(String p0,String p1,String p2){
       return UPPayWapActivity.b(p0, p1, p2);
    }
    public static void a(UPPayWapActivity p0,String p1,String p2){
       p0.a(p1, p2);
    }
    public static void a(UPPayWapActivity p0,boolean p1){
       p0 = p0.a;
       int i = (p1)? 0: 8;
       p0.setVisibility(i);
       return;
    }
    public static String b(String p0,String p1,String p2){
       try{
          JSONObject jSONObject = new JSONObject("{\"code\":\"0\",\"msg\":\"success\"}");
          if (p0 != null) {
             jSONObject.put("code", p0);
          }
          if (p1 != null) {
             jSONObject.put("msg", p1);
          }
          if (p2 != null) {
             jSONObject.put("value", p2);
          }
          return jSONObject.toString();
       }catch(org.json.JSONException e2){
          e2.printStackTrace();
          return "";
       }
    }
    public final void a(String p0,String p1){
       Intent intent = new Intent();
       intent.putExtra("pay_result", p0);
       intent.putExtra("result_data", p1);
       this.setResult(-1, intent);
       this.finish();
    }
    public Resources getResources(){
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       String stringExtra;
       c uoc;
       super.onCreate(p0);
       Window window = this.getWindow();
       int i = 8192;
       try{
          window.addFlags(i);
          if (!("949A1CC").equalsIgnoreCase(this.getIntent().getStringExtra("magic_data"))) {
             this.finish();
          }
          this.e = ("link").equals(this.getIntent().getStringExtra("actionType"));
          i = 1;
          this.getWindow().requestFeature(i);
          LinearLayout linearLayout = new LinearLayout(this);
          linearLayout.setOrientation(i);
          this.setContentView(linearLayout);
          this.b = new WebView(this);
          String str = "wapurl";
          if (this.e == null) {
             stringExtra = this.getIntent().getStringExtra("waptype");
             String str1 = "";
             if (stringExtra != null && stringExtra.equals("new_page")) {
                stringExtra = this.getIntent().getStringExtra(str);
                str = this.getIntent().getStringExtra("waptitle");
                if (stringExtra == null) {
                   stringExtra = str1;
                }
                if (str != null) {
                   str1 = str;
                }
                uoc = new c(this);
             }else {
                stringExtra = this.getIntent().getStringExtra(str);
                str = this.getIntent().getStringExtra("paydata");
                if (str != null) {
                   str1 = stringExtra+"?s="+str;
                }
                uoc = new f(this);
                str1 = k.a().e;
                stringExtra = str1;
             }
             RelativeLayout relativeLayo = new RelativeLayout(this);
             relativeLayo.setLayoutParams(new RelativeLayout$LayoutParams(-1, -2));
             int i1 = f.a(this, 10.00f);
             int i2 = f.a(this, 52.00f);
             relativeLayo.setLayoutParams(new RelativeLayout$LayoutParams(-1, i2));
             relativeLayo.setBackgroundColor(-10705958);
             LinearLayout linearLayout1 = new LinearLayout(this);
             this.a = linearLayout1;
             linearLayout1.setPadding(i1, i1, i1, i1);
             this.a.setGravity(16);
             RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-2, -2);
             layoutParams.addRule(9, -1);
             layoutParams.addRule(15, -1);
             layoutParams.leftMargin = i1;
             this.a.setOnClickListener(uoc);
             relativeLayo.addView(this.a, layoutParams);
             ImageView imageView = new ImageView(this);
             imageView.setBackgroundDrawable(g.a(h.a));
             RelativeLayout$LayoutParams layoutParams1 = new RelativeLayout$LayoutParams(f.a(this, 11.00f), f.a(this, 20.00f));
             layoutParams1.addRule(15, -1);
             this.a.addView(imageView, layoutParams1);
             RelativeLayout$LayoutParams layoutParams2 = new RelativeLayout$LayoutParams(f.a(this, 320.00f), i2);
             layoutParams2.addRule(13, -1);
             TextView textView = new TextView(this);
             textView.setTextSize(20.00f);
             textView.setTextColor(-1);
             textView.setText(str1);
             textView.setGravity(17);
             textView.setSingleLine(i);
             textView.setEllipsize(TextUtils$TruncateAt.END);
             relativeLayo.addView(textView, layoutParams2);
             linearLayout.addView(relativeLayo);
          }else {
             stringExtra = this.getIntent().getStringExtra(str);
          }
          this.b.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
          linearLayout.addView(this.b);
          WebViewJavascriptBridge webViewJavas = new WebViewJavascriptBridge(this, this.b, null);
          this.c = webViewJavas;
          webViewJavas.setAllowScheme(this.e);
          UPPayWapActivity tb = this.b;
          if (tb != null) {
             tb.loadUrl(stringExtra);
          }
          tb = this.c;
          if (tb != null) {
             tb.registerHandler("getDeviceInfo", new i(this));
             this.c.registerHandler("saveData", new j(this));
             this.c.registerHandler("getData", new k(this));
             this.c.registerHandler("removeData", new l(this));
             this.c.registerHandler("setPageBackEnable", new m(this));
             this.c.registerHandler("payBySDK", new n(this));
             this.c.registerHandler("payResult", new o(this));
             this.c.registerHandler("closePage", new d(this));
             this.c.registerHandler("openNewPage", new e(this));
          }
          return;
       }catch(java.lang.Exception e0){
          this.finish();
          return;
       }
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       if (p0 != 4) {
          return super.onKeyDown(p0, p1);
       }
       if (this.e != null) {
          UPPayWapActivity tb = this.b;
          if (tb != null && tb.canGoBack()) {
             this.b.goBack();
             return true;
          }else {
             this.a("cancel", null);
          }
       }else {
          this.onPause();
       }
       return true;
    }
}
