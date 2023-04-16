package b09.b;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.tachikoma.AdPlayEndTKPresenter;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.concurrent.atomic.AtomicBoolean;

public final class b implements g	// class@00034a
{
    public final AdPlayEndTKPresenter b;

    public void b(AdPlayEndTKPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          a.p(p0, "fragmentEvent");
          if (p0 == FragmentEvent.RESUME && this.b.M.get()) {
             this.b.V8(0);
          }
       }
       return;
    }
}
