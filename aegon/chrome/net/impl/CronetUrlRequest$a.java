package aegon.chrome.net.impl.CronetUrlRequest$a;
import java.lang.Runnable;
import aegon.chrome.net.impl.CronetUrlRequest;
import aegon.chrome.net.n;
import java.lang.Object;
import j0.t;

public class CronetUrlRequest$a implements Runnable	// class@0001c7
{
    public final n b;
    public final CronetUrlRequest c;

    public void CronetUrlRequest$a(CronetUrlRequest p0,n p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       this.c.x.b(this.b);
    }
}
