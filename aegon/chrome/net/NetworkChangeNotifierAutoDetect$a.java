package aegon.chrome.net.NetworkChangeNotifierAutoDetect$a;
import java.lang.Runnable;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect;
import java.lang.Object;

public class NetworkChangeNotifierAutoDetect$a implements Runnable	// class@000191
{
    public final NetworkChangeNotifierAutoDetect b;

    public void NetworkChangeNotifierAutoDetect$a(NetworkChangeNotifierAutoDetect p0){
       this.b = p0;
       super();
    }
    public void run(){
       NetworkChangeNotifierAutoDetect$a tb = this.b;
       if (tb.m != null) {
          tb.m = false;
          return;
       }else {
          tb.b();
          return;
       }
    }
}
