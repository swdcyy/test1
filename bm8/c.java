package bm8.c;
import java.lang.Runnable;
import com.smile.gifmaker.thread.executor.BaseExecutorCell$a;
import com.smile.gifmaker.thread.task.ElasticTask;
import java.lang.Object;
import java.util.Objects;
import am8.b;
import java.lang.String;
import com.smile.gifmaker.thread.executor.BaseExecutorCell;

public final class c implements Runnable	// class@000309
{
    public final BaseExecutorCell$a b;
    public final ElasticTask c;

    public void c(BaseExecutorCell$a p0,ElasticTask p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       c tb = this.b;
       c tc = this.c;
       Objects.requireNonNull(tb);
       if (b.b) {
          tc.b();
          tb.c.g();
       }
       return;
    }
}
