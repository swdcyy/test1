package bp6.k0;
import erd.g;
import com.kwai.imsdk.internal.v;
import java.util.List;
import qo6.h1;
import java.lang.Object;
import com.kwai.imsdk.msg.KwaiMsg;
import java.util.Objects;
import com.kwai.imsdk.internal.o;
import java.lang.String;
import java.lang.Exception;

public final class k0 implements g	// class@000530
{
    public final v b;
    public final List c;
    public final List d;
    public final h1 e;

    public void k0(v p0,List p1,List p2,h1 p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       k0 tb = this.b;
       k0 tc = this.c;
       k0 td = this.d;
       Objects.requireNonNull(tb);
       if (p0 != null && p0.getMessageState() == 2) {
          try{
             if (p0.getForward()) {
                tc.add(p0);
                td.remove(p0);
             }else {
                tb.b.i(p0);
             }
          }catch(java.lang.Exception e0){
             if (this.e) {
                this.e.g(p0, -110, e0.getMessage(), null);
             }
          }
       }
    }
}
