package com.xiaomi.mipush.sdk.PushMessageHandler;
import com.xiaomi.mipush.sdk.BaseService;
import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.List;
import java.lang.String;
import java.util.Iterator;
import java.lang.Object;
import com.xiaomi.mipush.sdk.MiPushClient$c;
import java.util.Objects;
import android.content.Context;
import android.content.Intent;
import android.content.ComponentName;
import java.lang.Class;
import com.kwai.plugin.dva.feature.core.hook.a;
import java.lang.Exception;
import rs8.c;
import java.lang.StringBuilder;
import android.content.pm.ResolveInfo;
import android.content.pm.ActivityInfo;
import ws8.f7;
import com.xiaomi.mipush.sdk.PushMessageReceiver;
import com.xiaomi.mipush.sdk.MessageHandleService$a;
import com.xiaomi.mipush.sdk.MessageHandleService;
import java.lang.Throwable;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.xiaomi.mipush.sdk.MiPushClient$b;
import com.xiaomi.mipush.sdk.MiPushClient$e;
import com.xiaomi.mipush.sdk.MiPushClient$d;
import com.xiaomi.mipush.sdk.MiPushMessage;
import com.xiaomi.mipush.sdk.PushMessageHandler$a;
import com.xiaomi.push.ex;
import java.lang.CharSequence;
import android.text.TextUtils;
import vs8.h0;
import android.net.Uri;
import vs8.r0;
import com.xiaomi.push.hl;
import com.xiaomi.push.is;
import com.xiaomi.push.i;
import com.xiaomi.mipush.sdk.b;
import vs8.n;
import com.xiaomi.mipush.sdk.f;
import android.content.pm.PackageManager;
import ws8.y3;
import vs8.v;
import java.lang.Runnable;
import android.os.IBinder;
import android.app.Service;

public class PushMessageHandler extends BaseService	// class@0010e3
{
    public static List a;
    public static ThreadPoolExecutor a;
    public static List b;

    static {
       PushMessageHandler.a = new ArrayList();
       PushMessageHandler.b = new ArrayList();
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());
       PushMessageHandler.a = v0;
    }
    public void PushMessageHandler(){
       super();
    }
    public static void a(){
       List b = PushMessageHandler.b;
       _monitor_enter(b);
       PushMessageHandler.b.clear();
       _monitor_exit(b);
    }
    public static void a(long p0,String p1,String p2){
       List b = PushMessageHandler.b;
       _monitor_enter(b);
       Iterator iterator = PushMessageHandler.b.iterator();
       while (iterator.hasNext()) {
          Objects.requireNonNull(iterator.next());
       }
       _monitor_exit(b);
       return;
    }
    public static void a(Context p0){
       Intent intent = new Intent();
       ComponentName uComponentNa = new ComponentName(p0, PushMessageHandler.class);
       try{
          intent.setComponent(uComponentNa);
          a.e(p0, intent);
       }catch(java.lang.Exception e3){
          c.l(e3.getMessage());
       }
       return;
    }
    public static void a(Context p0,Intent p1){
       c.t("addjob PushMessageHandler "+p1);
       if (p1 != null) {
          PushMessageHandler.c(p0, p1);
          PushMessageHandler.a(p0);
       }
       return;
    }
    public static void a(Context p0,Intent p1,ResolveInfo p2,boolean p3){
       MessageHandleService$a uoa = new MessageHandleService$a(p1, f7.c(p0, p2.activityInfo.name).newInstance());
       if (p3) {
          MessageHandleService.a(p0.getApplicationContext(), uoa);
       }else {
          MessageHandleService.addJob(p0.getApplicationContext(), uoa);
       }
       MessageHandleService.a(p0, new Intent(p0.getApplicationContext(), MessageHandleService.class));
       return;
    }
    public static void a(Context p0,MiPushCommandMessage p1){
       List a = PushMessageHandler.a;
       _monitor_enter(a);
       Iterator iterator = PushMessageHandler.a.iterator();
       while (iterator.hasNext()) {
          MiPushClient$b uob = iterator.next();
          if (uob instanceof MiPushClient$e) {
             MiPushClient$d uod = new MiPushClient$d();
             if (p1 != null && (p1.getCommandArguments() != null && p1.getCommandArguments().size() > 0)) {
                uod.a(p1.getResultCode());
                uod.b(p1.getCommandArguments().get(0));
             }
          label_0045 :
             uob.onResult(uod);
          }
       }
       _monitor_exit(a);
       return;
    }
    public static void a(Context p0,MiPushMessage p1){
       List b = PushMessageHandler.b;
       _monitor_enter(b);
       Iterator iterator = PushMessageHandler.b.iterator();
       while (iterator.hasNext()) {
          if (PushMessageHandler.a(p1.getCategory(), iterator.next().a())) {
             p1.getContent();
             p1.getAlias();
             p1.getTopic();
             p1.isNotified();
          }
       }
       _monitor_exit(b);
       return;
    }
    public static void a(Context p0,PushMessageHandler$a p1){
       List commandArgum1;
       if (p1 instanceof MiPushMessage) {
          PushMessageHandler.a(p0, p1);
       }else if(p1 instanceof MiPushCommandMessage){
          String command = p1.getCommand();
          int i = 0;
          String str = null;
          if ((ex.a.a).equals(command)) {
             List commandArgum = p1.getCommandArguments();
             if (commandArgum != null && !commandArgum.isEmpty()) {
                str = commandArgum.get(i);
             }
             PushMessageHandler.a(p1.getResultCode(), p1.getReason(), str);
          }else if(!(ex.c.a).equals(command) && ((ex.d.a).equals(command) || (ex.i.a).equals(command))){
             PushMessageHandler.a(p0, p1.getCategory(), command, p1.getResultCode(), p1.getReason(), p1.getCommandArguments());
          }else if((ex.g.a).equals(command)){
             commandArgum1 = p1.getCommandArguments();
             if (commandArgum1 != null && !commandArgum1.isEmpty()) {
                str = commandArgum1.get(i);
             }
             PushMessageHandler.a(p0, p1.getCategory(), p1.getResultCode(), p1.getReason(), str);
          }else if((ex.h.a).equals(command)){
             commandArgum1 = p1.getCommandArguments();
             if (commandArgum1 != null && !commandArgum1.isEmpty()) {
                str = commandArgum1.get(i);
             }
             PushMessageHandler.b(p0, p1.getCategory(), p1.getResultCode(), p1.getReason(), str);
          }
       }
       return;
    }
    public static void a(Context p0,String p1,long p2,String p3,String p4){
       boolean b1;
       List b = PushMessageHandler.b;
       _monitor_enter(b);
       Iterator iterator = PushMessageHandler.b.iterator();
       for (; iterator.hasNext(); b1 = PushMessageHandler.a(p1, iterator.next().a())) {
       }
       _monitor_exit(b);
       return;
    }
    public static void a(Context p0,String p1,String p2,long p3,String p4,List p5){
       boolean b1;
       List b = PushMessageHandler.b;
       _monitor_enter(b);
       Iterator iterator = PushMessageHandler.b.iterator();
       for (; iterator.hasNext(); b1 = PushMessageHandler.a(p1, iterator.next().a())) {
       }
       _monitor_exit(b);
       return;
    }
    public static void a(MiPushClient$b p0){
       List a = PushMessageHandler.a;
       _monitor_enter(a);
       if (!PushMessageHandler.a.contains(p0)) {
          PushMessageHandler.a.add(p0);
       }
       _monitor_exit(a);
       return;
    }
    public static void a(MiPushClient$c p0){
       List b = PushMessageHandler.b;
       _monitor_enter(b);
       if (!PushMessageHandler.b.contains(p0)) {
          PushMessageHandler.b.add(p0);
       }
       _monitor_exit(b);
       return;
    }
    public static boolean a(String p0,String p1){
       boolean b = (!TextUtils.isEmpty(p0) || (TextUtils.isEmpty(p1) || TextUtils.equals(p0, p1)))? true: false;
       return b;
    }
    public static void b(){
       List a = PushMessageHandler.a;
       _monitor_enter(a);
       PushMessageHandler.a.clear();
       _monitor_exit(a);
    }
    public static void b(Context p0){
       try{
          Intent intent = new Intent();
          intent.setPackage(p0.getPackageName());
          intent.setAction("action_clicked_activity_finish");
          p0.sendBroadcast(intent, h0.a(p0));
       }catch(java.lang.Exception e2){
          c.l("callback sync error"+e2);
       }
       return;
    }
    public static void b(Context p0,Intent p1){
       int i;
       boolean booleanExtra = p1.getBooleanExtra("is_clicked_activity_call", false);
       Uri uri = null;
       if (("com.xiaomi.mipush.sdk.WAKEUP").equals(p1.getAction())) {
          r0.a(p0, p1, uri);
       }else if(("com.xiaomi.mipush.SEND_TINYDATA").equals(p1.getAction())){
          hl ohl = new hl();
          i.c(ohl, p1.getByteArrayExtra("mipush_payload"));
          c.t("PushMessageHandler.onHandleIntent "+ohl.d());
          b.a(p0, ohl);
       }else if(true == n.c(p0)){
          if (PushMessageHandler.b()) {
             c.u("receive a message before application calling initialize");
             if (booleanExtra) {
                PushMessageHandler.b(p0);
             }
             return;
          }else {
             PushMessageHandler$a uoa = f.e(p0).b(p1);
             if (uoa != null) {
                PushMessageHandler.a(p0, uoa);
             }
          }
       }else if(("com.xiaomi.mipush.sdk.SYNC_LOG").equals(p1.getAction())){
          Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
          intent.setPackage(p0.getPackageName());
          intent.putExtras(p1);
          PackageManager packageManag = p0.getPackageManager();
          i = 32;
          List list = packageManag.queryBroadcastReceivers(intent, i);
          if (list != null) {
             Iterator iterator = list.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   ResolveInfo resolveInfo = iterator.next();
                   ResolveInfo activityInfo = resolveInfo.activityInfo;
                   if (activityInfo != null && ((activityInfo.packageName).equals(p0.getPackageName()) && PushMessageReceiver.class.isAssignableFrom(f7.c(p0, resolveInfo.activityInfo.name)))) {
                      uri = resolveInfo;
                   }
                }
             }
          }
          if (uri != null) {
             PushMessageHandler.a(p0, intent, uri, booleanExtra);
          }else {
             c.u("cannot find the receiver to handler this message, check your manifest");
             y3.a(p0).d(p0.getPackageName(), p1, "11");
          }
       }
    }
    public static void b(Context p0,String p1,long p2,String p3,String p4){
       boolean b1;
       List b = PushMessageHandler.b;
       _monitor_enter(b);
       Iterator iterator = PushMessageHandler.b.iterator();
       for (; iterator.hasNext(); b1 = PushMessageHandler.a(p1, iterator.next().a())) {
       }
       _monitor_exit(b);
       return;
    }
    public static boolean b(){
       return PushMessageHandler.b.isEmpty();
    }
    public static void c(Context p0,Intent p1){
       if (p1 != null && !PushMessageHandler.a.isShutdown()) {
          PushMessageHandler.a.execute(new v(p0, p1));
       }
       return;
    }
    public boolean a(){
       ThreadPoolExecutor a = PushMessageHandler.a;
       boolean b = (a != null && (a.getQueue() != null && PushMessageHandler.a.getQueue().size() > 0))? true: false;
       return b;
    }
    public IBinder onBind(Intent p0){
       return null;
    }
    public void onStart(Intent p0,int p1){
       super.onStart(p0, p1);
       PushMessageHandler.c(this.getApplicationContext(), p0);
    }
}
