package bm8.b;
import com.smile.gifmaker.thread.executor.BaseExecutorCell;
import android.os.SystemClock;
import java.lang.Math;
import com.smile.gifmaker.thread.task.ElasticTask;
import dm8.c;

public abstract class b extends BaseExecutorCell	// class@000308
{
    public long i;
    public long j;
    public boolean k;
    public int l;
    public long m;

    public void b(int p0){
       super(p0);
       this.i = 0;
       this.j = 0;
       this.k = false;
    }
    public void a(){
       super.a();
       this.l = 0;
       long l = 0;
       this.m = l;
       if (this.k != null) {
          this.m = l + 1;
       }
       return;
    }
    public void b(){
       super.b();
       if (this.k != null) {
          this.m = this.m + (SystemClock.elapsedRealtime() - Math.max(this.f, this.i));
       }
       return;
    }
    public boolean c(ElasticTask p0){
       boolean b = false;
       if (this.k == null) {
          return b;
       }
       if (this.h() < this.b) {
          b = true;
       }
       return b;
    }
    public void j(ElasticTask p0){
       super.j(p0);
       if (this.k != null) {
          c.d().f();
       }
       return;
    }
}
