package aegon.chrome.net.NetworkChangeNotifierAutoDetect$e$e;
import java.lang.Runnable;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$e;
import java.lang.Object;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$g;

public class NetworkChangeNotifierAutoDetect$e$e implements Runnable	// class@000196
{
    public final int b;
    public final NetworkChangeNotifierAutoDetect$e c;

    public void NetworkChangeNotifierAutoDetect$e$e(NetworkChangeNotifierAutoDetect$e p0,int p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       this.c.b.d.a(this.b);
    }
}
