package bm8.h;
import com.smile.gifmaker.thread.executor.BaseExecutorCell;
import java.lang.Long;
import java.util.concurrent.ThreadPoolExecutor;
import am8.b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.BlockingQueue;
import com.smile.gifmaker.thread.task.ElasticTask;
import java.lang.String;
import dm8.c;
import java.lang.Object;
import java.util.Objects;
import android.os.Message;
import android.os.Handler;

public class h extends BaseExecutorCell	// class@00030e
{
    public static final Long i;
    public static final Long j;

    static {
       Long longx = Long.valueOf(2000);
       h.i = longx;
       h.j = Long.valueOf((longx.longValue() + 10));
    }
    public void h(int p0){
       super(p0);
       if (p0 != 1) {
          this.b = 1;
       }
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(1, 1, b.l, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
       this.c = p0;
       p0.allowCoreThreadTimeOut(1);
       return;
    }
    public boolean c(ElasticTask p0){
       boolean b = true;
       if (this.h() < b) {
       }else {
          b = false;
       }
       return b;
    }
    public String g(){
       return "SerialElasticExecutorCell";
    }
    public synchronized void i(ElasticTask p0){
       super.i(p0);
       c uoc = c.d();
       Objects.requireNonNull(uoc);
       Message message = Message.obtain();
       message.what = 6;
       uoc.b.sendMessageDelayed(message, h.j.longValue());
    }
    public synchronized void j(ElasticTask p0){
       super.j(p0);
       c uoc = c.d();
       Objects.requireNonNull(uoc);
       Message message = Message.obtain();
       message.what = 5;
       uoc.b.sendMessageDelayed(message, 0);
    }
}
