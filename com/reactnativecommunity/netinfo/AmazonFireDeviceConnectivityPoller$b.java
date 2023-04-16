package com.reactnativecommunity.netinfo.AmazonFireDeviceConnectivityPoller$b;
import java.lang.Runnable;
import com.reactnativecommunity.netinfo.AmazonFireDeviceConnectivityPoller;
import java.lang.Object;
import android.content.Intent;
import java.lang.String;
import android.content.Context;
import android.os.Handler;

public class AmazonFireDeviceConnectivityPoller$b implements Runnable	// class@000b62
{
    public final AmazonFireDeviceConnectivityPoller b;

    public void AmazonFireDeviceConnectivityPoller$b(AmazonFireDeviceConnectivityPoller p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (this.b.f == null) {
          return;
       }
       this.b.b.sendBroadcast(new Intent("com.amazon.tv.networkmonitor.CONNECTIVITY_CHECK"));
       AmazonFireDeviceConnectivityPoller$b tb = this.b;
       tb.e.postDelayed(tb.d, 0x2710);
       return;
    }
}
