package com.xiaomi.mipush.sdk.PushServiceReceiver;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.mipush.sdk.PushMessageHandler;
import java.lang.Class;
import java.lang.String;

public class PushServiceReceiver extends BroadcastReceiver	// class@0010e5
{

    public void PushServiceReceiver(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       Intent intent = new Intent(p0, PushMessageHandler.class);
       intent.putExtras(p1);
       intent.setAction(p1.getAction());
       PushMessageHandler.a(p0, intent);
    }
}
