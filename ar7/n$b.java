package ar7.n$b;
import android.view.View$OnClickListener;
import ar7.n;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.c;
import qp7.d;
import ar7.q;
import java.util.Objects;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public final class n$b implements View$OnClickListener	// class@000357
{
    public final n b;

    public void n$b(n p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n$b.class, "1")) {
          return;
       }
       q oq = this.b.l();
       Objects.requireNonNull(oq);
       if (!PatchProxy.applyVoid(null, oq, q.class, "3")) {
          oq.b.onNext(Boolean.TRUE);
       }
       return;
    }
}
