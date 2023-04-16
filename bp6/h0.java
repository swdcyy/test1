package bp6.h0;
import java.lang.Runnable;
import com.kwai.imsdk.internal.q;
import java.lang.Object;
import com.kwai.imsdk.n;
import java.lang.String;
import com.kwai.chat.sdk.signal.BizDispatcher;
import com.kwai.imsdk.internal.client.t;
import ih0.a$a;
import ih0.a$i;
import com.kwai.imsdk.internal.v;
import java.lang.CharSequence;
import ca7.u;
import com.kwai.imsdk.n$b;
import com.kwai.imsdk.n$a;
import io.reactivex.subjects.PublishSubject;
import java.lang.Throwable;
import l85.b;

public class h0 implements Runnable	// class@000523
{
    public final int b;
    public final q c;

    public void h0(q p0,int p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       a$a n;
       n on = n.c.get(this.c.f);
       h0 tb = this.b;
       a$a uoa = t.o(on.a).l();
       n = uoa.n;
       String stringOrMain = (n != null)? BizDispatcher.getStringOrMain(n.b): BizDispatcher.getStringOrMain(null);
       uoa = uoa.n;
       n on1 = null;
       a$i c = (uoa != null)? uoa.c: 0;
       if (uoa != null && uoa.a != null) {
          on1 = 1;
       }
       if (on1 && (v.l().L(on.a) && !u.b(stringOrMain, on.a))) {
          n$b uob = new n$b(null);
          uob.d = tb;
          uob.b = on.a;
          uob.c = c;
          try{
             uob.a = stringOrMain;
             on.b.onNext(uob);
          }catch(java.lang.Exception e0){
             b.g(e0);
          }
       }
    }
}
