package com.oplus.ocs.base.task.k;
import java.lang.Runnable;
import com.oplus.ocs.base.task.j;
import com.oplus.ocs.base.task.Task;
import java.lang.Object;
import com.oplus.ocs.base.task.OnSuccessListener;

public final class k implements Runnable	// class@000b17
{
    public j a;
    public Task b;

    public void k(j p0,Task p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void run(){
       if (this.a.a() != null) {
          this.a.a().onSuccess(this.b.getResult());
       }
       return;
    }
}
