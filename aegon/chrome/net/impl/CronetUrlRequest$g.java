package aegon.chrome.net.impl.CronetUrlRequest$g;
import java.lang.Runnable;
import aegon.chrome.net.impl.CronetUrlRequest;
import java.lang.Object;
import aegon.chrome.net.q;
import aegon.chrome.net.r;
import aegon.chrome.net.impl.m;
import aegon.chrome.net.impl.CronetUrlRequestContext;
import java.lang.String;
import a0.n;

public class CronetUrlRequest$g implements Runnable	// class@0001ca
{
    public final CronetUrlRequest b;

    public void CronetUrlRequest$g(CronetUrlRequest p0){
       this.b = p0;
       super();
    }
    public void run(){
       try{
          CronetUrlRequest$g tb = this.b;
          tb.k.a(tb, tb.z);
          this.b.o();
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[]{e0};
          n.a(CronetUrlRequestContext.t, "Exception in onCanceled method", objArray);
       }
       return;
    }
}
