package bl0.c;
import com.kwai.performance.fluency.startup.scheduler.task.base.DependencyTask;
import rf7.a;
import com.kwai.performance.fluency.startup.scheduler.task.base.BarrierTask;
import com.kuaishou.merchant.cover.MerchantCoverInit;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public abstract class c extends DependencyTask	// class@000304
{

    public void c(){
       super();
       if (this.C()) {
          this.e(a.t);
       }
       return;
    }
    public boolean C(){
       return (this instanceof MerchantCoverInit ^ 0x01);
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       super.run();
       return;
    }
}
