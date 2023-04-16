package yqd.f;
import java.util.concurrent.ScheduledExecutorService;
import java.lang.Iterable;
import io.netty.util.concurrent.f;
import java.util.concurrent.TimeUnit;
import java.util.Set;
import java.util.Iterator;
import yqd.e;
import java.lang.Runnable;
import yqd.m;
import java.util.concurrent.Callable;
import java.util.List;
import java.lang.Object;

public interface abstract f implements ScheduledExecutorService, Iterable	// class@002a96
{

    f H1();
    f H3(long p0,long p1,TimeUnit p2);
    boolean Q2();
    Set children();
    Iterator iterator();
    e next();
    m schedule(Runnable p0,long p1,TimeUnit p2);
    m schedule(Callable p0,long p1,TimeUnit p2);
    m scheduleAtFixedRate(Runnable p0,long p1,long p2,TimeUnit p3);
    m scheduleWithFixedDelay(Runnable p0,long p1,long p2,TimeUnit p3);
    void shutdown();
    List shutdownNow();
    f submit(Runnable p0);
    f submit(Runnable p0,Object p1);
    f submit(Callable p0);
    f w2();
}
