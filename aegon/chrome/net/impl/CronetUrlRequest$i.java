package aegon.chrome.net.impl.CronetUrlRequest$i;
import java.lang.Runnable;
import aegon.chrome.net.impl.CronetUrlRequest;
import java.lang.Object;
import aegon.chrome.net.q;
import aegon.chrome.net.r;
import aegon.chrome.net.CronetException;
import aegon.chrome.net.impl.m;
import aegon.chrome.net.impl.CronetUrlRequestContext;
import java.lang.String;
import a0.n;

public class CronetUrlRequest$i implements Runnable	// class@0001cc
{
    public final CronetUrlRequest b;

    public void CronetUrlRequest$i(CronetUrlRequest p0){
       this.b = p0;
       super();
    }
    public void run(){
       try{
          CronetUrlRequest$i tb = this.b;
          tb.k.b(tb, tb.z, tb.B);
          this.b.o();
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[]{e0};
          n.a(CronetUrlRequestContext.t, "Exception in onFailed method", objArray);
       }
       return;
    }
}
