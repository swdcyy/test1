package iy9.c;
import android.view.View$OnClickListener;
import iy9.d;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.c;
import qp7.d;
import iy9.e;
import java.util.Objects;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public final class c implements View$OnClickListener	// class@0028bf
{
    public final d b;

    public void c(d p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       e uoe = this.b.l();
       Objects.requireNonNull(uoe);
       if (!PatchProxy.applyVoid(null, uoe, e.class, "1")) {
          uoe.a.onNext(Boolean.TRUE);
       }
       return;
    }
}
