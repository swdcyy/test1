package az8.d;
import erd.g;
import com.yxcorp.gifshow.ad.detail.fragment.AdDetailVMFragment;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;

public final class d implements g	// class@000344
{
    public final AdDetailVMFragment b;

    public void d(AdDetailVMFragment p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          j0.c(this.b.G, "logger page first frame error", objArray);
       }
       return;
    }
}
