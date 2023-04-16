package d.d;
import java.lang.Runnable;
import a.a.a.a.b.a.b;
import f.g;
import f.m$a;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import java.util.List;
import java.util.Iterator;
import okhttp3.Call;
import okhttp3.Request;
import java.util.concurrent.ConcurrentHashMap;
import f.m;
import com.kuaishou.security.kste.export.InvokeCallback;
import com.kuaishou.security.kste.export.KSTEResult$Code;

public class d implements Runnable	// class@001de7
{
    public final g b;
    public final m$a c;
    public final b d;

    public void d(b p0,g p1,m$a p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       Call uCall;
       m$c.b(this.b.g()+" task timeout tasktag["+this.b.g()+"]");
       this.c.c(true);
       Iterator iterator = m$f.a.dispatcher().runningCalls().iterator();
       String str = " will been cancel";
       while (iterator.hasNext()) {
          uCall = iterator.next();
          m$c.b("running request tag is: "+uCall.request().tag());
          if (uCall.request().tag() == this.b.g()) {
             m$c.b("running "+this.b.g()+str);
             if (!uCall.isCanceled() && uCall.isExecuted()) {
                uCall.cancel();
             }
          }
       }
       iterator = m$f.a.dispatcher().queuedCalls().iterator();
       while (iterator.hasNext()) {
          uCall = iterator.next();
          m$c.b("queuedcalls request tag is: "+uCall.request().tag());
          if (uCall.request().tag() == this.b.g()) {
             m$c.b(this.b.g()+str);
             if (!uCall.isCanceled() && uCall.isExecuted()) {
                uCall.cancel();
             }
          }
       }
       ConcurrentHashMap d = m$f.d;
       if (!d.get(this.b.g()).d().d()) {
          byte[] uobyteArray = new byte[0];
          this.b.c().onResult(KSTEResult$Code.INVOKE_TIMEOUT, uobyteArray);
          d.remove(this.b.g());
       }
       return;
    }
}
