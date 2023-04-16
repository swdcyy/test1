package gm8.a;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.Runnable;
import java.lang.String;
import com.smile.gifmaker.thread.task.ElasticTask;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.IllegalArgumentException;

public class a	// class@0016f3
{
    public AtomicLong a;
    public static a b;

    public void a(){
       super();
       this.a = new AtomicLong(0);
    }
    public static a b(){
       if (a.b == null) {
          a uoa = a.class;
          _monitor_enter(uoa);
          if (a.b == null) {
             a.b = new a();
          }
          _monitor_exit(uoa);
       }
       return a.b;
    }
    public ElasticTask a(Runnable p0,String p1,int p2){
       if (p0 == null || TextUtils.isEmpty(p1)) {
          throw new IllegalArgumentException("illegal params");
       }
       ElasticTask uElasticTask = new ElasticTask(p0, p1, this.a.incrementAndGet(), p2);
       return v0;
    }
}
