package com.kwai.performance.stability.crash.monitor.anr.async.MessageUtils;
import java.lang.Boolean;
import java.util.HashSet;
import java.util.LinkedList;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import android.os.Message;
import com.kwai.performance.stability.crash.monitor.anr.async.MessageUtils$MessageParsed;
import java.lang.StringBuilder;
import java.lang.Integer;
import yf7.h;
import android.os.SystemClock;
import com.kwai.performance.stability.crash.monitor.anr.config.AsyncScheduleConfig;
import android.os.IBinder;
import android.app.Service;
import android.os.Looper;
import com.kwai.performance.stability.crash.monitor.util.e;
import java.lang.System;
import java.lang.Runnable;
import android.os.Handler;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import com.kwai.performance.stability.crash.monitor.util.g;
import java.lang.Class;
import java.lang.reflect.Field;
import androidx.work.impl.background.systemalarm.d;
import java.lang.CharSequence;
import yf7.i;
import android.text.TextUtils;
import android.content.pm.ServiceInfo;
import android.content.Intent;
import android.content.ComponentName;
import vg7.h;
import java.lang.Throwable;
import android.util.Log;
import com.kwai.performance.stability.crash.monitor.anr.b;

public class MessageUtils	// class@0011a4
{
    public static final Boolean a;
    public static Object b;
    public static Handler c;
    public static Map d;
    public static Object e;
    public static AsyncScheduleConfig f;
    public static Set g;
    public static Set h;
    public static Set i;
    public static final Set j;
    public static LinkedList k;
    public static int l;
    public static int m;
    public static boolean n;
    public static Set o;
    public static Set p;

    static {
       MessageUtils.a = Boolean.FALSE;
       MessageUtils.j = new HashSet();
       MessageUtils.k = new LinkedList();
       MessageUtils.l = 114;
       MessageUtils.m = 115;
       MessageUtils.n = true;
       String[] stringArray = new String[]{"android.intent.action.PACKAGE_CHANGED","android.intent.action.TIME_TICK","com.kw.pp.action","android.intent.action.TIME_SET","com.kw.rr.tt.dd","android.intent.action.SCREEN_OFF","android.intent.action.SCREEN_ON","com.kw.rr.yy.dd","com.kw.rp.ch.action","com.kw.en.r.p","com.kw.en.rr.yy.ddd","com.kw.a.alll","android.intent.action.DATE_CHANGED","android.intent.action.NEW_OUTGOING_CALL","com.kw.rr.yy.ddd"};
       MessageUtils.o = new HashSet(Arrays.asList(stringArray));
       stringArray = new String[]{"com.kwai.chat.kwailink.client.KwaiLinkNotifyClientBroadcastReceiver","com.kwai.framework.plugin.qigsaw.receiver.MainProcessReceiver","com.xiaomi.push.service.receivers.PingReceiver","androidx.work.impl.background.systemalarm.RescheduleReceiver","com.huawei.hms.support.api.push.PushReceiver","com.yxcorp.gifshow.push.xiaomi.XiaomiPushReceiver","com.kwai.framework.plugin.downloader.PluginDownloadPriorityReceiver","com.yxcorp.gifshow.ad.detail.AppInstalledReceiver","com.kwai.yoda.event.YodaPhoneCallReceiver","com.kwai.framework.plugin.qigsaw.receiver.MiniApp0ProcessReceiver","com.kwai.framework.plugin.qigsaw.receiver.MiniGame2ProcessReceiver","com.kwai.framework.plugin.qigsaw.receiver.MiniGame1ProcessReceiver","com.kwai.framework.plugin.qigsaw.receiver.MiniGame4ProcessReceiver","com.kwai.framework.plugin.qigsaw.receiver.MiniGame3ProcessReceiver","com.kwai.framework.plugin.qigsaw.receiver.CloudGameProcessReceiver","com.kwai.framework.plugin.qigsaw.receiver.MiniGame0ProcessReceiver","com.yxcorp.gifshow.growth.widget.provider.GrowthLightSearchWidgetProvider","com.k.r.v2.MReceiverF","androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy","com.kwai.frog.game.engine.adapter.multiprocess.KRTReceiver","com.yxcorp.gifshow.growth.widget.provider.GrowthDarkRankWidgetProvider","com.huawei.hms.support.api.push.PushMsgReceiver","com.yxcorp.download.DownloadReceiver","com.yxcorp.gifshow.growth.widget.provider.GrowthDarkSearchWidgetProvider","com.yxcorp.gifshow.growth.widget.provider.GrowthLightRankWidgetProvider"};
       MessageUtils.p = new HashSet(Arrays.asList(stringArray));
    }
    public static void a(Message p0,MessageUtils$MessageParsed p1){
       MessageUtils$MessageParsed token;
       String str = ", component ";
       h.d("MessageUtils", "dispatchMessage\(before\) | what = "+p0.what+str+p1.componentName+", token = "+p1.token+", new hash = "+Integer.toHexString(p0.hashCode()));
       long l = SystemClock.uptimeMillis();
       long l1 = SystemClock.currentThreadTimeMillis();
       while (MessageUtils.k.size() >= MessageUtils.f.recentSchedCount) {
          MessageUtils.k.remove();
       }
       token = p1.token;
       if (token instanceof IBinder) {
          Service service = MessageUtils.g(token);
          if (service != null) {
             p1.service = service.toString();
          }
       }
       token = p1.token;
       if (token != null) {
          p1.token = token.toString();
       }
       boolean b = (Looper.myLooper() == Looper.getMainLooper())? true: false;
       p1.mainThread = b;
       MessageUtils.k.add(p1);
       p1.delay = l - p1.when;
       if (MessageUtils.n) {
          MessageUtils.n = false;
          e.v("AsyncSchedule.FirstSched", p1);
       }
       p1.now = System.currentTimeMillis();
       if (p0.getCallback() != null) {
          MessageUtils.e().dispatchMessage(p0);
       }else {
          MessageUtils.e().handleMessage(p0);
       }
       p1.cost = SystemClock.uptimeMillis() - l;
       p1.costCpu = SystemClock.currentThreadTimeMillis() - l1;
       h.d("MessageUtils", "dispatchMessage\(after\) | what = "+p0.what+str+p1.componentName+", token = "+p1.token+", new hash = "+Integer.toHexString(p0.hashCode())+", cost = "+p1.cost+" ms, costCpu = "+p1.costCpu+" ms, delay = "+p1.delay+" ms, history = "+MessageUtils.k.size()+", origin = "+p0);
       return;
    }
    public static Map b(){
       HashMap hashMap = new HashMap();
       Map map = MessageUtils.h();
       if (map == null) {
          return hashMap;
       }
       Iterator iterator = map.keySet().iterator();
       while (iterator.hasNext()) {
          IBinder iBinder = iterator.next();
          String str = String.valueOf(iBinder);
          hashMap.put(str, String.valueOf(map.get(iBinder)));
       }
       return hashMap;
    }
    public static Object c(){
       if (MessageUtils.b == null) {
          Object obj = g.h("android.app.ActivityThread", "sCurrentActivityThread");
          MessageUtils.b = obj;
       }
       return MessageUtils.b;
    }
    public static Object d(Object p0,String p1){
       object oobject;
       Field[] declaredFiel = p0.getClass().getDeclaredFields();
       int len = declaredFiel.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return null;
          }
          oobject = declaredFiel[i];
          if ((oobject.getName()).equals(p1)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       oobject.setAccessible(true);
       return oobject.get(p0);
    }
    public static Handler e(){
       if (MessageUtils.c == null) {
          MessageUtils.c = MessageUtils.d(MessageUtils.c(), "mH");
       }
       return MessageUtils.c;
    }
    public static Object f(){
       if (MessageUtils.e == null) {
          MessageUtils.e = MessageUtils.d(MessageUtils.c(), "mResourcesManager");
       }
       return MessageUtils.e;
    }
    public static Service g(IBinder p0){
       Map map = MessageUtils.h();
       if (map != null && map.containsKey(p0)) {
          return map.get(p0);
       }
       return null;
    }
    public static Map h(){
       if (MessageUtils.d == null) {
          MessageUtils.d = MessageUtils.d(MessageUtils.c(), "mServices");
       }
       return MessageUtils.d;
    }
    public static Object i(Service p0){
       object oobject;
       Object obj = null;
       if (p0 == null) {
          h.g("MessageUtils", "getSystemAlarmServiceDispatcher\(\) | service is null");
          return obj;
       }else {
          Field[] declaredFiel = p0.getClass().getDeclaredFields();
          int len = declaredFiel.length;
          int i = 0;
          while (true) {
             if (i < len) {
                oobject = declaredFiel[i];
                if (oobject.getType() == d.class) {
                label_0026 :
                   if (oobject == null) {
                      h.g("MessageUtils", "getSystemAlarmServiceDispatcher\(\) | cannot found mDispatcher field");
                      return obj;
                   }else {
                      oobject.setAccessible(true);
                      obj = oobject.get(p0);
                      if (obj == null) {
                         h.g("MessageUtils", "getSystemAlarmServiceDispatcher\(\) | cannot found mDispatcher instance");
                         break ;
                      }
                      break ;
                   }
                }else {
                   i = i + 1;
                }
             }else {
                oobject = obj;
                goto label_0026 ;
             }
          }
          return obj;
       }
    }
    public static boolean j(Message p0){
       MessageUtils$MessageParsed messageParse;
       MessageUtils$MessageParsed action;
       String str = "isBroadcastMessage\(\) | Action ";
       boolean b = true;
       boolean b1 = false;
       if (p0.what == MessageUtils.f.whatReceiver && (p0.getTarget() == MessageUtils.e() && MessageUtils.f.tempEnable113Schedule != null)) {
          messageParse = MessageUtils.p(p0, b1);
          if (MessageUtils.k(messageParse) || !MessageUtils.l(messageParse)) {
             h.g("MessageUtils", str+messageParse.action+" or Comp "+messageParse.componentName+" is in blackList");
             b = false;
          }
       }else {
          Runnable callback = p0.getCallback();
          String name = (callback != null)? callback.getClass().getName(): null;
          Handler handler = (name != null && (name.contains("$Lambda$") || name.contains("LoadedApk$ReceiverDispatcher$Args")))? 1: null;
          if (handler) {
             MessageUtils$MessageParsed messageParse1 = MessageUtils.o(p0);
             MessageUtils$MessageParsed isOrdered = messageParse1.isOrdered;
             if (isOrdered == null && MessageUtils.f.tempReportForDebug != null) {
                i.a.c("AsyncSched.Receiver.NotOrdered", "Action="+messageParse1.action+"&Cmp="+messageParse1.componentName+"&Receiver="+messageParse1.receiver+"&Callback="+callback, b1);
             }
             if (isOrdered == null && (("android.intent.action.SCREEN_ON").equals(messageParse1.action) || ("android.intent.action.SCREEN_OFF").equals(messageParse1.action))) {
                h.g("MessageUtils", str+messageParse1.action+" is not ordered \("+messageParse1+", "+messageParse1.receiver+"\)");
             }
             if (isOrdered == null && MessageUtils.f.forceSchedForReceiver != null) {
                messageParse = messageParse1.action;
                if (messageParse != null) {
                   isOrdered = MessageUtils.o.contains(messageParse);
                }
                messageParse = messageParse1.componentName;
                if (messageParse != null) {
                   isOrdered = MessageUtils.p.contains(messageParse);
                }
                if (isOrdered) {
                   i a = i.a;
                   action = messageParse1.action;
                   if (action == null) {
                      action = messageParse1.componentName;
                   }
                   a.c("AsyncSched.Receiver.WhiteList", action, b1);
                }
             }
          label_012e :
             if (MessageUtils.k(messageParse1) || !MessageUtils.l(messageParse1)) {
                handler = null;
             }
             if (!handler || !isOrdered) {
                b = false;
             }
             b1 = isOrdered;
          }else {
             b = handler;
          }
          if (b != null && p0.getTarget() != MessageUtils.e()) {
             h.d("MessageUtils", "isBroadcastMessage\(\) | Message handler is not mH, "+p0);
          }
       }
    label_0164 :
       if (MessageUtils.a.booleanValue()) {
          h.f("MessageUtils", "isBroadcastMessage\("+b+"/"+b1+"\) | Message = "+p0);
       }
       return b;
    }
    public static boolean k(MessageUtils$MessageParsed p0){
       Set g = MessageUtils.g;
       boolean b = false;
       if (g == null || !g.size()) {
          g = MessageUtils.h;
          if (g == null || !g.size()) {
          label_004b :
             return b;
          }
       }
       if (MessageUtils.g != null) {
          if (!TextUtils.isEmpty(p0.componentName) && (MessageUtils.g.contains(p0.componentName) || MessageUtils.g.contains(p0.action))) {
             b = true;
          }
          return b;
       }else {
          p0 = p0.receiver;
          if (p0 != null) {
             return MessageUtils.h.contains(p0.split("@")[b]);
          }else {
             goto label_004b ;
          }
       }
    }
    public static boolean l(MessageUtils$MessageParsed p0){
       Set i = MessageUtils.i;
       boolean b = (i == null || (!i.size() || (!TextUtils.isEmpty(p0.componentName) && (MessageUtils.i.contains(p0.componentName) || MessageUtils.i.contains(p0.action)))))? true: false;
       return b;
    }
    public static boolean m(Message p0){
       AsyncScheduleConfig f = MessageUtils.f;
       boolean b = (f.enableTrimMemorySchedule == null || (f.whatTrimMemory != p0.what && (f.enableLowMemorySchedule == null || (f.whatLowMemory == p0.what || (f.enableConfChangeSchedule != null && f.whatConfChange == p0.what)))))? true: false;
       return b;
    }
    public static boolean n(Message p0){
       boolean b = (MessageUtils.j.contains(Integer.valueOf(p0.what)) && p0.getTarget() == MessageUtils.e())? true: false;
       if (MessageUtils.a.booleanValue()) {
          h.f("MessageUtils", "isServiceMessage\("+b+"\) | Message = "+p0);
       }
       return b;
    }
    public static MessageUtils$MessageParsed o(Message p0){
       return MessageUtils.p(p0, true);
    }
    public static MessageUtils$MessageParsed p(Message p0,boolean p1){
       Service service;
       String str2;
       Intent intent;
       MessageUtils$MessageParsed token;
       object obj2;
       Field[] obj3;
       int i2;
       Intent intent1;
       Message message = p0;
       String str = "android.app.LoadedApk$ReceiverDispatcher";
       String str1 = "&";
       MessageUtils$MessageParsed messageParse = new MessageUtils$MessageParsed();
       messageParse.origin = p0.toString();
       messageParse.what = message.what;
       messageParse.when = p0.getWhen();
       Message obj = message.obj;
       Runnable callback = p0.getCallback();
       if (obj != null) {
          if (!(obj.getClass().getName()).equals("android.os.BinderProxy")) {
             Object obj1 = MessageUtils.d(obj, "token");
             obj2 = MessageUtils.d(obj, "info");
             if (obj2 instanceof ServiceInfo) {
             }else {
                obj2 = null;
             }
             if (obj2 != null) {
                messageParse.componentName = obj2.name;
                obj = obj1;
             }else {
                obj2 = MessageUtils.d(obj, "args");
                if (obj2 instanceof Intent) {
                }else {
                   obj2 = null;
                }
                if (obj2 != null) {
                   if (obj2.getComponent() != null) {
                      messageParse.componentName = obj2.getComponent().getClassName();
                   }
                }else {
                   obj3 = MessageUtils.d(obj, "intent");
                   obj2 = (obj3 instanceof Intent)? obj3: null;
                   if (obj2 != null) {
                      if (obj2.getComponent() != null) {
                         messageParse.componentName = obj2.getComponent().getClassName();
                      }
                      messageParse.action = obj2.getAction();
                   }
                }
                obj = obj1;
             label_00a3 :
                if (obj != null) {
                   messageParse.token = obj;
                   if (messageParse.componentName == null && (message.what == MessageUtils.f.whatStopService && obj instanceof IBinder)) {
                      service = MessageUtils.g(obj);
                      str2 = (service == null)? null: service.getClass().getName();
                      messageParse.componentName = str2;
                   }
                }
                intent = str1;
             }
          }
          str1 = 0;
          goto label_00a3 ;
       }else if(callback != null){
          obj3 = callback.getClass().getDeclaredFields();
          int len = obj3.length;
          int i = 0;
          Field uField = null;
          Field uField1 = null;
          Field uField2 = null;
          Object obj4 = null;
          String str3 = "mCurIntent";
          String str4 = "mOrdered";
          while (i < len) {
             object oobject = obj3[i];
             String name = oobject.getName();
             if (name.endsWith("f$0")) {
                oobject.setAccessible(true);
             label_0103 :
                uField = oobject;
             }else if(name.endsWith("$f0")){
                oobject.setAccessible(true);
                goto label_0103 ;
             }else if(str.equals(oobject.getType().getName())){
                if (name.equals("this$0") || name.equals("this$1")) {
                   oobject.setAccessible(true);
                   obj4 = oobject.get(callback);
                }
             }else if(name.equals(str4)){
                oobject.setAccessible(true);
                uField1 = oobject;
             }else {
                boolean b = true;
                if (name.equals(str3)) {
                   oobject.setAccessible(b);
                   uField2 = oobject;
                }
             }
             i = i + 1;
          }
          if (MessageUtils.f.tempReportForDebug != null) {
             StringBuilder str5 = h.b()+"Callback="+callback+str1;
             int i1 = 0;
             while (i1 < obj3.length) {
                str5 = str5+"Field"+i1+"="+obj3[i1];
                i2 = obj3.length - 1;
                if (i1 != i2) {
                   str5 = str5+str1;
                }
                i1 = i1 + 1;
             }
             i.a.c("AsyncSched.Receiver.FieldList", str5, false);
          }else {
             str2 = null;
          }
          if (uField == null) {
             if (uField1 != null) {
                messageParse.isOrdered = Boolean.TRUE.equals(uField1.get(callback));
             }
             if (uField2 != null) {
                intent1 = uField2.get(callback);
             }else {
                intent1 = null;
             }
          }else {
             Object obj5 = uField.get(callback);
             messageParse.isOrdered = Boolean.TRUE.equals(MessageUtils.d(obj5, str4));
             intent1 = MessageUtils.d(obj5, str3);
             if (obj5 != null) {
                Field[] declaredFiel = obj5.getClass().getDeclaredFields();
                int len2 = declaredFiel.length;
                i2 = 0;
                while (i2 < len2) {
                   object oobject1 = declaredFiel[i2];
                   if (str.equals(oobject1.getType().getName())) {
                      oobject1.setAccessible(true);
                      obj4 = oobject1.get(obj5);
                   }
                   i2 = i2 + 1;
                }
             }
          }
          if (obj4 != null) {
             obj3 = obj4.getClass().getDeclaredFields();
             int len1 = obj3.length;
             i2 = 0;
             while (i2 < len1) {
                obj2 = obj3[i2];
                if (("android.content.BroadcastReceiver").equals(obj2.getType().getName())) {
                   obj2.setAccessible(true);
                   messageParse.receiver = String.valueOf(obj2.get(obj4));
                }else {
                   Class uClass = 1;
                }
                i2 = i2 + 1;
             }
          }
          if (intent1 != null) {
             messageParse.action = intent1.getAction();
             if (intent1.getComponent() != null) {
                messageParse.componentName = intent1.getComponent().getClassName();
             }
             intent = intent1;
          }
       }
       intent = null;
       if (intent != null) {
          messageParse.intent = String.valueOf(intent);
       }
       if (p1) {
          token = messageParse.token;
          if (token instanceof IBinder) {
             service = MessageUtils.g(token);
             if (service != null) {
                messageParse.service = service.toString();
             }
          }
       }
       return messageParse;
    }
    public static void q(Message p0,MessageUtils$MessageParsed p1,Handler p2){
       MessageUtils$MessageParsed componentNam = p1.componentName;
       if (componentNam == null) {
          return;
       }
       if (componentNam.equals("androidx.work.impl.background.systemalarm.SystemAlarmService")) {
          if (p1.token instanceof String) {
             p1 = MessageUtils.o(p0);
          }
          componentNam = p1.token;
          if (!componentNam instanceof IBinder) {
             StringBuilder str = "processSpecService\(\) | token not IBinder = "+p1.token+", type = ";
             p1 = p1.token;
             Class class = (p1 != null)? p1.getClass(): "null";
             h.g("MessageUtils", str+class);
             return;
          }else {
             Service service = MessageUtils.g(componentNam);
             if (service == null) {
                h.g("MessageUtils", "processSpecService\(\) | cannot found service = "+p1.token);
                return;
             }else {
                h.d("MessageUtils", "replaceDispatcherHandler\(\) | prepare to update targetField | "+service);
                p1 = MessageUtils.i(service);
                StringBuilder str1 = (p1 == null)? null: MessageUtils.r(p1, p2);
                if (str1) {
                   h.d("MessageUtils", "processSpecService\(\) | process success | "+p0);
                }
             }
          }
       }
       return;
    }
    public static boolean r(Object p0,Handler p1){
       object oobject;
       h.d("MessageUtils", "replaceDispatcherHandler\(\) | dispatcher = "+p0);
       Field[] declaredFiel = p0.getClass().getDeclaredFields();
       int len = declaredFiel.length;
       int i = 0;
       while (true) {
          if (i < len) {
             oobject = declaredFiel[i];
             if (oobject.getType() == Handler.class) {
             label_0032 :
                if (oobject == null) {
                   h.g("MessageUtils", "replaceDispatcherHandler\(\) | cannot found mMainHandler instance");
                   return false;
                }else {
                   oobject.setAccessible(true);
                   if (oobject.get(p0) == p1) {
                      h.g("MessageUtils", "replaceDispatcherHandler\(\) | origin mMainHandler equals to new");
                      break ;
                   }
                   break ;
                }
             }else {
                i = i + 1;
             }
          }else {
             oobject = null;
             goto label_0032 ;
          }
       }
       oobject.set(p0, p1);
       h.d("MessageUtils", "replaceDispatcherHandler\(\) | update targetField success");
       return true;
    }
}
