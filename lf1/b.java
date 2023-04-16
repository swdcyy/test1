package lf1.b;
import erd.a;
import com.kuaishou.live.common.core.component.comments.mock.b;
import z1.a;
import java.lang.Object;
import java.util.Objects;

public final class b implements a	// class@002ee3
{
    public final b b;
    public final a c;

    public void b(b p0,a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       b tb = this.b;
       b tc = this.c;
       Objects.requireNonNull(tb);
       if (tc != null) {
          tc.accept(tb.p);
       }
       return;
    }
}
