package com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import android.content.Context;
import com.kwai.yoda.model.LaunchModel;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import java.lang.String;
import com.kwai.yoda.model.LaunchModelInternal;
import com.kwai.robust.PatchProxyResult;
import com.kwai.robust.PatchProxy;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.gifshow.webview.yoda.utils.q;
import android.net.Uri;
import ekd.x0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import of6.e;
import com.kuaishou.webkit.URLUtil;
import wkd.b;
import nf6.i;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.lang.System;
import com.yxcorp.gifshow.webview.e;
import com.yxcorp.gifshow.webview.c;
import yxc.g;
import java.util.List;
import java.util.Iterator;
import yxc.a;
import java.lang.StringBuilder;
import yz7.r;
import ekd.j0;
import jyc.b;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Boolean;

public class KwaiYodaWebViewActivity$c	// class@0016cd
{
    public final String a;
    public final Intent b;
    public LaunchModel c;
    public String d;
    public String e;
    public Serializable f;
    public Context g;
    public String h;
    public int i;

    public void KwaiYodaWebViewActivity$c(Context p0,LaunchModel p1){
       super();
       this.g = p0;
       this.b = new Intent(p0, KwaiYodaWebViewActivity.class);
       this.a = p1.getUrl();
       this.c = p1;
    }
    public void KwaiYodaWebViewActivity$c(Context p0,Class p1,String p2){
       super();
       this.g = p0;
       this.b = new Intent(p0, p1);
       this.a = p2;
    }
    public void KwaiYodaWebViewActivity$c(Context p0,String p1){
       super(p0, KwaiYodaWebViewActivity.class, p1);
    }
    public Intent a(){
       String str = "KEY_URL";
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KwaiYodaWebViewActivity$c uoc = KwaiYodaWebViewActivity$c.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uoc, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       q.b(a.a().a());
       List obj1 = PatchProxy.apply(objArray, this, uoc, "5");
       if (obj1 != patchProxyRe) {
          objArray = obj1;
       }else {
          Uri uri = x0.f(this.a);
          String str1 = x0.a(uri, "nativeUrl");
          if (!TextUtils.x(str1) && (e.a(str1) && URLUtil.isNetworkUrl(uri.toString()))) {
             objArray = b.a(0x66dce92a).c(this.g, x0.f(str1), false, false);
          }
       }
       if (objArray != null) {
          return objArray;
       }else {
          try{
             this.b.putExtra(str, this.a);
          }catch(java.lang.Exception e0){
          }
          this.b.putExtra(e0, this.a);
          this.b.putExtra("KEY_PAGE_URI", this.d);
          this.b.putExtra("KEY_PAGE", this.i);
          this.b.putExtra("KEY_PAGE_2", this.e);
          SerializableHook.putExtra(this.b, "KEY_EXTRA", this.f);
          this.b.putExtra("KEY_LEFT_TOP_BTN_TYPE", this.h);
          this.b.putExtra("buildIntentTimestamp", System.currentTimeMillis());
          KwaiYodaWebViewActivity$c tc = this.c;
          if (tc == null) {
             e.b(this.g, this.b);
             this.b(this.b, this.a);
          }else {
             c.a(tc, this.b, this.a);
             SerializableHook.putExtra(this.b, "model", this.c);
             this.b(this.b, this.c.getUrl());
          }
          tc = this.g;
          KwaiYodaWebViewActivity$c tb = this.b;
          KwaiYodaWebViewActivity$c ta = this.a;
          if (!PatchProxy.applyVoidThreeRefs(tc, tb, ta, this, KwaiYodaWebViewActivity$c.class, "8")) {
             obj1 = g.a;
             if (obj1 != null && !obj1.isEmpty()) {
                Iterator iterator = obj1.iterator();
                do {
                } while (!iterator.hasNext() || iterator.next().a(tc, tb, ta));
             }
          }
          r.i("[SampleCache]: loadUrl: "+this.a);
          return this.b;
       }
    }
    public void b(Intent p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiYodaWebViewActivity$c.class, "7")) {
          return;
       }
       if (TextUtils.x(j0.f(p0, "KEY_THEME"))) {
          p0.putExtra("KEY_THEME", b.b(p1));
       }
       return;
    }
    public KwaiYodaWebViewActivity$c c(String p0,float p1){
       KwaiYodaWebViewActivity$c uoc = KwaiYodaWebViewActivity$c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), this, uoc, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.b.putExtra(p0, p1);
       return this;
    }
    public KwaiYodaWebViewActivity$c d(String p0,int p1){
       KwaiYodaWebViewActivity$c uoc = KwaiYodaWebViewActivity$c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.b.putExtra(p0, p1);
       return this;
    }
    public KwaiYodaWebViewActivity$c e(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KwaiYodaWebViewActivity$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.b.putExtra(p0, p1);
       return this;
    }
    public KwaiYodaWebViewActivity$c f(String p0,boolean p1){
       KwaiYodaWebViewActivity$c uoc = KwaiYodaWebViewActivity$c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.b.putExtra(p0, p1);
       return this;
    }
    public KwaiYodaWebViewActivity$c g(Serializable p0){
       this.f = p0;
       return this;
    }
    public KwaiYodaWebViewActivity$c h(LaunchModel p0){
       this.c = p0;
       return this;
    }
    public KwaiYodaWebViewActivity$c i(String p0){
       this.h = p0;
       return this;
    }
    public KwaiYodaWebViewActivity$c j(String p0){
       this.e = p0;
       return this;
    }
    public KwaiYodaWebViewActivity$c k(String p0){
       this.d = p0;
       return this;
    }
}
