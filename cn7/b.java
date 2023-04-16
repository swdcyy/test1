package cn7.b;
import java.util.concurrent.TimeUnit;
import java.lang.String;
import com.kwai.sdk.eve.internal.common.scheduler.LabeledRunnable;
import java.lang.Object;
import java.util.concurrent.Future;
import cn7.c;
import com.kuaishou.eve.packageinfo.model.ResourceType;
import cn7.d;
import java.util.List;

public interface abstract b	// class@000576
{

    boolean awaitTermination(long p0,TimeUnit p1);
    void b(String p0);
    String d();
    Future e(LabeledRunnable p0,Object p1,boolean p2);
    int f(c p0);
    void g(ResourceType p0,int p1);
    int h(c p0);
    Future i(d p0,boolean p1);
    boolean isShutdown();
    boolean isTerminated();
    void j(LabeledRunnable p0,boolean p1);
    Future k(LabeledRunnable p0,boolean p1);
    void shutdown();
    List shutdownNow();
}
