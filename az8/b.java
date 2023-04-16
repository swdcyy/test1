package az8.b;
import erd.g;
import com.yxcorp.gifshow.ad.detail.fragment.AdDetailVMFragment;
import java.lang.Object;
import rd5.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import jz8.n;
import io.reactivex.subjects.PublishSubject;

public final class b implements g	// class@000342
{
    public final AdDetailVMFragment b;

    public void b(AdDetailVMFragment p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          a.p(p0, "event");
          AdDetailVMFragment l = this.b.L;
          a.m(l);
          l.Y0.onNext(p0);
       }
       return;
    }
}
