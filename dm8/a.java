package dm8.a;
import com.smile.gifmaker.thread.statistic.recorders.Recordable;
import java.lang.Object;
import am8.b;
import com.smile.gifmaker.thread.executor.BaseExecutorCell$ExecutorType;
import com.smile.gifmaker.thread.executor.BaseExecutorCell;

public class a implements Recordable	// class@0014ca
{
    public BaseExecutorCell a;
    public BaseExecutorCell b;
    public BaseExecutorCell c;

    public void a(){
       super();
       BaseExecutorCell$ExecutorType aRTERY = BaseExecutorCell$ExecutorType.ARTERY;
       this.a = BaseExecutorCell.d(b.p, aRTERY);
       this.b = BaseExecutorCell.d(b.q, aRTERY);
       this.c = BaseExecutorCell.d(b.r, aRTERY);
    }
    public void a(){
       this.a.a();
       this.b.a();
       this.c.a();
    }
    public void b(){
       this.a.b();
       this.b.b();
       this.c.b();
    }
    public BaseExecutorCell c(){
       return this.c;
    }
    public BaseExecutorCell d(){
       return this.b;
    }
    public BaseExecutorCell e(){
       return this.a;
    }
}
