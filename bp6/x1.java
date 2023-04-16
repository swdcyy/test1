package bp6.x1;
import qo6.h1;
import com.kwai.imsdk.internal.v;
import com.kwai.imsdk.d;
import qo6.n;
import java.lang.Object;
import com.kwai.imsdk.msg.KwaiMsg;
import java.util.List;
import java.util.Collections;
import java.lang.String;
import nq6.s;
import com.kwai.imsdk.callback.KwaiIMException;
import java.lang.Throwable;

public class x1 extends h1	// class@00055b
{
    public final d a;
    public final long b;
    public final n c;
    public final v d;

    public void x1(v p0,d p1,long p2,n p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void a(Object p0){
       this.h(p0);
    }
    public void b(Object p0){
       this.e(p0);
    }
    public void c(Object p0){
       this.i(p0);
    }
    public void e(KwaiMsg p0){
       x1 tc = this.c;
       if (tc != null) {
          tc.f(Collections.singletonList(p0));
       }
       return;
    }
    public void g(KwaiMsg p0,int p1,String p2,byte[] p3){
       s.t(this.d.a).n(2, this.a.getTargetType(), new KwaiIMException(p1, p2));
       x1 tc = this.c;
       if (tc != null) {
          tc.e(Collections.singletonList(p0), p1, p2);
       }
       return;
    }
    public void h(KwaiMsg p0){
       s.t(this.d.a).o(2, this.a.getTargetType(), this.b);
       x1 tc = this.c;
       if (tc != null) {
          tc.g(Collections.singletonList(p0));
       }
       return;
    }
    public void i(KwaiMsg p0){
       x1 tc = this.c;
       if (tc != null) {
          tc.h(Collections.singletonList(p0));
       }
       return;
    }
}
