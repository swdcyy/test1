package i0.h;
import java.lang.Runnable;
import aegon.chrome.net.ProxyChangeListener$ProxyReceiver;
import android.content.Intent;
import java.lang.Object;
import aegon.chrome.net.ProxyChangeListener$d;
import aegon.chrome.net.ProxyChangeListener;

public final class h implements Runnable	// class@002153
{
    public final ProxyChangeListener$ProxyReceiver b;
    public final Intent c;

    public void h(ProxyChangeListener$ProxyReceiver p0,Intent p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.a.e(ProxyChangeListener.b(this.c));
    }
}
