package ntd.l;
import java.lang.String;
import java.lang.Object;
import ltd.g0;
import usd.q;
import java.util.concurrent.TimeUnit;
import ntd.g;
import ntd.i;
import ntd.j;

public final class l	// class@001f86
{
    public static final long a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static m f;

    static {
       l.a = g0.g("kotlinx.coroutines.scheduler.resolution.ns", 0x186a0, 0, 0, 12, null);
       l.b = g0.f("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, null);
       int i = g0.f("kotlinx.coroutines.scheduler.core.pool.size", q.n(g0.a(), 2), 1, 0, 8, null);
       l.c = i;
       l.d = g0.f("kotlinx.coroutines.scheduler.max.pool.size", q.B((g0.a() * 128), i, 0x1ffffe), 0, 0x1ffffe, 4, null);
       l.e = TimeUnit.SECONDS.toNanos(g0.g("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));
       l.f = g.a;
    }
    public static final boolean a(i p0){
       boolean b = true;
       if (p0.c.r() == b) {
       }else {
          b = false;
       }
       return b;
    }
}
