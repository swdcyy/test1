package lv8.n;
import brd.z;
import io.reactivex.android.schedulers.a;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import lrd.b;

public class n	// class@002db8
{
    public static final z a;
    public static final z b;

    static {
       n.a = a.c();
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(2, 2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
       n.b = b.b(v0);
    }
}
