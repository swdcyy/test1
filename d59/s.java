package d59.s;
import android.view.View$OnClickListener;
import d59.t;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public final class s implements View$OnClickListener	// class@002059
{
    public final t b;

    public void s(t p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "1")) {
          return;
       }
       t t = this.b.t;
       if (t == null) {
          a.S("mTkPageHalfEmptyRenderState");
       }
       t.onNext(Boolean.TRUE);
       return;
    }
}
