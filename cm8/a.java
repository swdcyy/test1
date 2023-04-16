package cm8.a;
import com.smile.gifmaker.thread.statistic.recorders.Recordable;
import java.lang.Object;
import java.util.LinkedList;
import com.smile.gifmaker.thread.statistic.recorders.Recordable$RecordStatus;
import com.smile.gifmaker.thread.task.ElasticTask;
import java.util.List;
import com.smile.gifmaker.thread.task.ElasticTask$Status;
import android.os.SystemClock;

public class a implements Recordable	// class@0003c6
{
    public List a;
    public long b;
    public long c;
    public Recordable$RecordStatus d;

    public void a(){
       super();
       this.a = new LinkedList();
       this.b = 0;
       this.c = 0;
       this.d = Recordable$RecordStatus.UNINITIATED;
    }
    public void a(){
       this.b = 0;
       this.c = 0;
       this.d = Recordable$RecordStatus.RECORDING;
    }
    public void b(){
       this.d = Recordable$RecordStatus.RECORD_END;
    }
    public ElasticTask c(){
       if (this.a.isEmpty()) {
          return null;
       }
       return this.a.get(0);
    }
    public void d(ElasticTask p0){
       if (p0 == null) {
          return;
       }
       this.a.add(p0);
       _monitor_enter(p0);
       p0.k = ElasticTask$Status.WAITING;
       p0.h = SystemClock.elapsedRealtime();
       _monitor_exit(p0);
       return;
    }
    public boolean e(){
       return this.a.isEmpty();
    }
    public void f(ElasticTask p0){
       this.a.remove(p0);
       if (this.d == Recordable$RecordStatus.RECORDING) {
          this.b = this.b + p0.f();
          this.c = this.c + 1;
       }
       return;
    }
}
