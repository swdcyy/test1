package jh9.e$c;
import com.kwai.library.widget.refresh.RefreshLayout$g;
import jh9.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import io.reactivex.subjects.PublishSubject;
import kotlin.jvm.internal.a;
import java.lang.Boolean;

public final class e$c implements RefreshLayout$g	// class@002ae2
{
    public final e b;

    public void e$c(e p0){
       this.b = p0;
       super();
    }
    public final void onRefresh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e$c.class, "1")) {
          return;
       }
       e$c tb = this.b;
       Objects.requireNonNull(tb);
       e uoe = PatchProxy.apply(objArray, tb, e.class, "2");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = tb.p;
          if (uoe == null) {
             a.S("refreshPublishSubject");
          }
       }
       uoe.onNext(Boolean.TRUE);
       return;
    }
}
