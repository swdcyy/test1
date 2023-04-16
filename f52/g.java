package f52.g;
import erd.o;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.b;
import java.lang.Object;
import java.lang.Long;
import java.util.Objects;

public final class g implements o	// class@00288b
{
    public final b b;
    public final long c;

    public void g(b p0,long p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       long l = this.c - p0.longValue();
       tb.z = l;
       return Long.valueOf(l);
    }
}
