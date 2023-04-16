package cn7.e;
import cn7.d;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.lang.String;
import com.kwai.sdk.eve.internal.common.scheduler.LabeledRunnable;
import java.lang.Object;
import java.util.List;

public interface abstract e	// class@000579
{

    Future a(d p0);
    boolean awaitTermination(long p0,TimeUnit p1);
    void b(String p0);
    Future c(LabeledRunnable p0);
    String d();
    void e(int p0);
    int f();
    void g(LabeledRunnable p0);
    int h();
    Future i(LabeledRunnable p0,Object p1);
    boolean isShutdown();
    boolean isTerminated();
    void shutdown();
    List shutdownNow();
}
