package dm8.d;
import java.lang.Object;
import com.smile.gifmaker.thread.executor.BaseExecutorCell$ExecutorType;
import com.smile.gifmaker.thread.executor.BaseExecutorCell;
import bm8.g;
import java.lang.String;
import java.util.Map;
import am8.b;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Integer;

public class d	// class@0014ce
{
    public g a;

    public void d(){
       super();
       this.a = BaseExecutorCell.d(Integer.MAX_VALUE, BaseExecutorCell$ExecutorType.FIXED);
    }
    public void a(String p0,int p1){
       d ta = this.a;
       _monitor_enter(ta);
       if (ta.i.containsKey(p0)) {
          if (!b.b) {
             _monitor_exit(ta);
          }else {
             throw new IllegalArgumentException("task name "+p0+" already inited");
          }
       }else {
          ta.i.put(p0, Integer.valueOf(p1));
          _monitor_exit(ta);
       }
       return;
    }
}
