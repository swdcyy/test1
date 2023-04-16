package p75.a;
import java.lang.Runnable;
import java.lang.Object;
import p75.l;
import com.kwai.chat.kwailink.client.c0;
import com.kwai.chat.kwailink.i;
import com.kwai.chat.kwailink.client.d0;

public final class a implements Runnable	// class@002170
{
    public final int b;
    public final int c;

    public void a(int p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       try{
          a tb = this.b;
          a tc = this.c;
          if (c0.l() != null) {
             i oi = c0.l().a();
             if (oi != null) {
                tb = oi.M();
             }
          }
          d0.b(tc, e0);
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
