package com.yxcorp.gifshow.performance.monitor.gc.GcManageInitModule$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.performance.monitor.gc.GcManageInitModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class GcManageInitModule$b implements Runnable	// class@000e77
{
    public final GcManageInitModule b;

    public void GcManageInitModule$b(GcManageInitModule p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, GcManageInitModule$b.class, "1")) {
          return;
       }
       if (this.b.w != null) {
          GcManageInitModule$b tb = this.b;
          tb.v = tb.v - 1;
          tb = this.b;
          tb.p0(tb.s);
          this.b.w = false;
       }
       return;
    }
}
