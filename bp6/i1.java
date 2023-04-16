package bp6.i1;
import java.util.concurrent.Callable;
import com.kwai.imsdk.internal.v;
import java.lang.String;
import java.lang.Object;
import com.kwai.imsdk.internal.client.i;
import java.util.Objects;
import hp6.b;
import java.lang.StringBuilder;

public final class i1 implements Callable	// class@000528
{
    public final v b;
    public final String c;
    public final int d;
    public final int e;
    public final long f;

    public void i1(v p0,String p1,int p2,int p3,long p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final Object call(){
       b uob;
       i1 tc = this.c;
       i1 td = this.d;
       i1 te = this.e;
       i1 tf = this.f;
       i oi = i.t(this.b.a);
       Objects.requireNonNull(oi);
       if (te == 1) {
          uob = oi.K(tc, td, tf, 1, 2);
       }else if(te == 2){
          uob = oi.K(tc, td, tf, 2, 1);
       }else {
          uob = new b(1009);
          uob.e("unsupported typingState: "+te);
       }
       return uob;
    }
}
