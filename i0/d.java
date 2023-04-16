package i0.d;
import java.lang.Runnable;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect;
import java.lang.Object;

public final class d implements Runnable	// class@00214f
{
    public final NetworkChangeNotifierAutoDetect b;
    public final Runnable c;

    public void d(NetworkChangeNotifierAutoDetect p0,Runnable p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       d tc = this.c;
       if (this.b.k != null) {
          tc.run();
       }
       return;
    }
}
