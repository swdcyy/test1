package com.yxcorp.gifshow.push.init.PushSdkInitModuleForMainProcess;
import com.kwai.framework.init.a;
import com.yxcorp.gifshow.push.init.PushSdkInitModuleForMainProcess$a;
import nsd.u;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.push.init.NotificationManagerInitModule;
import kotlin.collections.CollectionsKt__CollectionsKt;
import qe6.b;
import com.yxcorp.utility.RomUtils;
import com.yxcorp.gifshow.push.init.PushSdkInitModuleForMainProcess$c;
import java.lang.Runnable;
import t45.c;
import com.yxcorp.gifshow.push.init.PushSdkInitModuleForMainProcess$d;
import b76.a;
import com.kwai.android.common.utils.PushSDKInitUtilKt;
import com.kwai.sdk.switchconfig.a;
import com.kwai.android.dispatcher.KwaiPush;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import android.app.Application;
import r6c.b;
import android.content.Context;
import r6c.b$a;
import com.kwai.android.dispatcher.PushConfig;
import com.yxcorp.gifshow.push.model.KwaiPushMsgData;
import java.util.concurrent.ExecutorService;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import ftd.o1;
import kotlinx.coroutines.CoroutineDispatcher;
import p6c.a;
import gv6.c;
import java.util.ArrayList;
import t6c.b;
import com.yxcorp.gifshow.push.init.interceptor.register.ChannelReplaceContextInterceptor;
import t6c.f;
import t6c.e;
import com.kwai.android.register.core.register.BaseChannelInterceptor;
import java.util.Collection;
import java.util.Objects;
import com.yxcorp.gifshow.push.init.PushSdkInitModuleForMainProcess$b;
import com.kwai.android.common.bean.NotificationSmallIcon;
import com.kwai.android.common.utils.ContextProvider;
import com.kwai.android.common.config.PushConfigManager;
import java.lang.Number;
import wkd.b;
import ob6.p;
import ob6.f;
import com.kwai.framework.network.keyconfig.ApiFeature;
import com.kwai.framework.plugin.PluginManager;
import android.os.Build$VERSION;
import android.content.IntentFilter;
import com.yxcorp.gifshow.push.init.PushSdkInitModuleForMainProcess$execute$1;
import java.lang.StringBuilder;
import android.content.BroadcastReceiver;
import android.os.Handler;
import android.content.Intent;
import o6c.c;
import com.yxcorp.gifshow.push.init.PushSdkInitModuleForMainProcess$initPushSdk$1;
import msd.l;
import com.kwai.android.common.intercept.Interceptor;
import q6c.b;
import q6c.c;
import q6c.d;
import q6c.a;
import q6c.e;
import s6c.b;
import s6c.a;
import s6c.c;
import com.yxcorp.gifshow.push.init.interceptor.process.KwaiPushTypeInterceptor;
import r6c.a;
import m6c.a;
import com.yxcorp.gifshow.push.init.interceptor.command.CommandCalendarInterceptor;
import yv3.e;
import sv3.a;
import q87.c;
import yv3.c;
import yv3.d;
import nfb.b;
import com.kwai.social.startup.reminder.util.IMConfigUtil;
import java.lang.Boolean;
import com.kwai.social.startup.reminder.model.IMConfigInfo;
import dc5.c;
import ofb.a;
import mb0.a;
import mb0.b;
import com.yxcorp.gifshow.push.init.PushSdkInitModuleForMainProcess$internalInitPushSDK$1;
import msd.a;
import android.content.SharedPreferences;
import vid.b;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class PushSdkInitModuleForMainProcess extends a	// class@001652
{
    public static boolean q;
    public static boolean r;
    public static final PushSdkInitModuleForMainProcess$a s;

    static {
       PushSdkInitModuleForMainProcess.s = new PushSdkInitModuleForMainProcess$a(null);
    }
    public void PushSdkInitModuleForMainProcess(){
       super();
    }
    public boolean H7(){
       return true;
    }
    public int f0(){
       return 9;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, PushSdkInitModuleForMainProcess.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{NotificationManagerInitModule.class};
       return CollectionsKt__CollectionsKt.P(obj);
    }
    public void h0(){
       if (PatchProxy.applyVoid(null, this, PushSdkInitModuleForMainProcess.class, "12")) {
          return;
       }
       if (b.a() && (!RomUtils.w() && !RomUtils.s())) {
          c.a(PushSdkInitModuleForMainProcess$c.b);
       }
    label_0023 :
       return;
    }
    public void i0(){
       if (PatchProxy.applyVoid(null, this, PushSdkInitModuleForMainProcess.class, "11")) {
          return;
       }
       c.a(PushSdkInitModuleForMainProcess$d.b);
       return;
    }
    public void k0(a p0){
       Application uApplication;
       if (PatchProxy.applyVoidOneRefs(p0, this, PushSdkInitModuleForMainProcess.class, "3")) {
          return;
       }
       if (PushSDKInitUtilKt.isInitReentrant()) {
          return;
       }
       this.o0();
       if (a.t().d("LaunchOptDisablePushV3", false) && RomUtils.w()) {
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          uApplication = uoc.a();
          a.o(uApplication, "AppEnv.get\(\).appContext");
          KwaiPush.INSTANCE.launchPushV3Process(uApplication);
       }
       uApplication = a.B;
       a.o(uApplication, "AppEnv.APP");
       b.a.a(uApplication);
       return;
    }
    public final PushConfig l0(){
       long l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       PushConfig obj = PatchProxy.apply(objArray, this, PushSdkInitModuleForMainProcess.class, "8");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new PushConfig();
       obj.setPushDataSubClass(KwaiPushMsgData.class);
       ExecutorService uExecutorSer = c.d();
       a.o(uExecutorSer, "Async.getGlobalThreadPoolExecutor\(\)");
       obj.setCoroutineDispatcher(o1.c(uExecutorSer));
       obj.setApiBuilder(new a());
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(new b());
       uArrayList.add(new ChannelReplaceContextInterceptor());
       uArrayList.add(new f());
       boolean b = false;
       if (a.t().d("enableHonorPlugin", b)) {
          uArrayList.add(new e());
       }
       BaseChannelInterceptor[] uBaseChannel = new BaseChannelInterceptor[b];
       Object[] objArray1 = uArrayList.toArray(uBaseChannel);
       Objects.requireNonNull(objArray1, "null cannot be cast to non-null type kotlin.Array<T>");
       obj.setInitRegisterInterceptors(objArray1);
       obj.setNotificationSmallIcon(PushSdkInitModuleForMainProcess$b.a);
       obj.setLaunchPushV3ProcessManually(a.t().d("LaunchOptDisablePushV3", b));
       ContextProvider.init(a.b());
       PushConfigManager iNSTANCE = PushConfigManager.INSTANCE;
       Object obj1 = PatchProxy.apply(objArray, this, PushSdkInitModuleForMainProcess.class, "9");
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
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PushSdkInitModuleForMainProcess.class, "2")) {
          return;
       }
       if (RomUtils.n()) {
          PluginManager h = PluginManager.H;
          int i = 4;
          h.P("push_lib_plugin", i);
          h.P("push_lib_honor_plugin", i);
       }
       int sDK_INT = Build$VERSION.SDK_INT;
       String str = 33;
       if (sDK_INT >= str && !b.a()) {
          Application uApplication = a.b();
          a.o(uApplication, "AppEnv.getAppContext\(\)");
          a.b().registerReceiver(new PushSdkInitModuleForMainProcess$execute$1(this), new IntentFilter("com.android.action.AGREE_PRIVACY_PERMISSION"), uApplication.getPackageName()+".permission.AGREE_PRIVACY_PERMISSION", objArray);
       }else if(b.a() && sDK_INT >= str){
          this.q0();
       }
       return;
    }
    public final void n0(PushConfig p0){
       Interceptor[] obj;
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, PushSdkInitModuleForMainProcess.class, "5")) {
          return;
       }
       Application b = a.B;
       a.o(b, "AppEnv.APP");
       KwaiPush.initialize(b, p0, new PushSdkInitModuleForMainProcess$initPushSdk$1(this, p0));
       Interceptor[] interceptorA = new Interceptor[]{new b(),new c(),new d(),new a(),new e()};
       boolean i = 2;
       int i1 = 3;
       int i2 = 4;
       KwaiPush.addClickInterceptor(interceptorA);
       interceptorA = new Interceptor[i2];
       interceptorA[0] = new b();
       interceptorA[1] = new a();
       interceptorA[i] = new c();
       interceptorA[i1] = new KwaiPushTypeInterceptor();
       KwaiPush.addProcessInterceptor(interceptorA);
       interceptorA = new Interceptor[]{new a()};
       KwaiPush.addCommandInterceptor(interceptorA);
       interceptorA = new Interceptor[]{new b()};
       KwaiPush.addCommandInterceptor(interceptorA);
       if (a.a.i()) {
          interceptorA = new Interceptor[]{new CommandCalendarInterceptor()};
          KwaiPush.addCommandInterceptor(interceptorA);
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, objArray, uoc, "1")) {
          if (!PatchProxy.applyVoid(objArray, objArray, e.class, "1") && !e.b) {
             e.b = true;
             Object[] objArray1 = new Object[0];
             a.C().w("NotificationHelper", "add push process interceptor", objArray1);
             obj = new Interceptor[i];
             obj[0] = new c();
             obj[1] = new d();
             KwaiPush.addProcessInterceptor(obj);
          }
          if (!PatchProxy.applyVoid(objArray, objArray, b.class, "1")) {
             obj = PatchProxy.apply(objArray, objArray, IMConfigUtil.class, "20");
             if (obj != PatchProxyResult.class) {
                i = obj.booleanValue();
             }else {
                IMConfigInfo iMConfigInfo = IMConfigUtil.i.r();
                iMConfigInfo = (iMConfigInfo != null)? iMConfigInfo.mCloseImRtcNotificationInterceptor: null;
             }
             if (i != null) {
                c.g("IMNotificationRegister", "closeImRtcNotificationInterceptor");
             }else {
                obj = new Interceptor[]{new a()};
                KwaiPush.addProcessInterceptor(obj);
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, objArray, uoc, "3") && (!PatchProxy.applyVoid(objArray, objArray, a.class, "1") && !a.b)) {
          a.b = true;
          interceptorA = new Interceptor[]{new b()};
          KwaiPush.addClickInterceptor(interceptorA);
       }
    label_0139 :
       c.a();
       return;
    }
    public final void o0(){
       if (PatchProxy.applyVoid(null, this, PushSdkInitModuleForMainProcess.class, "4")) {
          return;
       }
       PushSDKInitUtilKt.exclusiveInitBlocking(new PushSdkInitModuleForMainProcess$internalInitPushSDK$1(this));
       return;
    }
    public final void p0(){
       if (PatchProxy.applyVoid(null, this, PushSdkInitModuleForMainProcess.class, "10")) {
          return;
       }
       KwaiPush.refreshToken();
       return;
    }
    public final void q0(){
       Application b;
       if (PatchProxy.applyVoid(null, this, PushSdkInitModuleForMainProcess.class, "7")) {
          return;
       }
       SharedPreferences sharedPrefer = b.c(a.b(), "notification_permission_dialog", 0);
       String str = "ever_be_shown";
       boolean booleanx = sharedPrefer.getBoolean(str, 0);
       g.b(sharedPrefer.edit().putBoolean(str, true));
       if (!booleanx) {
          b = a.B;
          a.o(b, "AppEnv.APP");
          KwaiPush.createChannel(b);
          b = a.B;
          a.o(b, "AppEnv.APP");
          KwaiPush.createChannelForChannelPush(b);
       }
       return;
    }
}
