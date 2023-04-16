package gg0.b;
import java.lang.Runnable;
import gg0.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hg0.b;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;

public final class b implements Runnable	// class@0024d0
{
    public final a b;

    public void b(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       b tb = this.b;
       tb.j = tb.j + 1;
       tb.q((float)(tb.f.getMCurrentProgress() + this.b.j));
       return;
    }
}
