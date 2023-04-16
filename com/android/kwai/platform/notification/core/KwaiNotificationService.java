package com.android.kwai.platform.notification.core.KwaiNotificationService;
import t7.b;
import java.lang.Object;
import msd.l;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import java.lang.String;
import zsd.u;
import java.lang.reflect.Method;
import java.util.List;
import java.lang.Exception;
import v7.a;
import kotlin.Pair;
import java.lang.Throwable;
import java.util.Iterator;
import java.lang.Iterable;
import android.app.NotificationChannel;
import kotlin.jvm.internal.a;
import android.content.Context;
import com.kwai.lib.interfacies.AzerothCodeAdapter;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import qrd.r0;
import java.lang.Integer;
import java.lang.Number;
import android.app.Notification;
import android.widget.Toast;
import java.lang.IllegalAccessException;
import java.lang.System;
import java.io.PrintStream;
import t7.a;
import qrd.l1;
import java.lang.Void;
import android.os.Trace;
import t7.f;
import com.android.kwai.platform.notification.core.KwaiNotificationService$install$1;
import com.android.kwai.platform.notification.core.KwaiNotificationService$install$2;
import msd.a;
import msd.q;
import t7.f$a;
import android.os.Build$VERSION;
import android.os.Bundle;
import com.android.kwai.platform.notification.core.MethodCallName;
import t7.c;

public final class KwaiNotificationService	// class@000404
{
    public static final b a;
    public static Context b;
    public static boolean c;
    public static final KwaiNotificationService d;

    static {
       KwaiNotificationService.d = new KwaiNotificationService();
       KwaiNotificationService.a = new b();
    }
    public void KwaiNotificationService(){
       super();
    }
    public static final boolean a(KwaiNotificationService p0){
       return KwaiNotificationService.c;
    }
    public static final b b(KwaiNotificationService p0){
       return KwaiNotificationService.a;
    }
    public final void c(Object[] p0,l p1){
       b a;
       Object obj = p0;
       if (!obj) {
          return;
       }
       int len = obj.length;
       boolean b = false;
       Iterable iterable = null;
       int i = 0;
       int i1 = 2;
       while (i < len) {
          object oobject = obj[i];
          if (oobject != null && u.J1(m0.d(oobject.getClass()).o(), "android.content.pm.ParceledListSlice", b, i1, null)) {
             try{
                Class[] uClassArray = new Class[b];
                Object[] objArray = new Object[b];
                iterable = Class.forName("android.content.pm.ParceledListSlice").getDeclaredMethod("getList", uClassArray).invoke(oobject, objArray);
             }catch(java.lang.Exception e0){
                Exception uException = e0;
                uException.printStackTrace();
                a.b(a.c, "logger_internal_error", "get channel list failure.", null, uException, 4, null);
             }
          }
          i = i + 1;
       }
       if (iterable != null) {
          Iterator iterator = iterable.iterator();
          while (iterator.hasNext()) {
             NotificationChannel notification = iterator.next();
             a = KwaiNotificationService.a;
             Context b1 = KwaiNotificationService.b;
             if (b1 == null) {
                a.S("mContext");
             }
             if (a.n(b1, notification)) {
                p1.invoke(obj);
                AzerothCodeAdapter.b.logI("KwaiNotifyService", "create the channel in system. channel:"+notification.getId()+" name:"+notification.getName());
             }else {
                AzerothCodeAdapter.b.logE("KwaiNotifyService", "forbidden create channel\("+notification.getName()+"\), because the channel\("+notification.getId()+"\) is not in the whitelist! Please contact baiyahao who\'s in KuaiShou", null);
                Pair[] pairArray = new Pair[i1];
                pairArray[b] = r0.a("channelName", notification.getName().toString());
                pairArray[1] = r0.a("channelId", notification.getId());
                a.b(a.c, "logger_notification_channel_forbidden_warning", "forbidden create channel\("+notification.getName()+"\), because the channel\("+notification.getId()+"\) is not in the whitelist!", pairArray, null, 8, null);
                KwaiNotificationService.d.g('['+notification.getName()+"] ["+notification.getId()+"] Channel禁止创建,请增加配置,联系白亚豪");
             }
          }
       }else {
          AzerothCodeAdapter.b.logE("KwaiNotifyService", "get channel list failure.", null);
          a.b(a.c, "logger_internal_error", "get channel list failure.", null, null, 12, null);
       }
       return;
    }
    public final void d(){
       KwaiNotificationService.c = true;
    }
    public final void e(){
       KwaiNotificationService.c = false;
    }
    public final void f(Object[] p0,l p1){
       if (p0 == null) {
          return;
       }
       int len = p0.length;
       int i = 0;
       Notification notification = null;
       int i1 = -1;
       while (i < len) {
          object oobject = p0[i];
          if (oobject instanceof Integer) {
             if (i1 == -1) {
                i1 = oobject.intValue();
             }
          }else if(oobject instanceof Notification){
             notification = oobject;
          }
          i = i + 1;
       }
       this.m(notification, i1, p1, p0);
       return;
    }
    public final void g(String p0){
       a.p(p0, "msg");
       if (AzerothCodeAdapter.b.isDebugMode()) {
          Context b = KwaiNotificationService.b;
          if (b == null) {
             a.S("mContext");
          }
          Toast.makeText(b, p0, 1).show();
          new IllegalAccessException(p0).printStackTrace(System.err);
       }
       return;
    }
    public final a h(String p0){
       a.p(p0, "channelId");
       return KwaiNotificationService.a.c(p0);
    }
    public final Object i(Method p0,Object[] p1,l p2){
       l1 ol1 = (!a.g(p0.getReturnType(), m0.d(l1.class)) && !a.g(p0.getReturnType(), Void.class))? null: l1.a;
       return ol1;
    }
    public final NotificationChannel j(Object[] p0,l p1){
       if (p0 != null) {
          int len = p0.length;
          int i = 0;
          int i1 = 0;
          while (i < len) {
             object oobject = p0[i];
             int i2 = i1 + 1;
             if (i1 == 3) {
                p0[3] = KwaiNotificationService.a.p(String.valueOf(oobject));
             }
             i = i + 1;
             i1 = i2;
          }
       }
       return p1.invoke(p0);
    }
    public final void k(Context p0){
       a.p(p0, "context");
       KwaiNotificationService.b = p0;
       Trace.beginSection("KwaiNotificationManager.step2-1");
       f.b.a(new KwaiNotificationService$install$1(p0), KwaiNotificationService$install$2.INSTANCE);
       Trace.endSection();
    }
    public final boolean l(){
       return KwaiNotificationService.a.g();
    }
    public final void m(Notification p0,int p1,l p2,Object[] p3){
       b a;
       boolean b;
       Notification notification = p0;
       int i = p1;
       if (notification) {
          Notification extras = notification.extras;
          a.o(extras, "it.extras");
          String str = " content:";
          if (Build$VERSION.SDK_INT >= 26) {
             a = KwaiNotificationService.a;
             String channelId = p0.getChannelId();
             String str1 = "it.channelId";
             a.o(channelId, str1);
             String str2 = "  id:";
             if (a.f(channelId)) {
                AzerothCodeAdapter.b.logI("KwaiNotifyService", "pass notification to system ,channel:"+p0.getChannelId()+str2+i+str+extras);
                p2.invoke(p3);
             }else {
                channelId = p0.getChannelId();
                a.o(channelId, str1);
                String str3 = " id:";
                if (b.i(a, channelId, false, 2, null)) {
                   a.k(notification);
                   channelId = p0.getChannelId();
                   a.o(channelId, str1);
                   b = a.f(channelId);
                   if (b) {
                      AzerothCodeAdapter.b.logI("KwaiNotifyService", "pass legacy notification to system, channelId has replaced, channel:"+p0.getChannelId()+str2+i+str+extras);
                      p2.invoke(p3);
                      Pair[] pairArray = new Pair[]{r0.a("channelId", p0.getChannelId()),r0.a("notificationId", String.valueOf(p1)),r0.a("content", extras.toString())};
                      a.c.e("logger_notification_enqueue_legacy_info", "pass legacy notification to system, channelId has replaced", pairArray);
                   }else {
                      AzerothCodeAdapter.b.logE("KwaiNotifyService", "forbidden pass notification to system, channel:"+p0.getChannelId()+str3+i+str+extras, null);
                      Pair[] pairArray1 = new Pair[]{r0.a("channelId", p0.getChannelId()),r0.a("notificationId", String.valueOf(p1)),r0.a("content", extras.toString())};
                      a.b(a.c, "logger_notification_enqueue_forbidden_config_wrong_warning", "forbidden pass notification to system", pairArray1, null, 8, null);
                      KwaiNotificationService.d.g('['+i+"] Notification禁止展示,因为Channel被禁止.请检查Channel配置");
                   }
                }else if(a.g()){
                   AzerothCodeAdapter.b.logI("KwaiNotifyService", "according to config no forbidden notifications,channel:"+p0.getChannelId()+str3+i+str+extras);
                   p2.invoke(p3);
                }else {
                   AzerothCodeAdapter.b.logE("KwaiNotifyService", "forbidden pass notification to system id:"+i+str+extras, null);
                   Pair[] pairArray2 = new Pair[]{r0.a("notificationId", String.valueOf(p1)),r0.a("content", extras.toString())};
                   a.b(a.c, "logger_notification_enqueue_forbidden_warning", "forbidden pass notification to system", pairArray2, null, 8, null);
                   KwaiNotificationService.d.g('['+i+"] Notification禁止展示,因为Channel被禁止.请检查Channel配置");
                }
             }
          }else {
             AzerothCodeAdapter.b.logI("KwaiNotifyService", "low sdk pass notification to system , id:"+i+str+extras);
             p2.invoke(p3);
          }
       }
       return;
    }
    public final c n(MethodCallName p0,c p1){
       a.p(p0, "name");
       a.p(p1, "handler");
       return KwaiNotificationService.a.j(p0, p1);
    }
    public final void o(Notification p0,String p1){
       a.p(p0, "notification");
       a.p(p1, "newChannelId");
       KwaiNotificationService.a.l(p0, p1);
    }
}
