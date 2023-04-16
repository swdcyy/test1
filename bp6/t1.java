package bp6.t1;
import erd.g;
import com.kwai.imsdk.internal.v;
import java.lang.String;
import qo6.k;
import java.lang.Object;
import hp6.b;
import java.util.Objects;
import com.kwai.chat.kwailink.data.PacketData;
import ca7.u;
import qo6.m;

public final class t1 implements g	// class@00054f
{
    public final v b;
    public final int c;
    public final String d;
    public final k e;

    public void t1(v p0,int p1,String p2,k p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       int i;
       t1 tb = this.b;
       t1 tc = this.c;
       t1 td = this.d;
       t1 te = this.e;
       Objects.requireNonNull(tb);
       if (p0 != null && (p0.b() != null && !p0.b().c())) {
          tb.c(tc, td, false);
          if (te != null) {
             te.onSuccess();
          }
       }else if(p0.b() != null){
          i = p0.b().c();
       }else {
          i = p0.c();
       }
       p0 = (p0.b() != null)? u.a(p0.b().e()): "db execute fail.";
       te.onError(i, p0);
       return;
    }
}
