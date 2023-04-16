package fna.b0;
import erd.g;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import fna.j$b;

public final class b0 implements g	// class@00296f
{
    public final GrowthCleanerService b;

    public void b0(GrowthCleanerService p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "1")) {
       }else {
          RxBus.f.b(new j$b(this.b, p0));
          p0.e = false;
       }
       return;
    }
}
