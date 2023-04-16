package aegon.chrome.net.impl.CronetBidirectionalStream$d;
import java.lang.Runnable;
import aegon.chrome.net.impl.CronetBidirectionalStream;
import java.lang.Object;
import aegon.chrome.net.b;
import aegon.chrome.net.r;
import j0.p;
import aegon.chrome.net.impl.CronetUrlRequestContext;
import java.lang.String;
import a0.n;

public class CronetBidirectionalStream$d implements Runnable	// class@0001be
{
    public final CronetBidirectionalStream b;

    public void CronetBidirectionalStream$d(CronetBidirectionalStream p0){
       this.b = p0;
       super();
    }
    public void run(){
       try{
          CronetBidirectionalStream$d tb = this.b;
          tb.c.a(tb, tb.x);
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[]{e0};
          n.a(CronetUrlRequestContext.t, "Exception in onCanceled method", objArray);
       }
       return;
    }
}
