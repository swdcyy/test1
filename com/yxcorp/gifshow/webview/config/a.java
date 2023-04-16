package com.yxcorp.gifshow.webview.config.a;
import com.kuaishou.webkit.WebChromeClient;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.webview.config.d;
import com.yxcorp.gifshow.webview.config.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.webkit.ValueCallback;
import android.net.Uri;
import n3d.a;
import com.kwai.robust.PatchProxyResult;
import yxc.b;
import java.lang.Boolean;
import java.lang.StringBuilder;
import yz7.r;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import java.util.regex.Pattern;
import android.app.Activity;
import brd.t;
import com.yxcorp.gifshow.util.PermissionUtils;
import yxc.c;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.webview.config.a$b;
import java.lang.Throwable;
import com.kwai.middleware.azeroth.Azeroth2;
import android.content.Context;
import android.content.ContentResolver;
import android.os.ParcelFileDescriptor;
import java.io.File;
import android.content.pm.ApplicationInfo;
import android.content.Intent;
import com.yxcorp.gifshow.webview.config.a$a;
import android.content.ActivityNotFoundException;
import com.kuaishou.webkit.WebView;
import com.kuaishou.webkit.JsResult;
import android.widget.AbsoluteLayout;
import android.content.MutableContextWrapper;
import e3a.a;
import k2b.u1;
import java.lang.Integer;
import com.yxcorp.gifshow.webview.view.KwaiWebView;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.IllegalArgumentException;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kuaishou.webkit.WebChromeClient$FileChooserParams;
import android.text.TextUtils;

public class a extends WebChromeClient	// class@001740
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final GifshowActivity e;
    public static a$b f;

    static {
       if (PatchProxy.applyVoid(null, null, a.class, "1")) {
       }else if(PatchProxy.applyVoid(null, null, d.class, "1")){
          a.f = new c();
       }
    }
    public void a(GifshowActivity p0){
       super();
       this.a = 4;
       this.b = 5;
       this.c = 6;
       this.d = 0x200000;
       this.e = p0;
    }
    public static void d(a p0,ValueCallback p1,ValueCallback p2,Uri p3){
       p0.h(p1, p2, p3);
    }
    public final a e(ValueCallback p0,ValueCallback p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b(this, p0, p1);
    }
    public final void f(String p0,boolean p1,ValueCallback p2,ValueCallback p3){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), p2, p3, this, a.class, "5")) {
          return;
       }
       r.h("KwaiWebChromeClient", "doShowFileChooser, accept:"+p0+", cameraOnly:"+p1);
       p0 = TextUtils.L(p0);
       if (p1 && Pattern.matches("video/.*", p0)) {
          r.h("KwaiWebChromeClient", "doShowFileChooser, openVideoActivity");
          if (!PatchProxy.applyVoidTwoRefs(p2, p3, this, uoa, "11")) {
             String[] stringArray = new String[]{"android.permission.CAMERA","android.permission.RECORD_AUDIO"};
             PermissionUtils.j(this.e, stringArray).subscribe(new c(this, p2, p3));
          }
          return;
       }else if(Pattern.matches("image/.*", p0) && a.f != null){
          if (p1) {
             r.h("KwaiWebChromeClient", "doShowFileChooser, openCamera");
             a.f.b(this.e, 4, this.e(p2, p3));
          }else {
             r.h("KwaiWebChromeClient", "doShowFileChooser, openChooseImage");
             a.f.a(this.e, 4, this.e(p2, p3));
          }
          return;
       }else {
          r.h("KwaiWebChromeClient", "doShowFileChooser, openSystemChooser");
          this.i(p2, p3, p0);
          return;
       }
    }
    public final boolean g(Uri p0){
       Azeroth2 obj = PatchProxy.applyOneRefs(p0, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = Azeroth2.B;
       String canonicalPat = new File("/proc/self/fd/"+obj.d().getContentResolver().openFileDescriptor(p0, "r").getFd()).getCanonicalPath();
       ApplicationInfo dataDir = obj.d().getApplicationInfo().dataDir;
       boolean b = (canonicalPat.startsWith(dataDir) || canonicalPat.startsWith(new File(dataDir).getCanonicalPath()))? true: false;
       return b;
    }
    public final void h(ValueCallback p0,ValueCallback p1,Uri p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "13")) {
          return;
       }
       Uri[] uriArray = null;
       if (p2 != null) {
          uriArray = new Uri[]{p2};
       }
       if (p0 != null) {
          p0.onReceiveValue(uriArray);
       }else {
          p1.onReceiveValue(p2);
       }
       return;
    }
    public final void i(ValueCallback p0,ValueCallback p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "8")) {
          return;
       }
       Intent intent = new Intent("android.intent.action.GET_CONTENT");
       intent.setType(p2);
       p2 = "android.intent.category.OPENABLE";
       try{
          intent.addCategory(p2);
          this.e.t1(Intent.createChooser(intent, ""), 5, new a$a(this, p0, p1));
       }catch(android.content.ActivityNotFoundException e7){
          e7.printStackTrace();
       }
       return;
    }
    public boolean onJsAlert(WebView p0,String p1,String p2,JsResult p3){
       Context obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = (p0.getContext() instanceof MutableContextWrapper)? p0.getContext().getBaseContext(): p0.getContext();
       Activity uActivity = a.b(obj);
       if (uActivity == null || uActivity.isFinishing()) {
          u1.Q("JsAlert", "url ="+p1+", message ="+p2);
          p3.cancel();
          return true;
       }else {
          return super.onJsAlert(p0, p1, p2, p3);
       }
    }
    public void onProgressChanged(WebView p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2")) {
          return;
       }
       super.onProgressChanged(p0, p1);
       if (this.e.isFinishing()) {
          return;
       }
       if (p0 instanceof KwaiWebView) {
          p0.setProgress(p1);
       }else if(p0 instanceof YodaBaseWebView){
          p0.setProgress(p1);
          ExceptionHandler.handleCaughtException(new IllegalArgumentException("YodaWebView mismatch with KwaiWebChromeClient!"));
       }
       return;
    }
    public boolean onShowFileChooser(WebView p0,ValueCallback p1,WebChromeClient$FileChooserParams p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "4");
       if (p0 != patchProxyRe) {
          return p0.booleanValue();
       }
       String[] acceptTypes = p2.getAcceptTypes();
       object oobject = PatchProxy.applyOneRefs(acceptTypes, this, a.class, "7");
       if (oobject != patchProxyRe) {
       }else if(acceptTypes == null || !acceptTypes.length){
          int len = acceptTypes.length;
          int i = 0;
          while (true) {
             if (i < len) {
                object oobject1 = acceptTypes[i];
                if (!TextUtils.isEmpty(oobject1)) {
                   oobject = oobject1;
                   break ;
                }else {
                   i = i + 1;
                }
             }
          }
       }
       oobject = "*/*";
       this.f(oobject, p2.isCaptureEnabled(), p1, null);
       return true;
    }
    public void openFileChooser(ValueCallback p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "3")) {
          return;
       }
       this.f(p1, TextUtils.equals("camera", p2), null, p0);
       return;
    }
}
