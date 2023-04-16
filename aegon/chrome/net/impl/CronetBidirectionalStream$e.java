package aegon.chrome.net.impl.CronetBidirectionalStream$e;
import java.lang.Runnable;
import aegon.chrome.net.impl.CronetBidirectionalStream;
import aegon.chrome.net.CronetException;
import java.lang.Object;

public class CronetBidirectionalStream$e implements Runnable	// class@0001bf
{
    public final CronetException b;
    public final CronetBidirectionalStream c;

    public void CronetBidirectionalStream$e(CronetBidirectionalStream p0,CronetException p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       this.c.j(this.b);
    }
}
