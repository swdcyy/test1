package com.reactnativecommunity.netinfo.AmazonFireDeviceConnectivityPoller$Receiver;
import android.content.BroadcastReceiver;
import com.reactnativecommunity.netinfo.AmazonFireDeviceConnectivityPoller;
import android.content.Context;
import android.content.Intent;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;
import com.reactnativecommunity.netinfo.AmazonFireDeviceConnectivityPoller$a;

public class AmazonFireDeviceConnectivityPoller$Receiver extends BroadcastReceiver	// class@000b60
{
    public boolean a;
    public Boolean b;
    public final AmazonFireDeviceConnectivityPoller c;

    public void AmazonFireDeviceConnectivityPoller$Receiver(AmazonFireDeviceConnectivityPoller p0){
       this.c = p0;
       super();
       this.a = false;
    }
    public void onReceive(Context p0,Intent p1){
       boolean b;
       String str = (p1 == null)? null: p1.getAction();
       if (("com.amazon.tv.networkmonitor.INTERNET_DOWN").equals(str)) {
          b = false;
       label_001b :
          AmazonFireDeviceConnectivityPoller$Receiver tb = this.b;
          if (tb == null || tb.booleanValue() != b) {
             this.b = Boolean.valueOf(b);
             this.c.c.onAmazonFireDeviceConnectivityChanged(b);
          }
       }else if(("com.amazon.tv.networkmonitor.INTERNET_UP").equals(str)){
          b = true;
          goto label_001b ;
       }
       return;
    }
}
