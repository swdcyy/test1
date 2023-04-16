package com.kwai.performance.component.manager.receiver.UniversalReceiver;
import com.kwai.performance.component.manager.receiver.base.DispatchReceiver;
import java.util.concurrent.ConcurrentHashMap;
import java.util.HashSet;
import java.lang.String;
import java.lang.Object;
import java.util.Set;
import android.content.IntentFilter;
import je7.b;
import je7.b$a;
import java.util.ArrayList;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import java.lang.Iterable;
import android.text.TextUtils;
import java.lang.Throwable;
import android.util.Log;
import android.content.Context;
import android.content.BroadcastReceiver;
import android.content.Intent;
import java.lang.System;
import le7.a;
import java.util.List;
import kotlin.Triple;
import java.lang.Long;
import android.util.StringBuilderPrinter;
import android.util.Printer;
import com.kwai.performance.component.manager.receiver.PackageReceiver;
import java.util.Iterator;
import java.util.Map;
import java.util.Collections;

public class UniversalReceiver extends DispatchReceiver	// class@000d7b
{
    public static boolean b;
    public static final Map c;
    public static final Set d;
    public static boolean e;
    public static boolean f;

    static {
       UniversalReceiver.c = new ConcurrentHashMap();
       UniversalReceiver.d = new HashSet();
       UniversalReceiver.e = false;
       UniversalReceiver.f = false;
    }
    public void UniversalReceiver(){
       super();
    }
    public static void b(String p0){
       UniversalReceiver.d.add(p0);
    }
    public static void c(){
       UniversalReceiver.b("com.action.kwai.force.refreshToken.ACTION");
       UniversalReceiver.b("android.intent.action.SCREEN_ON");
       UniversalReceiver.b("android.intent.action.SCREEN_OFF");
       UniversalReceiver.b("android.intent.action.USER_PRESENT");
       UniversalReceiver.b("com.android.push.spring.dialog.SHOWN");
       UniversalReceiver.b("com.yxcorp.experiment.ABConfigUpdateReceiver");
       UniversalReceiver.b("com.kwai.kwaishare.system.SYS_SHARE_CLICK_ACTION");
       UniversalReceiver.b("com.yxcorp.experiment.logger.LogEventHelper.logUsage");
       UniversalReceiver.b("android.intent.action.BATTERY_CHANGED");
       UniversalReceiver.b("com.amazon.tv.networkmonitor.INTERNET_DOWN");
       UniversalReceiver.b("com.amazon.tv.networkmonitor.INTERNET_UP");
       UniversalReceiver.b("android.net.conn.CONNECTIVITY_CHANGE");
       UniversalReceiver.b("android.intent.action.DATE_CHANGED");
       UniversalReceiver.b("android.intent.action.LOCALE_CHANGED");
       UniversalReceiver.b("android.intent.action.TIME_SET");
       UniversalReceiver.b("android.intent.action.TIMEZONE_CHANGED");
       UniversalReceiver.b("android.net.wifi.STATE_CHANGE");
       UniversalReceiver.b("android.net.wifi.WIFI_STATE_CHANGED");
       UniversalReceiver.b("android.intent.action.DOWNLOAD_COMPLETE");
       UniversalReceiver.b("android.net.wifi.RSSI_CHANGED");
       UniversalReceiver.b("com.kw.r.p");
       UniversalReceiver.b("com.kw.rp.ch.action");
       UniversalReceiver.b("com.kw.rr.tt.dd");
       UniversalReceiver.b("com.kw.rr.yy.ddd");
       UniversalReceiver.b("android.intent.action.PACKAGE_ADDED");
       UniversalReceiver.b("android.intent.action.PACKAGE_REPLACED");
       UniversalReceiver.b("android.intent.action.PACKAGE_REMOVED");
       UniversalReceiver.b("alarm.util");
       UniversalReceiver.b("android.net.wifi.p2p.STATE_CHANGED");
       UniversalReceiver.b("android.net.wifi.p2p.CONNECTION_STATE_CHANGE");
       UniversalReceiver.b("com.kuaishou.webkit.action.optimize.result");
       UniversalReceiver.b("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
       UniversalReceiver.b("android.intent.action.HEADSET_PLUG");
       UniversalReceiver.b("android.media.AUDIO_BECOMING_NOISY");
       UniversalReceiver.b("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
       UniversalReceiver.b("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
       UniversalReceiver.b("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED");
       UniversalReceiver.b("android.hardware.usb.action.USB_DEVICE_ATTACHED");
       UniversalReceiver.b("android.hardware.usb.action.USB_DEVICE_DETACHED");
       UniversalReceiver.b("android.media.VOLUME_CHANGED_ACTION");
       UniversalReceiver.b("ACTION_LOCAL_NOTIFY_MY_SERVICE_MANAGER");
       UniversalReceiver.b("android.intent.action.PACKAGE_CHANGED");
       UniversalReceiver.b("ACTION_DISCONNECT");
       UniversalReceiver.b("ACTION_BACK_TO_FRONT");
       UniversalReceiver.b("com.yxcorp.gifshow.common_music_player.notification.previous");
       UniversalReceiver.b("com.yxcorp.gifshow.common_music_player.notification.play");
       UniversalReceiver.b("com.yxcorp.gifshow.common_music_player.notification.next");
       UniversalReceiver.b("com.kwai.framework.download.NOTIFICATION_CLICK");
       UniversalReceiver.b("com.kwai.framework.debuglog.realtime.FLUSH_LOG");
       UniversalReceiver.b("kwai.intent.action.ON_BACKGROUND");
       UniversalReceiver.b("kwai.intent.action.ON_FOREGROUND");
       UniversalReceiver.b("android.intent.action.MEDIA_MOUNTED");
       UniversalReceiver.b("android.intent.action.MEDIA_UNMOUNTED");
       UniversalReceiver.b("android.intent.action.MEDIA_REMOVED");
       UniversalReceiver.b("android.intent.action.MEDIA_SHARED");
       UniversalReceiver.b("android.intent.action.MEDIA_BAD_REMOVAL");
       UniversalReceiver.b("com.mini.app.capsule.CapsuleClickReceiver");
       UniversalReceiver.b("android.intent.action.CLOSE_SYSTEM_DIALOGS");
       UniversalReceiver.b("key_action_restore_broadcast");
       UniversalReceiver.b("com.mini.app.newFeature.NewFeatureGuideReceiver");
       UniversalReceiver.b("action_ks_mini_media_button");
       UniversalReceiver.b("key_action_plc_result");
       UniversalReceiver.b("ACTION_CLOSE_DIALOG");
       UniversalReceiver.b("android.intent.action.TIME_TICK");
       UniversalReceiver.b("com.kwai.chat.kwailink.ACTION_LINK_SERVICE_CREATED");
       UniversalReceiver.b("com.kwai.chat.kwailink.ACTION_DISPATCH_MSG");
       UniversalReceiver.b("com.kwai.chat.kwailink.ACTION_PUSH_NOTIFIER");
       UniversalReceiver.b("com.kwai.chat.kwailink.ACTION_INVALID_SERVICE_TOKEN");
       UniversalReceiver.b("com.kwai.chat.kwailink.ACTION_RELOGIN");
       UniversalReceiver.b("com.kwai.chat.kwailink.ACTION_SESSION_MANAGER_STATE_CHANGED");
       UniversalReceiver.b("com.kwai.chat.kwailink.ACTION_INVALID_PACKET");
       UniversalReceiver.b("com.kwai.chat.kwailink.ACTION_GET_SERVICE_TOKEN");
       UniversalReceiver.b("com.kwai.chat.kwailink.ACTION_IGNORE_ACTION_DUE_TO_LOGOFF");
       UniversalReceiver.b("com.kwai.chat.kwailink.ACTION_APPID_UPDATE");
       UniversalReceiver.b("com.kwai.chat.kwailink.ACTION_UPDATE_TIME_OFFSET");
       UniversalReceiver.b("android.intent.action.SIM_STATE_CHANGED");
       UniversalReceiver.b("com.kwai.sdk.switchconfig.internal.SwitchConfigUpdateReceiver");
       UniversalReceiver.b("com.kwai.middleware.azeroth.ACCOUNT_CHANGED");
       UniversalReceiver.b("com.kwai.middleware.azeroth.APP_LIFE");
       UniversalReceiver.b("com.kwai.middleware.azeroth.UPDATE_SDK_CONFIG");
       UniversalReceiver.b("android.intent.action.PROXY_CHANGE");
       UniversalReceiver.b("android.intent.action.ACTION_POWER_CONNECTED");
       UniversalReceiver.b("android.intent.action.ACTION_POWER_DISCONNECTED");
       UniversalReceiver.b("android.security.action.KEYCHAIN_CHANGED");
       UniversalReceiver.b("android.security.action.KEY_ACCESS_CHANGED");
       UniversalReceiver.b("android.security.action.TRUST_STORE_CHANGED");
       UniversalReceiver.b("android.intent.action.BATTERY_LOW");
       UniversalReceiver.b("android.intent.action.BATTERY_OKAY");
       UniversalReceiver.b("android.os.action.POWER_SAVE_MODE_CHANGED");
       UniversalReceiver.b("com.kw.pp.action");
       UniversalReceiver.b("action_kp_mid_debug");
       UniversalReceiver.b("download.intent.action.DOWNLOAD_PAUSE");
       UniversalReceiver.b("download.intent.action.DOWNLOAD_RESUME");
       UniversalReceiver.b("download.intent.action.DOWNLOAD_CANCEL");
       UniversalReceiver.b("action_clicked_activity_finish");
       UniversalReceiver.b("miui.net.wifi.DIGEST_INFORMATION_CHANGED");
       UniversalReceiver.b("com.xiaomi.xmsf.USE_INTELLIGENT_HB");
       UniversalReceiver.b("action_wayne_live_debug");
       UniversalReceiver.b("android.intent.action.PHONE_STATE");
       UniversalReceiver.b("android.intent.action.PHONE_STATE2");
       UniversalReceiver.b("android.intent.action.PHONE_STATE_2");
       UniversalReceiver.b("android.intent.action.PHONE_STATE_EXT");
       UniversalReceiver.b("android.intent.action.NEW_OUTGOING_CALL");
       UniversalReceiver.b("com.tencent.map.geolocation.wakeup");
       UniversalReceiver.b("android.net.wifi.SCAN_RESULTS");
       UniversalReceiver.b("com.live.router.scheme");
       UniversalReceiver.b("ACTION_GROWTH_WIDGET_ONE_KEY_ADD");
       UniversalReceiver.b("com.yxcorp.gifshow.photoad.REINSTALL");
       UniversalReceiver.b("com.android.action.AGREE_PRIVACY_PERMISSION");
       UniversalReceiver.b("protector.intent.action.FINISH_DIALOG");
       UniversalReceiver.b("com.kwai.action.BLOCKING_IO_RECEIVER");
    }
    public static String d(IntentFilter p0,String p1){
       b$a a = b.a;
       int i = 0;
       ArrayList uArrayList = (a == null || a.a())? 1: null;
       if (!uArrayList) {
          return "¡¾Debug Close¡¿";
       }else {
          uArrayList = new ArrayList();
          for (; i < p0.countActions(); i = i + 1) {
             uArrayList.add(p0.getAction(i));
          }
          return Log.getStackTraceString(new Throwable("¡¾"+p1+"¡¿"+TextUtils.join(",", uArrayList)));
       }
    }
    public static Intent e(Context p0,BroadcastReceiver p1,IntentFilter p2){
       List b;
       List b1;
       Intent intent;
       int i3;
       b$a a;
       System.currentTimeMillis();
       if (!p2.getPriority() && (p2.countDataAuthorities() <= 0 && (p2.countDataPaths() > 0 || p2.countDataTypes() > 0))) {
          UniversalReceiver.d(p2, "Special-Receiver");
          return p0.registerReceiver(p1, p2);
       }else {
          BroadcastReceiver uBroadcastRe = null;
          long l = 0;
          int i = 1;
          if (p1 == null) {
             UniversalReceiver.d(p2, "Null-Receiver");
             b = a.b;
             _monitor_enter(b);
             int i1 = 0;
             while (true) {
                b1 = a.b;
                if (i1 < b1.size()) {
                   Triple triple = b1.get(i1);
                   if (triple.component3().longValue() - System.currentTimeMillis() < 0) {
                      b1.remove(i1);
                      i1--;
                   }else {
                      StringBuilder str = "";
                      p2.dump(new StringBuilderPrinter(str), "");
                      StringBuilder str1 = "";
                      triple.component1().dump(new StringBuilderPrinter(str1), "");
                      String str2 = str;
                      if (str2.equals(str1)) {
                         intent = triple.component2();
                         _monitor_exit(b);
                      label_008d :
                         if (intent != null) {
                            intent.getAction();
                            break ;
                         }else {
                            intent = p0.registerReceiver(uBroadcastRe, p2);
                            _monitor_enter(b1);
                            int i2 = 0;
                            while (true) {
                               if (i2 < p2.countActions()) {
                                  if (!a.a.contains(p2.getAction(i2))) {
                                  label_00b0 :
                                     if (l) {
                                        a.b.add(new Triple(p2, intent, Long.valueOf((System.currentTimeMillis() + 5000))));
                                     }else {
                                        a.b.add(new Triple(p2, intent, Long.valueOf((System.currentTimeMillis() + 500))));
                                     }
                                     _monitor_exit(b1);
                                     break ;
                                  }else {
                                     i2++;
                                  }
                               }else {
                                  l = 1;
                                  goto label_00b0 ;
                               }
                            }
                         }
                      }
                   }
                   i1 = i1 + i;
                }else {
                   _monitor_exit(b);
                   i1 = uBroadcastRe;
                   goto label_008d ;
                }
             }
             return intent;
          }else if(p2.countDataSchemes() > 0){
             UniversalReceiver.d(p2, "DataScheme-Receiver");
             if (p2.countDataSchemes() == i && ("package").equals(p2.getDataScheme(l))) {
                i3 = 0;
                while (true) {
                   if (i3 < p2.countActions()) {
                      if (PackageReceiver.b.contains(p2.getAction(i3))) {
                         i3 = i3 + 1;
                      }
                   }else {
                      l = 1;
                   }
                }
             }
             if (l) {
                if (!PackageReceiver.d) {
                   _monitor_enter(UniversalReceiver.class);
                   if (!PackageReceiver.d) {
                      PackageReceiver.d = i;
                      IntentFilter intentFilter = new IntentFilter();
                      Iterator iterator = PackageReceiver.b.iterator();
                      while (iterator.hasNext()) {
                         intentFilter.addAction(iterator.next());
                      }
                      intentFilter.addDataScheme("package");
                      p0.registerReceiver(new PackageReceiver(), intentFilter);
                   }
                   _monitor_exit(UniversalReceiver.class);
                }
                PackageReceiver.c.put(p1, p2);
                return uBroadcastRe;
             }else {
                return p0.registerReceiver(p1, p2);
             }
          }else if(p2.countCategories() > i || (p2.countCategories() == i && !("android.intent.category.DEFAULT").equals(p2.getCategory(l)))){
             UniversalReceiver.d(p2, "Categories-Receiver");
             return p0.registerReceiver(p1, p2);
          }else if(!UniversalReceiver.e){
             UniversalReceiver universalRec = (b.a != null)? 1: null;
             if (universalRec) {
                universalRec = UniversalReceiver.class;
                _monitor_enter(universalRec);
                if (UniversalReceiver.e) {
                   _monitor_exit(universalRec);
                }else {
                   a = b.a;
                   b1 = (a != null)? a.b(): Collections.emptyList();
                   if (b1.isEmpty()) {
                      UniversalReceiver.c();
                   }else {
                      Iterator iterator2 = b1.iterator();
                      while (iterator2.hasNext()) {
                         UniversalReceiver.b(iterator2.next());
                      }
                   }
                   UniversalReceiver.e = i;
                   _monitor_exit(universalRec);
                }
             }
          }
          i3 = 0;
          while (true) {
             if (i3 < p2.countActions()) {
                if (!UniversalReceiver.d.contains(p2.getAction(i3))) {
                label_01e0 :
                   if (l) {
                      if (!UniversalReceiver.f) {
                         UniversalReceiver universalRec1 = UniversalReceiver.class;
                         _monitor_enter(universalRec1);
                         if (UniversalReceiver.f) {
                            _monitor_exit(universalRec1);
                            break ;
                         }else {
                            UniversalReceiver.f = i;
                            _monitor_exit(universalRec1);
                            IntentFilter intentFilter1 = new IntentFilter();
                            intentFilter1.addCategory("android.intent.category.DEFAULT");
                            Iterator iterator1 = UniversalReceiver.d.iterator();
                            while (iterator1.hasNext()) {
                               intentFilter1.addAction(iterator1.next());
                            }
                            if (intentFilter1.countActions() > 0) {
                               p0.registerReceiver(new UniversalReceiver(), intentFilter1);
                            }
                         }
                      }
                      break ;
                   }else {
                      UniversalReceiver.d(p2, "Lose-Receiver");
                      return p0.registerReceiver(p1, p2);
                   }
                }else {
                   i3 = i3 + 1;
                }
             }else {
                l = 1;
                goto label_01e0 ;
             }
          }
          UniversalReceiver.c.put(p1, p2);
          UniversalReceiver.d(p2, "Normal-Receiver");
          System.currentTimeMillis();
          return uBroadcastRe;
       }
    }
    public static void f(Context p0,BroadcastReceiver p1){
       if (UniversalReceiver.c.remove(p1) != null) {
          return;
       }
       if (PackageReceiver.c.remove(p1) != null) {
          return;
       }
       p0.unregisterReceiver(p1);
       return;
    }
    public Map a(){
       return UniversalReceiver.c;
    }
}
