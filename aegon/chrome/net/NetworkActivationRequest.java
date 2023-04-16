package aegon.chrome.net.NetworkActivationRequest;
import android.net.ConnectivityManager$NetworkCallback;
import java.lang.Object;
import android.content.Context;
import a0.f;
import java.lang.String;
import android.net.ConnectivityManager;
import android.net.NetworkRequest$Builder;
import android.net.NetworkRequest;
import android.net.Network;
import a0.o;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect;
import K.S;

public class NetworkActivationRequest extends ConnectivityManager$NetworkCallback	// class@00018e
{
    public final ConnectivityManager a;
    public final Object b;
    public long c;

    public void NetworkActivationRequest(long p0,int p1){
       super();
       this.b = new Object();
       ConnectivityManager systemServic = f.a().getSystemService("connectivity");
       this.a = systemServic;
       if (systemServic == null) {
          return;
       }
       try{
          systemServic.requestNetwork(new NetworkRequest$Builder().addTransportType(p1).addCapability(12).build(), this);
          this.c = p0;
          return;
       }catch(java.lang.SecurityException e0){
       }
    }
    public static NetworkActivationRequest createMobileNetworkRequest(long p0){
       return new NetworkActivationRequest(p0, 0);
    }
    public void onAvailable(Network p0){
       NetworkActivationRequest tb = this.b;
       _monitor_enter(tb);
       if (!this.c) {
          _monitor_exit(tb);
          return;
       }else {
          o.a(false);
          S.MJRUHS0T(this.c, NetworkChangeNotifierAutoDetect.g(p0));
          _monitor_exit(tb);
          return;
       }
    }
    public final void unregister(){
       NetworkActivationRequest tb = this.b;
       _monitor_enter(tb);
       int i = (this.c)? 1: 0;
       this.c = 0;
       _monitor_exit(tb);
       if (i) {
          this.a.unregisterNetworkCallback(this);
       }
       return;
    }
}
