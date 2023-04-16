package bm8.e;
import bm8.b;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.BlockingQueue;
import com.smile.gifmaker.thread.executor.BaseExecutorCell;
import android.os.SystemClock;
import com.smile.gifmaker.thread.statistic.recorders.Recordable$RecordStatus;
import java.lang.String;

public class e extends b	// class@00030b
{

    public void e(int p0){
       super(p0);
       TimeUnit mILLISECONDS = TimeUnit.MILLISECONDS;
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 5000, mILLISECONDS, new SynchronousQueue());
       this.c = p0;
       if (this.k != null) {
       }else {
          boolean b = true;
          this.k = b;
          this.i = SystemClock.elapsedRealtime();
          if (this.h == Recordable$RecordStatus.RECORDING) {
             this.l = this.l + b;
          }
          this.c.setKeepAliveTime(5000, mILLISECONDS);
       }
       return;
    }
    public String g(){
       return "DredgeExpandableExecutorCell";
    }
}
