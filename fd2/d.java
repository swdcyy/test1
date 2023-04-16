package fd2.d;
import erd.o;
import com.kuaishou.live.core.show.photoalbum.LiveEntryCoverSelectSupplier;
import w69.i;
import com.kuaishou.live.core.show.photoalbum.LiveEntryCoverSelectSupplier$SelectType;
import java.lang.Object;
import zq8.a;
import java.util.Objects;
import brd.t;

public final class d implements o	// class@002937
{
    public final LiveEntryCoverSelectSupplier b;
    public final i c;
    public final LiveEntryCoverSelectSupplier$SelectType d;

    public void d(LiveEntryCoverSelectSupplier p0,i p1,LiveEntryCoverSelectSupplier$SelectType p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       d tb = this.b;
       d tc = this.c;
       d td = this.d;
       Objects.requireNonNull(tb);
       if (p0.b != null) {
          tb.b(tc, td);
          p0 = tb.d;
       }else {
          p0 = t.empty();
       }
       return p0;
    }
}
