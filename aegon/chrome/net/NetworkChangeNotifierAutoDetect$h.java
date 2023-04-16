package aegon.chrome.net.NetworkChangeNotifierAutoDetect$h;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect;
import java.lang.Object;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$c;
import android.net.ConnectivityManager$NetworkCallback;
import android.os.Handler;
import android.net.ConnectivityManager;
import android.content.Context;
import a0.f;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$e;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$g;

public abstract class NetworkChangeNotifierAutoDetect$h	// class@00007f
{
    public NetworkChangeNotifierAutoDetect a;
    public static final boolean b;

    static {
    }
    public void NetworkChangeNotifierAutoDetect$h(){
       super();
    }
    public abstract void b();
    public void c(NetworkChangeNotifierAutoDetect p0){
       this.a = p0;
    }
    public final void d(){
       int i;
       boolean b;
       boolean b1;
       Network[] networkArray;
       NetworkCapabilities networkCapab;
       Network[] networkArray1;
       long[] olongArray;
       NetworkChangeNotifierAutoDetect$h ta = this.a;
       ta.a();
       if (ta.k != null) {
          ta.b();
       }else if(ta.n != null){
          ta.b();
       }
       NetworkChangeNotifierAutoDetect f = ta.f;
       Network network = null;
       if (f != null) {
          try{
             ta.g.a.registerDefaultNetworkCallback(f, ta.b);
          }catch(java.lang.RuntimeException e0){
             e0.f = network;
          }
       }
    label_009b :
       return;
    }
}
