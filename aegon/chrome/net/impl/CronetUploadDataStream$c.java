package aegon.chrome.net.impl.CronetUploadDataStream$c;
import java.lang.Runnable;
import aegon.chrome.net.impl.CronetUploadDataStream;
import java.lang.Object;
import aegon.chrome.net.impl.l;
import java.lang.String;
import a0.n;

public class CronetUploadDataStream$c implements Runnable	// class@0000a6
{
    public final CronetUploadDataStream b;

    public void CronetUploadDataStream$c(CronetUploadDataStream p0){
       this.b = p0;
       super();
    }
    public void run(){
       try{
          this.b.e();
          this.b.b.close();
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[]{e0};
          n.a(CronetUploadDataStream.n, "Exception thrown when closing", objArray);
       }
       return;
    }
}
