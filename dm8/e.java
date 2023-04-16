package dm8.e;
import com.smile.gifmaker.thread.statistic.recorders.Recordable;
import java.lang.Object;
import cm8.a;
import com.smile.gifmaker.thread.executor.BaseExecutorCell$ExecutorType;
import com.smile.gifmaker.thread.executor.BaseExecutorCell;

public class e implements Recordable	// class@0014cf
{
    public a a;
    public BaseExecutorCell b;

    public void e(){
       super();
       this.a = new a();
       this.b = BaseExecutorCell.d(1, BaseExecutorCell$ExecutorType.SERIAL);
    }
    public void a(){
       this.b.a();
    }
    public void b(){
       this.b.b();
    }
}
