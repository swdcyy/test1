package fgd.h;
import io.reactivex.g;
import fgd.k;
import java.util.List;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import com.kwai.framework.cache.a;
import java.lang.System;
import java.lang.String;
import java.lang.Boolean;
import brd.g;

public final class h implements g	// class@000e27
{
    public final k b;
    public final List c;

    public void h(k p0,List p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribe(v p0){
       h tb = this.b;
       h tc = this.c;
       Objects.requireNonNull(tb);
       Object c = k.C;
       _monitor_enter(c);
       tb.z.compareAndSet(true, false);
       a.f().s(true);
       a.f().o();
       a.f().m(false, tc);
       a.f().m(true, tc);
       a.f().n("MANUAL_CLEAR_COST", (System.currentTimeMillis() - System.currentTimeMillis()));
       a.f().s(false);
       p0.onNext(Boolean.TRUE);
       p0.onComplete();
       _monitor_exit(c);
    }
}
