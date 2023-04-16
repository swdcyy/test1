package aegon.chrome.net.impl.CronetUrlRequestContext$c;
import java.lang.Runnable;
import aegon.chrome.net.impl.CronetUrlRequestContext;
import j0.s;
import java.lang.Object;

public class CronetUrlRequestContext$c implements Runnable	// class@0001cf
{
    public final s b;
    public final int c;
    public final long d;
    public final int e;
    public final CronetUrlRequestContext f;

    public void CronetUrlRequestContext$c(CronetUrlRequestContext p0,s p1,int p2,long p3,int p4){
       this.f = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void run(){
       this.b.b(this.c, this.d, this.e);
    }
}
