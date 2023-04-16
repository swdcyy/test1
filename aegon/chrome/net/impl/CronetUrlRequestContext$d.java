package aegon.chrome.net.impl.CronetUrlRequestContext$d;
import java.lang.Runnable;
import aegon.chrome.net.impl.CronetUrlRequestContext;
import j0.t;
import aegon.chrome.net.n;
import java.lang.Object;

public class CronetUrlRequestContext$d implements Runnable	// class@0001d0
{
    public final t b;
    public final n c;
    public final CronetUrlRequestContext d;

    public void CronetUrlRequestContext$d(CronetUrlRequestContext p0,t p1,n p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       this.b.b(this.c);
    }
}
