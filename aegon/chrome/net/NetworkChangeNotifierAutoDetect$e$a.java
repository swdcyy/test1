package aegon.chrome.net.NetworkChangeNotifierAutoDetect$e$a;
import java.lang.Runnable;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$e;
import java.lang.Object;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$g;

public class NetworkChangeNotifierAutoDetect$e$a implements Runnable	// class@000077
{
    public final long b;
    public final int c;
    public final boolean d;
    public final NetworkChangeNotifierAutoDetect$e e;

    public void NetworkChangeNotifierAutoDetect$e$a(NetworkChangeNotifierAutoDetect$e p0,long p1,int p2,boolean p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void run(){
       this.e.b.d.d(this.b, this.c);
       if (this.d != null) {
          this.e.b.d.a(this.c);
          long[] olongArray = new long[]{this.b};
          this.e.b.d.e(olongArray);
       }
       return;
    }
}
