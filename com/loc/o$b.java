package com.loc.o$b;
import java.lang.Object;
import android.content.Context;
import android.os.Build$VERSION;
import com.loc.o$b$1;
import android.content.IntentFilter;
import java.lang.String;
import com.loc.x;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import com.loc.o;
import android.net.ConnectivityManager;
import android.net.NetworkRequest$Builder;
import android.net.NetworkRequest;
import com.loc.o$b$2;
import android.net.ConnectivityManager$NetworkCallback;

public final class o$b	// class@00145c
{
    public static Context a;
    public static BroadcastReceiver b;
    public static ConnectivityManager c;
    public static NetworkRequest d;
    public static ConnectivityManager$NetworkCallback e;

    public void o$b(){
       super();
    }
    public final void a(Context p0){
       if (Build$VERSION.SDK_INT < 24) {
          if (p0 != null && o$b.b == null) {
             o$b.b = new o$b$1(this);
             IntentFilter intentFilter = new IntentFilter();
             intentFilter.addAction(x.c("WYW5kcm9pZC5uZXQuY29ubi5DT05ORUNUSVZJVFlfQ0hBTkdF"));
             UniversalReceiver.e(p0, o$b.b, intentFilter);
             return;
          }
       }else if(!o.b(p0, x.c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF"))){
          return;
       }else if(p0 != null && o$b.c == null){
          ConnectivityManager systemServic = p0.getSystemService("connectivity");
          o$b.c = systemServic;
          if (systemServic != null) {
             o$b.d = new NetworkRequest$Builder().addCapability(0).addCapability(1).build();
             o$b$2 uob$2 = new o$b$2(this);
             o$b.e = uob$2;
             o$b.c.registerNetworkCallback(o$b.d, uob$2);
             o$b.a = p0;
          }
       }
       return;
    }
}
