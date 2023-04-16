package com.kuaishou.gifshow.kswebview.KsWebViewInitModule;
import com.kwai.framework.init.a;
import com.kuaishou.gifshow.kswebview.KsWebViewInitModule$a;
import nsd.u;
import java.lang.Object;
import java.util.ArrayList;
import com.kuaishou.gifshow.kswebview.KsWebViewInitModule$b;
import com.kuaishou.gifshow.kswebview.KsWebViewInitModule$c;
import com.kuaishou.webkit.extension.KwSdk$CoreInitCallback;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import o56.d;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import b76.a;
import com.kuaishou.gifshow.kswebview.KsWebViewInitModule$g;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import wkd.b;
import kotlin.jvm.internal.a;
import com.kuaishou.gifshow.kswebview.CNYWebviewIntelligentPreinit;
import com.kuaishou.gifshow.kswebview.CNYWebviewIntelligentPreinit$CNYWebviewLoadRuleModel;
import com.kuaishou.gifshow.kswebview.KsWebViewInitModule$h;
import com.kuaishou.gifshow.kswebview.KsWebViewInitModule$i;
import com.kuaishou.gifshow.kswebview.KsWebViewInitModule$j;
import com.kuaishou.gifshow.kswebview.KsWebViewInitModule$execute$1;
import msd.l;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import com.kuaishou.gifshow.kswebview.KsWebViewInitModule$d;
import erd.g;
import crd.b;
import eda.l;
import com.kuaishou.gifshow.kswebview.KsWebViewInitModule$e;
import android.app.Application;
import o56.a;
import android.content.Context;
import p80.v;
import com.kuaishou.webkit.extension.KwSdk;
import com.kuaishou.gifshow.kswebview.KsWebViewInitModule$f;
import com.kuaishou.webkit.extension.KsWebViewPageLoadListener;
import com.kuaishou.webkit.extension.KsWebExtensionStatics;
import p80.c;
import zsd.d;
import java.nio.charset.Charset;
import com.kuaishou.gifshow.kswebview.PlaceholderWebView;
import java.lang.Exception;
import o56.c;
import java.lang.CharSequence;
import e17.i;
import java.lang.IllegalStateException;
import com.kuaishou.gifshow.kswebview.KsWebViewInstaller2;
import com.kuaishou.gifshow.kswebview.KsWebViewInstaller2$a;
import p80.j;
import qrd.l1;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import com.kwai.plugin.dva.work.c;
import p80.k;
import com.kwai.plugin.dva.work.c$c;

public class KsWebViewInitModule extends a	// class@0019e1
{
    public boolean q;
    public static final KsWebViewInitModule$a A;
    public static boolean r;
    public static boolean s;
    public static boolean t;
    public static long u;
    public static Object v;
    public static KwSdk$CoreInitCallback w;
    public static final ArrayList x;
    public static final KsWebViewInitModule$b y;
    public static final KwSdk$CoreInitCallback z;

    static {
       KsWebViewInitModule.A = new KsWebViewInitModule$a(null);
       KsWebViewInitModule.v = new Object();
       KsWebViewInitModule.x = new ArrayList();
       KsWebViewInitModule.y = new KsWebViewInitModule$b();
       KsWebViewInitModule.z = new KsWebViewInitModule$c();
    }
    public void KsWebViewInitModule(){
       super();
    }
    public static final KwSdk$CoreInitCallback getCoreInitCallback(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       KsWebViewInitModule$a obj = PatchProxy.apply(objArray, objArray, KsWebViewInitModule.class, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = KsWebViewInitModule.A;
       Objects.requireNonNull(obj);
       Object[] objArray1 = PatchProxy.apply(objArray, obj, KsWebViewInitModule$a.class, "2");
       if (objArray1 != patchProxyRe) {
       }else if(d.i){
          objArray = obj.d();
       }
       Log.g("KsWebView", "getCoreInitCallback by reflection "+objArray);
       objArray1 = objArray;
       return objArray1;
    }
    public static final void initKwSdkOnMainProcess(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, KsWebViewInitModule.class, "10")) {
          return;
       }
       KsWebViewInitModule$a a = KsWebViewInitModule.A;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoid(objArray, a, KsWebViewInitModule$a.class, "7")) {
          Log.g("KsWebView", "initKwSdkOnMainProcess in KwSdk reflection");
          a.f();
       }
       return;
    }
    public int f0(){
       return 20;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsWebViewInitModule.class, "6")) {
          return;
       }
       e.g(KsWebViewInitModule$g.b, "webviewkswitch");
       if (d.i) {
          Log.g("KsWebView", "initKwSdkOnMainProcess in onLaunchFinish");
          KsWebViewInitModule.A.f();
       }
       if (d.i) {
          int i = -1436040059;
          Object obj = b.a(i);
          a.o(obj, "Singleton.get\(CNYWebview¡­igentPreinit::class.java\)");
          if (obj.d().mLoadRule == 4) {
             this.n0("onlaunchfinish");
          }else {
             obj = b.a(i);
             a.o(obj, "Singleton.get\(CNYWebview¡­igentPreinit::class.java\)");
             if (obj.d().mLoadRule == 5) {
                e.i(new KsWebViewInitModule$h(this), "preinitwebview", 0x4e20);
             }else {
                i = b.a(i);
                a.o(i, "Singleton.get\(CNYWebview¡­igentPreinit::class.java\)");
                if (i.d().mLoadRule == 6) {
                   e.g(new KsWebViewInitModule$i(this), "webviewpreinit");
                }
             }
          }
          e.g(KsWebViewInitModule$j.b, "KsWebViewInitModule");
       }
       return;
    }
    public final void l0(){
       if (PatchProxy.applyVoid(null, this, KsWebViewInitModule.class, "4")) {
          return;
       }
       b.a(-1436040059).e();
       return;
    }
    public void n(){
       Application obj;
       if (PatchProxy.applyVoid(null, this, KsWebViewInitModule.class, "5")) {
          return;
       }
       int i = -1436040059;
       if (d.i) {
          b.a(i).c(new KsWebViewInitModule$execute$1(this));
          RxBus f = RxBus.f;
          RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
          f.g(n.class, mAIN).subscribe(new KsWebViewInitModule$d(this));
          f.g(l.class, mAIN).subscribe(new KsWebViewInitModule$e(this));
       }
       if (d.i) {
          KsWebViewInitModule.A.f();
          obj = b.a(i);
          a.o(obj, "Singleton.get\(CNYWebview¡­igentPreinit::class.java\)");
          if (obj.d().mLoadRule == 1) {
             this.n0("execute");
          }
       }else {
          obj = a.b();
          a.o(obj, "AppEnv.getAppContext\(\)");
          if (v.d(obj)) {
             KsWebViewInitModule.A.a(false);
             v.i();
             KwSdk.onChildApplicationCreated();
             KsWebExtensionStatics.addPageLoadListener(new KsWebViewInitModule$f());
          }
       }
       return;
    }
    public final void n0(String p0){
       c a;
       KsWebViewInitModule$b y;
       String str2;
       if (PatchProxy.applyVoidOneRefs(p0, this, KsWebViewInitModule.class, "7")) {
          return;
       }
       a.p(p0, "tag");
       a = c.a;
       Objects.requireNonNull(a);
       String str = "KsWebView";
       boolean b = true;
       if (!PatchProxy.applyVoid(null, a, c.class, "1")) {
          String str1 = new String(new byte[22]{'a','n','d','r','o','i','d','.','w','e','b','k','i','t','.','W','e','b','V','i','e','w'}, d.a);
          try{
             y = 0;
             if (Class.forName(str1).isAssignableFrom(PlaceholderWebView.class)) {
                str2 = 1;
             }
          }catch(java.lang.Exception e3){
             Log.d(str, e3.toString());
          }
          if (y) {
             str2 = "Not replace system WebView yet";
             Log.d(str, str2);
             c uoc = a.a();
             a.o(uoc, "AppEnv.get\(\)");
             if (uoc.c()) {
                i.d(R.style.arg_RES_7f11066a, str2);
             }else {
                throw new IllegalStateException(str2);
             }
          }
       }
       if (this.q == null) {
          this.q = b;
          y = KsWebViewInitModule.y;
          y.d();
          KwSdk.preload(p0);
          y.b();
          KsWebViewInstaller2 ksWebViewIns = KsWebViewInstaller2.c.a();
          Objects.requireNonNull(ksWebViewIns);
          KsWebViewInstaller2 ksWebViewIns1 = KsWebViewInstaller2.class;
          if (!PatchProxy.applyVoid(null, ksWebViewIns, ksWebViewIns1, "2")) {
             Log.g("KsWebView", "installFromPredownload start");
             KsWebViewInstaller2 a1 = ksWebViewIns.a;
             _monitor_enter(a1);
             if (ksWebViewIns.a.c()) {
                Log.b("KsWebView", "installFromPredownload: already started");
                _monitor_exit(a1);
             }else {
                _monitor_exit(a1);
                if (!PatchProxy.applyVoid(null, ksWebViewIns, ksWebViewIns1, "3")) {
                   Log.g("KsWebView", "downloadDvaPlugin");
                   Dva uDva = Dva.instance();
                   a.o(uDva, "Dva.instance\(\)");
                   uDva.getPluginInstallManager().x("kswebview_so_group").a(new k(ksWebViewIns));
                }
             }
          }
          y.c();
       }
       return;
    }
}
