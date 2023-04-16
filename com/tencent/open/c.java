package com.tencent.open.c;
import com.tencent.open.c.a$a;
import com.tencent.open.b;
import android.content.Context;
import java.lang.String;
import com.tencent.tauth.IUiListener;
import com.tencent.connect.auth.QQToken;
import java.lang.ref.WeakReference;
import java.lang.Object;
import com.tencent.open.c$c;
import com.tencent.open.c$d;
import android.os.Looper;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import java.lang.Math;
import java.lang.StringBuilder;
import com.tencent.open.log.SLog;
import com.tencent.open.c.b;
import org.json.JSONObject;
import com.tencent.open.utils.k;
import java.lang.CharSequence;
import android.widget.Toast;
import android.view.View;
import org.json.JSONException;
import android.view.ViewGroup$LayoutParams;
import android.widget.AbsoluteLayout;
import android.content.res.Configuration;
import com.kuaishou.webkit.WebView;
import com.tencent.open.a;
import com.tencent.open.c.a;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout$LayoutParams;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.Integer;
import android.graphics.Paint;
import java.lang.reflect.Method;
import java.lang.Exception;
import android.app.Dialog;
import com.tencent.open.c$a;
import com.tencent.open.c$1;
import com.kuaishou.webkit.WebViewClient;
import com.kuaishou.webkit.WebChromeClient;
import com.kuaishou.webkit.WebSettings;
import com.tencent.open.utils.i;
import com.kuaishou.webkit.WebSettings$RenderPriority;
import java.io.File;
import com.tencent.open.c$b;
import com.tencent.open.a$b;
import android.os.Bundle;
import android.view.Window;

public class c extends b implements a$a	// class@000f5c
{
    public String d;
    public IUiListener e;
    public c$c f;
    public Handler g;
    public a h;
    public b i;
    public WeakReference j;
    public int k;
    public static Toast c;

    public void c(Context p0,String p1,String p2,IUiListener p3,QQToken p4){
       super(p0, 0x1030010);
       this.j = new WeakReference(p0);
       this.d = p2;
       c$c uoc = new c$c(p0, p1, p2, p4.getAppId(), p3);
       this.f = v0;
       this.g = new c$d(this, this.f, p0.getMainLooper());
       this.e = p3;
       this.k = Math.round((c.c(p0.getResources()).density * 185.00f));
       SLog.e("openSDK_LOG.PKDialog", "density="+c.c(p0.getResources()).density+"; webviewHeight="+this.k);
    }
    public static WeakReference a(c p0){
       return p0.j;
    }
    public static void a(Context p0,String p1){
       c.c(p0, p1);
    }
    public static c$c b(c p0){
       return p0.f;
    }
    public static void b(Context p0,String p1){
       c.d(p0, p1);
    }
    public static b c(c p0){
       return p0.i;
    }
    public static void c(Context p0,String p1){
       Toast c;
       try{
          JSONObject jSONObject = k.d(p1);
          int intx = jSONObject.getInt("type");
          jSONObject = jSONObject.getString("msg");
          if (!intx) {
             c = c.c;
             if (c == null) {
                c.c = Toast.makeText(p0, jSONObject, 0);
             }else {
                c.setView(c.getView());
                c.c.setText(jSONObject);
                c.c.setDuration(0);
             }
             c.c.show();
          }else if(intx == 1){
             c = c.c;
             if (c == null) {
                c.c = Toast.makeText(p0, jSONObject, 1);
             }else {
                c.setView(c.getView());
                c.c.setText(jSONObject);
                c.c.setDuration(1);
             }
             c.c.show();
          }
       }catch(org.json.JSONException e2){
          e2.printStackTrace();
       }
       return;
    }
    public static void d(Context p0,String p1){
       if (p0 != null && p1 != null) {
          try{
             JSONObject jSONObject = k.d(p1);
             jSONObject.getInt("action");
             jSONObject.getString("msg");
          }catch(org.json.JSONException e0){
             e0.printStackTrace();
          }
       }
    }
    public void a(){
       this.i.getLayoutParams().height = this.k;
       SLog.e("openSDK_LOG.PKDialog", "onKeyboardHidden keyboard hide");
    }
    public void a(int p0){
       c tj = this.j;
       if (tj != null && tj.get() != null) {
          if (p0 < this.k && 2 == this.j.get().getResources().getConfiguration().orientation) {
             this.i.getLayoutParams().height = p0;
          }else {
             p0.height = this.k;
          }
       }
       SLog.e("openSDK_LOG.PKDialog", "onKeyboardShown keyboard show");
       return;
    }
    public void a(String p0){
       String str = "openSDK_LOG.PKDialog";
       String str1 = "--onConsoleMessage--";
       try{
          SLog.d(str, str1);
          this.a.a(this.i, p0);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public final void b(){
       a uoa = new a(this.j.get());
       this.h = uoa;
       uoa.setBackgroundColor(0x66000000);
       this.h.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       b uob = new b(this.j.get());
       this.i = uob;
       int i = 0;
       uob.setBackgroundColor(i);
       c ti = this.i;
       Drawable uDrawable = null;
       try{
          ti.setBackgroundDrawable(uDrawable);
          Class[] uClassArray = new Class[]{Integer.TYPE,Paint.class};
          Object[] objArray = new Object[]{Integer.valueOf(1),new Paint()};
          View.class.getMethod("setLayerType", uClassArray).invoke(this.i, objArray);
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-1, this.k);
       layoutParams.addRule(13, -1);
       this.i.setLayoutParams(layoutParams);
       this.h.addView(this.i);
       this.h.a(this);
       this.setContentView(this.h);
       return;
    }
    public final void c(){
       boolean b = false;
       this.i.setVerticalScrollBarEnabled(b);
       this.i.setHorizontalScrollBarEnabled(b);
       this.i.setWebViewClient(new c$a(this, null));
       this.i.setWebChromeClient(this.b);
       this.i.clearFormData();
       WebSettings settings = this.i.getSettings();
       if (settings == null) {
          return;
       }
       i.a(settings);
       settings.setSaveFormData(b);
       settings.setCacheMode(-1);
       settings.setNeedInitialFocus(b);
       boolean b1 = true;
       settings.setBuiltInZoomControls(b1);
       settings.setSupportZoom(b1);
       settings.setRenderPriority(WebSettings$RenderPriority.HIGH);
       settings.setJavaScriptEnabled(b1);
       c tj = this.j;
       if (tj != null && tj.get() != null) {
          settings.setDatabaseEnabled(b1);
          settings.setDatabasePath(this.j.get().getApplicationContext().getDir("databases", b).getPath());
       }
       settings.setDomStorageEnabled(b1);
       this.a.a(new c$b(this, null), "sdk_js_if");
       this.i.clearView();
       this.i.loadUrl(this.d);
       return;
    }
    public void onBackPressed(){
       super.onBackPressed();
    }
    public void onCreate(Bundle p0){
       this.requestWindowFeature(1);
       super.onCreate(p0);
       this.getWindow().setSoftInputMode(16);
       this.getWindow().setSoftInputMode(1);
       this.b();
       this.c();
    }
}
