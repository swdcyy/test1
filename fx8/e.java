package fx8.e;
import erd.o;
import fx8.h;
import java.util.Map;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Collections;
import brd.t;

public final class e implements o	// class@00237a
{
    public final h b;
    public final Map c;
    public final c d;

    public void e(h p0,Map p1,c p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       e tb = this.b;
       e tc = this.c;
       e td = this.d;
       Objects.requireNonNull(tb);
       if (tc == null) {
          tc = Collections.emptyMap();
       }
       return tb.a(p0, tc, td);
    }
}
