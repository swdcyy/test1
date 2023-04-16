package com.xiaomi.mipush.sdk.MiPushClient;
import java.lang.System;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.SharedPreferences;
import oe6.o;
import android.content.SharedPreferences$Editor;
import ws8.d7;
import oe6.g;
import ws8.k;
import vs8.i;
import java.lang.Runnable;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import java.lang.Math;
import java.lang.Thread;
import android.content.Intent;
import com.xiaomi.mipush.sdk.PushMessageHandler;
import java.lang.IllegalArgumentException;
import java.util.List;
import java.util.Iterator;
import vs8.x;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import vs8.f0;
import ws8.m6;
import vs8.i0;
import com.xiaomi.mipush.sdk.e;
import vs8.j;
import ws8.x3$a;
import ws8.x3;
import ss8.a;
import ts8.b;
import ws8.v3;
import ws8.w3;
import us8.a;
import us8.b;
import ts8.a;
import vs8.o;
import vs8.w0;
import ys8.r;
import vs8.k;
import ys8.r$a;
import com.xiaomi.mipush.sdk.MiPushClient$c;
import com.xiaomi.mipush.sdk.MiPushClient$b;
import rs8.c;
import ws8.a0;
import java.util.Objects;
import ws8.d2;
import ws8.f7;
import com.xiaomi.mipush.sdk.v;
import vs8.c;
import vs8.n;
import com.xiaomi.push.ex;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.xiaomi.push.ig;
import com.xiaomi.push.hr;
import ys8.u;
import java.util.HashMap;
import com.xiaomi.push.g;
import java.lang.Integer;
import com.xiaomi.push.hh;
import com.xiaomi.push.is;
import com.xiaomi.push.hu;
import ws8.y6;
import ws8.p0;
import com.xiaomi.mipush.sdk.b$a;
import com.xiaomi.push.ih;
import com.xiaomi.push.hv;
import ws8.i6;
import vs8.d0;
import rs8.a;
import com.xiaomi.mipush.sdk.Logger;
import java.lang.Throwable;
import vs8.r;
import com.xiaomi.mipush.sdk.au;
import java.lang.Thread$UncaughtExceptionHandler;
import android.content.IntentFilter;
import com.xiaomi.push.service.receivers.NetworkStatusReceiver;
import android.content.BroadcastReceiver;
import ws8.z6;
import java.lang.Class;
import vs8.m;
import com.xiaomi.mipush.sdk.a;
import com.xiaomi.mipush.sdk.MiPushClient$e;
import com.xiaomi.mipush.sdk.MiPushMessage;
import com.xiaomi.push.hm;
import ws8.n2;
import vs8.u0;
import ws8.m2;
import vs8.g;
import vs8.q;
import ws8.k$a;
import java.util.TimeZone;
import java.lang.Long;
import com.xiaomi.push.ib;
import com.xiaomi.push.il;
import com.xiaomi.mipush.sdk.MiPushClient$f;
import com.xiaomi.mipush.sdk.MiPushClient$a;
import com.xiaomi.mipush.sdk.MiPushClient$g;
import com.xiaomi.mipush.sdk.MiPushClient$d;
import vs8.l0;
import com.xiaomi.push.in;
import com.xiaomi.push.ip;
import vs8.h;

public abstract class MiPushClient	// class@0010de
{
    public static Context sContext;
    public static long sCurMsgId;

    static {
       MiPushClient.sCurMsgId = System.currentTimeMillis();
    }
    public void MiPushClient(){
       super();
    }
    public static boolean acceptTimeSet(Context p0,String p1,String p2){
       return TextUtils.equals(MiPushClient.getAcceptTime(p0), p1+","+p2);
    }
    public static long accountSetTime(Context p0,String p1){
       return o.c(p0, "mipush_extra", 0).getLong("account_"+p1, -1);
    }
    public static synchronized void addAcceptTime(Context p0,String p1,String p2){
       _monitor_enter(MiPushClient.class);
       SharedPreferences$Editor uEditor = o.c(p0, "mipush_extra", 0).edit();
       uEditor.putString("accept_time", p1+","+p2);
       d7.a(uEditor);
       _monitor_exit(MiPushClient.class);
    }
    public static synchronized void addAccount(Context p0,String p1){
       _monitor_enter(MiPushClient.class);
       g.b(o.c(p0, "mipush_extra", 0).edit().putLong("account_"+p1, System.currentTimeMillis()));
       _monitor_exit(MiPushClient.class);
    }
    public static synchronized void addAlias(Context p0,String p1){
       _monitor_enter(MiPushClient.class);
       g.b(o.c(p0, "mipush_extra", 0).edit().putLong("alias_"+p1, System.currentTimeMillis()));
       _monitor_exit(MiPushClient.class);
    }
    public static void addPullNotificationTime(Context p0){
       SharedPreferences$Editor uEditor = o.c(p0, "mipush_extra", 0).edit();
       uEditor.putLong("last_pull_notification", System.currentTimeMillis());
       d7.a(uEditor);
    }
    public static void addRegRequestTime(Context p0){
       SharedPreferences$Editor uEditor = o.c(p0, "mipush_extra", 0).edit();
       uEditor.putLong("last_reg_request", System.currentTimeMillis());
       d7.a(uEditor);
    }
    public static synchronized void addTopic(Context p0,String p1){
       _monitor_enter(MiPushClient.class);
       g.b(o.c(p0, "mipush_extra", 0).edit().putLong("topic_"+p1, System.currentTimeMillis()));
       _monitor_exit(MiPushClient.class);
    }
    public static long aliasSetTime(Context p0,String p1){
       return o.c(p0, "mipush_extra", 0).getLong("alias_"+p1, -1);
    }
    public static void awakeApps(Context p0,String[] p1){
       k.f(p0).g(new i(p1, p0));
    }
    public static void awakePushServiceByPackageInfo(Context p0,PackageInfo p1){
       p1 = p1.services;
       if (p1 != null) {
          int len = p1.length;
          int i = 0;
          while (i < len) {
             object oobject = p1[i];
             if (oobject.exported != null && (oobject.enabled != null && (("com.xiaomi.mipush.sdk.PushMessageHandler").equals(oobject.name) && !(p0.getPackageName()).equals(oobject.packageName)))) {
                Thread.sleep(((long)((Math.random() * 2.00f) + 0x3ff0000000000000) * 1000));
                Intent intent = new Intent();
                intent.setClassName(oobject.packageName, oobject.name);
                intent.setAction("com.xiaomi.mipush.sdk.WAKEUP");
                intent.putExtra("waker_pkgname", p0.getPackageName());
                PushMessageHandler.a(p0, intent);
                break ;
             }
             i = i + 1;
          }
       }
       return;
    }
    public static void checkNotNull(Object p0,String p1){
       if (p0 != null) {
          return;
       }
       throw new IllegalArgumentException("param "+p1+" is not nullable");
    }
    public static void clearExtras(Context p0){
       SharedPreferences$Editor uEditor = o.c(p0, "mipush_extra", 0).edit();
       uEditor.clear();
       g.b(uEditor);
    }
    public static void clearExtrasForInitialize(Context p0){
       SharedPreferences$Editor uEditor = o.c(p0, "mipush_extra", 0).edit();
       Iterator iterator = MiPushClient.getAllAlias(p0).iterator();
       while (iterator.hasNext()) {
          uEditor.remove("alias_"+iterator.next());
       }
       iterator = MiPushClient.getAllUserAccount(p0).iterator();
       while (iterator.hasNext()) {
          uEditor.remove("account_"+iterator.next());
       }
       Iterator iterator1 = MiPushClient.getAllTopic(p0).iterator();
       while (iterator1.hasNext()) {
          uEditor.remove("topic_"+iterator1.next());
       }
       uEditor.remove("accept_time");
       g.b(uEditor);
       return;
    }
    public static void clearLocalNotificationType(Context p0){
       x.l(p0).d0();
    }
    public static void clearNotification(Context p0){
       x.l(p0).n(-1);
    }
    public static void clearNotification(Context p0,int p1){
       x.l(p0).n(p1);
    }
    public static void clearNotification(Context p0,String p1,String p2){
       x.l(p0).F(p1, p2);
    }
    public static void disablePush(Context p0){
       x.l(p0).H(true);
    }
    public static void enablePush(Context p0){
       x.l(p0).H(false);
    }
    public static String getAcceptTime(Context p0){
       return o.c(p0, "mipush_extra", 0).getString("accept_time", "00:00-23:59");
    }
    public static List getAllAlias(Context p0){
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = o.c(p0, "mipush_extra", 0).getAll().keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (str.startsWith("alias_")) {
             uArrayList.add(str.substring(6));
          }
       }
       return uArrayList;
    }
    public static List getAllTopic(Context p0){
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = o.c(p0, "mipush_extra", 0).getAll().keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (str.startsWith("topic_") && !str.contains("**ALL**")) {
             uArrayList.add(str.substring(6));
          }
       }
       return uArrayList;
    }
    public static List getAllUserAccount(Context p0){
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = o.c(p0, "mipush_extra", 0).getAll().keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (str.startsWith("account_")) {
             uArrayList.add(str.substring(8));
          }
       }
       return uArrayList;
    }
    public static String getAppRegion(Context p0){
       if (f0.d(p0).s()) {
          return f0.d(p0).x();
       }
       return null;
    }
    public static boolean getDefaultSwitch(){
       return m6.p();
    }
    public static boolean getOpenFCMPush(Context p0){
       MiPushClient.checkNotNull(p0, "context");
       return i0.e(p0).m(e.b);
    }
    public static boolean getOpenHmsPush(Context p0){
       MiPushClient.checkNotNull(p0, "context");
       return i0.e(p0).m(e.a);
    }
    public static boolean getOpenOPPOPush(Context p0){
       MiPushClient.checkNotNull(p0, "context");
       return i0.e(p0).m(e.c);
    }
    public static boolean getOpenVIVOPush(Context p0){
       return i0.e(p0).m(e.d);
    }
    public static String getRegId(Context p0){
       if (f0.d(p0).s()) {
          return f0.d(p0).q();
       }
       return null;
    }
    public static void initEventPerfLogic(Context p0){
       x3.o(new j());
       a uoa = x3.f(p0);
       b.f(p0).h("5_0_8-C");
       a.a(p0, uoa, new v3(p0), new w3(p0));
       o.b(p0);
       w0.a(p0, uoa);
       r.g(p0).l(new k(100, "perf event job update", p0));
    }
    public static void initialize(Context p0,String p1,String p2,MiPushClient$c p3){
       MiPushClient.initialize(p0, p1, p2, p3, null, null);
    }
    public static void initialize(Context p0,String p1,String p2,MiPushClient$c p3,String p4,MiPushClient$b p5){
       String str = p1;
       String str1 = p2;
       ig obj = p3;
       String str2 = "update_devId";
       c.j(p0.getApplicationContext());
       c.v("sdk_version = 5_0_8-C");
       Objects.requireNonNull(a0.c(p0));
       if (obj) {
          PushMessageHandler.a(p3);
       }
       if (p5 != null) {
          PushMessageHandler.a(p5);
       }
       if (f7.g(MiPushClient.sContext)) {
          v.b(MiPushClient.sContext);
       }
       boolean b = true;
       boolean b1 = false;
       Context uContext = (f0.d(MiPushClient.sContext).a() != c.a())? 1: null;
       if (!uContext && !MiPushClient.shouldSendRegRequest(MiPushClient.sContext)) {
          x.l(MiPushClient.sContext).m();
          c.l("Could not send  register message within 5s repeatly .");
          return;
       }else {
          hu ohu = null;
          if (!uContext && (f0.d(MiPushClient.sContext).l(str, str1) && !f0.d(MiPushClient.sContext).y())) {
             if (b == n.c(MiPushClient.sContext)) {
                MiPushClient.checkNotNull(obj, "callback");
                f0.d(MiPushClient.sContext).q();
                Objects.requireNonNull(p3);
             }else {
                ArrayList uArrayList = new ArrayList();
                uArrayList.add(f0.d(MiPushClient.sContext).q());
                n.f(MiPushClient.sContext, n.a(ex.a.a, uArrayList, 0, null, null, null));
             }
             x.l(MiPushClient.sContext).m();
             if (f0.d(MiPushClient.sContext).k()) {
                ig oig = new ig();
                oig.b(f0.d(MiPushClient.sContext).c());
                oig.c(hr.g.a);
                oig.a(u.a());
                HashMap hashMap = new HashMap();
                oig.a = hashMap;
                uContext = MiPushClient.sContext;
                hashMap.put("app_version", g.h(uContext, uContext.getPackageName()));
                uContext = MiPushClient.sContext;
                oig.a.put("app_version_code", Integer.toString(g.b(uContext, uContext.getPackageName())));
                oig.a.put("push_sdk_vn", "5_0_8-C");
                oig.a.put("push_sdk_vc", Integer.toString(0xc358));
                str1 = f0.d(MiPushClient.sContext).v();
                if (!TextUtils.isEmpty(str1)) {
                   oig.a.put("deviceid", str1);
                }
                x.l(MiPushClient.sContext).x(oig, hh.i, b1, ohu);
                x.l(MiPushClient.sContext).q(MiPushClient.sContext);
             }
             if (!y6.c(MiPushClient.sContext, str2, b1)) {
                MiPushClient.updateImeiOrOaid();
                y6.a(MiPushClient.sContext, str2, b);
             }
             if (MiPushClient.shouldUseMIUIPush(MiPushClient.sContext) && MiPushClient.shouldPullNotification(MiPushClient.sContext)) {
                obj = new ig();
                obj.b(f0.d(MiPushClient.sContext).c());
                obj.c(hr.j.a);
                obj.a(u.a());
                obj.a(b1);
                x.l(MiPushClient.sContext).y(obj, hh.i, false, null, false);
                MiPushClient.addPullNotificationTime(MiPushClient.sContext);
             }
          }else {
             String str3 = p0.a(6);
             f0.d(MiPushClient.sContext).e();
             f0.d(MiPushClient.sContext).f(c.a());
             f0.d(MiPushClient.sContext).h(str, str1, str3);
             b$a.b().h("com.xiaomi.xmpushsdk.tinydataPending.appId");
             MiPushClient.clearExtras(MiPushClient.sContext);
             MiPushClient.clearNotification(p0);
             ih oih = new ih();
             oih.a(u.c());
             oih.b(str);
             oih.e(str1);
             oih.d(MiPushClient.sContext.getPackageName());
             oih.f(str3);
             Context sContext = MiPushClient.sContext;
             oih.c(g.h(sContext, sContext.getPackageName()));
             sContext = MiPushClient.sContext;
             oih.b(g.b(sContext, sContext.getPackageName()));
             oih.h("5_0_8-C");
             oih.a(0xc358);
             oih.a(hv.c);
             if (!TextUtils.isEmpty(p4)) {
                oih.g(p4);
             }
             if (!m6.t() && !TextUtils.isEmpty(ohu)) {
                oih.i(p0.b(ohu)+","+"");
             }
             int i = i6.c();
             if (i >= 0) {
                oih.c(i);
             }
             x.l(MiPushClient.sContext).t(oih, uContext);
             o.c(MiPushClient.sContext, "mipush_extra", 4).getBoolean("mipush_registed", b);
          }
          MiPushClient.addRegRequestTime(MiPushClient.sContext);
          MiPushClient.scheduleOcVersionCheckJob();
          MiPushClient.scheduleDataCollectionJobs(MiPushClient.sContext);
          MiPushClient.initEventPerfLogic(MiPushClient.sContext);
          d0.b(MiPushClient.sContext);
          if (!(MiPushClient.sContext.getPackageName()).equals("com.xiaomi.xmsf")) {
             if (Logger.getUserLogger() != null) {
                Logger.setLogger(MiPushClient.sContext, Logger.getUserLogger());
             }
             c.f(2);
          }
          MiPushClient.operateSyncAction(p0);
          return;
       }
    }
    public static void operateSyncAction(Context p0){
       if (("syncing").equals(r.c(MiPushClient.sContext).b(au.a))) {
          MiPushClient.disablePush(MiPushClient.sContext);
       }
       if ("syncing".equals(r.c(MiPushClient.sContext).b(au.b))) {
          MiPushClient.enablePush(MiPushClient.sContext);
       }
       au c = au.c;
       if ("syncing".equals(r.c(MiPushClient.sContext).b(c))) {
          x.l(MiPushClient.sContext).D(null, c, e.a, "init");
       }
       if ("syncing".equals(r.c(MiPushClient.sContext).b(au.d))) {
          MiPushClient.syncAssembleFCMPushToken(MiPushClient.sContext);
       }
       c = au.e;
       if ("syncing".equals(r.c(MiPushClient.sContext).b(c))) {
          x.l(MiPushClient.sContext).D(null, c, e.c, "init");
       }
       c = au.f;
       if ("syncing".equals(r.c(MiPushClient.sContext).b(c))) {
          x.l(p0).D(null, c, e.d, "init");
       }
       return;
    }
    public static void pausePush(Context p0,String p1){
       MiPushClient.setAcceptTime(p0, 0, 0, 0, 0, p1);
    }
    public static void reInitialize(Context p0,hv p1){
       c.v("re-register reason: "+p1);
       String str = p0.a(6);
       String str1 = f0.d(p0).c();
       String str2 = f0.d(p0).m();
       f0.d(p0).e();
       MiPushClient.clearExtrasForInitialize(p0);
       MiPushClient.clearNotification(p0);
       f0.d(p0).f(c.a());
       f0.d(p0).h(str1, str2, str);
       ih oih = new ih();
       oih.a(u.c());
       oih.b(str1);
       oih.e(str2);
       oih.f(str);
       oih.d(p0.getPackageName());
       oih.c(g.h(p0, p0.getPackageName()));
       oih.b(g.b(p0, p0.getPackageName()));
       oih.h("5_0_8-C");
       oih.a(0xc358);
       oih.a(p1);
       int i = i6.c();
       if (i >= 0) {
          oih.c(i);
       }
       x.l(p0).t(oih, false);
       return;
    }
    public static void registerCrashHandler(Thread$UncaughtExceptionHandler p0){
       Thread.setDefaultUncaughtExceptionHandler(p0);
    }
    public static void registerNetworkReceiver(Context p0){
       IntentFilter intentFilter = new IntentFilter();
       intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
       intentFilter.addCategory("android.intent.category.DEFAULT");
       z6.a(p0.getApplicationContext(), new NetworkStatusReceiver(null), intentFilter);
       z6.e(p0, NetworkStatusReceiver.class);
       return;
    }
    public static void registerPush(Context p0,String p1,String p2){
       MiPushClient.registerPush(p0, p1, p2, new m());
    }
    public static void registerPush(Context p0,String p1,String p2,String p3){
       MiPushClient.registerPush(p0, p1, p2, new m(), p3, null);
    }
    public static void registerPush(Context p0,String p1,String p2,m p3){
       MiPushClient.registerPush(p0, p1, p2, p3, null, null);
    }
    public static void registerPush(Context p0,String p1,String p2,m p3,String p4,MiPushClient$b p5){
       MiPushClient.checkNotNull(p0, "context");
       MiPushClient.checkNotNull(p1, "appID");
       MiPushClient.checkNotNull(p2, "appToken");
       Context applicationC = p0.getApplicationContext();
       MiPushClient.sContext = applicationC;
       if (applicationC == null) {
          MiPushClient.sContext = p0;
       }
       p0 = MiPushClient.sContext;
       f7.e(p0);
       if (!NetworkStatusReceiver.a()) {
          MiPushClient.registerNetworkReceiver(MiPushClient.sContext);
       }
       i0.e(MiPushClient.sContext).i(p3);
       k.f(p0).g(new a(p1, p2, p4, p5));
       return;
    }
    public static void registerToken(Context p0,String p1,String p2,String p3,MiPushClient$e p4){
       MiPushClient.registerPush(p0, p1, p2, new m(), null, p4);
    }
    public static synchronized void removeAcceptTime(Context p0){
       _monitor_enter(MiPushClient.class);
       SharedPreferences$Editor uEditor = o.c(p0, "mipush_extra", 0).edit();
       uEditor.remove("accept_time");
       d7.a(uEditor);
       _monitor_exit(MiPushClient.class);
    }
    public static synchronized void removeAccount(Context p0,String p1){
       _monitor_enter(MiPushClient.class);
       g.b(o.c(p0, "mipush_extra", 0).edit().remove("account_"+p1));
       _monitor_exit(MiPushClient.class);
    }
    public static synchronized void removeAlias(Context p0,String p1){
       _monitor_enter(MiPushClient.class);
       g.b(o.c(p0, "mipush_extra", 0).edit().remove("alias_"+p1));
       _monitor_exit(MiPushClient.class);
    }
    public static synchronized void removeAllAccounts(Context p0){
       _monitor_enter(MiPushClient.class);
       Iterator iterator = MiPushClient.getAllUserAccount(p0).iterator();
       while (iterator.hasNext()) {
          MiPushClient.removeAccount(p0, iterator.next());
       }
       _monitor_exit(MiPushClient.class);
       return;
    }
    public static synchronized void removeAllAliases(Context p0){
       _monitor_enter(MiPushClient.class);
       Iterator iterator = MiPushClient.getAllAlias(p0).iterator();
       while (iterator.hasNext()) {
          MiPushClient.removeAlias(p0, iterator.next());
       }
       _monitor_exit(MiPushClient.class);
       return;
    }
    public static synchronized void removeAllTopics(Context p0){
       _monitor_enter(MiPushClient.class);
       Iterator iterator = MiPushClient.getAllTopic(p0).iterator();
       while (iterator.hasNext()) {
          MiPushClient.removeTopic(p0, iterator.next());
       }
       _monitor_exit(MiPushClient.class);
       return;
    }
    public static synchronized void removeTopic(Context p0,String p1){
       _monitor_enter(MiPushClient.class);
       g.b(o.c(p0, "mipush_extra", 0).edit().remove("topic_"+p1));
       _monitor_exit(MiPushClient.class);
    }
    public static void removeWindow(Context p0){
       x.l(p0).b0();
    }
    public static void reportAppRunInBackground(Context p0,boolean p1){
       if (!f0.d(p0).p()) {
          return;
       }
       hr r = (p1)? hr.R: hr.Q;
       ig oig = new ig();
       oig.b(f0.d(p0).c());
       oig.c(r.a);
       oig.d(p0.getPackageName());
       oig.a(u.a());
       oig.a(false);
       x.l(p0).y(oig, hh.i, false, null, false);
       return;
    }
    public static void reportIgnoreRegMessageClicked(Context p0,String p1,hu p2,String p3,String p4){
       ig oig = new ig();
       if (TextUtils.isEmpty(p4)) {
          c.u("do not report clicked message");
          return;
       }else {
          oig.b(p4);
          oig.c("bar:click");
          oig.a(p1);
          oig.a(false);
          x.l(p0).A(oig, hh.i, false, true, p2, true, p3, p4);
          return;
       }
    }
    public static void reportMessageClicked(Context p0,MiPushMessage p1){
       hu ohu = new hu();
       ohu.a(p1.getMessageId());
       ohu.b(p1.getTopic());
       ohu.d(p1.getDescription());
       ohu.c(p1.getTitle());
       ohu.c(p1.getNotifyId());
       ohu.a(p1.getNotifyType());
       ohu.b(p1.getPassThrough());
       ohu.a(p1.getExtra());
       MiPushClient.reportMessageClicked(p0, p1.getMessageId(), ohu, null);
    }
    public static void reportMessageClicked(Context p0,String p1){
       MiPushClient.reportMessageClicked(p0, p1, null, null);
    }
    public static void reportMessageClicked(Context p0,String p1,hu p2,String p3){
       ig oig = new ig();
       if (TextUtils.isEmpty(p3)) {
          if (f0.d(p0).p()) {
             p3 = f0.d(p0).c();
          }else {
             c.u("do not report clicked message");
             return;
          }
       }
       oig.b(p3);
       oig.c("bar:click");
       oig.a(p1);
       oig.a(false);
       x.l(p0).x(oig, hh.i, false, p2);
       return;
    }
    public static void resumePush(Context p0,String p1){
       MiPushClient.setAcceptTime(p0, 0, 0, 23, 59, p1);
    }
    public static void scheduleDataCollectionJobs(Context p0){
       if (r.g(MiPushClient.sContext).m(hm.z.a(), MiPushClient.getDefaultSwitch())) {
          n2.b().c(new u0(p0));
          k.f(MiPushClient.sContext).h(new g(), 10);
       }
       return;
    }
    public static void scheduleOcVersionCheckJob(){
       k.f(MiPushClient.sContext).l(new q(MiPushClient.sContext), r.g(MiPushClient.sContext).a(hm.A.a(), 0x15180), 5);
    }
    public static void setAcceptTime(Context p0,int p1,int p2,int p3,int p4,String p5){
       Context uContext = p0;
       int i = p1;
       int i1 = p2;
       int i2 = p3;
       int i3 = p4;
       if (i >= 0) {
          int i4 = 24;
          if (i < i4 && (i2 >= 0 && (i2 < i4 && i1 >= 0))) {
             i4 = 60;
             if (i1 < i4 && (i3 >= 0 && i3 < i4)) {
                long l = (long)(((TimeZone.getTimeZone("GMT+08").getRawOffset() - TimeZone.getDefault().getRawOffset()) / 1000) / i4);
                long l1 = (((long)((i * 60) + i1) + l) + 1440) % 1440;
                long l2 = (((long)((i2 * 60) + i3) + l) + 1440) % 1440;
                ArrayList uArrayList = new ArrayList();
                int i5 = 2;
                Object[] objArray = new Object[i5];
                objArray[0] = Long.valueOf((l1 / 60));
                objArray[1] = Long.valueOf((l1 % 60));
                uArrayList.add(String.format("%1$02d:%2$02d", objArray));
                objArray = new Object[i5];
                objArray[0] = Long.valueOf((l2 / 60));
                objArray[1] = Long.valueOf((l2 % 60));
                uArrayList.add(String.format("%1$02d:%2$02d", objArray));
                ArrayList uArrayList1 = new ArrayList();
                Object[] objArray1 = new Object[i5];
                objArray1[0] = Integer.valueOf(p1);
                objArray1[1] = Integer.valueOf(p2);
                uArrayList1.add(String.format("%1$02d:%2$02d", objArray1));
                Object[] objArray2 = new Object[i5];
                objArray2[0] = Integer.valueOf(p3);
                objArray2[1] = Integer.valueOf(p4);
                uArrayList1.add(String.format("%1$02d:%2$02d", objArray2));
                if (MiPushClient.acceptTimeSet(uContext, uArrayList.get(0), uArrayList.get(1))) {
                   if (1 == n.c(p0)) {
                      PushMessageHandler.a(p0, p5, ex.i.a, 0, null, uArrayList1);
                   }else {
                      n.f(uContext, n.a(ex.i.a, uArrayList1, 0, null, null, null));
                   }
                }else {
                   MiPushClient.setCommand(uContext, ex.i.a, uArrayList, p5);
                }
                return;
             }
          }
       }
    label_00fa :
       throw new IllegalArgumentException("the input parameter is not valid.");
    }
    public static void setAlias(Context p0,String p1,String p2){
       if (!TextUtils.isEmpty(p1)) {
          MiPushClient.setCommand(p0, ex.c.a, p1, p2);
       }
       return;
    }
    public static void setCommand(Context p0,String p1,String p2,String p3){
       StringBuilder str2;
       ArrayList uArrayList = new ArrayList();
       if (!TextUtils.isEmpty(p2)) {
          uArrayList.add(p2);
       }
       ex c = ex.c;
       int i = 1;
       if ((c.a).equalsIgnoreCase(p1) && Math.abs((System.currentTimeMillis() - MiPushClient.aliasSetTime(p0, p2))) - 0x5265c00 < 0) {
          if (i == n.c(p0)) {
          label_0033 :
             PushMessageHandler.a(p0, p3, p1, 0, null, uArrayList);
          }else {
          label_003e :
             n.f(p0, n.a(c.a, uArrayList, 0, null, p3, null));
          }
       }else {
          String str = " is unseted";
          int i1 = 3;
          String str1 = null;
          if ((ex.d.a).equalsIgnoreCase(p1) && MiPushClient.aliasSetTime(p0, p2) - str1 < 0) {
             str2 = "";
             p1 = "Don\'t cancel alias for ";
          }else {
             c = ex.e;
             if ((c.a).equalsIgnoreCase(p1) && Math.abs((System.currentTimeMillis() - MiPushClient.accountSetTime(p0, p2))) - 0x36ee80 < 0) {
                if (i == n.c(p0)) {
                   goto label_0033 ;
                }else {
                   goto label_003e ;
                }
             }else if((ex.f.a).equalsIgnoreCase(p1) && MiPushClient.accountSetTime(p0, p2) - str1 < 0){
                str2 = "";
                p1 = "Don\'t cancel account for ";
             }else {
                MiPushClient.setCommand(p0, p1, uArrayList, p3);
             }
          }
          c.l(str2+p1+p0.c(uArrayList.toString(), i1)+str);
       }
       return;
    }
    public static void setCommand(Context p0,String p1,ArrayList p2,String p3){
       if (TextUtils.isEmpty(f0.d(p0).c())) {
          return;
       }
       ib oib = new ib();
       String str = u.a();
       oib.a(str);
       oib.b(f0.d(p0).c());
       oib.c(p1);
       Iterator iterator = p2.iterator();
       while (iterator.hasNext()) {
          oib.a(iterator.next());
       }
       oib.e(p3);
       oib.d(p0.getPackageName());
       c.v("cmd:"+p1+", "+str);
       x.l(p0).v(oib, hh.j, null);
       return;
    }
    public static void setLocalNotificationType(Context p0,int p1){
       x.l(p0).O((p1 & 0xff));
    }
    public static void setUserAccount(Context p0,String p1,String p2){
       if (!TextUtils.isEmpty(p1)) {
          MiPushClient.setCommand(p0, ex.e.a, p1, p2);
       }
       return;
    }
    public static boolean shouldPullNotification(Context p0){
       int i = 0;
       if (Math.abs((System.currentTimeMillis() - o.c(p0, "mipush_extra", i).getLong("last_pull_notification", -1))) - 0x493e0 > 0) {
          i = true;
       }
       return i;
    }
    public static boolean shouldSendRegRequest(Context p0){
       int i = 0;
       if (Math.abs((System.currentTimeMillis() - o.c(p0, "mipush_extra", i).getLong("last_reg_request", -1))) - 5000 > 0) {
          i = true;
       }
       return i;
    }
    public static boolean shouldUseMIUIPush(Context p0){
       return x.l(p0).J();
    }
    public static void subscribe(Context p0,String p1,String p2){
       if (!TextUtils.isEmpty(f0.d(p0).c()) && !TextUtils.isEmpty(p1)) {
          if (Math.abs((System.currentTimeMillis() - MiPushClient.topicSubscribedTime(p0, p1))) - 0x5265c00 > 0) {
             il oil = new il();
             String str = u.a();
             oil.a(str);
             oil.b(f0.d(p0).c());
             oil.c(p1);
             oil.d(p0.getPackageName());
             oil.e(p2);
             c.v("cmd:"+ex.g+", "+str);
             x.l(p0).v(oil, hh.c, null);
          }else if(1 == n.c(p0)){
             PushMessageHandler.a(p0, p2, 0, 0, p1);
          }else {
             ArrayList uArrayList = new ArrayList();
             uArrayList.add(p1);
             n.f(p0, n.a(ex.g.a, uArrayList, 0, null, null, null));
          }
       }
       return;
    }
    public static void syncAssembleCOSPushToken(Context p0){
    }
    public static void syncAssembleFCMPushToken(Context p0){
       x.l(p0).D(null, au.d, e.b, "");
    }
    public static void syncAssembleFTOSPushToken(Context p0){
    }
    public static void syncAssemblePushToken(Context p0){
    }
    public static long topicSubscribedTime(Context p0,String p1){
       return o.c(p0, "mipush_extra", 0).getLong("topic_"+p1, -1);
    }
    public static void turnOffPush(Context p0,MiPushClient$f p1){
       MiPushClient.disablePush(p0);
       if (p1 != null) {
          MiPushClient$a uoa = new MiPushClient$a();
          uoa.a(0);
          p1.onResult(uoa);
       }
       return;
    }
    public static void turnOnPush(Context p0,MiPushClient$f p1){
       MiPushClient.enablePush(p0);
       if (p1 != null) {
          MiPushClient$a uoa = new MiPushClient$a();
          uoa.a(0);
          p1.onResult(uoa);
       }
       return;
    }
    public static void unRegisterToken(Context p0,MiPushClient$g p1){
       MiPushClient.unregisterPush(p0);
       if (p1 != null) {
          MiPushClient$d uod = new MiPushClient$d();
          uod.b(null);
          uod.a(0);
          p1.onResult(uod);
       }
       return;
    }
    public static void unregisterPush(Context p0){
       l0.n(p0);
       r.g(p0).h();
       if (!f0.d(p0).p()) {
          return;
       }
       in oin = new in();
       oin.a(u.a());
       oin.b(f0.d(p0).c());
       oin.c(f0.d(p0).q());
       oin.e(f0.d(p0).m());
       oin.d(p0.getPackageName());
       x.l(p0).u(oin);
       PushMessageHandler.a();
       PushMessageHandler.b();
       f0.d(p0).n();
       MiPushClient.clearLocalNotificationType(p0);
       MiPushClient.clearNotification(p0);
       MiPushClient.clearExtras(p0);
       return;
    }
    public static void unsetAlias(Context p0,String p1,String p2){
       MiPushClient.setCommand(p0, ex.d.a, p1, p2);
    }
    public static void unsetUserAccount(Context p0,String p1,String p2){
       MiPushClient.setCommand(p0, ex.f.a, p1, p2);
    }
    public static void unsubscribe(Context p0,String p1,String p2){
       if (!f0.d(p0).p()) {
          return;
       }
       if (MiPushClient.topicSubscribedTime(p0, p1) - null < 0) {
          c.l("Don\'t cancel subscribe for "+p1+" is unsubscribed");
          return;
       }else {
          ip oip = new ip();
          String str = u.a();
          oip.a(str);
          oip.b(f0.d(p0).c());
          oip.c(p1);
          oip.d(p0.getPackageName());
          oip.e(p2);
          c.v("cmd:"+ex.h+", "+str);
          x.l(p0).v(oip, hh.d, null);
          return;
       }
    }
    public static void updateImeiOrOaid(){
       new Thread(new h()).start();
    }
}
