package t7.b;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.String;
import android.content.Context;
import kotlin.jvm.internal.a;
import com.android.kwai.platform.notification.core.KwaiNotificationService;
import java.util.ArrayList;
import androidx.core.app.e;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import android.app.NotificationChannel;
import java.lang.Exception;
import android.app.NotificationManager;
import android.service.notification.StatusBarNotification;
import android.app.Notification;
import v7.a;
import kotlin.Pair;
import qrd.r0;
import com.kwai.lib.interfacies.AzerothCodeAdapter;
import java.lang.StringBuilder;
import java.lang.NullPointerException;
import t7.a;
import com.android.kwai.platform.notification.core.config.RemoteConfigManager;
import com.android.kwai.platform.notification.core.NotificationConfig;
import t7.d;
import java.lang.reflect.Method;
import t7.c;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Regex;
import java.util.Objects;
import com.android.kwai.platform.notification.core.MethodCallName;
import java.lang.Class;
import java.lang.reflect.Field;
import android.text.TextUtils;
import android.net.Uri;
import android.media.AudioAttributes;
import android.provider.Settings$System;
import android.os.Build$VERSION;

public final class b	// class@002471
{
    public final ConcurrentHashMap a;

    public void b(){
       super();
       this.a = new ConcurrentHashMap();
    }
    public static boolean i(b p0,String p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = false;
       }
       return p0.h(p1, p2);
    }
    public final void a(Context p0){
       String id;
       String id1;
       a.p(p0, "context");
       KwaiNotificationService.d.d();
       try{
          ArrayList uArrayList = new ArrayList();
          e uoe = e.e(p0);
          a.o(uoe, "NotificationManagerCompat.from\(context\)");
          List list = uoe.h();
          a.o(list, "nmc.notificationChannels");
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             NotificationChannel notification = iterator.next();
             String str = "channel";
             if (this.g()) {
                a.o(notification, str);
                id = notification.getId();
                a.o(id, "channel.id");
                if (this.h(id, true)) {
                   id1 = notification.getId();
                   a.o(id1, "channel.id");
                   this.b(p0, id1);
                }
             }else {
                a.o(notification, str);
                id = notification.getId();
                a.o(id, "channel.id");
                if (!this.f(id)) {
                   id = notification.getId();
                   a.o(id, "channel.id");
                   this.b(p0, id);
                   id = notification.getId();
                   a.o(id, "channel.id");
                   if (b.i(this, id, false, 2, null)) {
                      id1 = notification.getId();
                      a.o(id1, "channel.id");
                      uArrayList.add(id1);
                   }
                }
             }
          }
       }catch(java.lang.Exception e9){
          e9.printStackTrace();
       }
       KwaiNotificationService.d.e();
       return;
    }
    public final void b(Context p0,String p1){
       Notification notification;
       String str = "notification";
       Object systemServic = p0.getSystemService(str);
       if (systemServic == null) {
          throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
       }
       StatusBarNotification[] activeNotifi = systemServic.getActiveNotifications();
       int len = activeNotifi.length;
       int i = 0;
       while (true) {
          if (i < len) {
             object oobject = activeNotifi[i];
             a.o(oobject, str);
             if (a.g(oobject.getPackageName(), p0.getPackageName())) {
                notification = oobject.getNotification();
                a.o(notification, "notification.notification");
                if (a.g(p1, notification.getChannelId())) {
                   break ;
                }
             }
             i = i + 1;
          }else {
             systemServic.deleteNotificationChannel(p1);
             return;
          }
       }
       Pair[] pairArray = new Pair[]{r0.a("channelId", p1)};
       a.c.e("logger_cannot_clean_channel", "has notification deleted", pairArray);
       AzerothCodeAdapter.b.logI("KwaiNotifyService", "has notification deleted channelId: "+p1);
       return;
    }
    public final a c(String p0){
       Iterator iterator;
       a uoa;
       a.p(p0, "channelId");
       NotificationConfig notification = RemoteConfigManager.j.g();
       if (b.i(this, p0, false, 2, null)) {
          d uod = this.d(p0);
          if (uod != null) {
             iterator = notification.a().iterator();
             while (iterator.hasNext()) {
                uoa = iterator.next();
                if (a.g(uoa.d(), uod.b())) {
                   return uoa;
                }
             }
          }
       }else {
          iterator = notification.a().iterator();
          while (iterator.hasNext()) {
             uoa = iterator.next();
             if (a.g(uoa.d(), p0)) {
                return uoa;
             }
          }
       }
       return null;
    }
    public final d d(String p0){
       d uod;
       Iterator iterator = RemoteConfigManager.j.g().c().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          uod = iterator.next();
          if (a.g(p0, uod.a())) {
             break ;
          }
       }
       return uod;
    }
    public final boolean e(Method p0,Object[] p1){
       a.p(p0, "method");
       c uoc = this.a.get(p0.getName());
       boolean b = (uoc != null)? uoc.a(p0, p1): false;
       return b;
    }
    public final boolean f(String p0){
       Iterator iterator;
       a.p(p0, "channelId");
       RemoteConfigManager j = RemoteConfigManager.j;
       NotificationConfig notification = j.g();
       List list = j.h();
       if (list != null) {
          iterator = list.iterator();
          while (true) {
             if (iterator.hasNext()) {
                if (a.g(p0, iterator.next())) {
                   return true;
                }
                continue ;
             }
          }
          return false;
       }
       iterator = notification.a().iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (a.g(p0, iterator.next().d())) {
             }else {
                continue ;
             }
          }else {
             goto label_0046 ;
          }
       }
       return true;
    }
    public final boolean g(){
       return RemoteConfigManager.j.g().b();
    }
    public final boolean h(String p0,boolean p1){
       Object obj = p0;
       a.p(obj, "channelId");
       Iterator iterator = RemoteConfigManager.j.g().c().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return 0;
          }
          Object obj1 = iterator.next();
          if (a.g(obj, obj1.a())) {
             break ;
          }else if(p1){
             int i = StringsKt__StringsKt.w3(p0, "_", 0, false, 6, null);
             String str = -1;
             if (i != str) {
                int i1 = i + 1;
                String str1 = obj.substring(i1);
                String str2 = "\(this as java.lang.String\).substring\(startIndex\)";
                a.o(str1, str2);
                String str3 = "^[vV]\\d*$";
                if (new Regex(str3).matches(str1)) {
                   String str4 = obj.substring(0, i);
                   str1 = "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)";
                   a.o(str4, str1);
                   int i2 = StringsKt__StringsKt.w3(obj1.a(), "_", 0, false, 6, null);
                   if (i2 != str) {
                      str = obj1.a();
                      int i3 = i2 + 1;
                      String str5 = "null cannot be cast to non-null type java.lang.String";
                      Objects.requireNonNull(str, str5);
                      str = str.substring(i3);
                      a.o(str, str2);
                      if (new Regex(str3).matches(str)) {
                         str = obj1.a();
                         Objects.requireNonNull(str, str5);
                         str = str.substring(0, i2);
                         a.o(str, str1);
                         if (a.g(str4, str)) {
                            return true;
                         }
                         continue ;
                      }
                   }
                }
             }
          }
       }
       return true;
    }
    public final c j(MethodCallName p0,c p1){
       a.p(p0, "name");
       a.p(p1, "handler");
       return this.a.put(p0.getMethodName$push_notification_release(), p1);
    }
    public final void k(Notification p0){
       NotificationConfig notification;
       a.p(p0, "notification");
       notification = RemoteConfigManager.j.g();
       if (notification != null) {
          Iterator iterator = notification.c().iterator();
          while (iterator.hasNext()) {
             d uod = iterator.next();
             if (a.g(p0.getChannelId(), uod.a())) {
                this.l(p0, uod.b());
             }
          }
       }
       return;
    }
    public final void l(Notification p0,String p1){
       a.p(p0, "notification");
       a.p(p1, "newChannelId");
       Field declaredFiel = p0.getClass().getDeclaredField("mChannelId");
       a.o(declaredFiel, "field");
       declaredFiel.setAccessible(true);
       declaredFiel.set(p0, p1);
    }
    public final void m(Context p0,NotificationChannel p1,String p2){
       Uri uri;
       if (TextUtils.isEmpty(p2)) {
          return;
       }
       try{
          switch (p2.hashCode()){
              case 0x877acd31:
                if (p2.equals("sound_a")) {
                   uri = Uri.parse("android.resource://"+p0.getPackageName()+"/"+R.raw.arg_RES_7f0f0031);
                }else {
                label_008f :
                   uri = null;
                }
                break;
              case 0x877acd32:
                if (p2.equals("sound_b")) {
                   uri = Uri.parse("android.resource://"+p0.getPackageName()+"/"+R.raw.arg_RES_7f0f0032);
                }else {
                   goto label_008f ;
                }
                break;
              case 0x877acd33:
                if (p2.equals("sound_c")) {
                   uri = Uri.parse("android.resource://"+p0.getPackageName()+"/"+R.raw.arg_RES_7f0f0033);
                }else {
                   goto label_008f ;
                }
                break;
              default:
                goto label_008f ;
          }
          if (uri != null) {
             p1.setSound(uri, Notification.AUDIO_ATTRIBUTES_DEFAULT);
          }
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
          p1.setSound(Settings$System.DEFAULT_NOTIFICATION_URI, Notification.AUDIO_ATTRIBUTES_DEFAULT);
       }
       return;
    }
    public final boolean n(Context p0,NotificationChannel p1){
       a.p(p0, "context");
       a.p(p1, "channel");
       NotificationConfig notification = RemoteConfigManager.j.g();
       String id = p1.getId();
       String str = "channel.id";
       a.o(id, str);
       if (this.f(id)) {
          Iterator iterator = notification.a().iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             if (a.g(uoa.d(), p1.getId())) {
                this.o(p1, uoa, p0);
             }
          }
          return true;
       }else {
          id = p1.getId();
          a.o(id, str);
          if (b.i(this, id, false, 2, null)) {
             id = p1.getId();
             a.o(id, str);
             d uod = this.d(id);
             if (uod != null) {
                Field declaredFiel = NotificationChannel.class.getDeclaredField("mId");
                a.o(declaredFiel, "id");
                declaredFiel.setAccessible(true);
                declaredFiel.set(p1, uod.b());
                Iterator iterator1 = notification.a().iterator();
                while (iterator1.hasNext()) {
                   a uoa1 = iterator1.next();
                   if (a.g(uoa1.d(), uod.b())) {
                      this.o(p1, uoa1, p0);
                      return true;
                   }
                }
             }
          }
          return notification.b();
       }
    }
    public final void o(NotificationChannel p0,a p1,Context p2){
       p0.setName(p1.h());
       p0.enableVibration(p1.k());
       p0.enableLights(p1.f());
       p0.setBypassDnd(p1.i());
       p0.setImportance(p1.e());
       p0.setDescription(p1.c());
       p0.setShowBadge(p1.a());
       this.m(p2, p0, p1.j());
       if (Build$VERSION.SDK_INT >= 29) {
          p0.setAllowBubbles(p1.b());
       }
       if (p1.g()) {
          p0.setLockscreenVisibility(1);
       }
       return;
    }
    public final String p(String p0){
       a.p(p0, "channelId");
       Iterator iterator = RemoteConfigManager.j.g().c().iterator();
       while (iterator.hasNext()) {
          d uod = iterator.next();
          if (a.g(uod.a(), p0)) {
             p0 = uod.b();
             break ;
          }
       }
       return p0;
    }
}
