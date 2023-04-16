package com.yxcorp.gifshow.push.init.PushSdkInitModuleForSubProcess;
import com.kwai.framework.init.a;
import com.yxcorp.gifshow.push.init.PushSdkInitModuleForSubProcess$a;
import nsd.u;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.initmodule.AzerothInitModule;
import com.yxcorp.gifshow.push.init.NotificationManagerInitModule;
import com.kwai.framework.switchs.SwitchConfigInitModule;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import qe6.b;
import com.yxcorp.utility.RomUtils;
import com.yxcorp.gifshow.push.init.PushSdkInitModuleForSubProcess$c;
import java.lang.Runnable;
import t45.c;
import com.yxcorp.gifshow.push.init.PushSdkInitModuleForSubProcess$d;
import com.kwai.android.dispatcher.PushConfig;
import com.yxcorp.gifshow.push.model.KwaiPushMsgData;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.a;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import ftd.o1;
import kotlinx.coroutines.CoroutineDispatcher;
import p6c.a;
import gv6.c;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.kwai.android.common.ext.ContextExtKt;
import zsd.u;
import t6c.b;
import com.yxcorp.gifshow.push.init.interceptor.register.ChannelReplaceContextInterceptor;
import com.kwai.android.register.core.register.BaseChannelInterceptor;
import java.util.Collection;
import java.util.Objects;
import com.yxcorp.gifshow.push.init.PushSdkInitModuleForSubProcess$b;
import com.kwai.android.common.bean.NotificationSmallIcon;
import com.kwai.sdk.switchconfig.a;
import com.kwai.android.common.utils.ContextProvider;
import com.kwai.android.common.config.PushConfigManager;
import java.lang.Number;
import wkd.b;
import ob6.p;
import ob6.f;
import com.kwai.framework.network.keyconfig.ApiFeature;
import com.kwai.android.common.utils.PushSDKInitUtilKt;
import com.yxcorp.gifshow.push.init.PushSdkInitModuleForSubProcess$initPushSdk$1;
import msd.l;
import com.kwai.android.dispatcher.KwaiPush;
import com.kwai.android.common.intercept.Interceptor;
import s6c.h;
import r6c.c;
import r6c.a;
import q6c.b;
import q6c.c;
import q6c.d;
import q6c.a;
import s6c.b;
import s6c.a;
import s6c.c;
import com.yxcorp.gifshow.push.init.interceptor.process.KwaiPushV3TypeInterceptor;
import o6c.c;
import s6c.g;
import com.yxcorp.gifshow.push.init.PushSdkInitModuleForSubProcess$internalInitPushSDK$1;
import msd.a;

public final class PushSdkInitModuleForSubProcess extends a	// class@0012ee
{
    public static boolean q;
    public static final PushSdkInitModuleForSubProcess$a r;

    static {
       PushSdkInitModuleForSubProcess.r = new PushSdkInitModuleForSubProcess$a(null);
    }
    public void PushSdkInitModuleForSubProcess(){
       super();
    }
    public boolean H7(){
       return true;
    }
    public int f0(){
       return 9;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, PushSdkInitModuleForSubProcess.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{AzerothInitModule.class,NotificationManagerInitModule.class,SwitchConfigInitModule.class};
       return CollectionsKt__CollectionsKt.r(obj);
    }
    public void h0(){
       if (PatchProxy.applyVoid(null, this, PushSdkInitModuleForSubProcess.class, "9")) {
          return;
       }
       if (b.a() && (!RomUtils.w() && !RomUtils.s())) {
          c.a(PushSdkInitModuleForSubProcess$c.b);
       }
    label_0023 :
       return;
    }
    public void i0(){
       if (PatchProxy.applyVoid(null, this, PushSdkInitModuleForSubProcess.class, "8")) {
          return;
       }
       if (b.a()) {
          c.a(PushSdkInitModuleForSubProcess$d.b);
       }
       return;
    }
    public final PushConfig l0(){
       long l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       PushConfig obj = PatchProxy.apply(objArray, this, PushSdkInitModuleForSubProcess.class, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new PushConfig();
       obj.setPushDataSubClass(KwaiPushMsgData.class);
       ExecutorService uExecutorSer = c.d();
       a.o(uExecutorSer, "Async.getGlobalThreadPoolExecutor\(\)");
       obj.setCoroutineDispatcher(o1.c(uExecutorSer));
       obj.setApiBuilder(new a());
       c uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       Application uApplication = uoc.a();
       a.o(uApplication, "AppEnv.get\(\).appContext");
       boolean b = false;
       obj.setStartSuicideProcessToProcess(u.H1(ContextExtKt.getProcessName(uApplication), ":messagesdk", b, 2, objArray));
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(new b());
       uArrayList.add(new ChannelReplaceContextInterceptor());
       BaseChannelInterceptor[] uBaseChannel = new BaseChannelInterceptor[b];
       Object[] objArray1 = uArrayList.toArray(uBaseChannel);
       Objects.requireNonNull(objArray1, "null cannot be cast to non-null type kotlin.Array<T>");
       obj.setInitRegisterInterceptors(objArray1);
       obj.setNotificationSmallIcon(PushSdkInitModuleForSubProcess$b.a);
       obj.setLaunchPushV3ProcessManually(a.t().d("LaunchOptDisablePushV3", b));
       ContextProvider.init(a.b());
       PushConfigManager iNSTANCE = PushConfigManager.INSTANCE;
       Object obj1 = PatchProxy.apply(objArray, this, PushSdkInitModuleForSubProcess.class, "7");
       if (obj1 != patchProxyRe) {
          l = obj1.longValue();
       }else {
          l = b.a(0x36463d96).i().f(ApiFeature.PUSH);
          if (l - iNSTANCE.getDelayInitMs() < 0) {
             l = iNSTANCE.getDelayInitMs();
          }
       }
       iNSTANCE.setDelayInitMs(l);
       return obj;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, PushSdkInitModuleForSubProcess.class, "2")) {
          return;
       }
       if (PushSDKInitUtilKt.isInitReentrant()) {
          return;
       }
       this.o0();
       return;
    }
    public final void n0(PushConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PushSdkInitModuleForSubProcess.class, "4")) {
          return;
       }
       Application b = a.B;
       a.o(b, "AppEnv.APP");
       KwaiPush.initialize(b, p0, new PushSdkInitModuleForSubProcess$initPushSdk$1(this, p0));
       int i = 1;
       Interceptor[] interceptorA = new Interceptor[i];
       interceptorA[0] = new h();
       KwaiPush.addProcessInterceptor(interceptorA);
       interceptorA = new Interceptor[i];
       interceptorA[0] = new c();
       KwaiPush.addCommandInterceptor(interceptorA);
       interceptorA = new Interceptor[i];
       interceptorA[0] = new a();
       KwaiPush.addCommandInterceptor(interceptorA);
       int i1 = 4;
       Interceptor[] interceptorA1 = new Interceptor[i1];
       interceptorA1[0] = new b();
       interceptorA1[i] = new c();
       interceptorA1[2] = new d();
       interceptorA1[3] = new a();
       KwaiPush.addClickInterceptor(interceptorA1);
       Application uApplication = a.b();
       a.o(uApplication, "AppEnv.getAppContext\(\)");
       if (u.H1(ContextExtKt.getProcessName(uApplication), ":push_v3", 0, 2, null)) {
          interceptorA = new Interceptor[i1];
          interceptorA[0] = new b();
          interceptorA[i] = new a();
          interceptorA[2] = new c();
          interceptorA[3] = new KwaiPushV3TypeInterceptor();
          KwaiPush.addProcessInterceptor(interceptorA);
          c.a();
       }else {
          interceptorA = new Interceptor[i1];
          interceptorA[0] = new b();
          interceptorA[i] = new a();
          interceptorA[2] = new c();
          interceptorA[3] = new g();
          KwaiPush.addProcessInterceptor(interceptorA);
       }
       return;
    }
    public final void o0(){
       if (PatchProxy.applyVoid(null, this, PushSdkInitModuleForSubProcess.class, "3")) {
          return;
       }
       PushSDKInitUtilKt.exclusiveInitBlocking(new PushSdkInitModuleForSubProcess$internalInitPushSDK$1(this));
       return;
    }
}
