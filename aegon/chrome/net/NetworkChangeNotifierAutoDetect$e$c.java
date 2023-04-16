package aegon.chrome.net.NetworkChangeNotifierAutoDetect$e$c;
import java.lang.Runnable;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$e;
import java.lang.Object;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$g;

public class NetworkChangeNotifierAutoDetect$e$c implements Runnable	// class@000194
{
    public final long b;
    public final NetworkChangeNotifierAutoDetect$e c;

    public void NetworkChangeNotifierAutoDetect$e$c(NetworkChangeNotifierAutoDetect$e p0,long p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       this.c.b.d.b(this.b);
    }
}
