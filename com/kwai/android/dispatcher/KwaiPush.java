package com.kwai.android.dispatcher.KwaiPush;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import com.kwai.android.dispatcher.KwaiPush$coreInitBlock$1;
import java.lang.Object;
import msd.p;
import java.util.List;
import java.util.Map;
import com.kwai.android.common.intercept.Interceptor;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.android.register.Processor;
import java.util.Collection;
import trd.y;
import android.content.Context;
import android.os.Build$VERSION;
import android.app.NotificationChannel;
import java.lang.CharSequence;
import android.app.NotificationManager;
import com.kwai.android.common.utils.PushLogcat;
import java.lang.Throwable;
import com.kwai.android.common.bean.Channel;
import asd.c;
import com.kwai.android.common.utils.PushSDKInitState;
import java.util.concurrent.atomic.AtomicBoolean;
import com.kwai.android.api.PushApi;
import android.app.Activity;
import com.kwai.android.common.ext.ContextExtKt;
import com.kwai.android.common.bean.ActivityChannelProvider;
import android.content.Intent;
import zsd.u;
import java.util.Locale;
import java.lang.NullPointerException;
import android.app.Application;
import com.kwai.android.dispatcher.PushConfig;
import msd.l;
import com.kwai.android.dispatcher.KwaiPush$initialize$2;
import msd.a;
import com.kwai.android.common.utils.PushSDKInitUtilKt;
import com.kwai.android.dispatcher.KwaiPush$initialize$1;
import android.os.SystemClock;
import com.kwai.android.common.utils.ActivityStack;
import com.kwai.android.dispatcher.KwaiPush$coreInitInternal$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import kotlin.Result;
import com.kwai.android.register.RegisterLoader;
import com.kwai.android.register.core.register.BaseChannelInterceptor;
import trd.n;
import java.lang.StringBuilder;
import com.kwai.android.pushlog.PushLogger;
import com.kwai.android.dispatcher.SystemPushStateReporter;
import ftd.j2;
import ftd.z0;
import com.kwai.android.dispatcher.KwaiPush$coreInitInternal$2$1;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.a;
import qrd.l1;
import p45.f;
import kotlin.Pair;
import com.kwai.android.common.config.PushConfigManager;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.IllegalArgumentException;
import com.kwai.lib.interfacies.AzerothCodeAdapter;
import com.kwai.android.dispatcher.PushV3ProcessLauncherService;
import java.lang.Class;
import com.kwai.android.dispatcher.KwaiPush$launchPushV3Process$1;
import android.content.ServiceConnection;
import com.kwai.plugin.dva.feature.core.hook.a;
import com.kwai.android.dispatcher.KwaiPush$refreshToken$1;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Runnable;
import java.util.Set;
import java.util.Map$Entry;
import com.kwai.android.register.Register;
import java.lang.Enum;
import com.kwai.android.common.bean.NotificationSmallIcon;
import kotlinx.coroutines.CoroutineDispatcher;
import gv6.c;

public final class KwaiPush	// class@0009b4
{
    public static final KwaiPush INSTANCE;
    public static final p coreInitBlock;
    public static final List corePendingRunnableList;
    public static long initTimeStamp;
    public static boolean isCoreNeedPendingRunning;
    public static Map registerInstance;

    static {
       KwaiPush.INSTANCE = new KwaiPush();
       KwaiPush.isCoreNeedPendingRunning = true;
       KwaiPush.registerInstance = new LinkedHashMap();
       KwaiPush.corePendingRunnableList = new ArrayList();
       KwaiPush.coreInitBlock = KwaiPush$coreInitBlock$1.INSTANCE;
    }
    public void KwaiPush(){
       super();
    }
    public static final p access$getCoreInitBlock$p(KwaiPush p0){
       return KwaiPush.coreInitBlock;
    }
    public static final List access$getCorePendingRunnableList$p(KwaiPush p0){
       return KwaiPush.corePendingRunnableList;
    }
    public static final Map access$getRegisterInstance$p(KwaiPush p0){
       return KwaiPush.registerInstance;
    }
    public static final boolean access$isCoreNeedPendingRunning$p(KwaiPush p0){
       return KwaiPush.isCoreNeedPendingRunning;
    }
    public static final void access$setCoreNeedPendingRunning$p(KwaiPush p0,boolean p1){
       KwaiPush.isCoreNeedPendingRunning = p1;
    }
    public static final void access$setRegisterInstance$p(KwaiPush p0,Map p1){
       KwaiPush.registerInstance = p1;
    }
    public static final void addClickInterceptor(Interceptor[] p0){
       a.p(p0, "interceptors");
       y.s0(Processor.INSTANCE.getClickNotificationInterceptors(), p0);
    }
    public static final void addCommandInterceptor(Interceptor[] p0){
       a.p(p0, "interceptors");
       y.s0(Processor.INSTANCE.getCommandInterceptors(), p0);
    }
    public static final void addProcessInterceptor(Interceptor[] p0){
       a.p(p0, "interceptors");
       y.s0(Processor.INSTANCE.getParseNotificationInterceptors(), p0);
    }
    public static final void createChannel(Context p0){
       String str = "context";
       try{
          a.p(p0, str);
          int sDK_INT = Build$VERSION.SDK_INT;
          if (sDK_INT >= 26) {
             NotificationChannel notification = new NotificationChannel("default_push_sdk_notify_channel", "推送通知", 4);
             notification.enableLights(true);
             notification.enableVibration(true);
             notification.setShowBadge(true);
             if (sDK_INT >= 29) {
                notification.setAllowBubbles(true);
             }
             notification.setLockscreenVisibility(true);
             notification.setBypassDnd(true);
             NotificationManager systemServic = p0.getSystemService("notification");
             if (systemServic != null) {
                systemServic.createNotificationChannel(notification);
             }
          }
       }catch(java.lang.Exception e5){
          PushLogcat.INSTANCE.e("KwaiPushSDK", "push sdk createChannel fatal", e5);
       }
       return;
    }
    public static final void createChannelForChannelPush(Context p0){
       String str = "context";
       try{
          a.p(p0, str);
          int sDK_INT = Build$VERSION.SDK_INT;
          if (sDK_INT >= 26) {
             NotificationChannel notification = new NotificationChannel("push_sdk_notify_channel_no_limit", "渠道推送通知", 4);
             notification.enableLights(true);
             notification.enableVibration(true);
             notification.setShowBadge(true);
             if (sDK_INT >= 29) {
                notification.setAllowBubbles(true);
             }
             notification.setLockscreenVisibility(true);
             notification.setBypassDnd(true);
             NotificationManager systemServic = p0.getSystemService("notification");
             if (systemServic != null) {
                systemServic.createNotificationChannel(notification);
             }
          }
       }catch(java.lang.Exception e5){
          PushLogcat.INSTANCE.e("KwaiPushSDK", "push sdk createChannelForChannelPush fatal", e5);
       }
       return;
    }
    public static final Object fetchInitiativePush(String p0,Channel p1,Map p2,c p3){
       if (!PushSDKInitState.INSTANCE.isInit().get()) {
          return null;
       }
       return PushApi.INSTANCE.fetchInitiativePush(p0, p1, p2, p3);
    }
    public static Object fetchInitiativePush$default(String p0,Channel p1,Map p2,c p3,int p4,Object p5){
       LinkedHashMap linkedHashMa;
       if (p4 & 0x04) {
          linkedHashMa = new LinkedHashMap();
       }
       return KwaiPush.fetchInitiativePush(p0, p1, linkedHashMa, p3);
    }
    public static final Channel getPushChannel(Activity p0){
       Channel channel;
       a.p(p0, "activity");
       Channel uChannel = null;
       if (!ContextExtKt.isMainProcess(p0)) {
          return uChannel;
       }
       try{
          if (p0 instanceof ActivityChannelProvider) {
             channel = p0.getChannel();
          label_0017 :
             uChannel = channel;
          }else {
             String stringExtra = p0.getIntent().getStringExtra("provider");
             Locale locale = (stringExtra == null || u.S1(stringExtra))? 1: null;
             if (!locale) {
                locale = Locale.ROOT;
                a.o(locale, "Locale.ROOT");
                if (stringExtra != null) {
                   stringExtra = stringExtra.toUpperCase(locale);
                   a.o(stringExtra, "\(this as java.lang.String\).toUpperCase\(locale\)");
                   channel = Channel.valueOf(stringExtra);
                   goto label_0017 ;
                }else {
                   throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
             }
          }
       }catch(java.lang.Exception e4){
          PushLogcat.INSTANCE.e("KwaiPushSDK", "push sdk getPushChannel fatal", e4);
       }
       return uChannel;
    }
    public static final void initialize(Application p0,PushConfig p1){
       KwaiPush.initialize$default(p0, p1, null, 4, null);
    }
    public static final void initialize(Application p0,PushConfig p1,l p2){
       a.p(p0, "application");
       a.p(p1, "config");
       a.p(p2, "coreInit");
       PushSDKInitUtilKt.waitingInitLock(new KwaiPush$initialize$2(p0, p1, p2));
    }
    public static void initialize$default(Application p0,PushConfig p1,l p2,int p3,Object p4){
       KwaiPush$initialize$1 oinitialize$;
       if (p3 & 0x04) {
          oinitialize$ = new KwaiPush$initialize$1(p0, p1);
       }
       KwaiPush.initialize(p0, p1, oinitialize$);
       return;
    }
    public static final void refreshToken(){
       KwaiPush.INSTANCE.refreshToken(true);
    }
    public static final void removeClickInterceptor(Interceptor p0){
       a.p(p0, "interceptor");
       Processor.INSTANCE.getClickNotificationInterceptors().remove(p0);
    }
    public static final void removeClickInterceptorAll(){
       Processor.INSTANCE.getClickNotificationInterceptors().clear();
    }
    public static final void removeCommandInterceptor(Interceptor p0){
       a.p(p0, "interceptor");
       Processor.INSTANCE.getCommandInterceptors().remove(p0);
    }
    public static final void removeCommandInterceptorAll(){
       Processor.INSTANCE.getCommandInterceptors().clear();
    }
    public static final void removeProcessInterceptor(Interceptor p0){
       a.p(p0, "interceptor");
       Processor.INSTANCE.getParseNotificationInterceptors().remove(p0);
    }
    public static final void removeProcessInterceptorAll(){
       Processor.INSTANCE.getParseNotificationInterceptors().clear();
    }
    public static void sinkChannelVersionToSdk$default(KwaiPush p0,Map p1,int p2,Object p3){
       LinkedHashMap linkedHashMa;
       if (p2 & 0x01) {
          linkedHashMa = new LinkedHashMap();
       }
       p0.sinkChannelVersionToSdk(linkedHashMa);
       return;
    }
    public final void baseInitInternal(Application p0,PushConfig p1){
       KwaiPush.initTimeStamp = SystemClock.elapsedRealtime();
       KwaiPush.createChannel(p0);
       KwaiPush.createChannelForChannelPush(p0);
       ActivityStack.init(p0);
       KwaiPush.sinkChannelVersionToSdk$default(this, null, 1, null);
       this.staticConfigIsGoodToGo();
       this.sinkConfigToConfigManger(p1);
       this.logSystemInfo();
       if (!p1.getLaunchPushV3ProcessManually()) {
          this.launchPushV3Process(p0);
       }else {
          PushLogcat.INSTANCE.i("KwaiPushSDK", "push v3 process launch manually and push sdk not launch it!");
       }
       return;
    }
    public final Object coreInitInternal(Application p0,PushConfig p1,c p2){
       KwaiPush$coreInitInternal$1 uocoreInitIn;
       if (p2 instanceof KwaiPush$coreInitInternal$1) {
          uocoreInitIn = p2;
          KwaiPush$coreInitInternal$1 label = uocoreInitIn.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uocoreInitIn.label = label - i;
          label_0018 :
             KwaiPush$coreInitInternal$1 result = uocoreInitIn.result;
             Object obj = b.h();
             KwaiPush$coreInitInternal$1 label1 = uocoreInitIn.label;
             if (label1 != null) {
                if (label1 == 1) {
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                PushLogcat iNSTANCE = PushLogcat.INSTANCE;
                iNSTANCE.i("KwaiPushSDK", "push core init is beginning...");
                KwaiPush iNSTANCE1 = KwaiPush.INSTANCE;
                iNSTANCE1.dynamicConfigIsGoodToGo();
                iNSTANCE.i("KwaiPushSDK", "push sdk is register...");
                KwaiPush.registerInstance = new RegisterLoader(p0, KwaiPush.initTimeStamp, n.t(p1.getInitRegisterInterceptors())).getRegisterInstances();
                iNSTANCE1.sinkChannelVersionToSdk(KwaiPush.registerInstance);
                iNSTANCE.i("KwaiPushSDK", "push sdk are registered version is "+PushLogger.h.f());
                SystemPushStateReporter.INSTANCE.init();
                uocoreInitIn.label = 1;
                if (a.i(z0.g(), new KwaiPush$coreInitInternal$2$1(null), uocoreInitIn) == obj) {
                   return obj;
                }
             }
             KwaiPush.INSTANCE.refreshToken(false);
             p0 = Result.constructor-impl(l1.a);
             Throwable throwable = Result.exceptionOrNull-impl(p0);
             if (throwable != null) {
                PushLogcat.INSTANCE.e("KwaiPushSDK", "push core init fatal!!! "+throwable.getMessage(), throwable);
                Pair[] pairArray = new Pair[false];
                PushLogger.c().f("tag_error_init_sdk", "push core init fatal!!! "+throwable.getMessage(), throwable, pairArray);
             }
             return l1.a;
          }
       }
       uocoreInitIn = new KwaiPush$coreInitInternal$1(this, p2);
       goto label_0018 ;
    }
    public final void dynamicConfigIsGoodToGo(){
       Pair pair = PushConfigManager.INSTANCE.dynamicConfigIsGoodToGo();
       int i = pair.component2().intValue();
       if (!pair.component1().booleanValue() && !i) {
          IllegalArgumentException illegalArgum = new IllegalArgumentException("动态配置不正确,请配置默认图标 see{@link PushConfig#notificationSmallIcon}");
          Pair[] pairArray = new Pair[0];
          f.g(PushLogger.c(), "initOnMainProcess", null, illegalArgum, pairArray, 2, null);
          if (!AzerothCodeAdapter.b.isDebugMode()) {
             PushLogcat.INSTANCE.e("KwaiPushSDK", "push sdk dynamicConfigIsGoodToGo is wrong", illegalArgum);
          }else {
             throw illegalArgum;
          }
       }
       return;
    }
    public final void launchPushV3Process(Application p0){
       a.p(p0, "application");
       a.a(p0, new Intent(p0, PushV3ProcessLauncherService.class), new KwaiPush$launchPushV3Process$1(), 1);
    }
    public final void logSystemInfo(){
       try{
          AzerothCodeAdapter b = AzerothCodeAdapter.b;
          PushLogcat.INSTANCE.i("KwaiPushSDK", "azeroth info appVersion: "+b.getAppVersion()+' '+"deviceId: "+b.getDeviceId()+' '+"globalId: "+b.getGlobalId()+' '+"uid: "+b.getUserId()+' '+"model: "+b.getManufacturerAndModel()+' '+"SystemVersion: "+b.getSysRelease()+' ');
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public final void refreshToken(boolean p0){
       PushSDKInitUtilKt.requirePushInit(new KwaiPush$refreshToken$1(p0));
    }
    public final void runPending(){
       KwaiPush.isCoreNeedPendingRunning = false;
       Iterator iterator = CollectionsKt___CollectionsKt.J5(KwaiPush.corePendingRunnableList).iterator();
       while (iterator.hasNext()) {
          iterator.next().run();
          Result.constructor-impl(l1.a);
       }
       KwaiPush.corePendingRunnableList.clear();
       return;
    }
    public final void sinkChannelVersionToSdk(Map p0){
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Channel key = uEntry.getKey();
          linkedHashMa.put(key.name(), uEntry.getValue().sdkVersion());
       }
       linkedHashMa.put("LIB_DISPATCHER", "3.6.24");
       linkedHashMa.put("LIB_REGISTER", "3.6.24");
       linkedHashMa.put("LIB_COMMON", "3.6.24");
       linkedHashMa.put("LIB_API", "3.6.24");
       PushLogger h = PushLogger.h;
       h.f().clear();
       h.f().putAll(linkedHashMa);
       return;
    }
    public final void sinkConfigToConfigManger(PushConfig p0){
       PushConfigManager iNSTANCE = PushConfigManager.INSTANCE;
       iNSTANCE.getDynamicConfig().put("notificationDataSubClass", p0.getPushDataSubClass());
       iNSTANCE.getDynamicConfig().put("commandDataSubClass", p0.getCommandDataSubClass());
       iNSTANCE.getDynamicConfig().put("startSuicideProcessToProcess", Boolean.valueOf(p0.getStartSuicideProcessToProcess()));
       iNSTANCE.getDynamicConfig().put("notificationSmallIcon", p0.getNotificationSmallIcon());
       iNSTANCE.getDynamicConfig().put("coroutineDispatcher", p0.getCoroutineDispatcher());
       iNSTANCE.getDynamicConfig().put("apiBuilder", p0.getApiBuilder());
    }
    public final void staticConfigIsGoodToGo(){
       if (!PushConfigManager.INSTANCE.staticConfigIsGoodToGo()) {
          IllegalArgumentException illegalArgum = new IllegalArgumentException("静态配置不正确,可能是文件丢失,或者版本过低,PushSdk支持配置最低版本为:1, 需要从服务器重新按业务线下载!");
          Pair[] pairArray = new Pair[0];
          f.g(PushLogger.c(), "initOnMainProcess", null, illegalArgum, pairArray, 2, null);
          if (!AzerothCodeAdapter.b.isDebugMode()) {
             PushLogcat.INSTANCE.e("KwaiPushSDK", "push sdk staticConfigIsGoodToGo is wrong", illegalArgum);
          }else {
             throw illegalArgum;
          }
       }
       return;
    }
}
