package com.tencent.open.TDialog;
import com.tencent.open.b;
import android.widget.FrameLayout$LayoutParams;
import android.content.Context;
import java.lang.String;
import com.tencent.tauth.IUiListener;
import com.tencent.connect.auth.QQToken;
import java.lang.ref.WeakReference;
import java.lang.Object;
import com.tencent.open.TDialog$OnTimeListener;
import com.tencent.open.TDialog$THandler;
import android.os.Looper;
import android.os.Handler;
import org.json.JSONObject;
import com.tencent.open.utils.k;
import java.lang.CharSequence;
import android.widget.Toast;
import android.view.View;
import org.json.JSONException;
import com.tencent.open.c.b;
import android.app.ProgressDialog;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.webkit.WebView;
import android.widget.FrameLayout;
import android.app.Dialog;
import com.tencent.open.log.SLog;
import com.tencent.open.a;
import android.widget.AbsoluteLayout;
import com.tencent.open.TDialog$FbWebViewClient;
import com.tencent.open.TDialog$1;
import com.kuaishou.webkit.WebViewClient;
import com.kuaishou.webkit.WebChromeClient;
import com.kuaishou.webkit.WebSettings;
import com.tencent.open.utils.i;
import com.kuaishou.webkit.WebSettings$RenderPriority;
import java.io.File;
import com.tencent.open.TDialog$JsListener;
import com.tencent.open.a$b;
import android.os.Bundle;
import java.lang.Runnable;

public class TDialog extends b	// class@000f38
{
    public WeakReference e;
    public String g;
    public TDialog$OnTimeListener h;
    public IUiListener i;
    public FrameLayout j;
    public b k;
    public Handler l;
    public boolean m;
    public QQToken n;
    public static final FrameLayout$LayoutParams c;
    public static Toast d;
    public static WeakReference f;

    static {
       TDialog.c = new FrameLayout$LayoutParams(-1, -1);
       TDialog.d = null;
    }
    public void TDialog(Context p0,String p1,String p2,IUiListener p3,QQToken p4){
       super(p0, 0x1030010);
       this.m = false;
       this.n = null;
       this.e = new WeakReference(p0);
       this.g = p2;
       TDialog$OnTimeListener onTimeListen = new TDialog$OnTimeListener(p0, p1, p2, p4.getAppId(), p3);
       this.h = v0;
       this.l = new TDialog$THandler(this, this.h, p0.getMainLooper());
       this.i = p3;
       this.n = p4;
    }
    public static WeakReference a(TDialog p0){
       return p0.e;
    }
    public static void a(Context p0,String p1){
       TDialog.c(p0, p1);
    }
    public static Handler b(TDialog p0){
       return p0.l;
    }
    public static void b(Context p0,String p1){
       TDialog.d(p0, p1);
    }
    public static TDialog$OnTimeListener c(TDialog p0){
       return p0.h;
    }
    public static void c(Context p0,String p1){
       Toast d;
       try{
          JSONObject jSONObject = k.d(p1);
          int intx = jSONObject.getInt("type");
          jSONObject = jSONObject.getString("msg");
          if (!intx) {
             d = TDialog.d;
             if (d == null) {
                TDialog.d = Toast.makeText(p0, jSONObject, 0);
             }else {
                d.setView(d.getView());
                TDialog.d.setText(jSONObject);
                TDialog.d.setDuration(0);
             }
             TDialog.d.show();
          }else if(intx == 1){
             d = TDialog.d;
             if (d == null) {
                TDialog.d = Toast.makeText(p0, jSONObject, 1);
             }else {
                d.setView(d.getView());
                TDialog.d.setText(jSONObject);
                TDialog.d.setDuration(1);
             }
             TDialog.d.show();
          }
       }catch(org.json.JSONException e2){
          e2.printStackTrace();
       }
       return;
    }
    public static b d(TDialog p0){
       return p0.k;
    }
    public static void d(Context p0,String p1){
       if (p0 != null && p1 != null) {
          try{
             JSONObject jSONObject = k.d(p1);
             int intx = jSONObject.getInt("action");
             jSONObject = jSONObject.getString("msg");
             if (intx == 1) {
                WeakReference f = TDialog.f;
                if (f == null || f.get() == null) {
                   ProgressDialog progressDial = new ProgressDialog(p0);
                   progressDial.setMessage(jSONObject);
                   TDialog.f = new WeakReference(progressDial);
                   progressDial.show();
                }else {
                   TDialog.f.get().setMessage(jSONObject);
                   if (!TDialog.f.get().isShowing()) {
                      TDialog.f.get().show();
                   }
                }
             }else if(!intx){
                WeakReference f1 = TDialog.f;
                if (f1 == null) {
                   return;
                }else if(f1.get() != null && TDialog.f.get().isShowing()){
                   TDialog.f.get().dismiss();
                   TDialog.f = null;
                }
             }
          }catch(org.json.JSONException e2){
             e2.printStackTrace();
          }
       }
    }
    public final void a(){
       new TextView(this.e.get()).setText("test");
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-1, -1);
       b uob = new b(this.e.get());
       this.k = uob;
       uob.setLayoutParams(layoutParams);
       FrameLayout uFrameLayout = new FrameLayout(this.e.get());
       this.j = uFrameLayout;
       layoutParams.gravity = 17;
       uFrameLayout.setLayoutParams(layoutParams);
       this.j.addView(this.k);
       this.setContentView(this.j);
    }
    public void a(String p0){
       String str = "openSDK_LOG.TDialog";
       String str1 = "--onConsoleMessage--";
       try{
          SLog.d(str, str1);
          this.a.a(this.k, p0);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public final void b(){
       boolean b = false;
       this.k.setVerticalScrollBarEnabled(b);
       this.k.setHorizontalScrollBarEnabled(b);
       this.k.setWebViewClient(new TDialog$FbWebViewClient(this, null));
       this.k.setWebChromeClient(this.b);
       this.k.clearFormData();
       WebSettings settings = this.k.getSettings();
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
       TDialog te = this.e;
       if (te != null && te.get() != null) {
          settings.setDatabaseEnabled(b1);
          settings.setDatabasePath(this.e.get().getApplicationContext().getDir("databases", b).getPath());
       }
       settings.setDomStorageEnabled(b1);
       this.a.a(new TDialog$JsListener(this, null), "sdk_js_if");
       this.k.loadUrl(this.g);
       this.k.setLayoutParams(TDialog.c);
       this.k.setVisibility(4);
       return;
    }
    public void onBackPressed(){
       TDialog th = this.h;
       if (th != null) {
          th.onCancel();
       }
       super.onBackPressed();
       return;
    }
    public void onCreate(Bundle p0){
       this.requestWindowFeature(1);
       super.onCreate(p0);
       this.a();
       new Handler(Looper.getMainLooper()).post(new TDialog$1(this));
       this.b();
    }
}
