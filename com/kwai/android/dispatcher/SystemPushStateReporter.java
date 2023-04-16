package com.kwai.android.dispatcher.SystemPushStateReporter;
import com.kwai.android.common.utils.ActivityStack$OnStackChangedListener;
import java.lang.Object;
import android.app.NotificationChannel;
import java.util.Map;
import java.util.HashMap;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.net.Uri;
import com.google.gson.JsonObject;
import com.kwai.android.common.config.PushPreference;
import java.lang.Integer;
import java.lang.Number;
import com.kwai.android.common.ext.JsonObjectExtKt;
import java.lang.Long;
import com.google.gson.JsonElement;
import com.kwai.android.common.utils.ActivityStack;
import kotlin.Result;
import android.content.Context;
import com.kwai.android.common.utils.ContextProvider;
import vk7.g0;
import java.lang.Boolean;
import java.lang.Throwable;
import qrd.j0;
import android.os.SystemClock;
import com.kwai.android.common.config.PushConfigManager;
import qrd.l1;
import android.app.Activity;
import b45.d;
import androidx.core.app.e;
import com.kwai.android.api.PushApi;
import com.kwai.lib.interfacies.AzerothCodeAdapter;
import java.util.Date;
import com.kwai.android.dispatcher.SystemPushStateReporter$reportSystemPushStateInAPI$1$1;
import com.android.kwai.foundation.network.IRpcService$Callback;
import com.kwai.android.common.utils.PushLogcat;
import java.lang.StringBuilder;
import java.util.ArrayList;
import android.os.Build$VERSION;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import p45.f;
import com.kwai.android.pushlog.PushLogger;

public final class SystemPushStateReporter implements ActivityStack$OnStackChangedListener	// class@0009b9
{
    public static final SystemPushStateReporter INSTANCE;
    public static long appPauseTs;
    public static boolean isInit;

    static {
       SystemPushStateReporter.INSTANCE = new SystemPushStateReporter();
    }
    public void SystemPushStateReporter(){
       super();
    }
    public final Map getChannelInfo(NotificationChannel p0){
       HashMap hashMap = new HashMap();
       String id = p0.getId();
       a.o(id, "channel.id");
       hashMap.put("id", id);
       hashMap.put("name", p0.getName().toString());
       hashMap.put("importance", String.valueOf(p0.getImportance()));
       id = (!p0.getImportance())? String.valueOf(-1): String.valueOf(1);
       hashMap.put("notify_setting", id);
       id = (p0.getSound() == null)? String.valueOf(-1): String.valueOf(1);
       hashMap.put("sound_setting", id);
       id = (p0.canShowBadge())? String.valueOf(1): String.valueOf(-1);
       hashMap.put("badge_setting", id);
       hashMap.put("lock_screen_setting2", this.getLockScreenVisibilityInternal(p0));
       String str = (p0.shouldShowLights())? String.valueOf(1): String.valueOf(-1);
       hashMap.put("lights_setting2", str);
       return hashMap;
    }
    public final String getConfigJson(){
       JsonObject jsonObject = new JsonObject();
       JsonObjectExtKt.set(jsonObject, "msg_num", Integer.valueOf(PushPreference.getCombineShowNum()));
       JsonObjectExtKt.set(jsonObject, "barrier_time", Long.valueOf(PushPreference.getCombineBarrierMills()));
       String str = jsonObject.toString();
       a.o(str, "json.toString\(\)");
       return str;
    }
    public final String getLockScreenVisibilityInternal(NotificationChannel p0){
       int lockscreenVi = p0.getLockscreenVisibility();
       int i = -1;
       if (lockscreenVi != -1000) {
          if (lockscreenVi != i) {
             i = (lockscreenVi)? 0: 2;
          }
       }else {
          i = 1;
       }
       return String.valueOf(i);
    }
    public final void init(){
       if (SystemPushStateReporter.isInit) {
          return;
       }
       SystemPushStateReporter.isInit = true;
       this.reportSystemPushStateInAPI(true);
       this.reportSystemPushStateInLogger();
       ActivityStack.addStackChangedListener(this);
       return;
    }
    public final boolean isEnableCalendar(){
       Context context = ContextProvider.getContext();
       boolean b = (!g0.a(context, "android.permission.READ_CALENDAR") && !g0.a(context, "android.permission.WRITE_CALENDAR"))? true: false;
       Boolean uBoolean = Result.constructor-impl(Boolean.valueOf(b));
       Boolean fALSE = Boolean.FALSE;
       if (Result.isFailure-impl(uBoolean)) {
          uBoolean = fALSE;
       }
       return uBoolean.booleanValue();
    }
    public void onAppPause(){
       SystemPushStateReporter.appPauseTs = SystemClock.elapsedRealtime();
    }
    public void onAppResume(){
       if ((SystemClock.elapsedRealtime() - SystemPushStateReporter.appPauseTs) - PushConfigManager.INSTANCE.getStayBackgroundThreshold() >= 0 && SystemPushStateReporter.appPauseTs) {
          SystemPushStateReporter.INSTANCE.reportSystemPushStateInAPI(false);
       }
       Result.constructor-impl(l1.a);
       return;
    }
    public void onPop(Activity p0){
       d.c(this, p0);
    }
    public void onPush(Activity p0){
       d.d(this, p0);
    }
    public void onStackGonnaEmpty(Activity p0){
       d.e(this, p0);
    }
    public final void reportSystemPushStateInAPI(boolean p0){
       e uoe = e.e(ContextProvider.getContext());
       a.o(uoe, "NotificationManagerCompa¡­extProvider.getContext\(\)\)");
       PushApi iNSTANCE = PushApi.INSTANCE;
       String deviceId = AzerothCodeAdapter.b.getDeviceId();
       boolean b = uoe.a();
       Date lastReportSt = PushPreference.getLastReportStateDate();
       long time = (lastReportSt != null)? lastReportSt.getTime(): null;
       SystemPushStateReporter iNSTANCE1 = SystemPushStateReporter.INSTANCE;
       iNSTANCE.reportSystemNotifyState(deviceId, b, p0, time, iNSTANCE1.getConfigJson(), iNSTANCE1.isEnableCalendar(), new SystemPushStateReporter$reportSystemPushStateInAPI$1$1());
       PushLogcat.INSTANCE.i("KwaiPushSDK", "report system push state in api way done");
       Throwable obj = Result.constructor-impl(l1.a);
       obj = Result.exceptionOrNull-impl(obj);
       if (obj != null) {
          PushLogcat.INSTANCE.e("KwaiPushSDK", "report system push state in api way error!! "+obj.getMessage(), obj);
       }
       return;
    }
    public final void reportSystemPushStateInLogger(){
       e uoe = e.e(ContextProvider.getContext());
       a.o(uoe, "NotificationManagerCompa¡­extProvider.getContext\(\)\)");
       ArrayList uArrayList = new ArrayList();
       if (Build$VERSION.SDK_INT >= 26) {
          List list = uoe.h();
          a.o(list, "notificationManager.notificationChannels");
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             NotificationChannel notification = iterator.next();
             a.o(notification, "it");
             uArrayList.add(SystemPushStateReporter.INSTANCE.getChannelInfo(notification));
          }
       }
       PushLogger.c().e(uoe.a(), uArrayList);
       PushLogcat.INSTANCE.i("KwaiPushSDK", "report system push state in logger way done");
       Throwable obj = Result.constructor-impl(l1.a);
       obj = Result.exceptionOrNull-impl(obj);
       if (obj != null) {
          PushLogcat.INSTANCE.e("KwaiPushSDK", "report system push state in logger way error!! "+obj.getMessage(), obj);
       }
       return;
    }
}
