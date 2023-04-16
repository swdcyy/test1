package com.meizu.cloud.pushsdk.b.c.b;
import java.util.concurrent.Executor;
import java.lang.Object;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import com.meizu.cloud.pushsdk.b.c.c;
import java.lang.Integer;
import java.lang.String;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import com.meizu.cloud.pushsdk.b.c.b$1;
import com.meizu.cloud.pushsdk.b.c.b$a;
import java.lang.Runnable;

public class b implements Executor	// class@0014a9
{
    public final ThreadPoolExecutor a;

    public void b(){
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new c().a(Integer.valueOf(10)).a("message-pool-%d").a());
       this.a = v8;
    }
    public void b(b$1 p0){
       super();
    }
    public static b a(){
       return b$a.a();
    }
    public void execute(Runnable p0){
       this.a.execute(p0);
    }
}
