package com.android.kwai.platform.notification.core.config.RemoteConfigManager;
import com.android.kwai.platform.notification.core.NotificationConfig;
import java.util.List;
import nsd.u;
import com.kwai.lib.interfacies.SpAdapter;
import java.lang.String;
import com.android.kwai.platform.notification.core.config.RemoteConfigManager$pushApiBuilder$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.android.kwai.platform.notification.core.config.RemoteConfigManager$clientChannelList$2;
import com.android.kwai.platform.notification.core.config.RemoteConfigManager$forceSendRequest$2;
import java.util.LinkedHashMap;
import com.android.kwai.platform.notification.core.config.RemoteConfigManager$service$2;
import kotlin.Result;
import com.google.gson.Gson;
import com.android.kwai.platform.notification.core.a;
import java.lang.Class;
import java.lang.Object;
import java.lang.Throwable;
import qrd.j0;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.System;
import com.android.kwai.platform.notification.core.config.IRemoteService;
import com.android.kwai.platform.notification.core.config.RemoteConfigManager$fetchConfig$1;
import com.android.kwai.foundation.network.IRpcService$Callback;
import com.android.kwai.foundation.network.core.ICancelFeature;
import java.util.Map;
import gv6.c;

public final class RemoteConfigManager	// class@00040f
{
    public static a a;
    public static NotificationConfig b;
    public static long c;
    public static final p d;
    public static final p e;
    public static final p f;
    public static final Map g;
    public static boolean h;
    public static final p i;
    public static final RemoteConfigManager j;

    static {
       NotificationConfig notification1;
       RemoteConfigManager.j = new RemoteConfigManager();
       NotificationConfig notification = new NotificationConfig(null, null, false, 7, null);
       RemoteConfigManager.b = v0;
       SpAdapter b = SpAdapter.b;
       RemoteConfigManager.c = b.getLong("channel_config_timestamp", 0);
       RemoteConfigManager.d = s.c(RemoteConfigManager$pushApiBuilder$2.INSTANCE);
       RemoteConfigManager.e = s.c(RemoteConfigManager$clientChannelList$2.INSTANCE);
       RemoteConfigManager.f = s.c(RemoteConfigManager$forceSendRequest$2.INSTANCE);
       RemoteConfigManager.g = new LinkedHashMap();
       RemoteConfigManager.i = s.c(RemoteConfigManager$service$2.INSTANCE);
       String str = null;
       String str1 = b.getString("notification_config", str);
       if (str1 != null) {
          a uoa = new Gson().h(str1, a.class);
          if (uoa != null) {
             notification = uoa.a();
             if (notification != null) {
             label_0073 :
                RemoteConfigManager.b = notification;
                Object obj = Result.constructor-impl(uoa);
                if (!Result.isFailure-impl(obj)) {
                   str = obj;
                }
                RemoteConfigManager.a = str;
             }
          }
          notification1 = new NotificationConfig(null, null, false, 7, null);
          goto label_0073 ;
       }else {
          notification1 = new NotificationConfig(null, null, false, 7, null);
          RemoteConfigManager.b = str1;
       }
    }
    public void RemoteConfigManager(){
       super();
    }
    public static final a a(RemoteConfigManager p0){
       return RemoteConfigManager.a;
    }
    public static final long b(RemoteConfigManager p0){
       return RemoteConfigManager.c;
    }
    public static final void c(RemoteConfigManager p0,NotificationConfig p1){
       RemoteConfigManager.b = p1;
    }
    public static final void d(RemoteConfigManager p0,a p1){
       RemoteConfigManager.a = p1;
    }
    public static final void e(RemoteConfigManager p0,long p1){
       RemoteConfigManager.c = p1;
    }
    public final void f(){
       a a;
       if (RemoteConfigManager.h) {
          return;
       }
       RemoteConfigManager$fetchConfig$1 uofetchConfi = -1;
       if (!a.g(this.j(), Boolean.TRUE)) {
          a = RemoteConfigManager.a;
          if (a != null) {
             uofetchConfi = a.b();
          }
       }
       if ((System.currentTimeMillis() - RemoteConfigManager.c) - uofetchConfi >= 0) {
          RemoteConfigManager.h = true;
          this.l().fetchRemoteConfig(new RemoteConfigManager$fetchConfig$1());
       }
       return;
    }
    public final NotificationConfig g(){
       return RemoteConfigManager.b;
    }
    public final List h(){
       return RemoteConfigManager.e.getValue();
    }
    public final Map i(){
       return RemoteConfigManager.g;
    }
    public final Boolean j(){
       return RemoteConfigManager.f.getValue();
    }
    public final c k(){
       return RemoteConfigManager.d.getValue();
    }
    public final IRemoteService l(){
       return RemoteConfigManager.i.getValue();
    }
    public final void m(boolean p0){
       RemoteConfigManager.h = p0;
    }
}
