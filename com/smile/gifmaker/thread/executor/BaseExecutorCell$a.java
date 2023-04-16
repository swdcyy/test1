package com.smile.gifmaker.thread.executor.BaseExecutorCell$a;
import com.smile.gifmaker.thread.task.ElasticTask$a;
import com.smile.gifmaker.thread.executor.BaseExecutorCell;
import com.smile.gifmaker.thread.task.ElasticTask;
import java.lang.Object;
import bm8.c;
import am8.b;
import java.lang.String;
import dm8.c;
import java.lang.Runnable;
import android.os.Handler;
import java.lang.StringBuilder;

public class BaseExecutorCell$a implements ElasticTask$a	// class@000fcb
{
    public Runnable a;
    public final ElasticTask b;
    public final BaseExecutorCell c;

    public void BaseExecutorCell$a(BaseExecutorCell p0,ElasticTask p1){
       this.c = p0;
       this.b = p1;
       super();
       this.a = new c(this, p1);
    }
    public void a(){
       if (b.b) {
          this.c.g();
          this.b.b();
          c.d().b.postDelayed(this.a, (long)b.A);
       }
       this.c.i(this.b);
       return;
    }
    public void b(){
       this.c.j(this.b);
       if (b.b) {
          c.d().b.removeCallbacks(this.a);
          StringBuilder str = "ElasticTask execution finish:"+this.b.b()+" ## executeTime:"+this.b.d()+" ## waiTime:"+this.b.f();
          if (b.f) {
             this.b.a();
          }
          this.c.g();
       }
       return;
    }
}
