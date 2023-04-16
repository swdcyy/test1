package aegon.chrome.net.NetworkChangeNotifierAutoDetect$e$d;
import java.lang.Runnable;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$e;
import android.net.Network;
import java.lang.Object;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$g;

public class NetworkChangeNotifierAutoDetect$e$d implements Runnable	// class@000195
{
    public final Network b;
    public final NetworkChangeNotifierAutoDetect$e c;

    public void NetworkChangeNotifierAutoDetect$e$d(NetworkChangeNotifierAutoDetect$e p0,Network p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       this.c.b.d.onNetworkDisconnect(NetworkChangeNotifierAutoDetect.g(this.b));
    }
}
