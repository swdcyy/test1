package com.kuaishou.gifshow.kswebview.KsWebViewInitModule$c;
import com.kuaishou.webkit.extension.KwSdk$CoreInitCallback;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.gifshow.kswebview.KsWebViewInitModule;
import com.kuaishou.gifshow.kswebview.KsWebViewInitModule$b;
import com.kuaishou.gifshow.kswebview.KsWebViewInitModule$a;
import qrd.l1;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.gifshow.kswebview.KsWebViewSwitches;
import p80.v;
import java.lang.Boolean;
import com.kuaishou.webkit.extension.KwSdk;
import kotlin.jvm.internal.a;
import com.kuaishou.gifshow.kswebview.KsWebViewInitModule$c$a;
import com.kuaishou.webkit.extension.KsWebViewPageLoadListener;
import com.kuaishou.webkit.extension.KsWebExtensionStatics;
import p80.u;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;
import kotlin.jvm.internal.Ref$IntRef;
import p80.w;
import com.kuaishou.webkit.extension.KwSdk$LoadError;
import fg6.a;
import p80.s;
import nsd.u;
import com.google.gson.Gson;
import k2b.u1;
import com.yxcorp.utility.AbiUtil$Abi;
import com.yxcorp.utility.AbiUtil;
import java.util.Objects;
import com.kwai.sdk.switchconfig.a;
import p80.y;
import zsd.u;
import p80.t;
import com.kwai.framework.init.c;
import com.kuaishou.webkit.extension.KsCoreInitSettings;
import java.lang.Number;
import java.lang.Double;
import java.lang.reflect.Type;
import java.lang.Math;
import p80.e$a;
import p80.e;
import com.kuaishou.webkit.extension.media.KsMediaPlayerFactory;
import java.lang.CharSequence;
import o56.c;
import o56.a;
import t80.a;
import xf6.l;

public final class KsWebViewInitModule$c implements KwSdk$CoreInitCallback	// class@0019d7
{

    public void KsWebViewInitModule$c(){
       super();
    }
    public void onCoreLoadFailed(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KsWebViewInitModule$c.class, "3")) {
          return;
       }
       KsWebViewInitModule$b y = KsWebViewInitModule.y;
       String str = (p1 != null)? p1: "Unknown Error";
       y.e(str);
       KsWebViewInitModule$a a = KsWebViewInitModule.A;
       Object obj = a.c();
       _monitor_enter(obj);
       a.g(true);
       KwSdk$CoreInitCallback uCoreInitCal = a.b();
       a.h(null);
       _monitor_exit(obj);
       if (uCoreInitCal != null) {
          uCoreInitCal.onCoreLoadFailed(p0, p1);
       }
       Log.g("KsWebView", "kswebview loaded error "+p0+", "+p1);
       return;
    }
    public void onCoreLoadFinished(boolean p0){
       KsWebViewInitModule$a a;
       KsWebViewSwitches c;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KsWebViewSwitches ksWebViewSwi = KsWebViewSwitches.class;
       KsWebViewInitModule$c uoc = KsWebViewInitModule$c.class;
       v ov = v.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "2")) {
          return;
       }
       KsWebViewInitModule.y.onCoreLoadFinished(p0);
       Log.g("KsWebView", "use kswebview "+p0);
       String coreVersionN = KwSdk.getCoreVersionName();
       if (coreVersionN == null) {
          coreVersionN = "";
       }
       if (!PatchProxy.applyVoidOneRefs(coreVersionN, null, ov, "1")) {
          a.p(coreVersionN, "<set-?>");
          v.b = coreVersionN;
       }
       a = KsWebViewInitModule.A;
       String obj = a.c();
       _monitor_enter(obj);
       a.i(p0);
       a.g(true);
       KwSdk$CoreInitCallback uCoreInitCal = a.b();
       a.h(null);
       _monitor_exit(obj);
       if (uCoreInitCal != null) {
          uCoreInitCal.onCoreLoadFinished(p0);
       }
       v.i();
       KsWebExtensionStatics.addPageLoadListener(new KsWebViewInitModule$c$a());
       if (!PatchProxy.applyVoid(null, null, ov, "14")) {
          c.k(u.b);
       }
       if (p0) {
          coreVersionN = v.c();
          if (!PatchProxy.applyVoid(null, null, ov, "15")) {
             Ref$IntRef intRef = new Ref$IntRef();
             intRef.element = KsWebViewSwitches.c.b();
             Log.b("KsWebView", "kswebview httpdns policy: "+intRef.element);
             if (intRef.element > null) {
                c.k(new w(intRef));
             }
          }
       }else {
          coreVersionN = "0.0.0."+KwSdk.getLoadError().getValue();
       }
       String str = coreVersionN;
       if (!PatchProxy.applyVoidOneRefs(str, null, ov, "7")) {
          a.p(str, "coreVersion_");
          s os = new s(null, null, str, null, 11, null);
          obj = a.a.q(v13);
          u1.Q("kswebview_event_core_loaded", obj);
          Log.b("KsWebView", "kswebview_event_core_loaded"+": "+obj);
       }
       if (PatchProxy.isSupport(ov) && (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, ov, "20") && (p0 && AbiUtil.a() == AbiUtil$Abi.ARMEABI_V7A))) {
          c = KsWebViewSwitches.c;
          Objects.requireNonNull(c);
          Object obj2 = PatchProxy.apply(null, c, ksWebViewSwi, "9");
          boolean b1 = (obj2 != patchProxyRe)? obj2.booleanValue(): a.t().d("switchKsWebViewUnmapReservedMem", false);
          if (b1) {
             c.k(y.b);
          }
       }
    label_0164 :
       if (!PatchProxy.isSupport(ov) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, ov, "23")) {
          c = KsWebViewSwitches.c;
          Objects.requireNonNull(c);
          String obj1 = PatchProxy.apply(null, c, ksWebViewSwi, "12");
          boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): a.t().d("switchKsWebViewClearCache", false);
          obj1 = KwSdk.getCoreVersionName();
          Log.g("KsWebView", "switchKsWebViewClearCache "+b+", useKsWebView:"+p0+", core version:"+obj1);
          if (b && p0) {
             a.o(obj1, "coreVersionName");
             if (u.q2(obj1, "1.8.90", false, 2, null)) {
                c.a(t.b, 0xea60);
             }
          }
       }
    label_01d9 :
       return;
    }
    public void onPreLoadCore(KsCoreInitSettings p0){
       boolean b6;
       String str3;
       String str4;
       KsWebViewInitModule$a a;
       Object obj = p0;
       KsWebViewSwitches ksWebViewSwi = KsWebViewSwitches.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(obj, this, KsWebViewInitModule$c.class, "1")) {
          return;
       }
       KsWebViewInitModule.y.a();
       if (obj == null) {
          return;
       }
       KsWebViewSwitches c = KsWebViewSwitches.c;
       boolean b = c.d();
       boolean b1 = c.e();
       Objects.requireNonNull(c);
       Object[] objArray = null;
       Object obj1 = PatchProxy.apply(objArray, c, ksWebViewSwi, "7");
       boolean b2 = false;
       boolean b3 = (obj1 != patchProxyRe)? obj1.booleanValue(): a.t().d("switchKsWebViewSoLoadFailover", b2);
       Objects.requireNonNull(c);
       Object obj2 = PatchProxy.apply(objArray, c, ksWebViewSwi, "6");
       int i = (obj2 != patchProxyRe)? obj2.intValue(): a.t().a("switchKsWebViewDeviceMode", b2);
       int i1 = c.a();
       String str = c.f();
       Objects.requireNonNull(c);
       String str1 = PatchProxy.apply(objArray, c, ksWebViewSwi, "11");
       if (str1 != patchProxyRe) {
       }else {
          str1 = a.t().c("switchKsWebViewLastVersionSupported", "");
          a.o(str1, "SwitchConfigManager.getI¡­ST_VERSION_SUPPORTED, \"\"\)");
       }
       Objects.requireNonNull(c);
       Object obj3 = PatchProxy.apply(objArray, c, ksWebViewSwi, "13");
       boolean b4 = (obj3 != patchProxyRe)? obj3.booleanValue(): a.t().d("switchKsWebViewEnableReportInitStack", b2);
       Objects.requireNonNull(c);
       Object obj4 = PatchProxy.apply(objArray, c, ksWebViewSwi, "14");
       int i2 = (obj4 != patchProxyRe)? obj4.intValue(): a.t().a("switchKsWebViewUserAgentPolicy", -1);
       Objects.requireNonNull(c);
       e$a obj5 = PatchProxy.apply(null, c, ksWebViewSwi, "16");
       if (obj5 == patchProxyRe) {
          obj5 = a.t().getValue("switchKsWebViewCommonSamplingRatio", Double.TYPE, Double.valueOf(0));
          a.o(obj5, "SwitchConfigManager.getI¡­ Double::class.java, 0.0\)");
       }
       double d = obj5.doubleValue();
       int b5 = (Math.random() - d < 0)? true: false;
       obj.useSystemWebView((b ^ 0x01));
       obj.setAsyncCompositingMode(i1);
       p0.disableHiddenApiUnseal();
       obj.setCommonSamplingRatio(d);
       obj.setCommonSamplingFlag(b5);
       if (b1) {
          obj5 = e.a();
          if (obj5 == null) {
             b6 = b5;
             Log.d("KsWebView", "Failed to fetch KsWebViewExtensionProvider");
          }else {
             b6 = b5;
          }
          if (obj5 != null) {
             obj.setKsMediaPlayerModeAndFactory(1, obj5.a(), 1);
          }
       }else {
          b6 = b5;
       }
       if (b3) {
          p0.checkSoLoadFailedMultiTimes();
       }
       obj.setDeviceMode(i);
       int i3 = (str == null || !str.length())? 1: 0;
       if (!i3) {
          obj.setOptimizePolicy(str);
       }
       c uoc = (str1 == null || !str1.length())? 1: null;
       if (!uoc) {
          obj.setLastVersionSupported(str1);
       }
       if (b4) {
          p0.enableReportInitStack();
       }
       if (i2 >= 0) {
          obj.setUserAgentPolicy(i2);
       }
       uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       if (uoc.c()) {
          if (a.a("KEY_ENABLE_SHOW_FPS_MEMORY_DEBUG")) {
             p0.enableShowFps();
          }
          if (a.a("KEY_ENABLE_SHOW_UPDATE_AREA_DEBUG")) {
             p0.enableShowChangedRests();
          }
          b5 = 2;
          if (a.a("KEY_ENABLE_DEV_MODE")) {
             obj.setDevMode(b5);
          }
          i3 = a.b("KEY_LOAD_KSWEBVIEW_MODE_LIST");
          String str2 = 1;
          if (i3 != str2) {
             if (i3 == b5) {
                obj.useSystemWebView(str2);
             }
             str3 = null;
          }else {
             str3 = false;
             obj.useSystemWebView(str3);
          }
          int i4 = a.b("KEY_LOAD_KSWEBVIEW_MODE_LIST");
          e$a uoa = e.a();
          if (i4 != str2) {
             if (i4 == b5 && uoa != null) {
                obj.setKsMediaPlayerModeAndFactory(str3, uoa.a(), str2);
             }
          }else if(uoa != null){
             obj.setKsMediaPlayerModeAndFactory(str2, uoa.a(), str2);
          }
          i3 = a.b("KEY_PROCESS_MODE_LIST");
          a uoa1 = 3;
          if (i3 != str2) {
             if (i3 != b5) {
                if (i3 != uoa1) {
                   str4 = 4;
                   if (i3 == str4) {
                      obj.setAsyncCompositingMode(str4);
                   }
                }else {
                   obj.setAsyncCompositingMode(str2);
                }
             }else {
                obj.setAsyncCompositingMode(uoa1);
             }
             str3 = null;
          }else {
             i3 = 0;
             obj.setAsyncCompositingMode(i3);
          }
          b5 = a.b("KEY_DEVICE_MODE_LIST");
          if (b5 != str2) {
             str2 = 2;
             if (b5 != str2) {
                if (b5 == uoa1) {
                   obj.setDeviceMode(str3);
                }
             }else {
                obj.setDeviceMode(str2);
             }
             str4 = 1;
          }else {
             obj.setDeviceMode(1);
          }
          str3 = PatchProxy.applyOneRefs("KEY_OPTIMIZE_POLECY", null, a.class, "3");
          if (str3 != patchProxyRe) {
          }else {
             str3 = l.g("KEY_OPTIMIZE_POLECY", "");
          }
          int i5 = (str3 == null || !str3.length())? 1: 0;
          if (!i5) {
             obj.setOptimizePolicy(str3);
          }
       }else {
          p0.ignoreDataDirLockFailure();
       }
       a = KsWebViewInitModule.A;
       Object obj6 = a.c();
       _monitor_enter(obj6);
       KwSdk$CoreInitCallback uCoreInitCal = a.b();
       _monitor_exit(obj6);
       if (uCoreInitCal != null) {
          uCoreInitCal.onPreLoadCore(obj);
       }
       Log.g("KsWebView", "kswebview preload enableKSWebView "+b+", "+"asyncCompositingMode "+i1+", "+"enableSingleLayerRender "+b1+", "+"isSoLoadFailover "+b3+", "+"deviceMode "+i+", "+"uaPolicy "+i2+", "+"reportStack "+b4+", "+"policyBits "+str+", "+"commonSamplingRatio "+d+", "+"commonSamplingFlag "+b6);
       return;
    }
    public String toString(){
       return "Main Process CoreInitCallback";
    }
}
