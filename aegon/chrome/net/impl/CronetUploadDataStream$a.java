package aegon.chrome.net.impl.CronetUploadDataStream$a;
import java.lang.Runnable;
import aegon.chrome.net.impl.CronetUploadDataStream;
import java.lang.Object;
import i0.k;
import java.nio.ByteBuffer;
import aegon.chrome.net.impl.l;
import java.lang.Throwable;
import java.lang.IllegalStateException;
import java.lang.String;

public class CronetUploadDataStream$a implements Runnable	// class@0000a4
{
    public final CronetUploadDataStream b;
    public static final boolean c;

    public void CronetUploadDataStream$a(CronetUploadDataStream p0){
       this.b = p0;
       super();
    }
    public void run(){
       CronetUploadDataStream i = this.b.i;
       _monitor_enter(i);
       CronetUploadDataStream$a tb = this.b;
       if (!tb.j) {
          _monitor_exit(i);
          return;
       }else {
          tb.f(3);
          tb = this.b;
          if (tb.h == null) {
             throw new IllegalStateException("Unexpected readData call. Buffer is null");
          }
          tb.k = 0;
          _monitor_exit(i);
          try{
             tb.e();
             CronetUploadDataStream$a tb1 = this.b;
             tb1.b.b(tb1, tb1.h);
          }catch(java.lang.Exception e0){
             this.b.i(e0);
          }
          return;
       }
    }
}
