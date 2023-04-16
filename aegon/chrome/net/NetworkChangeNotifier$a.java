package aegon.chrome.net.NetworkChangeNotifier$a;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$g;
import aegon.chrome.net.NetworkChangeNotifier;
import java.lang.Object;

public class NetworkChangeNotifier$a implements NetworkChangeNotifierAutoDetect$g	// class@00006e
{
    public final NetworkChangeNotifier a;

    public void NetworkChangeNotifier$a(NetworkChangeNotifier p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       this.a.j(p0);
    }
    public void b(long p0){
       this.a.f(p0);
    }
    public void c(int p0){
       this.a.b(p0);
    }
    public void d(long p0,int p1){
       this.a.d(p0, p1);
    }
    public void e(long[] p0){
       this.a.g(p0);
    }
    public void onNetworkDisconnect(long p0){
       this.a.e(p0);
    }
}
