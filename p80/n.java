package p80.n;
import p80.m;
import java.lang.Object;
import com.kuaishou.gifshow.kswebview.KsWebViewInitModule;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.webkit.extension.KwSdk;
import p80.e$a;
import kotlin.jvm.internal.a;
import p80.e;
import java.lang.Boolean;
import com.kuaishou.gifshow.kswebview.KsWebViewInitModule$a;
import p80.a;
import java.util.Objects;
import java.util.ArrayList;
import android.app.Application;
import android.content.Context;
import p80.v;
import com.kwai.framework.init.a;
import com.kuaishou.gifshow.kswebview.KsWebViewSwitches;
import p80.b;
import com.kuaishou.gifshow.kswebview.KsWebViewInstaller2;
import com.kuaishou.gifshow.kswebview.KsWebViewInstaller2$a;
import com.yxcorp.utility.Log;
import com.kuaishou.webkit.extension.KwSdk$CoreInitCallback;
import o56.d;
import qrd.l1;
import p80.f;

public class n implements m	// class@0028d7
{
    public final KsWebViewInitModule b;

    public void n(){
       super();
       this.b = new KsWebViewInitModule();
    }
    public String KF(){
       Object obj = PatchProxy.apply(null, this, n.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KwSdk.getInstalledVersion();
    }
    public void L4(e$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "9")) {
          return;
       }
       a.p(p0, "provider");
       e.a = p0;
       return;
    }
    public boolean N1(){
       Object obj = PatchProxy.apply(null, this, n.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return KsWebViewInitModule.A.e();
    }
    public void Nz(a p0){
       KsWebViewInitModule$a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "10")) {
          return;
       }
       String str = "listener";
       a.p(p0, str);
       a = KsWebViewInitModule.A;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidOneRefs(p0, a, KsWebViewInitModule$a.class, "3")) {
          a.p(p0, str);
          if (KsWebViewInitModule.s) {
             p0.onCoreLoadFinished(a.e());
          }
          KsWebViewInitModule.x.add(p0);
       }
       return;
    }
    public boolean UD(Application p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "application");
       return v.d(p0);
    }
    public a a(){
       return this.b;
    }
    public void d7(a p0){
       KsWebViewInitModule$a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "11")) {
          return;
       }
       String str = "listener";
       a.p(p0, str);
       a = KsWebViewInitModule.A;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidOneRefs(p0, a, KsWebViewInitModule$a.class, "4")) {
          a.p(p0, str);
          KsWebViewInitModule.x.remove(p0);
       }
       return;
    }
    public String getVersion(){
       String obj = PatchProxy.apply(null, this, n.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = KwSdk.getCoreVersionName();
       a.o(obj, "KwSdk.getCoreVersionName\(\)");
       return obj;
    }
    public boolean gj(){
       Object obj = PatchProxy.apply(null, this, n.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return KsWebViewSwitches.c.d();
    }
    public void h5(b p0,boolean p1){
       n on = n.class;
       String str = "1";
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, on, str)) {
          return;
       }
       String str1 = "callback";
       a.p(p0, str1);
       KsWebViewInstaller2 ksWebViewIns = KsWebViewInstaller2.c.a();
       Objects.requireNonNull(ksWebViewIns);
       if (!PatchProxy.isSupport(KsWebViewInstaller2.class) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), ksWebViewIns, KsWebViewInstaller2.class, str)) {
          a.p(p0, str1);
          Log.g("KsWebView", "install: start");
          ksWebViewIns.a(p0, p1);
       }
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public boolean isInstalled(){
       Object obj = PatchProxy.apply(null, this, n.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return KwSdk.isInstalled();
    }
    public boolean qX(Application p0,KwSdk$CoreInitCallback p1){
       boolean r;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n obj = PatchProxy.applyTwoRefs(p0, p1, this, n.class, "8");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "application");
       a.p(p1, "callback");
       obj = this.b;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, KsWebViewInitModule.class, "8");
       boolean b = false;
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          a.p(p0, "application");
          a.p(p1, "callback");
          if (d.i) {
             p0 = KsWebViewInitModule.v;
             _monitor_enter(p0);
             if (KsWebViewInitModule.s) {
                r = KsWebViewInitModule.r;
             }else {
                KsWebViewInitModule.w = p1;
                r = false;
                b = true;
             }
             _monitor_exit(p0);
             if (b) {
                obj.n0("mini_app_preload");
             }else {
                p1.onCoreLoadFinished(r);
             }
          }else if(KsWebViewInitModule.s || d.i){
             KwSdk.initAndPreload(p0, new f(p1));
          }
          b = true;
       }
       return b;
    }
}
