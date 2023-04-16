package ar7.n$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import ar7.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import qp7.d;
import java.util.Objects;
import android.app.Activity;
import com.yxcorp.utility.n;
import qp7.c;
import ar7.q;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public final class n$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@000356
{
    public final n b;

    public void n$a(n p0){
       this.b = p0;
       super();
    }
    public final void onGlobalLayout(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, n$a.class, "1")) {
          return;
       }
       Context uContext = this.b.k();
       Objects.requireNonNull(uContext, "null cannot be cast to non-null type android.app.Activity");
       int i = n.k(uContext);
       n$a tb = this.b;
       if (i != tb.m) {
          tb.m = i;
          q oq = tb.l();
          Objects.requireNonNull(oq);
          if (!PatchProxy.applyVoid(objArray, oq, q.class, "5")) {
             oq.c.onNext(Boolean.TRUE);
          }
       }
       return;
    }
}
