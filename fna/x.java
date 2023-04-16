package fna.x;
import erd.g;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerReDispatchPresenter;
import java.lang.Object;
import fna.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class x implements g	// class@002999
{
    public final GrowthCleanerReDispatchPresenter b;

    public void x(GrowthCleanerReDispatchPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.R8(p0);
       }
       return;
    }
}
