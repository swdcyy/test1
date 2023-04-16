package bm8.g;
import com.smile.gifmaker.thread.executor.BaseExecutorCell;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.BlockingQueue;
import com.smile.gifmaker.thread.task.ElasticTask;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import java.lang.Integer;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.Math;
import dm8.c;

public class g extends BaseExecutorCell	// class@00030d
{
    public Map i;
    public Map j;

    public void g(int p0){
       super(p0);
       this.i = new ConcurrentHashMap();
       this.j = new ConcurrentHashMap();
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 5000, TimeUnit.MILLISECONDS, new SynchronousQueue());
       this.c = new ConcurrentHashMap();
    }
    public synchronized boolean c(ElasticTask p0){
       String str = p0.b();
       if (!this.i.containsKey(str)) {
          throw new RuntimeException("fixed executor "+str+" is not inited");
       }
       int i = this.i.get(str).intValue();
       int i1 = 0;
       if (!this.j.containsKey(str)) {
          this.j.put(str, Integer.valueOf(i1));
       }
       if (this.j.get(str).intValue() < i) {
          i1 = true;
       }
       return i1;
    }
    public String g(){
       return "FixedExecutorCell";
    }
    public synchronized void j(ElasticTask p0){
       super.j(p0);
       String str = p0.b();
       this.j.put(str, Integer.valueOf(Math.max((this.j.get(str).intValue() - 1), 0)));
       c.d().g(p0.b());
    }
    public synchronized void k(ElasticTask p0){
       super.k(p0);
       String str = p0.b();
       this.j.put(str, Integer.valueOf(Math.max((this.j.get(str).intValue() + 1), 0)));
    }
}
