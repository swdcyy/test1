package il0.c;
import erd.g;
import com.kuaishou.lite.presenter.LiveLiteBaseAdLogPresenter;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class c implements g	// class@002942
{
    public final LiveLiteBaseAdLogPresenter b;

    public void c(LiveLiteBaseAdLogPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          a.p(p0, "fragmentEvent");
          if (p0 == FragmentEvent.PAUSE) {
             c tb = this.b;
             if (tb.B != null) {
                LiveLiteBaseAdLogPresenter.B9(tb, true, false, 2, null);
             }
          }
          if (p0 == FragmentEvent.RESUME) {
             p0 = this.b;
             if (p0.B != null) {
                p0.x9();
             }
             p0.B = false;
          }
       }
       return;
    }
}
