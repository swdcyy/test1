package aegon.chrome.net.NetworkChangeNotifierAutoDetect$e;
import android.net.ConnectivityManager$NetworkCallback;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$a;
import android.net.Network;
import android.net.NetworkCapabilities;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$c;
import java.lang.Object;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$e$a;
import java.lang.Runnable;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$e$b;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$e$c;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$e$d;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$f;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$e$e;

public class NetworkChangeNotifierAutoDetect$e extends ConnectivityManager$NetworkCallback	// class@00007c
{
    public Network a;
    public final NetworkChangeNotifierAutoDetect b;
    public static final boolean c;

    static {
    }
    public void NetworkChangeNotifierAutoDetect$e(NetworkChangeNotifierAutoDetect p0){
       this.b = p0;
       super();
    }
    public void NetworkChangeNotifierAutoDetect$e(NetworkChangeNotifierAutoDetect p0,NetworkChangeNotifierAutoDetect$a p1){
       super(p0);
    }
    public final boolean a(Network p0,NetworkCapabilities p1){
       boolean b = false;
       if (!this.b(p0)) {
          if (p1 == null) {
             p1 = this.b.g.c(p0);
          }
          int i = (p1 == null || (p1.hasTransport(4) && !this.b.g.j(p0)))? 1: 0;
          if (!i) {
          label_002c :
             return b;
          }
       }
       b = true;
       goto label_002c ;
    }
    public final boolean b(Network p0){
       NetworkChangeNotifierAutoDetect$e ta = this.a;
       boolean b = (ta != null && !ta.equals(p0))? true: false;
       return b;
    }
    public void onAvailable(Network p0){
       boolean b;
       NetworkCapabilities networkCapab = this.b.g.c(p0);
       if (this.a(p0, networkCapab)) {
          return;
       }
       if (networkCapab.hasTransport(4)) {
          NetworkChangeNotifierAutoDetect$e ta = this.a;
          if (ta == null || !p0.equals(ta)) {
             b = true;
          label_0025 :
             if (b) {
                this.a = p0;
             }
             NetworkChangeNotifierAutoDetect$e$a uoe$a = new NetworkChangeNotifierAutoDetect$e$a(this, NetworkChangeNotifierAutoDetect.g(p0), this.b.g.a(p0), b);
             this.b.i(ta);
             return;
          }
       }
       b = false;
       goto label_0025 ;
    }
    public void onCapabilitiesChanged(Network p0,NetworkCapabilities p1){
       if (this.a(p0, p1)) {
          return;
       }
       this.b.i(new NetworkChangeNotifierAutoDetect$e$b(this, NetworkChangeNotifierAutoDetect.g(p0), this.b.g.a(p0)));
       return;
    }
    public void onLosing(Network p0,int p1){
       if (this.a(p0, null)) {
          return;
       }
       this.b.i(new NetworkChangeNotifierAutoDetect$e$c(this, NetworkChangeNotifierAutoDetect.g(p0)));
       return;
    }
    public void onLost(Network p0){
       if (this.b(p0)) {
          return;
       }
       this.b.i(new NetworkChangeNotifierAutoDetect$e$d(this, p0));
       if (this.a != null) {
          this.a = null;
          Network[] networkArray = NetworkChangeNotifierAutoDetect.e(this.b.g, p0);
          int len = networkArray.length;
          for (int i = 0; i < len; i = i + 1) {
             this.onAvailable(networkArray[i]);
          }
          this.b.i(new NetworkChangeNotifierAutoDetect$e$e(this, this.b.f().b()));
       }
       return;
    }
}
