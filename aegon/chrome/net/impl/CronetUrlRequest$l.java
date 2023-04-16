package aegon.chrome.net.impl.CronetUrlRequest$l;
import java.lang.Runnable;
import aegon.chrome.net.impl.CronetUrlRequest;
import java.lang.Object;
import aegon.chrome.net.q;
import aegon.chrome.net.r;
import java.nio.ByteBuffer;
import aegon.chrome.net.impl.m;
import java.lang.Exception;

public final class CronetUrlRequest$l implements Runnable	// class@0000b5
{
    public ByteBuffer b;
    public final CronetUrlRequest c;

    public void CronetUrlRequest$l(CronetUrlRequest p0){
       this.c = p0;
       super();
    }
    public void run(){
       this.c.j();
       CronetUrlRequest$l tb = this.b;
       ByteBuffer uByteBuffer = null;
       try{
          this.b = uByteBuffer;
          CronetUrlRequest g = this.c.g;
          _monitor_enter(g);
          if (this.c.n()) {
             _monitor_exit(g);
             return;
          }else {
             CronetUrlRequest$l tc = this.c;
             tc.f = true;
             _monitor_exit(g);
             tc.k.c(tc, tc.z, tb);
          }
       }catch(java.lang.Exception e0){
          this.c.p(e0);
       }
       return;
    }
}
