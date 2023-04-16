package b4d.f1$c;
import erd.g;
import b4d.f1;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import io.reactivex.subjects.PublishSubject;

public final class f1$c implements g	// class@000367
{
    public final f1 b;

    public void f1$c(f1 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f1$c.class, "1")) {
       }else {
          Log.g("EmotionFloatPanelPresenter", "onPanelFinishShow: ..."+p0);
          this.b.v.onNext(Boolean.TRUE);
       }
       return;
    }
}
