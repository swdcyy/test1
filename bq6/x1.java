package bq6.x1;
import erd.o;
import bq6.p2;
import java.util.Map;
import java.lang.Object;
import com.kwai.imsdk.d;
import java.lang.String;
import java.util.Objects;
import cp6.r;
import cp6.u;
import io.reactivex.g;
import brd.t;
import com.kuaishou.gifshow.kuaishan.logic.s0;
import bq6.f2;
import brd.a0;
import bq6.e2;

public final class x1 implements o	// class@0005cc
{
    public final p2 b;
    public final Map c;

    public void x1(p2 p0,Map p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       x1 tc = this.c;
       p2 b = this.b.b;
       Objects.requireNonNull(b);
       return t.create(new r(b, p0.getTarget(), p0.getTargetType())).flatMap(s0.b).map(new f2(tc, p0)).toList().C(new e2(tc)).d0();
    }
}
