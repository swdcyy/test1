package com.kuaishou.krn.bridges.KrnBasicReactPackage;
import qi0.a;
import vi0.a;
import pf.g;
import com.facebook.react.views.image.ReactImageManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.NativeModule;
import com.kuaishou.krn.bridges.page.KrnPageViewBridge;
import com.kuaishou.krn.bridges.yoda.KrnYodaModule;
import com.kuaishou.krn.bridges.kds.LocalStorageBridge;
import com.kuaishou.krn.bridges.kds.ScreenBridge;
import com.kuaishou.krn.bridges.app.KrnAppStateModule;
import com.kuaishou.krn.bridges.version.KdsVersionBridge;
import com.kuaishou.krn.bridges.kswitch.SwitchBridge;
import com.kuaishou.krn.bridges.kds.CookieManagerBridge;
import com.kuaishou.krn.bridges.page.KrnTopBarBridge;
import com.kuaishou.krn.bridges.page.KrnPageFunnelJsEventBridge;
import com.kuaishou.krn.bridges.toast.KrnToastBridge;
import com.kuaishou.krn.bridges.basic.KrnBasicBridge;
import com.kuaishou.krn.bridges.core.KrnCoreBridge;
import com.kuaishou.krn.bridges.download.KrnDownloadBridge;
import com.kuaishou.krn.bridges.install.KrnInstallBridge;
import com.kuaishou.krn.bridges.sp.KrnSpBridge;
import com.kuaishou.krn.bridges.kds.KdsBridge;
import com.kuaishou.krn.bridges.weblogger.KrnWebLoggerBridge;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import si0.a;
import javax.inject.Provider;
import com.facebook.react.bridge.ModuleSpec;
import si0.j;
import si0.b;
import si0.c;
import si0.d;
import si0.e;
import si0.f;
import si0.g;
import si0.h;
import si0.i;
import si0.k;
import si0.l;
import si0.m;
import si0.n;
import si0.o;
import si0.p;
import si0.q;
import si0.r;

public class KrnBasicReactPackage extends a	// class@000805
{

    public void KrnBasicReactPackage(){
       super();
       ReactImageManager.setGlobalReactImageConfig(a.b);
    }
    public static NativeModule lambda$createKrnNativeModules$0(ReactApplicationContext p0){
       return new KrnPageViewBridge(p0);
    }
    public static NativeModule lambda$createKrnNativeModules$1(ReactApplicationContext p0){
       return new KrnYodaModule(p0);
    }
    public static NativeModule lambda$createKrnNativeModules$10(ReactApplicationContext p0){
       return new LocalStorageBridge(p0);
    }
    public static NativeModule lambda$createKrnNativeModules$11(ReactApplicationContext p0){
       return new ScreenBridge(p0);
    }
    public static NativeModule lambda$createKrnNativeModules$12(ReactApplicationContext p0){
       return new KrnAppStateModule(p0);
    }
    public static NativeModule lambda$createKrnNativeModules$13(ReactApplicationContext p0){
       return new KdsVersionBridge(p0);
    }
    public static NativeModule lambda$createKrnNativeModules$14(ReactApplicationContext p0){
       return new SwitchBridge(p0);
    }
    public static NativeModule lambda$createKrnNativeModules$15(ReactApplicationContext p0){
       return new CookieManagerBridge(p0);
    }
    public static NativeModule lambda$createKrnNativeModules$16(ReactApplicationContext p0){
       return new KrnTopBarBridge(p0);
    }
    public static NativeModule lambda$createKrnNativeModules$17(ReactApplicationContext p0){
       return new KrnPageFunnelJsEventBridge(p0);
    }
    public static NativeModule lambda$createKrnNativeModules$2(ReactApplicationContext p0){
       return new KrnToastBridge(p0);
    }
    public static NativeModule lambda$createKrnNativeModules$3(ReactApplicationContext p0){
       return new KrnBasicBridge(p0);
    }
    public static NativeModule lambda$createKrnNativeModules$4(ReactApplicationContext p0){
       return new KrnCoreBridge(p0);
    }
    public static NativeModule lambda$createKrnNativeModules$5(ReactApplicationContext p0){
       return new KrnDownloadBridge(p0);
    }
    public static NativeModule lambda$createKrnNativeModules$6(ReactApplicationContext p0){
       return new KrnInstallBridge(p0);
    }
    public static NativeModule lambda$createKrnNativeModules$7(ReactApplicationContext p0){
       return new KrnSpBridge(p0);
    }
    public static NativeModule lambda$createKrnNativeModules$8(ReactApplicationContext p0){
       return new KdsBridge(p0);
    }
    public static NativeModule lambda$createKrnNativeModules$9(ReactApplicationContext p0){
       return new KrnWebLoggerBridge(p0);
    }
    public List createKrnNativeModules(ReactApplicationContext p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, KrnBasicReactPackage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(ModuleSpec.nativeModuleSpec(KrnPageViewBridge.class, new a(p0)));
       obj.add(ModuleSpec.nativeModuleSpec(KrnYodaModule.class, new j(p0)));
       obj.add(ModuleSpec.nativeModuleSpec(KrnToastBridge.class, new b(p0)));
       obj.add(ModuleSpec.nativeModuleSpec(KrnBasicBridge.class, new c(p0)));
       obj.add(ModuleSpec.nativeModuleSpec(KrnCoreBridge.class, new d(p0)));
       obj.add(ModuleSpec.nativeModuleSpec(KrnDownloadBridge.class, new e(p0)));
       obj.add(ModuleSpec.nativeModuleSpec(KrnInstallBridge.class, new f(p0)));
       obj.add(ModuleSpec.nativeModuleSpec(KrnSpBridge.class, new g(p0)));
       obj.add(ModuleSpec.nativeModuleSpec(KdsBridge.class, new h(p0)));
       obj.add(ModuleSpec.nativeModuleSpec(KrnWebLoggerBridge.class, new i(p0)));
       obj.add(ModuleSpec.nativeModuleSpec(LocalStorageBridge.class, new k(p0)));
       obj.add(ModuleSpec.nativeModuleSpec(ScreenBridge.class, new l(p0)));
       obj.add(ModuleSpec.nativeModuleSpec(KrnAppStateModule.class, new m(p0)));
       obj.add(ModuleSpec.nativeModuleSpec(KdsVersionBridge.class, new n(p0)));
       obj.add(ModuleSpec.nativeModuleSpec(SwitchBridge.class, new o(p0)));
       obj.add(ModuleSpec.nativeModuleSpec(CookieManagerBridge.class, new p(p0)));
       obj.add(ModuleSpec.nativeModuleSpec(KrnTopBarBridge.class, new q(p0)));
       obj.add(ModuleSpec.nativeModuleSpec(KrnPageFunnelJsEventBridge.class, new r(p0)));
       return obj;
    }
    public List createKrnViewManagers(ReactApplicationContext p0){
       p0 = PatchProxy.applyOneRefs(p0, this, KrnBasicReactPackage.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new ArrayList();
    }
}
