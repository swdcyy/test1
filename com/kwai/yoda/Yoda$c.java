package com.kwai.yoda.Yoda$c;
import my7.g;
import com.kwai.yoda.Yoda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.yoda.session.logger.webviewload.SdkInitInfo;
import java.lang.System;
import java.lang.Long;
import java.lang.Boolean;
import gy7.n;
import com.kwai.robust.PatchProxyResult;
import com.kwai.middleware.azeroth.Azeroth2;
import o97.a;
import o97.a$a;
import tx7.a;
import java.lang.StringBuilder;
import yz7.r;
import java.util.concurrent.CopyOnWriteArraySet;
import com.kuaishou.webkit.extension.KsWebExtensionStatics;
import kotlin.jvm.internal.a;
import uz7.a;
import java.util.Objects;
import com.kwai.yoda.store.sp.YodaSharedPreferences;
import xb7.a;
import com.kuaishou.webkit.extension.KsWebView;
import java.util.concurrent.TimeUnit;
import brd.a0;
import tx7.g;
import erd.o;
import brd.z;
import tx7.h;
import tx7.i;
import erd.g;
import crd.b;

public class Yoda$c implements g	// class@001160
{
    public final Yoda a;

    public void Yoda$c(Yoda p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, Yoda$c.class, "4")) {
          return;
       }
       this.a.getInitSDKInfo().ksPreloadCore = Long.valueOf(System.currentTimeMillis());
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, Yoda$c.class, "2")) {
          return;
       }
       this.a.getInitSDKInfo().ksPreloaded = Long.valueOf(System.currentTimeMillis());
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, Yoda$c.class, "3")) {
          return;
       }
       this.a.getInitSDKInfo().ksInstalled = Long.valueOf(System.currentTimeMillis());
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, Yoda$c.class, "1")) {
          return;
       }
       this.a.getInitSDKInfo().preKsPreload = Long.valueOf(System.currentTimeMillis());
       return;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Yoda$c.class, "6")) {
          return;
       }
       p0.ksPreloadCoreError = Long.valueOf(System.currentTimeMillis());
       return;
    }
    public void onCoreLoadFinished(boolean p0){
       boolean b;
       Yoda$c uoc = Yoda$c.class;
       String str = "5";
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, str)) {
          return;
       }
       this.a.getInitSDKInfo().ksPreloadedCore = Long.valueOf(System.currentTimeMillis());
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, objArray, n.class, "7");
       a uoa = null;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a uoa1 = Azeroth2.B.q();
          b = (uoa1 != null)? a$a.b(uoa1, null, "yoda_code_cache_entrance_enable", false, 1, null): false;
       }
       if (b) {
          obj = a.class;
          if (!PatchProxy.isSupport(obj) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), objArray, obj, "1")) {
             r.h("YodaCodeCache", "init\(\) called with: isKsWebView = "+p0);
             a.d = true;
             if (!p0) {
                r.h("YodaCodeCache", "init\(\) is not ks webview");
                a.g.clear();
             }else {
                String b1 = a.b;
                b1 = (b1 == null || !b1.length())? 1: null;
                if (!b1) {
                   r.h("YodaCodeCache", "init\(\) has inited");
                }else {
                   b1 = KsWebExtensionStatics.getV8CachedDataVersionTag();
                   if (b1 == null || !b1.length()) {
                      uoa = 1;
                   }
                   if (uoa) {
                      r.h("YodaCodeCache", "init\(\) codeCacheTag is null or empty");
                      a.g.clear();
                   }else {
                      r.h("YodaCodeCache", "init\(\) called with: codeCacheTag = "+b1);
                      Yoda yoda = Yoda.get();
                      a.h(yoda, "Yoda.get\(\)");
                      obj = yoda.getYodaStorage();
                      Objects.requireNonNull(obj);
                      if (!PatchProxy.applyVoidOneRefs(b1, obj, a.class, str)) {
                         String str1 = "codeCacheTag";
                         a.q(b1, str1);
                         obj = obj.a;
                         Objects.requireNonNull(obj);
                         if (!PatchProxy.applyVoidOneRefs(b1, obj, YodaSharedPreferences.class, "7")) {
                            a.q(b1, str1);
                            a.d(obj.a(), "code_cache_tag", b1, false, 4, null);
                         }
                      }
                      a.b = b1;
                      a.c = KsWebView.isCompileJsAndGenCodeCacheSupported();
                      if (!a.c) {
                         r.h("YodaCodeCache", "init\(\) not support code cache by WebView core");
                         a.g.clear();
                      }else {
                         a0.Y(n.a(), TimeUnit.SECONDS).C(g.b).T(a.a).R(h.b, i.b);
                      }
                   }
                }
             }
          }
       }else {
          r.h("YodaCodeCache", "onCoreLoadFinished: entrance is closed");
       }
       return;
    }
}
