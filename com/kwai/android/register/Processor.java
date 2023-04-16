package com.kwai.android.register.Processor;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import com.kwai.android.common.bean.Channel;
import kotlin.Pair;
import kotlin.jvm.internal.a;
import com.kwai.android.register.Processor$clickNotification$2;
import msd.a;
import com.kwai.android.common.utils.PushSDKInitUtilKt;
import com.kwai.android.register.Processor$clickNotification$1;
import com.kwai.android.register.Processor$commandProcess$1;
import java.util.LinkedList;
import com.kwai.android.register.Processor$showNotification$1;
import java.util.Collection;
import com.kwai.android.register.core.click.ClickLogInterceptor;
import com.kwai.android.register.core.click.ClickRebuildIntentInterceptor;
import com.kwai.android.register.core.click.ClickStartActivityInterceptor;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.android.common.intercept.Interceptor;
import com.kwai.android.register.ProcessorKt;
import java.util.List;
import com.kwai.android.register.core.command.CommandLogHeadInterceptor;
import com.kwai.android.register.core.command.CommandCombineInterceptor;
import com.kwai.android.register.core.command.CommandRecallInterceptor;
import com.kwai.android.register.core.command.CommandObiwanInterceptor;
import com.kwai.android.register.core.command.CommandLogFootInterceptor;
import com.kwai.android.register.core.notification.NotificationLogHeadInterceptor;
import com.kwai.android.register.core.notification.NotificationBuilderInterceptor;
import com.kwai.android.register.core.notification.NotificationDisableForegroundInterceptor;
import com.kwai.android.register.core.notification.NotificationCombineInterceptor;
import com.kwai.android.register.core.notification.NotificationShowInterceptor;
import com.kwai.android.register.core.notification.NotificationStateReportInterceptor;
import com.kwai.android.register.core.notification.NotificationLogFootInterceptor;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import android.content.Context;
import com.kwai.android.common.utils.ContextProvider;
import android.app.ActivityManager;
import android.app.ActivityManager$RunningAppProcessInfo;
import qrd.l1;
import java.lang.NullPointerException;
import java.lang.Throwable;
import qrd.j0;

public final class Processor	// class@0009d8
{
    public static final Processor INSTANCE;
    public static final List clickNotificationInterceptors;
    public static final List commandInterceptors;
    public static boolean isMainProcessRunning;
    public static long lastCheckMainProcessMills;
    public static final List parseNotificationInterceptors;

    static {
       Processor.INSTANCE = new Processor();
       Processor.parseNotificationInterceptors = new ArrayList();
       Processor.clickNotificationInterceptors = new ArrayList();
       Processor.commandInterceptors = new ArrayList();
    }
    public void Processor(){
       super();
    }
    public static final void clickNotification(String p0,Channel p1,boolean p2,Pair[] p3){
       a.p(p0, "pushData");
       a.p(p1, "channel");
       a.p(p3, "params");
       PushSDKInitUtilKt.requirePushInit(new Processor$clickNotification$2(p0, p1, p2, p3));
    }
    public static final void clickNotification(String p0,Channel p1,Pair[] p2){
       a.p(p0, "pushData");
       a.p(p1, "channel");
       a.p(p2, "params");
       PushSDKInitUtilKt.requirePushInit(new Processor$clickNotification$1(p0, p1, p2));
    }
    public static final void commandProcess(String p0,Channel p1){
       a.p(p0, "commandData");
       a.p(p1, "channel");
       PushSDKInitUtilKt.requirePushInit(new Processor$commandProcess$1(p1, p0));
    }
    public static LinkedList getClickInterceptorList$lib_register_release$default(Processor p0,int p1,int p2,Object p3){
       if (p2 & 1) {
          p1 = 1;
       }
       return p0.getClickInterceptorList$lib_register_release(p1);
    }
    public static LinkedList getCommandInterceptorList$lib_register_release$default(Processor p0,int p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = 3;
       }
       return p0.getCommandInterceptorList$lib_register_release(p1);
    }
    public static LinkedList getNotificationInterceptorList$lib_register_release$default(Processor p0,int p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = 3;
       }
       return p0.getNotificationInterceptorList$lib_register_release(p1);
    }
    public static final void showNotification(String p0,Channel p1){
       a.p(p0, "pushData");
       a.p(p1, "channel");
       PushSDKInitUtilKt.requirePushInit(new Processor$showNotification$1(p1, p0));
    }
    public final LinkedList getClickInterceptorList$lib_register_release(int p0){
       LinkedList linkedList = new LinkedList(Processor.clickNotificationInterceptors);
       linkedList.add(0, new ClickLogInterceptor());
       linkedList.add(new ClickRebuildIntentInterceptor());
       linkedList.add(new ClickStartActivityInterceptor());
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = linkedList.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          Object obj1 = obj;
          a.o(obj1, "it");
          if (ProcessorKt.isSupportFlag(obj1, p0)) {
             uArrayList.add(obj);
          }
       }
       return new LinkedList(uArrayList);
    }
    public final List getClickNotificationInterceptors(){
       return Processor.clickNotificationInterceptors;
    }
    public final LinkedList getCommandInterceptorList$lib_register_release(int p0){
       LinkedList linkedList = new LinkedList(Processor.commandInterceptors);
       linkedList.add(0, new CommandLogHeadInterceptor());
       linkedList.add(1, new CommandCombineInterceptor());
       linkedList.add(2, new CommandRecallInterceptor());
       linkedList.add(3, new CommandObiwanInterceptor());
       linkedList.add(new CommandLogFootInterceptor());
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = linkedList.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          Object obj1 = obj;
          a.o(obj1, "it");
          if (ProcessorKt.isSupportFlag(obj1, p0)) {
             uArrayList.add(obj);
          }
       }
       return new LinkedList(uArrayList);
    }
    public final List getCommandInterceptors(){
       return Processor.commandInterceptors;
    }
    public final LinkedList getNotificationInterceptorList$lib_register_release(int p0){
       LinkedList linkedList = new LinkedList(Processor.parseNotificationInterceptors);
       linkedList.add(0, new NotificationLogHeadInterceptor());
       linkedList.add(1, new NotificationBuilderInterceptor());
       linkedList.add(2, new NotificationDisableForegroundInterceptor());
       linkedList.add(3, new NotificationCombineInterceptor());
       linkedList.add(new NotificationShowInterceptor());
       linkedList.add(new NotificationStateReportInterceptor());
       linkedList.add(new NotificationLogFootInterceptor());
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = linkedList.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          Object obj1 = obj;
          a.o(obj1, "it");
          if (ProcessorKt.isSupportFlag(obj1, p0)) {
             uArrayList.add(obj);
          }
       }
       return new LinkedList(uArrayList);
    }
    public final List getParseNotificationInterceptors(){
       return Processor.parseNotificationInterceptors;
    }
    public final boolean isMainProcessRunning(){
       if ((SystemClock.elapsedRealtime() - Processor.lastCheckMainProcessMills) - TimeUnit.SECONDS.toMillis(2) >= 0) {
          List systemServic = ContextProvider.getContext().getSystemService("activity");
          if (systemServic != null) {
             boolean b = false;
             systemServic = systemServic.getRunningAppProcesses();
             a.o(systemServic, "am.runningAppProcesses");
             Iterator iterator = systemServic.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   Context context = ContextProvider.getContext();
                   a.o(context, "ContextProvider.getContext\(\)");
                   if (a.g(iterator.next().processName, context.getPackageName())) {
                      b = true;
                   }
                }
                Processor.lastCheckMainProcessMills = SystemClock.elapsedRealtime();
                Processor.isMainProcessRunning = b;
                Result.constructor-impl(l1.a);
                break ;
             }
          }else {
             throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
          }
       }
       return Processor.isMainProcessRunning;
    }
}
