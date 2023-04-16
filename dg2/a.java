package dg2.a;
import erd.g;
import com.kuaishou.live.core.show.quiz.manager.a;
import java.lang.Object;
import java.lang.Long;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.concurrent.atomic.AtomicInteger;

public final class a implements g	// class@00250e
{
    public final a b;

    public void a(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       tb.c("send  signal timeout pulse: "+tb.c);
       tb.h.addAndGet(2);
       tb.a();
    }
}
