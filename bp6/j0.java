package bp6.j0;
import erd.g;
import com.kwai.imsdk.internal.v;
import java.util.List;
import l85.c;
import qo6.h1;
import java.lang.Object;
import java.util.Objects;
import java.util.Collection;
import com.kwai.imsdk.internal.util.b;
import java.util.Iterator;
import com.kwai.imsdk.msg.KwaiMsg;
import java.lang.String;
import nq6.s;
import pq6.a;
import java.lang.StringBuilder;
import l85.b;
import com.kwai.imsdk.internal.o;
import android.os.SystemClock;
import qp6.h;
import com.kwai.imsdk.d;
import java.util.Collections;
import bp6.w;
import qo6.n;

public final class j0 implements g	// class@00052b
{
    public final v b;
    public final List c;
    public final List d;
    public final c e;
    public final boolean f;
    public final h1 g;

    public void j0(v p0,List p1,List p2,c p3,boolean p4,h1 p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final void accept(Object p0){
       Iterator iterator;
       j0 oj0 = this;
       j0 b = oj0.b;
       j0 c = oj0.c;
       j0 d = oj0.d;
       j0 e = oj0.e;
       j0 f = oj0.f;
       j0 g = oj0.g;
       Objects.requireNonNull(b);
       if (b.c(c)) {
          iterator = d.iterator();
          while (iterator.hasNext()) {
             s.t(b.a).e(iterator.next().getClientSeq(), a.b());
          }
          b.a(e.d("forwardFailMessageList")+" msgs: "+b.g(c));
          b.b.u(d, f, g);
       }else {
          iterator = c.iterator();
          while (iterator.hasNext()) {
             s.t(b.a).e(iterator.next().getClientSeq(), a.b());
          }
          iterator = d.iterator();
          while (iterator.hasNext()) {
             s.t(b.a).e(iterator.next().getClientSeq(), a.b());
          }
          b.a(e.d("resendForwardMessages")+" msgs: "+b.g(c));
          v b1 = b.b;
          Objects.requireNonNull(b1);
          Iterator iterator1 = c.iterator();
          while (iterator1.hasNext()) {
             KwaiMsg kwaiMsg = iterator1.next();
             if (kwaiMsg == null) {
                break ;
             }
             h.b(b1.g).c(b1, new d(kwaiMsg.getTargetType(), kwaiMsg.getTarget()), Collections.singletonList(kwaiMsg), 1, 1, new w(b1, g, SystemClock.elapsedRealtime()));
          }
          b.a(e.d("normalFailMessageList")+" msgs: "+b.g(d));
          b.b.u(d, f, g);
       }
       return;
    }
}
