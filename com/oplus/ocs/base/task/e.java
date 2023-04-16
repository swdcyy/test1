package com.oplus.ocs.base.task.e;
import java.lang.Runnable;
import com.oplus.ocs.base.task.d;
import java.lang.Object;
import com.oplus.ocs.base.task.OnCanceledListener;

public final class e implements Runnable	// class@000b11
{
    public d a;

    public void e(d p0){
       super();
       this.a = p0;
    }
    public final void run(){
       if (this.a.a() != null) {
          this.a.a().onCanceled();
       }
       return;
    }
}
