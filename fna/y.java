package fna.y;
import erd.g;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerReDispatchPresenter;
import fna.j;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fna.j$f;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService;

public final class y implements g	// class@00299a
{
    public final GrowthCleanerReDispatchPresenter b;
    public final j c;

    public void y(GrowthCleanerReDispatchPresenter p0,j p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "1")) {
       }else {
          y tb = this.b;
          tb.t = null;
          tb.R8(new j$f(this.c.a(), p0));
       }
       return;
    }
}
