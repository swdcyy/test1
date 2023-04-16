package aegon.chrome.base.task.b$c;
import java.util.concurrent.RejectedExecutionHandler;
import java.lang.Object;
import aegon.chrome.base.task.b$a;
import java.lang.Runnable;
import java.util.concurrent.ThreadPoolExecutor;
import aegon.chrome.base.task.b;
import java.util.concurrent.Executor;

public class b$c implements RejectedExecutionHandler	// class@000176
{

    public void b$c(){
       super();
    }
    public void b$c(b$a p0){
       super();
    }
    public void rejectedExecution(Runnable p0,ThreadPoolExecutor p1){
       b.f.execute(p0);
    }
}
