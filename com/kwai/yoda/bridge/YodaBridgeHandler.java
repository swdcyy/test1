package com.kwai.yoda.bridge.YodaBridgeHandler;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import com.kwai.yoda.bridge.YodaBridgeHandler$mBridgeHolder$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.yoda.function.system.GetDeviceInfoFunction;
import ny7.a;
import com.kwai.yoda.function.system.GetAppInfoFunction;
import com.kwai.yoda.function.system.GetNetworkTypeFunction;
import com.kwai.yoda.function.system.GetLocationFunction;
import cy7.d;
import cy7.g;
import cy7.a;
import cy7.b;
import com.kwai.yoda.function.system.StartAccelerometerFunction;
import cy7.e;
import com.kwai.yoda.function.system.GetBatteryInfoFunction;
import cy7.c;
import cy7.f;
import com.kwai.yoda.function.system.ReadFileFunction;
import com.kwai.yoda.function.system.StartNativeDebuggerFunction;
import by7.a;
import by7.c;
import by7.b;
import fy7.d;
import fy7.b;
import com.kwai.yoda.function.webview.GetLaunchParamsFunction;
import fy7.a;
import fy7.c;
import com.kwai.yoda.function.webview.GetPageLoadDataFunction;
import com.kwai.yoda.function.webview.GetWebViewStatusFunction;
import com.kwai.yoda.function.webview.GetPageResourceDataFunction;
import com.kwai.yoda.function.webview.GetPageConfigInfoFunction;
import com.kwai.yoda.function.tool.LaunchAppFunction;
import com.kwai.yoda.function.tool.GetKwaiSwitchConfig;
import dy7.c;
import com.kwai.yoda.function.tool.GetApiListFunction;
import com.kwai.yoda.function.tool.CanIUseFunction;
import com.kwai.yoda.function.tool.SendRadarLogFunction;
import dy7.e;
import com.kwai.yoda.function.tool.SendPerformanceLogFunction;
import com.kwai.yoda.function.tool.SendWebLogFunction;
import com.kwai.yoda.function.tool.SecAtlasSignFunction;
import com.kwai.yoda.function.tool.GetCurrentPageConfigFunction;
import dy7.f;
import com.kwai.yoda.function.tool.HandleEntryTagFunction;
import com.kwai.yoda.function.tool.GetPageInitConfigFunction;
import com.kwai.yoda.function.ui.d;
import com.kwai.yoda.function.ui.l;
import com.kwai.yoda.function.ui.g;
import com.kwai.yoda.function.ui.e;
import com.kwai.yoda.function.ui.c;
import com.kwai.yoda.function.ui.h;
import com.kwai.yoda.function.ui.k;
import com.kwai.yoda.function.ui.DialogFunction;
import com.kwai.yoda.function.ui.i;
import com.kwai.yoda.function.ui.a;
import com.kwai.yoda.function.ui.f;
import com.kwai.yoda.function.ui.j;
import com.kwai.yoda.function.ui.b;
import com.kwai.yoda.function.hybrid.GetOfflinePackageDetailFunction;
import com.kwai.yoda.function.hybrid.GetHybridStatusFunction;
import java.util.Set;
import com.kwai.robust.PatchProxyResult;
import ny7.h;
import com.kwai.yoda.bridge.YodaBaseWebView;
import kotlin.jvm.internal.a;
import java.util.HashSet;
import java.util.Iterator;
import java.lang.Iterable;
import rx7.c;
import java.util.List;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import vy7.a;
import vy7.a$a;
import sy7.b;
import java.util.concurrent.ConcurrentHashMap;
import trd.t0;
import ny7.d;
import java.util.concurrent.CopyOnWriteArraySet;

public final class YodaBridgeHandler	// class@001185
{
    public final CopyOnWriteArrayList a;
    public final p b;
    public boolean c;

    public void YodaBridgeHandler(){
       super();
       this.a = new CopyOnWriteArrayList();
       this.b = s.c(YodaBridgeHandler$mBridgeHolder$2.INSTANCE);
       if (PatchProxy.applyVoid(null, this, YodaBridgeHandler.class, "34")) {
       }else {
          this.h(new GetDeviceInfoFunction());
          this.h(new GetAppInfoFunction());
          this.h(new GetNetworkTypeFunction());
          this.h(new GetLocationFunction());
          this.h(new d());
          this.h(new g());
          this.h(new a());
          this.h(new b());
          this.h(new StartAccelerometerFunction());
          this.h(new e());
          this.h(new GetBatteryInfoFunction());
          this.h(new c());
          this.h(new f());
          this.h(new ReadFileFunction());
          this.g("system", "startNativeDebugger", new StartNativeDebuggerFunction());
          this.h(new a());
          this.h(new c());
          this.h(new b());
          this.h(new d());
          this.h(new b());
          this.h(new GetLaunchParamsFunction());
          this.h(new a());
          this.h(new c());
          this.h(new GetPageLoadDataFunction());
          this.h(new GetWebViewStatusFunction());
          this.h(new GetPageResourceDataFunction());
          this.h(new GetPageConfigInfoFunction());
          this.h(new LaunchAppFunction());
          this.h(new GetKwaiSwitchConfig());
          this.h(new c());
          this.h(new GetApiListFunction());
          this.h(new CanIUseFunction());
          this.h(new SendRadarLogFunction());
          this.h(new e());
          this.h(new SendPerformanceLogFunction());
          this.h(new SendWebLogFunction());
          this.h(new SecAtlasSignFunction());
          this.h(new GetCurrentPageConfigFunction());
          this.h(new f());
          this.h(new HandleEntryTagFunction());
          this.h(new GetPageInitConfigFunction());
          this.g("ui", "setTitle", new d());
          this.g("ui", "setTopBarStyle", new l());
          this.g("ui", "setSlideBackBehavior", new g());
          this.g("ui", "setPhysicalBackButtonBehavior", new e());
          this.g("ui", "removeTopBarButton", new c());
          this.g("ui", "setTopBarButton", new h());
          this.g("ui", "showToast", new k());
          this.g("ui", "showDialog", new DialogFunction());
          this.g("ui", "showLoading", new i());
          this.g("ui", "hideLoading", new a());
          this.g("ui", "setBounceStyle", new f());
          this.g("ui", "stopPullDown", new j());
          this.g("ui", "hideLoadingPage", new b());
          this.g("hybrid", "getAndUpdateHybridDetail", new GetOfflinePackageDetailFunction());
          this.h(new GetHybridStatusFunction());
       }
       return;
    }
    public final Set a(){
       Object obj = PatchProxy.apply(null, this, YodaBridgeHandler.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e().b();
    }
    public final Set b(YodaBaseWebView p0){
       HashSet obj = PatchProxy.applyOneRefs(p0, this, YodaBridgeHandler.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "webView");
       obj = new HashSet();
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          obj.addAll(iterator.next().a(p0));
       }
       return obj;
    }
    public final CopyOnWriteArrayList c(){
       return this.a;
    }
    public final Set d(Map p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, YodaBridgeHandler.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "map");
       return this.e().f(p0);
    }
    public final h e(){
       Object obj = PatchProxy.apply(null, this, YodaBridgeHandler.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final void f(String p0,String p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, YodaBridgeHandler.class, "17")) {
          return;
       }
       String str = "function";
       a.q(p2, str);
       h oh = this.e();
       Objects.requireNonNull(oh);
       if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, oh, h.class, "11")) {
          a.q(p2, str);
          boolean b = true;
          int i = (p0 == null || !p0.length())? 1: 0;
          if (!i) {
             if (p1 != null && p1.length()) {
                b = false;
             }
             if (!b && !oh.l(p0, p1)) {
                if (a.a.a() && a.g(p0, "Kwai")) {
                   b.b.k("Kwai namespace has already disabled");
                }else {
                   Map map = oh.c.get(p0);
                   if (map != null) {
                      map = t0.J0(map);
                      if (map != null) {
                      label_0080 :
                         map.put(p1, p2);
                         oh.c.put(p0, map);
                         oh.e.add(new d(p0, p1));
                         oh.h.clear();
                      }
                   }
                   ConcurrentHashMap uConcurrentH = new ConcurrentHashMap();
                   goto label_0080 ;
                }
             }
          }
       }
    label_0097 :
       return;
    }
    public final void g(String p0,String p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, YodaBridgeHandler.class, "15")) {
          return;
       }
       String str = "function";
       a.q(p2, str);
       h oh = this.e();
       Objects.requireNonNull(oh);
       if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, oh, h.class, "9")) {
          a.q(p2, str);
          boolean b = false;
          int i = (p0 == null || !p0.length())? 1: 0;
          if (!i) {
             if (p1 == null || !p1.length()) {
                b = true;
             }
             if (!b && !oh.l(p0, p1)) {
                Map map = oh.b.get(p0);
                if (map != null) {
                   map = t0.J0(map);
                   if (map != null) {
                   label_0066 :
                      map.put(p1, p2);
                      oh.b.put(p0, map);
                      oh.d.add(new d(p0, p1));
                      oh.h.clear();
                   }
                }
                ConcurrentHashMap uConcurrentH = new ConcurrentHashMap();
                goto label_0066 ;
             }
          }
       }
    label_007d :
       return;
    }
    public final void h(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaBridgeHandler.class, "14")) {
          return;
       }
       a.q(p0, "function");
       this.g(p0.d(), p0.c(), p0);
       return;
    }
}
