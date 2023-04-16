package com.meizu.cloud.pushsdk.b.c.a;
import java.util.concurrent.Executor;
import java.lang.Object;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.SynchronousQueue;
import com.meizu.cloud.pushsdk.b.c.c;
import java.lang.String;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import com.meizu.cloud.pushsdk.b.c.a$1;
import com.meizu.cloud.pushsdk.b.c.a$a;
import java.lang.Runnable;

public class a implements Executor	// class@0014a6
{
    public final ThreadPoolExecutor a;

    public void a(){
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), new c().a("io-pool-%d").a());
       this.a = v8;
    }
    public void a(a$1 p0){
       super();
    }
    public static a a(){
       return a$a.a();
    }
    public void execute(Runnable p0){
       this.a.execute(p0);
    }
}
