package j0.g;
import java.lang.Runnable;
import aegon.chrome.net.impl.CronetUrlRequestContext$a;
import java.lang.Object;
import aegon.chrome.net.impl.CronetUrlRequestContext;
import aegon.chrome.net.impl.CronetUrlRequestContext$e;
import aegon.chrome.net.impl.g;
import K.S;

public final class g implements Runnable	// class@001997
{
    public final CronetUrlRequestContext$a b;

    public void g(CronetUrlRequestContext$a p0){
       this.b = p0;
    }
    public final void run(){
       g tb = this.b;
       CronetUrlRequestContext b = tb.b.b;
       _monitor_enter(b);
       g.o();
       CronetUrlRequestContext$a b1 = tb.b;
       S.M6Dz0nZ5(b1.e, b1);
       _monitor_exit(b);
    }
}
