package com.vivo.push.util.NotifyAdapterUtil;
import java.lang.Object;
import android.content.Context;
import android.app.NotificationManager;
import java.lang.String;
import android.os.Build$VERSION;
import android.app.NotificationChannel;
import java.lang.CharSequence;
import android.content.res.Resources;
import android.content.res.Configuration;
import java.util.Locale;
import java.util.List;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.d.r$a;
import com.vivo.push.util.p;
import com.vivo.push.util.BaseNotifyDataAdapter;
import com.vivo.push.util.NotifyUtil;
import com.vivo.push.model.UPSNotificationMessage;
import android.text.TextUtils;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.app.Notification$Builder;
import android.app.Notification;
import android.widget.RemoteViews;
import com.vivo.push.util.BaseNotifyLayoutAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;
import android.graphics.Bitmap;
import android.media.AudioManager;
import java.lang.StringBuilder;
import android.content.Intent;
import com.vivo.push.util.a;
import com.vivo.push.c.d;
import com.vivo.push.c.b;
import java.security.PublicKey;
import java.security.Key;
import com.vivo.push.util.u;
import java.lang.Exception;
import com.vivo.push.b.p;
import com.vivo.push.o;
import android.os.SystemClock;
import android.app.PendingIntent;
import com.vivo.push.e;
import java.lang.Throwable;
import android.graphics.BitmapFactory;
import com.vivo.push.util.c;
import java.lang.System;
import android.app.Notification$BigTextStyle;
import android.app.Notification$Style;
import android.app.Notification$BigPictureStyle;
import com.vivo.push.util.w;
import com.vivo.push.util.b;

public class NotifyAdapterUtil	// class@0010ac
{
    public static NotificationManager sNotificationManager;
    public static int sNotifyId;

    public void NotifyAdapterUtil(){
       super();
    }
    public static void cancelNotify(Context p0){
       NotifyAdapterUtil.cancelNotify(p0, NotifyAdapterUtil.sNotifyId);
    }
    public static boolean cancelNotify(Context p0,int p1){
       NotifyAdapterUtil.initAdapter(p0);
       NotificationManager sNotificatio = NotifyAdapterUtil.sNotificationManager;
       if (sNotificatio == null) {
          return false;
       }
       sNotificatio.cancel(p1);
       return true;
    }
    public static synchronized void initAdapter(Context p0){
       NotificationChannel notification;
       _monitor_enter(NotifyAdapterUtil.class);
       if (NotifyAdapterUtil.sNotificationManager == null) {
          NotifyAdapterUtil.sNotificationManager = p0.getSystemService("notification");
       }
       if (Build$VERSION.SDK_INT >= 26) {
          NotificationManager sNotificatio = NotifyAdapterUtil.sNotificationManager;
          if (sNotificatio != null) {
             String str = "default";
             notification = sNotificatio.getNotificationChannel(str);
             if (notification != null) {
                CharSequence name = notification.getName();
                if (("推送通知").equals(name) || ("PUSH").equals(name)) {
                   NotifyAdapterUtil.sNotificationManager.deleteNotificationChannel(str);
                }
             }
             String str1 = (NotifyAdapterUtil.isZh(p0))? "推送通知": "PUSH";
             notification = new NotificationChannel("vivo_push_channel", str1, 4);
             notification.setLightColor(-16711936);
             notification.enableVibration(true);
             notification.setLockscreenVisibility(true);
             NotifyAdapterUtil.sNotificationManager.createNotificationChannel(notification);
          }
       }
       _monitor_exit(NotifyAdapterUtil.class);
       return;
    }
    public static boolean isZh(Context p0){
       return (p0.getResources().getConfiguration().locale.getLanguage()).endsWith("zh");
    }
    public static void pushNotification(Context p0,List p1,InsideNotificationItem p2,long p3,int p4,r$a p5){
       p.d("NotifyManager", "pushNotification");
       NotifyAdapterUtil.initAdapter(p0);
       int notifyMode = NotifyUtil.getNotifyDataAdapter(p0).getNotifyMode(p2);
       int i = 1;
       if (!TextUtils.isEmpty(p2.getPurePicUrl()) && (p1 != null && (p1.size() > i && p1.get(i) != null))) {
          notifyMode = 1;
       }
    label_002c :
       if (notifyMode == 2) {
          NotifyAdapterUtil.pushNotificationBySystem(p0, p1, p2, p3, p4, p5);
          return;
       }else if(notifyMode == i){
          NotifyAdapterUtil.pushNotificationByCustom(p0, p1, p2, p3, p5);
       }
       return;
    }
    public static void pushNotificationByCustom(Context p0,List p1,InsideNotificationItem p2,long p3,r$a p4){
       Notification$Builder uBuilder;
       Notification notification;
       int i;
       Context uContext = p0;
       List list = p1;
       long l = p3;
       String str = "com.vivo.pushservice";
       Resources resources = p0.getResources();
       String packageName = p0.getPackageName();
       String title = p2.getTitle();
       int defaultNotif = NotifyUtil.getNotifyDataAdapter(p0).getDefaultNotifyIcon();
       ApplicationInfo icon = p0.getApplicationInfo().icon;
       Bundle uBundle = new Bundle();
       uBundle.putLong("pushId", l);
       if (Build$VERSION.SDK_INT >= 26) {
          uBuilder = new Notification$Builder(uContext, "vivo_push_channel");
          if (defaultNotif > 0) {
             uBundle.putInt("vivo.summaryIconRes", defaultNotif);
          }
          uBuilder.setExtras(uBundle);
          notification = uBuilder.build();
       }else {
          uBuilder = new Notification$Builder(uContext);
          uBuilder.setExtras(uBundle);
          notification = uBuilder.build();
       }
       notification.priority = 2;
       notification.flags = 16;
       notification.tickerText = title;
       int defaultSmall = NotifyUtil.getNotifyDataAdapter(p0).getDefaultSmallIconId();
       if (defaultSmall <= 0) {
          defaultSmall = icon;
       }
       notification.icon = defaultSmall;
       RemoteViews remoteViews = new RemoteViews(packageName, NotifyUtil.getNotifyLayoutAdapter(p0).getNotificationLayout());
       remoteViews.setTextViewText(resources.getIdentifier("notify_title", "id", packageName), title);
       remoteViews.setTextColor(resources.getIdentifier("notify_title", "id", packageName), NotifyUtil.getNotifyLayoutAdapter(p0).getTitleColor());
       remoteViews.setTextViewText(resources.getIdentifier("notify_msg", "id", packageName), p2.getContent());
       String str1 = "notify_when";
       if (p2.isShowTime()) {
          remoteViews.setTextViewText(resources.getIdentifier(str1, "id", packageName), new SimpleDateFormat("HH:mm", Locale.CHINA).format(new Date()));
          i = 0;
          remoteViews.setViewVisibility(resources.getIdentifier(str1, "id", packageName), i);
       }else {
          i = 0;
          remoteViews.setViewVisibility(resources.getIdentifier(str1, "id", packageName), 8);
       }
       int suitIconId = NotifyUtil.getNotifyLayoutAdapter(p0).getSuitIconId();
       remoteViews.setViewVisibility(suitIconId, i);
       if (list && !p1.isEmpty()) {
          Bitmap uBitmap = list.get(i);
          if (uBitmap != null) {
             remoteViews.setImageViewBitmap(suitIconId, uBitmap);
          label_00f7 :
             Bitmap uBitmap1 = null;
             if (list != null && p1.size() > 1) {
                uBitmap1 = list.get(1);
             }
             String str2 = "notify_cover";
             if (uBitmap1 != null) {
                if (!TextUtils.isEmpty(p2.getPurePicUrl())) {
                   remoteViews.setViewVisibility(resources.getIdentifier("notify_content", "id", packageName), 8);
                   remoteViews.setViewVisibility(resources.getIdentifier(str2, "id", packageName), 8);
                   remoteViews.setViewVisibility(resources.getIdentifier("notify_pure_cover", "id", packageName), 0);
                   remoteViews.setImageViewBitmap(resources.getIdentifier("notify_pure_cover", "id", packageName), uBitmap1);
                }else {
                   remoteViews.setViewVisibility(resources.getIdentifier(str2, "id", packageName), 0);
                   remoteViews.setImageViewBitmap(resources.getIdentifier(str2, "id", packageName), uBitmap1);
                }
             }else {
                remoteViews.setViewVisibility(resources.getIdentifier(str2, "id", packageName), 8);
             }
             notification.contentView = remoteViews;
             if (TextUtils.isEmpty(p2.getPurePicUrl())) {
                notification.bigContentView = remoteViews;
             }
             AudioManager systemServic = uContext.getSystemService("audio");
             int ringerMode = systemServic.getRingerMode();
             int vibrateSetti = systemServic.getVibrateSetting(0);
             p.d("NotifyManager", "ringMode="+ringerMode+" callVibrateSetting="+vibrateSetti);
             suitIconId = p2.getNotifyType();
             if (suitIconId != 2) {
                if (suitIconId != 3) {
                   if (suitIconId == 4) {
                      if (ringerMode == 2) {
                         notification.defaults = 1;
                      }
                      if (vibrateSetti == 1) {
                         notification.defaults = notification.defaults | 2;
                         notification.vibrate = new long[4]{0,100,200,300};
                      }
                   }
                }else if(vibrateSetti == 1){
                   notification.defaults = 2;
                   notification.vibrate = new long[4]{0,100,200,300};
                }
             }else if(ringerMode == 2){
                notification.defaults = 1;
             }
             Intent intent = new Intent("com.vivo.pushservice.action.RECEIVE");
             intent.setPackage(p0.getPackageName());
             intent.setClassName(p0.getPackageName(), "com.vivo.push.sdk.service.CommandService");
             str2 = "command_type";
             title = "reflect_receiver";
             try{
                intent.putExtra(str2, title);
                intent.putExtra("security_avoid_pull", a.a(p0).a(str));
                intent.putExtra("security_avoid_pull_rsa", d.a(p0).a().a(str));
                intent.putExtra("security_avoid_rsa_public_key", u.a(d.a(p0).a().a()));
             }catch(java.lang.Exception e0){
                p.a("NotifyManager", "pushNotificationByCustom encrypt ："+e0.getMessage());
             }
             new p(packageName, l, p2).b(intent);
             notification.contentIntent = PendingIntent.getService(uContext, (int)SystemClock.uptimeMillis(), intent, 0x10000000);
             if (NotifyAdapterUtil.sNotificationManager != null) {
                try{
                   vibrateSetti = e.a().k();
                   if (!vibrateSetti) {
                      NotifyAdapterUtil.sNotificationManager.notify(NotifyAdapterUtil.sNotifyId, notification);
                      if (p4 != null) {
                         p4.a();
                         return;
                      }
                   }else if(vibrateSetti == 1){
                      NotifyAdapterUtil.sNotificationManager.notify((int)l, notification);
                      if (p4 != null) {
                         p4.a();
                         return;
                      }
                   }else {
                      p.a("NotifyManager", ("unknow notify style ").concat(String.valueOf(vibrateSetti)));
                   }
                   return;
                }catch(java.lang.Exception e0){
                   p.a("NotifyManager", e0);
                   if (p4) {
                      p4.b();
                   }
                }
             label_027e :
                return;
             }else {
                goto label_027e ;
             }
          }
       }
       if (defaultNotif <= 0) {
          defaultNotif = icon;
       }
       remoteViews.setImageViewResource(suitIconId, defaultNotif);
       goto label_00f7 ;
    }
    public static void pushNotificationBySystem(Context p0,List p1,InsideNotificationItem p2,long p3,int p4,r$a p5){
       Bitmap uBitmap;
       String str1;
       Notification$Builder uBuilder;
       Bitmap uBitmap2;
       Context uContext = p0;
       List list = p1;
       long l = p3;
       String str = "com.vivo.pushservice";
       String packageName = p0.getPackageName();
       String title = p2.getTitle();
       String content = p2.getContent();
       ApplicationInfo icon = p0.getApplicationInfo().icon;
       int b = p2.isShowTime();
       AudioManager systemServic = uContext.getSystemService("audio");
       int defaultNotif = NotifyUtil.getNotifyDataAdapter(p0).getDefaultNotifyIcon();
       if (list && !p1.isEmpty()) {
          uBitmap = list.get(0);
          if (uBitmap != null && defaultNotif > 0) {
             Bitmap uBitmap1 = BitmapFactory.decodeResource(p0.getResources(), defaultNotif);
             if (uBitmap1 != null) {
                str1 = packageName;
                uBitmap1.recycle();
                uBitmap = c.a(uBitmap, uBitmap1.getWidth(), uBitmap1.getHeight());
             }
          }
          str1 = packageName;
       }else {
          str1 = packageName;
          uBitmap = null;
       }
       Bundle uBundle = new Bundle();
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 26) {
          uBuilder = new Notification$Builder(uContext, "vivo_push_channel");
          if (defaultNotif > 0) {
             uBundle.putInt("vivo.summaryIconRes", defaultNotif);
          }
          if (uBitmap != null) {
             uBuilder.setLargeIcon(uBitmap);
          }
       }else {
          Notification$Builder uBuilder1 = new Notification$Builder(uContext);
          if (uBitmap != null) {
             uBuilder1.setLargeIcon(uBitmap);
          }else if(sDK_INT <= 22){
             uBuilder1.setLargeIcon(BitmapFactory.decodeResource(p0.getResources(), icon));
          }
          uBuilder = uBuilder1;
       }
       uBundle.putLong("pushId", l);
       uBuilder.setExtras(uBundle);
       int defaultSmall = NotifyUtil.getNotifyDataAdapter(p0).getDefaultSmallIconId();
       if (defaultSmall > 0) {
          icon = defaultSmall;
       }
       uBuilder.setSmallIcon(icon);
       if (p2.getCompatibleType() != 1) {
          uBuilder.setContentTitle(title);
       }
       defaultSmall = 2;
       uBuilder.setPriority(defaultSmall);
       uBuilder.setContentText(content);
       long l1 = (b)? System.currentTimeMillis(): 0;
       uBuilder.setWhen(l1);
       uBuilder.setShowWhen(b);
       uBuilder.setTicker(title);
       b = systemServic.getRingerMode();
       int notifyType = p2.getNotifyType();
       if (notifyType != defaultSmall) {
          if (notifyType != 3) {
             if (notifyType == 4) {
                if (b == defaultSmall) {
                   uBuilder.setDefaults(3);
                   uBuilder.setVibrate(new long[4]{0,100,200,300});
                }else if(b == 1){
                   uBuilder.setDefaults(defaultSmall);
                   uBuilder.setVibrate(new long[4]{0,100,200,300});
                }
             }
          }else if(b == defaultSmall){
             uBuilder.setDefaults(defaultSmall);
             uBuilder.setVibrate(new long[4]{0,100,200,300});
          }
       }else if(b == defaultSmall){
          uBuilder.setDefaults(1);
       }
       if (list != null && p1.size() > 1) {
          uBitmap2 = list.get(1);
          defaultSmall = p4;
       }else {
          defaultSmall = p4;
          uBitmap2 = null;
       }
       if (defaultSmall != 1) {
          Notification$BigTextStyle uBigTextStyl = new Notification$BigTextStyle();
          uBigTextStyl.setBigContentTitle(title);
          uBigTextStyl.bigText(content);
          uBuilder.setStyle(uBigTextStyl);
       }
       if (uBitmap2 != null) {
          Notification$BigPictureStyle uBigPictureS = new Notification$BigPictureStyle();
          uBigPictureS.setBigContentTitle(title);
          uBigPictureS.setSummaryText(content);
          uBigPictureS.bigPicture(uBitmap2);
          uBuilder.setStyle(uBigPictureS);
       }
       uBuilder.setAutoCancel(1);
       Intent intent = new Intent("com.vivo.pushservice.action.RECEIVE");
       intent.setPackage(p0.getPackageName());
       intent.setClassName(p0.getPackageName(), "com.vivo.push.sdk.service.CommandService");
       String str2 = "command_type";
       title = "reflect_receiver";
       try{
          intent.putExtra(str2, title);
          intent.putExtra("security_avoid_pull", a.a(p0).a(str));
          intent.putExtra("security_avoid_pull_rsa", d.a(p0).a().a(str));
          intent.putExtra("security_avoid_rsa_public_key", u.a(d.a(p0).a().a()));
       }catch(java.lang.Exception e0){
          p.a("NotifyManager", "pushNotificationBySystem encrypt ："+e0.getMessage());
       }
       new p(str1, l, p2).b(intent);
       uBuilder.setContentIntent(PendingIntent.getService(uContext, (int)SystemClock.uptimeMillis(), intent, 0x10000000));
       Notification notification = uBuilder.build();
       int i = e.a().k();
       NotificationManager sNotificatio = NotifyAdapterUtil.sNotificationManager;
       if (sNotificatio != null) {
          try{
             if (!i) {
                sNotificatio.notify(NotifyAdapterUtil.sNotifyId, notification);
                if (p5 != null) {
                   p5.a();
                   return;
                }
             }else if(i == 1){
                sNotificatio.notify((int)l, notification);
                if (p5 != null) {
                   p5.a();
                   return;
                }
             }else {
                p.a("NotifyManager", ("unknow notify style ").concat(String.valueOf(i)));
             }
             return;
          }catch(java.lang.Exception e0){
             p.a("NotifyManager", e0);
             if (p5) {
                p5.b();
             }
          }
       label_0216 :
          return;
       }else {
          goto label_0216 ;
       }
    }
    public static boolean repealNotifyById(Context p0,long p1){
       int i = e.a().k();
       String str = null;
       String str1 = "NotifyManager";
       if (!i) {
          long l = w.b().b("com.vivo.push.notify_key", -1);
          if (!l - p1) {
             p.d(str1, ("undo showed message ").concat(String.valueOf(p1)));
             p.a(p0, ("回收已展示的通知： ").concat(String.valueOf(p1)));
             return NotifyAdapterUtil.cancelNotify(p0, NotifyAdapterUtil.sNotifyId);
          }else {
             p.d(str1, "current showing message id "+l+" not match "+p1);
             p.a(p0, "与已展示的通知"+l+"与待回收的通知"+p1+"不匹配");
             return str;
          }
       }else if(i == 1){
          return NotifyAdapterUtil.cancelNotify(p0, (int)p1);
       }else {
          p.a(str1, ("unknow cancle notify style ").concat(String.valueOf(i)));
          return str;
       }
    }
    public static void setNotifyId(int p0){
       NotifyAdapterUtil.sNotifyId = p0;
    }
}
