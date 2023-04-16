package bp6.i;
import io.reactivex.g;
import com.kwai.imsdk.internal.o;
import com.kwai.imsdk.msg.KwaiMsg;
import java.lang.Object;
import brd.v;
import iq6.f;
import iq6.g;
import iq6.m;
import brd.g;
import iq6.h;
import java.lang.String;
import nq6.s;
import java.lang.Throwable;

public final class i implements g	// class@00052a
{
    public final o b;
    public final KwaiMsg c;

    public void i(o p0,KwaiMsg p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribe(v p0){
       i tb = this.b;
       i tc = this.c;
       if (tb.h(tc, p0)) {
       }else {
          p0.onNext(new f(tc, new g()));
          tb.r(tc);
          p0.onNext(new f(tc, new h()));
          p0.onComplete();
       }
       return;
    }
}
