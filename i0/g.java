package i0.g;
import java.lang.Runnable;
import aegon.chrome.net.ProxyChangeListener;
import android.content.Intent;
import java.lang.Object;
import aegon.chrome.net.ProxyChangeListener$d;

public final class g implements Runnable	// class@002152
{
    public final ProxyChangeListener b;
    public final Intent c;

    public void g(ProxyChangeListener p0,Intent p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       g tb = this.b;
       tb.e(tb.c(this.c));
    }
}
