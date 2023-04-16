package aq7.e$b;
import android.view.View$OnClickListener;
import aq7.e;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.c;
import qp7.d;
import aq7.f;
import java.util.Objects;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public final class e$b implements View$OnClickListener	// class@000342
{
    public final e b;

    public void e$b(e p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$b.class, "1")) {
          return;
       }
       f uof = this.b.l();
       Objects.requireNonNull(uof);
       if (!PatchProxy.applyVoid(null, uof, f.class, "1")) {
          uof.a.onNext(Boolean.TRUE);
       }
       return;
    }
}
