package com.reactnativecommunity.netinfo.AmazonFireDeviceConnectivityPoller;
import android.content.Context;
import com.reactnativecommunity.netinfo.AmazonFireDeviceConnectivityPoller$a;
import java.lang.Object;
import com.reactnativecommunity.netinfo.AmazonFireDeviceConnectivityPoller$Receiver;
import com.reactnativecommunity.netinfo.AmazonFireDeviceConnectivityPoller$b;
import android.os.Build;
import java.lang.String;

public class AmazonFireDeviceConnectivityPoller	// class@000b63
{
    public final AmazonFireDeviceConnectivityPoller$Receiver a;
    public final Context b;
    public final AmazonFireDeviceConnectivityPoller$a c;
    public final Runnable d;
    public Handler e;
    public boolean f;

    public void AmazonFireDeviceConnectivityPoller(Context p0,AmazonFireDeviceConnectivityPoller$a p1){
       super();
       this.a = new AmazonFireDeviceConnectivityPoller$Receiver(this);
       this.d = new AmazonFireDeviceConnectivityPoller$b(this);
       this.f = false;
       this.b = p0;
       this.c = p1;
    }
    public final boolean a(){
       boolean b;
       if ((Build.MANUFACTURER).equals("Amazon")) {
          String mODEL = Build.MODEL;
          if (mODEL.startsWith("AF") || mODEL.startsWith("KF")) {
             b = true;
          label_001f :
             return b;
          }
       }
       b = false;
       goto label_001f ;
    }
}
