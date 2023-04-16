package bm8.f;
import bm8.b;
import com.smile.gifmaker.thread.executor.BaseExecutorCell;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.lang.String;

public class f extends b	// class@000433
{

    public void f(int p0){
       super(p0);
       this.b = p0;
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(p0, p0, 100, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
       this.c = v7;
       v7.allowCoreThreadTimeOut(true);
    }
    public String g(){
       return "ElasticDredgeNormalCell";
    }
}
