package com.oplus.ocs.base.task.g;
import java.lang.Runnable;
import com.oplus.ocs.base.task.f;
import com.oplus.ocs.base.task.Task;
import java.lang.Object;
import com.oplus.ocs.base.task.OnCompleteListener;

public final class g implements Runnable	// class@000b13
{
    public f a;
    public Task b;

    public void g(f p0,Task p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void run(){
       f a = this.a.a;
       _monitor_enter(a);
       if (this.a.a() != null) {
          this.a.a().onComplete(this.b);
       }
       _monitor_exit(a);
       return;
    }
}
