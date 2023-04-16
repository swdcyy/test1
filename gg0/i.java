package gg0.i;
import java.lang.Runnable;
import gg0.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hg0.b;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;

public final class i implements Runnable	// class@0024da
{
    public final h b;

    public void i(h p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       i tb = this.b;
       tb.j = tb.j + 0.10f;
       tb.q(((float)tb.f.getMCurrentProgress() + this.b.j));
       return;
    }
}
