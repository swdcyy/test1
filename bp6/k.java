package bp6.k;
import erd.o;
import com.kwai.imsdk.internal.o;
import iq6.f;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.kwai.imsdk.msg.state.a;
import java.lang.String;
import com.kwai.imsdk.internal.o$c;
import iq6.m;
import com.kwai.imsdk.msg.KwaiMsg;

public final class k implements o	// class@000533
{
    public final o b;
    public final f c;

    public void k(o p0,f p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       k tb = this.b;
       k tc = this.c;
       Objects.requireNonNull(tb);
       return new f(tc.a, new a(p0, tb.g, tb.r, tc.b));
    }
}
