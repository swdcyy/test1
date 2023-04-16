package fw1.c;
import erd.g;
import fw1.e;
import wu1.a;
import java.lang.Object;
import java.lang.Long;
import java.util.Objects;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class c implements g	// class@0023c2
{
    public final e b;
    public final a c;

    public void c(e p0,a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       c tb = this.b;
       c tc = this.c;
       Objects.requireNonNull(tb);
       b.c0(e.u, "[tryShowPendant] count down, and remove pendant", "pendantId", tc.k);
       tb.P8(tc.k);
    }
}
