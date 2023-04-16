package aegon.chrome.net.impl.CronetUrlRequest$j;
import java.lang.Runnable;
import aegon.chrome.net.impl.CronetUrlRequest;
import aegon.chrome.net.n;
import java.lang.Object;
import j0.t;

public class CronetUrlRequest$j implements Runnable	// class@0000b3
{
    public final n b;
    public final CronetUrlRequest c;

    public void CronetUrlRequest$j(CronetUrlRequest p0,n p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       this.c.x.b(this.b);
    }
}
