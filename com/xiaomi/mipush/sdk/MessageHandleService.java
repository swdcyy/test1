package com.xiaomi.mipush.sdk.MessageHandleService;
import com.xiaomi.mipush.sdk.BaseService;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.BlockingQueue;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.mipush.sdk.MessageHandleService$a;
import com.xiaomi.mipush.sdk.PushMessageReceiver;
import java.lang.String;
import java.lang.Object;
import rs8.c;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import java.lang.StringBuilder;
import com.xiaomi.push.ex;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.PushMessageHandler;
import vs8.l0;
import com.xiaomi.mipush.sdk.f;
import com.xiaomi.mipush.sdk.PushMessageHandler$a;
import com.xiaomi.mipush.sdk.MiPushMessage;
import ws8.y3;
import java.lang.Throwable;
import java.util.concurrent.ExecutorService;
import vs8.a1;
import java.lang.Runnable;
import android.content.ComponentName;
import java.lang.Class;
import ws8.k;
import vs8.z0;
import android.os.IBinder;

public class MessageHandleService extends BaseService	// class@0010d6
{
    public static ConcurrentLinkedQueue a;
    public static ExecutorService a;

    static {
       MessageHandleService.a = new ConcurrentLinkedQueue();
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());
       MessageHandleService.a = v0;
    }
    public void MessageHandleService(){
       super();
    }
    public static void a(Context p0){
       MessageHandleService.c(p0);
    }
    public static void a(Context p0,Intent p1){
       if (p1 == null) {
          return;
       }
       MessageHandleService.b(p0);
       return;
    }
    public static void a(Context p0,MessageHandleService$a p1){
       if (p1 == null) {
          return;
       }
       try{
          PushMessageReceiver pushMessageR = p1.b();
          Intent intent = p1.a();
          int i = 1;
          int intExtra = intent.getIntExtra("message_type", i);
          boolean b = false;
          String str = ", reason=";
          String str1 = ", resultCode=";
          if (intExtra != i) {
             if (intExtra != 3) {
                if (intExtra == 5 && ("error_lack_of_permission").equals(intent.getStringExtra("error_type"))) {
                   String[] stringArrayE = intent.getStringArrayExtra("error_message");
                   if (stringArrayE != null) {
                      c.v("begin execute onRequirePermissions, lack of necessary permissions");
                      pushMessageR.onRequirePermissions(p0, stringArrayE);
                   }
                }
             }else {
                MiPushCommandMessage serializable = SerializableHook.getSerializableExtra(intent, "key_command");
                c.v("\(Local\) begin execute onCommandResult, command="+serializable.getCommand()+str1+serializable.getResultCode()+str+serializable.getReason());
                pushMessageR.onCommandResult(p0, serializable);
                if (TextUtils.equals(serializable.getCommand(), ex.a.a)) {
                   pushMessageR.onReceiveRegisterResult(p0, serializable);
                   PushMessageHandler.a(p0, serializable);
                   if (!serializable.getResultCode() - b) {
                   label_0095 :
                      l0.l(p0);
                   }
                }
             }
          }else {
             PushMessageHandler$a uoa = f.e(p0).b(intent);
             int intExtra1 = intent.getIntExtra("eventMessageType", -1);
             if (uoa != null) {
                if (uoa instanceof MiPushMessage) {
                   if (!uoa.isArrivedMessage()) {
                      pushMessageR.onReceiveMessage(p0, uoa);
                   }
                   if (uoa.getPassThrough() == i) {
                      y3.a(p0.getApplicationContext()).c(p0.getPackageName(), intent, 2004, null);
                      c.v("begin execute onReceivePassThroughMessage from "+uoa.getMessageId());
                      pushMessageR.onReceivePassThroughMessage(p0, uoa);
                   }else if(uoa.isNotified()){
                      if (intExtra1 == 1000) {
                         y3.a(p0.getApplicationContext()).c(p0.getPackageName(), intent, 1007, null);
                      }else {
                         y3.a(p0.getApplicationContext()).c(p0.getPackageName(), intent, 3007, null);
                      }
                      c.v("begin execute onNotificationMessageClicked from¡¡"+uoa.getMessageId());
                      pushMessageR.onNotificationMessageClicked(p0, uoa);
                   }else {
                      c.v("begin execute onNotificationMessageArrived from "+uoa.getMessageId());
                      pushMessageR.onNotificationMessageArrived(p0, uoa);
                   }
                }else if(uoa instanceof MiPushCommandMessage){
                   c.v("begin execute onCommandResult, command="+uoa.getCommand()+str1+uoa.getResultCode()+str+uoa.getReason());
                   pushMessageR.onCommandResult(p0, uoa);
                   if (TextUtils.equals(uoa.getCommand(), ex.a.a)) {
                      pushMessageR.onReceiveRegisterResult(p0, uoa);
                      PushMessageHandler.a(p0, uoa);
                      if (!uoa.getResultCode() - b) {
                         goto label_0095 ;
                      }
                   }
                }
             }
          }
       }catch(java.lang.RuntimeException e9){
          c.o(e9);
       }
       return;
    }
    public static void addJob(Context p0,MessageHandleService$a p1){
       if (p1 != null) {
          MessageHandleService.a.add(p1);
          MessageHandleService.b(p0);
          MessageHandleService.startService(p0);
       }
       return;
    }
    public static void b(Context p0){
       if (!MessageHandleService.a.isShutdown()) {
          MessageHandleService.a.execute(new a1(p0));
       }
       return;
    }
    public static void c(Context p0){
       try{
          MessageHandleService.a(p0, MessageHandleService.a.poll());
       }catch(java.lang.RuntimeException e1){
          c.o(e1);
       }
       return;
    }
    public static void startService(Context p0){
       Intent intent = new Intent();
       intent.setComponent(new ComponentName(p0, MessageHandleService.class));
       k.f(p0).g(new z0(p0, intent));
    }
    public boolean a(){
       ConcurrentLinkedQueue a = MessageHandleService.a;
       boolean b = (a != null && a.size() > 0)? true: false;
       return b;
    }
    public IBinder onBind(Intent p0){
       return null;
    }
    public void onStart(Intent p0,int p1){
       super.onStart(p0, p1);
    }
}
