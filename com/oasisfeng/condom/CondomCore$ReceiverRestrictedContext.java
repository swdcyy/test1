package com.oasisfeng.condom.CondomCore$ReceiverRestrictedContext;
import android.content.ContextWrapper;
import com.oasisfeng.condom.CondomCore;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.ReceiverCallNotAllowedException;
import java.lang.String;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Handler;

public class CondomCore$ReceiverRestrictedContext extends ContextWrapper	// class@000a77
{
    public final CondomCore a;

    public void CondomCore$ReceiverRestrictedContext(CondomCore p0,Context p1){
       this.a = p0;
       super(p1);
    }
    public boolean bindService(Intent p0,ServiceConnection p1,int p2){
       throw new ReceiverCallNotAllowedException("BroadcastReceiver components are not allowed to bind to services");
    }
    public Intent registerReceiver(BroadcastReceiver p0,IntentFilter p1){
       return this.registerReceiver(p0, p1, null, null);
    }
    public Intent registerReceiver(BroadcastReceiver p0,IntentFilter p1,String p2,Handler p3){
       if (p0 == null) {
          return super.registerReceiver(null, p1, p2, p3);
       }
       throw new ReceiverCallNotAllowedException("BroadcastReceiver components are not allowed to register to receive intents");
    }
}
