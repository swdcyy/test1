package fna.a0;
import erd.g;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService;
import java.lang.Object;
import fna.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import fna.j$a;

public final class a0 implements g	// class@00296d
{
    public final GrowthCleanerService b;

    public void a0(GrowthCleanerService p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0.class, "1")) {
       }else {
          RxBus.f.b(p0);
          if (p0 instanceof j$a) {
             p0.e = false;
          }
       }
       return;
    }
}
