package zu8.f;
import erd.g;
import com.yxcorp.experiment.logger.a;
import java.util.Calendar;
import java.lang.Object;
import java.lang.Long;
import java.util.Objects;
import java.lang.System;
import java.util.Set;

public final class f implements g	// class@00297b
{
    public final a b;
    public final Calendar c;

    public void f(a p0,Calendar p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       f tb = this.b;
       f tc = this.c;
       Objects.requireNonNull(tb);
       tc.add(5, 1);
       tb.f(System.currentTimeMillis(), tc);
       p0 = tb.b;
       _monitor_enter(p0);
       tb.b.clear();
       _monitor_exit(p0);
       a d = tb.d;
       _monitor_enter(d);
       tb.d.clear();
       _monitor_exit(d);
    }
}
