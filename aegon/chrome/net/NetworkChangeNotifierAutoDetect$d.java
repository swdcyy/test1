package aegon.chrome.net.NetworkChangeNotifierAutoDetect$d;
import android.net.ConnectivityManager$NetworkCallback;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$a;
import android.net.Network;
import android.net.LinkProperties;

public class NetworkChangeNotifierAutoDetect$d extends ConnectivityManager$NetworkCallback	// class@000076
{
    public final NetworkChangeNotifierAutoDetect a;

    public void NetworkChangeNotifierAutoDetect$d(NetworkChangeNotifierAutoDetect p0){
       this.a = p0;
       super();
    }
    public void NetworkChangeNotifierAutoDetect$d(NetworkChangeNotifierAutoDetect p0,NetworkChangeNotifierAutoDetect$a p1){
       super(p0);
    }
    public void onAvailable(Network p0){
       NetworkChangeNotifierAutoDetect$d ta = this.a;
       if (ta.k != null) {
          ta.b();
       }
       return;
    }
    public void onLinkPropertiesChanged(Network p0,LinkProperties p1){
       this.onAvailable(null);
    }
    public void onLost(Network p0){
       this.onAvailable(null);
    }
}
