package bm8.a;
import com.smile.gifmaker.thread.executor.BaseExecutorCell;
import java.util.concurrent.ThreadPoolExecutor;
import am8.b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.BlockingQueue;
import com.smile.gifmaker.thread.task.ElasticTask;
import java.lang.String;
import dm8.c;

public class a extends BaseExecutorCell	// class@000307
{

    public void a(int p0){
       super(p0);
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(p0, p0, b.l, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
       this.c = v7;
       v7.allowCoreThreadTimeOut(true);
    }
    public boolean c(ElasticTask p0){
       boolean b = (this.h() < this.b)? true: false;
       return b;
    }
    public String g(){
       return "ArteryElasticExecutorCell";
    }
    public synchronized void j(ElasticTask p0){
       super.j(p0);
       c.d().f();
    }
}
