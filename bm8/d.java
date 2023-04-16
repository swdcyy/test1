package bm8.d;
import bm8.b;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.BlockingQueue;
import com.smile.gifmaker.thread.executor.BaseExecutorCell;
import java.lang.String;

public class d extends b	// class@000432
{

    public void d(int p0){
       super(p0);
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 100, TimeUnit.MILLISECONDS, new SynchronousQueue());
       this.c = p0;
    }
    public String g(){
       return "ElasticDredgeDisasterCell";
    }
}
