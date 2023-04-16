package cm8.b;
import com.smile.gifmaker.thread.statistic.recorders.Recordable;
import java.lang.Object;
import cm8.a;
import am8.b;
import java.lang.IllegalStateException;
import java.lang.String;
import com.smile.gifmaker.thread.statistic.recorders.Recordable$RecordStatus;
import java.util.Objects;
import com.smile.gifmaker.thread.task.ElasticTask;

public class b implements Recordable	// class@0003c7
{
    public final a[] a;

    public void b(){
       super();
       int i = 4;
       a[] uoaArray = new a[i];
       this.a = uoaArray;
       if (b.a.length == i && (b.w.length != i && b.b)) {
          throw new IllegalStateException("Elastic Queue size incompatible!");
       }
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.a[i1] = new a();
       }
       return;
    }
    public void a(){
       for (int i = 0; i < 4; i = i + 1) {
          object oobject = this.a[i];
          oobject.b = 0;
          oobject.c = 0;
          oobject.d = Recordable$RecordStatus.RECORDING;
       }
       return;
    }
    public void b(){
       for (int i = 0; i < 4; i = i + 1) {
          object oobject = this.a[i];
          Objects.requireNonNull(oobject);
          oobject.d = Recordable$RecordStatus.RECORD_END;
       }
       return;
    }
    public a c(int p0){
       int i = 0;
       while (true) {
          int[] a = b.a;
          if (i < a.length) {
             if (a[i] == p0) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             b ta = this.a;
             return ta[(ta.length - 1)];
          }
       }
       return this.a[i];
    }
    public void d(ElasticTask p0){
       this.c(p0.c()).f(p0);
    }
}
