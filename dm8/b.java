package dm8.b;
import com.smile.gifmaker.thread.statistic.recorders.Recordable;
import java.lang.Object;
import com.smile.gifmaker.thread.executor.BaseExecutorCell$ExecutorType;
import com.smile.gifmaker.thread.executor.BaseExecutorCell;
import bm8.e;
import bm8.b;

public class b implements Recordable	// class@0014cb
{
    public e a;

    public void b(){
       super();
       this.a = BaseExecutorCell.d(0, BaseExecutorCell$ExecutorType.DREDGE_EXPANDABLE);
    }
    public void a(){
       this.a.a();
    }
    public void b(){
       this.a.b();
    }
    public e c(){
       return this.a;
    }
}
