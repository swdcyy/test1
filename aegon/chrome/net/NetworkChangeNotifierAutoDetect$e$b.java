package aegon.chrome.net.NetworkChangeNotifierAutoDetect$e$b;
import java.lang.Runnable;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$e;
import java.lang.Object;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$g;

public class NetworkChangeNotifierAutoDetect$e$b implements Runnable	// class@000078
{
    public final long b;
    public final int c;
    public final NetworkChangeNotifierAutoDetect$e d;

    public void NetworkChangeNotifierAutoDetect$e$b(NetworkChangeNotifierAutoDetect$e p0,long p1,int p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       this.d.b.d.d(this.b, this.c);
    }
}
