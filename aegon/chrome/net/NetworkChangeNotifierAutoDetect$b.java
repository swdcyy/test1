package aegon.chrome.net.NetworkChangeNotifierAutoDetect$b;
import android.net.ConnectivityManager$NetworkCallback;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$a;
import android.net.Network;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$f;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$c;
import java.lang.String;
import android.net.LinkProperties;
import b0.d;

public class NetworkChangeNotifierAutoDetect$b extends ConnectivityManager$NetworkCallback	// class@000192
{
    public LinkProperties a;
    public NetworkCapabilities b;
    public final NetworkChangeNotifierAutoDetect c;

    public void NetworkChangeNotifierAutoDetect$b(NetworkChangeNotifierAutoDetect p0){
       this.c = p0;
       super();
    }
    public void NetworkChangeNotifierAutoDetect$b(NetworkChangeNotifierAutoDetect p0,NetworkChangeNotifierAutoDetect$a p1){
       super(p0);
    }
    public final NetworkChangeNotifierAutoDetect$f a(Network p0){
       int i1;
       int i2;
       NetworkInfo networkInfo;
       int i = -1;
       if (this.b.hasTransport(1) || this.b.hasTransport(5)) {
          i1 = 1;
       }else if(this.b.hasTransport(0)){
          networkInfo = this.c.g.f(p0);
          if (networkInfo != null) {
             i = networkInfo.getSubtype();
          }
          i2 = i;
          i1 = 0;
       label_006b :
          NetworkChangeNotifierAutoDetect$f uof = new NetworkChangeNotifierAutoDetect$f(true, i1, i2, String.valueOf(NetworkChangeNotifierAutoDetect.g(p0)), d.b(this.a), d.a(this.a));
          return v0;
       }else if(this.b.hasTransport(3)){
          i1 = 9;
       }else if(this.b.hasTransport(2)){
          i1 = 7;
       }else if(this.b.hasTransport(4)){
          networkInfo = this.c.g.d(p0);
          int i3 = (networkInfo != null)? networkInfo.getType(): 17;
          i1 = i3;
       }else {
          i1 = -1;
       }
       i2 = -1;
       goto label_006b ;
    }
    public void onAvailable(Network p0){
       this.a = null;
       this.b = null;
    }
    public void onCapabilitiesChanged(Network p0,NetworkCapabilities p1){
       this.b = p1;
       NetworkChangeNotifierAutoDetect$b tc = this.c;
       if (tc.k != null && (this.a != null && p1 != null)) {
          tc.c(this.a(p0));
       }
    label_0015 :
       return;
    }
    public void onLinkPropertiesChanged(Network p0,LinkProperties p1){
       this.a = p1;
       NetworkChangeNotifierAutoDetect$b tc = this.c;
       if (tc.k != null && (p1 != null && this.b != null)) {
          tc.c(this.a(p0));
       }
    label_0015 :
       return;
    }
    public void onLost(Network p0){
       this.a = null;
       this.b = null;
       NetworkChangeNotifierAutoDetect$b tc = this.c;
       if (tc.k != null) {
          NetworkChangeNotifierAutoDetect$f uof = new NetworkChangeNotifierAutoDetect$f(false, -1, -1, null, false, "");
          tc.c(v0);
       }
       return;
    }
}
