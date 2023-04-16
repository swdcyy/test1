package com.meizu.cloud.pushsdk.MzPushMessageReceiver$1;
import java.lang.Runnable;
import com.meizu.cloud.pushsdk.MzPushMessageReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import com.meizu.cloud.pushinternal.DebugLogger;

public class MzPushMessageReceiver$1 implements Runnable	// class@001487
{
    public final Context a;
    public final Intent b;
    public final MzPushMessageReceiver c;

    public void MzPushMessageReceiver$1(MzPushMessageReceiver p0,Context p1,Intent p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       if (!MzPushMessageReceiver.bInitLog) {
          MzPushMessageReceiver.bInitLog = true;
          DebugLogger.init(this.a);
       }
       this.c.onHandleIntent(this.a, this.b);
       return;
    }
}
