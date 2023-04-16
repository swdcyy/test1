package com.xiaomi.mipush.sdk.PushMessageReceiver;
import android.content.BroadcastReceiver;
import android.content.Context;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.xiaomi.mipush.sdk.MiPushMessage;
import android.content.Intent;
import java.lang.StringBuilder;
import java.lang.String;
import rs8.c;
import com.xiaomi.mipush.sdk.MessageHandleService$a;
import com.xiaomi.mipush.sdk.MessageHandleService;
import ws8.y3;
import java.lang.Object;

public abstract class PushMessageReceiver extends BroadcastReceiver	// class@0010e4
{

    public void PushMessageReceiver(){
       super();
    }
    public void onCommandResult(Context p0,MiPushCommandMessage p1){
    }
    public void onNotificationMessageArrived(Context p0,MiPushMessage p1){
    }
    public void onNotificationMessageClicked(Context p0,MiPushMessage p1){
    }
    public final void onReceive(Context p0,Intent p1){
       if (p1 != null) {
          c.v("[CRcv] receive a msg broadcast: "+p1.getAction());
       }
       Context applicationC = p0.getApplicationContext();
       MessageHandleService$a uoa = new MessageHandleService$a(p1, this);
       try{
          MessageHandleService.addJob(applicationC, uoa);
          int intExtra = p1.getIntExtra("eventMessageType", -1);
          if (intExtra == 2000) {
             y3.a(p0.getApplicationContext()).c(p0.getPackageName(), p1, 2003, null);
          }else if(intExtra == 6000){
             y3.a(p0.getApplicationContext()).c(p0.getPackageName(), p1, 6005, null);
          }
       }catch(java.lang.Exception e4){
          c.u("meet error in PushMessageReceiver. "+e4);
       }
       return;
    }
    public void onReceiveMessage(Context p0,MiPushMessage p1){
    }
    public void onReceivePassThroughMessage(Context p0,MiPushMessage p1){
    }
    public void onReceiveRegisterResult(Context p0,MiPushCommandMessage p1){
    }
    public void onRequirePermissions(Context p0,String[] p1){
    }
}
