package com.oplus.ocs.base.task.i;
import java.lang.Runnable;
import com.oplus.ocs.base.task.h;
import com.oplus.ocs.base.task.Task;
import java.lang.Object;
import com.oplus.ocs.base.task.OnFailureListener;
import java.lang.Exception;

public final class i implements Runnable	// class@000b15
{
    public h a;
    public Task b;

    public void i(h p0,Task p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void run(){
       if (this.a.a() != null) {
          this.a.a().onFailure(this.b.getException());
       }
       return;
    }
}
