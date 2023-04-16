package com.alipay.sdk.app.H5PayActivity;
import android.app.Activity;
import com.alipay.sdk.app.PayTask;
import java.lang.Object;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.content.Intent;
import java.lang.ref.WeakReference;
import com.alipay.sdk.m.q.b;
import s6.a;
import j6.c;
import java.lang.StringBuilder;
import java.lang.String;
import k6.a;
import org.json.JSONObject;
import j6.c$a;
import android.os.Bundle;
import java.util.Set;
import java.util.Iterator;
import com.alipay.sdk.m.s.c;
import j6.b;
import android.content.res.Configuration;
import android.view.Window;
import java.lang.Throwable;
import u6.c;
import s6.a$a;
import m6.a;
import java.util.regex.Pattern;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import com.alipay.sdk.m.s.d;
import android.view.View;
import android.widget.TextView;
import com.alipay.sdk.m.s.e;
import android.text.TextUtils;
import android.content.Context;
import com.kuaishou.webkit.CookieSyncManager;
import com.kuaishou.webkit.CookieManager;

public class H5PayActivity extends Activity	// class@000e8f
{
    public c b;
    public String c;
    public String d;
    public String e;
    public String f;
    public boolean g;
    public String h;
    public WeakReference i;

    public void H5PayActivity(){
       super();
    }
    public void a(){
       Object h = PayTask.h;
       _monitor_enter(h);
       try{
          h.notify();
          _monitor_exit(e0);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void finish(){
       this.a();
       super.finish();
    }
    public Resources getResources(){
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       boolean b;
       super.onActivityResult(p0, p1, p2);
       int i = 1010;
       if (p0 == i) {
          a uoa = b.b(this.i);
          b = false;
          if (p0 == i && p2 != null) {
             c$a a = c.a;
             if (a != null) {
                c$a uoa1 = null;
                c.a = uoa1;
                if (p1 != -1) {
                   if (p1) {
                      a.h(uoa, "biz", "TbUnknown", p1);
                   }else {
                      a.c(uoa, "biz", "TbCancel", p2.toUri(1));
                      a.a(b, uoa1, "CANCELED");
                   }
                }else {
                   a.c(uoa, "biz", "TbOk", p2.toUri(1));
                   JSONObject jSONObject = new JSONObject();
                   Bundle extras = p2.getExtras();
                   if (extras != null) {
                      Iterator iterator = extras.keySet().iterator();
                      while (iterator.hasNext()) {
                         String str = iterator.next();
                         jSONObject.put(str, String.valueOf(extras.get(str)));
                      }
                   }
                   a.a(1, jSONObject, "OK");
                }
             }
          }
       }
       return;
    }
    public void onBackPressed(){
       H5PayActivity tb = this.b;
       if (tb == null) {
          this.finish();
          return;
       }else if(tb.l()){
          tb.m();
       }else if(!tb.m()){
          super.onBackPressed();
       }
       b.c(b.a());
       this.finish();
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       super.onConfigurationChanged(p0);
    }
    public void onCreate(Bundle p0){
       int i = 1;
       super.requestWindowFeature(i);
       this.getWindow().addFlags(8192);
       try{
          super.onCreate(p0);
          a uoa = a$a.a(this.getIntent());
          if (uoa == null) {
             this.finish();
             return;
          }else {
             this.i = new WeakReference(uoa);
             if (!a.A().w()) {
                this.setRequestedOrientation(i);
             }else {
                this.setRequestedOrientation(3);
             }
             try{
                Bundle extras = this.getIntent().getExtras();
                String str = null;
                String str1 = extras.getString("url", str);
                this.c = str1;
                if (!Pattern.compile("^http\(s\)?://\([a-z0-9_\\-]+\\.\)*\(alipaydev|alipay|taobao\)\\.\(com|net\)\(:\\d+\)?\(/.*\)?$").matcher(str1).matches()) {
                   this.finish();
                   return;
                }else {
                   this.e = extras.getString("cookie", str);
                   this.d = extras.getString("method", str);
                   this.f = extras.getString("title", str);
                   this.h = extras.getString("version", "v1");
                   this.g = extras.getBoolean("backisexit", false);
                   d uod = new d(this, uoa, this.h);
                   this.setContentView(uod);
                   _monitor_enter(uod);
                   uod.e = this.d;
                   uod.i.getTitle().setText(this.f);
                   uod.d = this.g;
                   _monitor_exit(uod);
                   H5PayActivity tc = this.c;
                   H5PayActivity te = this.e;
                   if (!TextUtils.isEmpty(te)) {
                      CookieSyncManager.createInstance(uod.b.getApplicationContext()).sync();
                      CookieManager.getInstance().setCookie(tc, te);
                      CookieSyncManager.getInstance().sync();
                   }
                   uod.k(this.c);
                   this.b = uod;
                   return;
                }
             }catch(java.lang.Exception e0){
                this.finish();
                return;
             }
          }
       }catch(java.lang.Exception e0){
          this.finish();
          return;
       }
    }
    public void onDestroy(){
       super.onDestroy();
       H5PayActivity tb = this.b;
       if (tb != null) {
          tb.n();
       }
       return;
    }
    public void setRequestedOrientation(int p0){
       super.setRequestedOrientation(p0);
       return;
    }
}
