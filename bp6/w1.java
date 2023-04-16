package bp6.w1;
import qo6.c;
import com.kwai.imsdk.internal.v;
import java.lang.Object;
import qo6.l1;
import java.lang.String;
import com.kwai.imsdk.internal.client.t;
import java.lang.Exception;
import java.util.concurrent.atomic.AtomicInteger;

public class w1 implements c	// class@000558
{
    public final v a;

    public void w1(v p0){
       this.a = p0;
       super();
    }
    public void a(l1 p0){
       try{
          t.j(p0.c, this.a.u(), p0.b, p0.a);
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
       }
       return;
    }
    public void onFailed(){
       this.a.e.incrementAndGet();
    }
}
